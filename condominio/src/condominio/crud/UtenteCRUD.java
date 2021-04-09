package condominio.crud;

import java.util.List;

import Exception.FieldError;
import condominio.mapper.SqlMapFactory;
import condominio.mapper.UtenteMapper;
import condominio.model.Utente;



public class UtenteCRUD {

	public void insert(Utente utente) throws FieldError{
//		validateInsert(utente); da implementare 
		SqlMapFactory.instance().openSession();
		
		UtenteMapper mapper =  SqlMapFactory.instance().getMapper(UtenteMapper.class);
		
		mapper.insert(utente);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		
		
		
	}
	public void update (Utente utente) throws FieldError {
//	validateInsert(Utente);
	SqlMapFactory.instance().openSession();
	
	UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
	
	mapper.update(utente);
	SqlMapFactory.instance().commitSession();
	SqlMapFactory.instance().closeSession();
}
public void delete(int id) {
	SqlMapFactory.instance().openSession();
	
	UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
	
	mapper.delete(id);
	SqlMapFactory.instance().commitSession();
	SqlMapFactory.instance().closeSession();
}


public Utente find(int id) {
	SqlMapFactory.instance().openSession();
	
	UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
	Utente ret = mapper.find(id);
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}
public List<Utente> findAll() {
	
	SqlMapFactory.instance().openSession();
	
	UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
	List<Utente> ret = mapper.findAll();
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}

public void stampa(List<Utente> utenti) {
	int i = 0;
	for (Utente utente : utenti) {
		System.out.println(utente);
		i++;
	}
}
	public Utente findlogin (Utente utente) {
		
		SqlMapFactory.instance().openSession();
	//	validatemaipassword(utente.getUsername(), utente.getPassword());
		UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		Utente ret = mapper.findlogin(utente);
		
		
		SqlMapFactory.instance().closeSession();
		
		return ret;
		
		
	}

	private boolean  validatemaipassword(String username,String password) throws FieldError{
		int conta_numeri = 0;
		int contaChiocciola =0;
		if(password=="" || password==null || username=="" || username==null)
			return false;
		if(!(username.endsWith(".com") || username.endsWith(".it"))){
			return false;
			
		} 
				
		if(password.length()<8)
			return false;
		
		for(int i=0; i<password.length();i++) {	
			if (Character.isDigit(password.charAt(i)))
				conta_numeri ++;
		}
		for(int i=0; i < username.length() ;i++) {				
			if(username.charAt(i)=='@') {
				contaChiocciola++;
			}
				
		}
		if(conta_numeri < 2 ) {
			return false;
		}	
		if(contaChiocciola>1)
			return false;
		return true ;
	}
	}


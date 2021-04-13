package condominio.crud;

import java.util.List;

import Exception.FieldError;
import condominio.mapper.DocumentoMapper;
import condominio.mapper.PartecipaMapper;
import condominio.mapper.RiunioniMapper;
import condominio.mapper.SqlMapFactory;
import condominio.mapper.UtenteMapper;
import condominio.model.Documento;
import condominio.model.Partecipa;
import condominio.model.Riunioni;
import condominio.model.Utente;


public class PartecipaCRUD {
	public void insert(Partecipa partecipa) throws FieldError{
//		validateInsert(utente); da implementare 
		SqlMapFactory.instance().openSession();
		
		PartecipaMapper mapper =  SqlMapFactory.instance().getMapper(PartecipaMapper.class);
		
		mapper.insert(partecipa);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		
		
		
	}

public void delete(int id_utente) {
	SqlMapFactory.instance().openSession();
	
	UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
	
	mapper.delete(id_utente);
	SqlMapFactory.instance().commitSession();
	SqlMapFactory.instance().closeSession();
}
public void deleteriunioni(int id_riunioni) {
	SqlMapFactory.instance().openSession();
	
	UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
	
	mapper.delete(id_riunioni);
	SqlMapFactory.instance().commitSession();
	SqlMapFactory.instance().closeSession();
}

public Documento findbyUtente(int id_utente) {
	SqlMapFactory.instance().openSession();
	
	DocumentoMapper mapper = SqlMapFactory.instance().getMapper(DocumentoMapper.class);
	Documento ret = mapper.find(id_utente);
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}
public Documento findbyRiunioni(int id_riunioni) {
	SqlMapFactory.instance().openSession();
	
	DocumentoMapper mapper = SqlMapFactory.instance().getMapper(DocumentoMapper.class);
	Documento ret = mapper.find(id_riunioni);
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}
public List<Riunioni> findAllbyRiunioni() {
	
	SqlMapFactory.instance().openSession();
	
	RiunioniMapper mapper = SqlMapFactory.instance().getMapper(RiunioniMapper.class);
	List<Riunioni> ret = mapper.findAll();
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}
public List<Utente> findAllbyUtente() {
	
	SqlMapFactory.instance().openSession();
	
	UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
	List<Utente> ret = mapper.findAll();
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}

public void stampa(List<Riunioni> riunioni) {
	int i = 0;
	for (Riunioni riunione : riunioni) {
		System.out.println(riunione);
		i++;
	}
}
}

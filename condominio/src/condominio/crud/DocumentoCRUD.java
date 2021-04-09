package condominio.crud;

import java.util.List;

import Exception.FieldError;
import condominio.mapper.DocumentoMapper;
import condominio.mapper.SqlMapFactory;
import condominio.mapper.UtenteMapper;
import condominio.model.Documento;


public class DocumentoCRUD {
	public void insert(Documento documento) throws FieldError{
//		validateInsert(utente); da implementare 
		SqlMapFactory.instance().openSession();
		
		DocumentoMapper mapper =  SqlMapFactory.instance().getMapper(DocumentoMapper.class);
		
		mapper.insert(documento);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		
		
		
	}
	public void update (Documento documento) throws FieldError {
//	validateInsert(Utente);
	SqlMapFactory.instance().openSession();
	
	DocumentoMapper mapper = SqlMapFactory.instance().getMapper(DocumentoMapper.class);
	
	mapper.update(documento);
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


public Documento find(int id) {
	SqlMapFactory.instance().openSession();
	
	DocumentoMapper mapper = SqlMapFactory.instance().getMapper(DocumentoMapper.class);
	Documento ret = mapper.find(id);
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}
public List<Documento> findAll() {
	
	SqlMapFactory.instance().openSession();
	
	DocumentoMapper mapper = SqlMapFactory.instance().getMapper(DocumentoMapper.class);
	List<Documento> ret = mapper.findAll();
	
	
	SqlMapFactory.instance().closeSession();
	
	return ret;
	
}

public void stampa(List<Documento> documenti) {
	int i = 0;
	for (Documento documento : documenti) {
		System.out.println(documento);
		i++;
	}
}
}

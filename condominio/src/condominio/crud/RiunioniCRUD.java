package condominio.crud;

import java.util.List;

import Exception.FieldError;
import condominio.mapper.DocumentoMapper;
import condominio.mapper.RiunioniMapper;
import condominio.mapper.SqlMapFactory;
import condominio.model.Documento;
import condominio.model.Riunioni;

public class RiunioniCRUD {
	 
		public void insert(Riunioni riunioni) throws FieldError{
//			validateInsert(utente); da implementare 
			SqlMapFactory.instance().openSession();
			
			RiunioniMapper mapper =  SqlMapFactory.instance().getMapper(RiunioniMapper.class);
			
			mapper.insert(riunioni);
			SqlMapFactory.instance().commitSession();
			SqlMapFactory.instance().closeSession();
			
			
			
		}
		public void update (Riunioni riunioni) throws FieldError {
//		validateInsert(Utente);
		SqlMapFactory.instance().openSession();
		
		RiunioniMapper mapper = SqlMapFactory.instance().getMapper(RiunioniMapper.class);
		
		mapper.update(riunioni);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}
	public void delete(int id) {
		SqlMapFactory.instance().openSession();
		
		RiunioniMapper mapper = SqlMapFactory.instance().getMapper(RiunioniMapper.class);
		
		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}


	public Riunioni find(int id) {
		SqlMapFactory.instance().openSession();
		
		RiunioniMapper mapper = SqlMapFactory.instance().getMapper(RiunioniMapper.class);
		Riunioni ret = mapper.find(id);
		
		
		SqlMapFactory.instance().closeSession();
		
		return ret;
		
	}
	public List<Riunioni> findAll() {
		
		SqlMapFactory.instance().openSession();
		
		RiunioniMapper mapper = SqlMapFactory.instance().getMapper(RiunioniMapper.class);
		List<Riunioni> ret = mapper.findAll();
		
		
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

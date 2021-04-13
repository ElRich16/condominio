package condominio.mapper;

import java.util.List;

import condominio.model.Riunioni;




public interface RiunioniMapper {
	public void insert(Riunioni riunioni);

	public void update(Riunioni riunioni);

	public void delete(int id);

	public Riunioni find(int id);

	public List<Riunioni> findAll();

	

	
	
}

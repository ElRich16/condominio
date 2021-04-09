package condominio.mapper;

import java.util.List;

import condominio.model.Documento;


public interface DocumentoMapper {
	public void insert(Documento documento);

	public void update(Documento documento);

	public void delete(int id);

	public Documento find(int id);

	public List<Documento> findAll();

	

	

}

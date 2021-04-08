package condominio.mapper;

import java.util.List;

import condominio.model.Utente;

public interface DocumentoMapper {
	public void insert(Utente utente);

	public void update(Utente utente);

	public void delete(int id);

	public Utente find(int id);

	public List<Utente> findAll();

	public List<Utente> findAllWithStats();

}

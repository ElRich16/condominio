package condominio.mapper;

import java.util.List;


import condominio.model.Partecipa;
import condominio.model.Riunioni;
import condominio.model.Utente;

public interface PartecipaMapper {
	public void insert(Partecipa partecipa);

	public void update(Partecipa partecipa);

	public void delete(Partecipa partecipa);

	public Partecipa find(Partecipa partecipa);

	public List<Utente> findAllbyUtente();
	
	public List<Riunioni> findAllbyRiunioni();

	

	

}

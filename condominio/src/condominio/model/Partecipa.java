package condominio.model;

import java.util.List;

public class Partecipa {
private int id_utente;
private int id_riunioni;

private List<Utente> utente;
private List<Riunioni> riunioni;


public int getId_utente() {
	return id_utente;
}
public void setId_utente(int id_utente) {
	this.id_utente = id_utente;
}
public int getId_riunioni() {
	return id_riunioni;
}
public void setId_riunioni(int id_riunioni) {
	this.id_riunioni = id_riunioni;
}



public List<Utente> getUtente() {
	return utente;
}
public void setUtente(List<Utente> utente) {
	this.utente = utente;
}
public List<Riunioni> getRiunioni() {
	return riunioni;
}
public void setRiunioni(List<Riunioni> riunioni) {
	this.riunioni = riunioni;
}
public Partecipa () {}


public Partecipa(int id_utente, int id_riunioni, List<Utente> utente, List<Riunioni> riunioni) {
	super();
	this.id_utente = id_utente;
	this.id_riunioni = id_riunioni;
	this.utente = utente;
	this.riunioni = riunioni;
}
public Partecipa(int id_utente, int id_riunioni) {
	super();
	this.id_utente = id_utente;
	this.id_riunioni = id_riunioni;
}
@Override
public String toString() {
	return "Partecipa [id_utente=" + id_utente + ", id_riunioni=" + id_riunioni + ", utente=" + utente + ", riunioni="
			+ riunioni + "]";
}




}

package condominio.model;

public class Voto {
private int id;
private String voto;
private Utente utente;
private Riunioni riunioni;

public Voto () {}


public Voto(int id, String voto, Utente utente) {
	super();
	this.id = id;
	this.voto = voto;
	this.utente = utente;
}


public Voto(String voto) {
	super();
	this.voto = voto;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getVoto() {
	return voto;
}


public void setVoto(String voto) {
	this.voto = voto;
}


public Utente getUtente() {
	return utente;
}


public void setUtente(Utente utente) {
	this.utente = utente;
}


@Override
public String toString() {
	return "Voto [id=" + id + ", voto=" + voto + ", utente=" + utente + "]";
}


public Riunioni getRiunioni() {
	return riunioni;
}


public void setRiunioni(Riunioni riunioni) {
	this.riunioni = riunioni;
}


public Voto(int id, String voto, Utente utente, Riunioni riunioni) {
	super();
	this.id = id;
	this.voto = voto;
	this.utente = utente;
	this.riunioni = riunioni;
}



}

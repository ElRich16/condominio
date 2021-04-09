package condominio.model;

public class Documento {
private int id;
private String url_doc;
private String commento;
private int id_utente;
private Utente utente;
private String titolo;
public Documento () {}


public int getId_utente() {
	return id_utente;
}


public void setId_utente(int id_utente) {
	this.id_utente = id_utente;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUrl_doc() {
	return url_doc;
}
public void setUrl_doc(String url_doc) {
	this.url_doc = url_doc;
}
public String getCommento() {
	return commento;
}
public void setCommento(String commento) {
	this.commento = commento;
}
public Utente getUtente() {
	return utente;
}
public void setUtente(Utente utente) {
	this.utente = utente;
}





public Documento(int id, String url_doc, String commento, int id_utente, Utente utente, String titolo) {
	super();
	this.id = id;
	this.url_doc = url_doc;
	this.commento = commento;
	this.id_utente = id_utente;
	this.utente = utente;
	this.titolo = titolo;
}


public String getTitolo() {
	return titolo;
}


public void setTitolo(String titolo) {
	this.titolo = titolo;
}


public Documento(String url_doc, String commento, int id_utente) {
	super();
	this.url_doc = url_doc;
	this.commento = commento;
	this.id_utente = id_utente;
}


public Documento(int id, String url_doc, String commento, int id_utente) {
	super();
	this.id = id;
	this.url_doc = url_doc;
	this.commento = commento;
	this.id_utente = id_utente;
}





}

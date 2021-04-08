package condominio.model;

public class Documento {
private int id;
private String url_doc;
private String commento;
private Utente utente;

public Documento () {}


public Documento(int id, String url_doc, String commento) {
	super();
	this.id = id;
	this.url_doc = url_doc;
	this.commento = commento;
}
public Documento(String url_doc, String commento) {
	super();
	this.url_doc = url_doc;
	this.commento = commento;
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
public Documento(int id, String url_doc, String commento, Utente utente) {
	super();
	this.id = id;
	this.url_doc = url_doc;
	this.commento = commento;
	this.utente = utente;
}
@Override
public String toString() {
	return "Documento [id=" + id + ", url_doc=" + url_doc + ", commento=" + commento + ", utente=" + utente + "]";
}



}

package condominio.model;

public class Utente {
private int id;
private String username;
private String password;
private String cognome;
private String interno;
private String srcid;
private int id_ruolo;
private Ruolo ruolo;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getInterno() {
	return interno;
}
public void setInterno(String interno) {
	this.interno = interno;
}
public String getSrcid() {
	return srcid;
}
public void setSrcid(String srcid) {
	this.srcid = srcid;
}
public int getId_ruolo() {
	return id_ruolo;
}
public void setId_ruolo(int id_ruolo) {
	this.id_ruolo = id_ruolo;
}
public Ruolo getRuolo() {
	return ruolo;
}
public void setRuolo(Ruolo ruolo) {
	this.ruolo = ruolo;
}
public Utente(int id, String username, String password, String cognome, String interno, String srcid, int id_ruolo,
		Ruolo ruolo) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.cognome = cognome;
	this.interno = interno;
	this.srcid = srcid;
	this.id_ruolo = id_ruolo;
	this.ruolo = ruolo;
}
public Utente(String username, String password, String cognome, String interno, String srcid, int id_ruolo) {
	super();
	this.username = username;
	this.password = password;
	this.cognome = cognome;
	this.interno = interno;
	this.srcid = srcid;
	this.id_ruolo = id_ruolo;
}


public Utente () {}







}

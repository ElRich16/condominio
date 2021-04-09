package condominio.model;

public class Utente {
private int id;
private String username;
private String password;
private String cognome;
private String interno;
private String srcId;
private int id_ruolo;
private String attivo;
public Utente () {}

public String getSrcId() {
	return srcId;
}
public void setSrcId(String srcId) {
	this.srcId = srcId;
}
public String getAttivo() {
	return attivo;
}
public void setAttivo(String attivo) {
	this.attivo = attivo;
}
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
	return srcId;
}
public void setSrcid(String srcId) {
	this.srcId = srcId;
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
public Utente(int id, String username, String password, String cognome, String interno, String srcId, int id_ruolo,
		Ruolo ruolo) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.cognome = cognome;
	this.interno = interno;
	this.srcId = srcId;
	this.id_ruolo = id_ruolo;
	this.ruolo = ruolo;
}
public Utente(String username, String password, String cognome, String interno, String srcId, int id_ruolo) {
	super();
	this.username = username;
	this.password = password;
	this.cognome = cognome;
	this.interno = interno;
	this.srcId = srcId;
	this.id_ruolo = id_ruolo;
}
public Utente(String username, String password, String cognome, String interno, String srcId, int id_ruolo,
		String attivo, Ruolo ruolo) {
	super();
	this.username = username;
	this.password = password;
	this.cognome = cognome;
	this.interno = interno;
	this.srcId = srcId;
	this.id_ruolo = id_ruolo;
	this.attivo = attivo;
	this.ruolo = ruolo;
}


@Override
public String toString() {
	return "Utente [id=" + id + ", username=" + username + ", password=" + password + ", cognome=" + cognome
			+ ", interno=" + interno + ", srcId=" + srcId + ", id_ruolo=" + id_ruolo + ", attivo=" + attivo + ", ruolo="
			+ ruolo + "]";
}









}

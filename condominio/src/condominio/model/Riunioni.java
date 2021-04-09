package condominio.model;

import java.util.Date;

public class Riunioni {
private int id;
private String nome_riunione;
private Date data;
private Utente utente;
private int voto;

private int id_utente;







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
public String getNome_riunione() {
	return nome_riunione;
}
public void setNome_riunione(String nome_riunione) {
	this.nome_riunione = nome_riunione;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public Utente getUtente() {
	return utente;
}
public void setUtente(Utente utente) {
	this.utente = utente;
}



public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public Riunioni() {}
public Riunioni(int id, String nome_riunione, Date data, Utente utente, int voto, int id_utente) {
	super();
	this.id = id;
	this.nome_riunione = nome_riunione;
	this.data = data;
	this.utente = utente;
	this.voto = voto;
	
	this.id_utente = id_utente;
}
@Override
public String toString() {
	return "Riunioni [id=" + id + ", nome_riunione=" + nome_riunione + ", data=" + data + ", utente=" + utente
			+ ", voto=" + voto + ", id_utente=" + id_utente + "]";
}
public Riunioni(String nome_riunione, Date data, int voto, int id_utente) {
	super();
	this.nome_riunione = nome_riunione;
	this.data = data;
	this.voto = voto;
	this.id_utente = id_utente;
}





}

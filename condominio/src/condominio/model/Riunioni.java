package condominio.model;

import java.util.Date;

public class Riunioni {
private int id;
private String nome_riunione;
private Date data;
private Utente utente;
private Voto voto;
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
public Voto getVoto() {
	return voto;
}
public void setVoto(Voto voto) {
	this.voto = voto;
}
public Riunioni(int id, String nome_riunione, Date data, Utente utente, Voto voto) {
	super();
	this.id = id;
	this.nome_riunione = nome_riunione;
	this.data = data;
	this.utente = utente;
	this.voto = voto;
}
public Riunioni(String nome_riunione, Date data) {
	super();
	this.nome_riunione = nome_riunione;
	this.data = data;
}

public Riunioni() {}





}

package condominio.model;

public class Voto {
private int id;
private String voto;


public Voto () {}


public Voto(int id, String voto) {
	super();
	this.id = id;
	this.voto = voto;

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





@Override
public String toString() {
	return "Voto [id=" + id + ", voto=" + voto +  "]";
}




public Voto(int id, String voto, Utente utente) {
	super();
	this.id = id;
	this.voto = voto;

}



}

package condominio.model;

public class Ruolo {

	private int id;
	private int ruolo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRuolo() {
		return ruolo;
	}
	public void setRuolo(int ruolo) {
		this.ruolo = ruolo;
	}
	
	public Ruolo () {}
	
	
	public Ruolo(int id, int ruolo) {
		super();
		this.id = id;
		this.ruolo = ruolo;
	}
	@Override
	public String toString() {
		return "Ruolo [id=" + id + ", ruolo=" + ruolo + "]";
	}
	
	
	
	
	
}

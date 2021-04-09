package condominio.test;

import Exception.FieldError;
import condominio.crud.RiunioniCRUD;
import condominio.crud.UtenteCRUD;
import condominio.model.Riunioni;
import condominio.model.Utente;

public class UtenteTest {
	public static void main(String [] args) {
//Utente u = new Utente("simone@simone.it","prova2","mario","2c","",2);
//UtenteCRUD uc = new UtenteCRUD();
//
//	
//uc.delete(2);
	
	Riunioni r = new Riunioni();
	RiunioniCRUD rc = new RiunioniCRUD();
	System.out.println(rc.findRiunioniByUtente("titolo"));

	}

}
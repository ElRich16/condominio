package condominio.test;

import Exception.FieldError;
import condominio.crud.DocumentoCRUD;
import condominio.model.Documento;

public class DocumentoTest {

	public static void main(String[] args) {
		Documento a= new Documento();
		DocumentoCRUD dc = new DocumentoCRUD();
		try {
			dc.insert(a);
		} catch (FieldError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

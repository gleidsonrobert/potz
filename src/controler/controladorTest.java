package controler;

import junit.framework.TestCase;

public class controladorTest extends TestCase {
	public void testeExecutaCalculo()
	{
		String cupom = "5000365327";
		boolean retorno    = controlador.validar_cupom(cupom); 
		assertEquals(true, retorno);
	}
}

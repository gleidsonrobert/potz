package principal;
import java.util.Scanner;

import controler.controlador;

public class principal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		//Varivel que recebe o cupom
		String Cupom = "";
		String Msg   = "";
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com numero do cupom.");
		Cupom = ler.next();
		
		controlador Control = new controlador();
		
		if (Control.validar_cupom(Cupom)){
			if (Control.valida_codigo_cupom(Cupom)){
				int pontos	= Integer.parseInt(Cupom.substring(0,3));
				Msg = "Cupom valido, Pontos adquiridos:"+Integer.toString(pontos);	
			} else {
				Msg = "Cupom inválido!";	
			}
		}else{
			Msg = "Cupom inválido!";	
		}
		
		System.out.println(Msg);
	}
}

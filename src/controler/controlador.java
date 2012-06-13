package controler;

public class controlador {

	public static boolean validar_cupom(String cupom)
	{
		boolean retorno = true;
		String validos 	= "0123456789";
		int aux 	   	= 0;
		String auxcupom = "";
		
		try {
			
			//Valida se tem Letras ou caracteres
			for (int i = 0; i < cupom.length(); i++) {
				aux = validos.indexOf(cupom.substring(i, i+1));
				if (aux>=0) {
					auxcupom += Integer.toString(aux);
				}
			}

			if (auxcupom.length()==10)
			{
				//guarda numa variavel os pontos do cupom
				int pontos	= Integer.parseInt(cupom.substring(0,3));
				
				//valida se o cupom tem 10 caracteres e se os pontos são maiores que 0
				if (cupom.length()!=10 && pontos==0)	{
					retorno = false;	
				}
			} else {
				retorno = false;
			}
		} catch (Exception e) {
			System.out.println("Cupom Invalido.");
		}
		
		return retorno;
	}
	
	public static boolean valida_codigo_cupom(String cupom)
	{
		boolean retorno = false;

		int vlr1 = Integer.parseInt(cupom.substring(3,4));
        int vlr2 = Integer.parseInt(cupom.substring(4,5));
        int vlr3 = Integer.parseInt(cupom.substring(5,6));
        int vlr4 = Integer.parseInt(cupom.substring(6,7));
        int vlr5 = Integer.parseInt(cupom.substring(7,8));
        int vlr6 = Integer.parseInt(cupom.substring(8,9));
        int digito_verificador = Integer.parseInt(cupom.substring(9,10));		
		
		//Calculo 11 com digito verificador
		int total = ((vlr1*7)+(vlr2*6)+(vlr3*5)+(vlr4*4)+(vlr5*3)+(vlr6*2));
		
		//Verifica resto da divisão
		total = total%11;
		total = 11-total;
		
		//verifica se o resto da divisão e igual ao digito verificador
		if (total==digito_verificador) {
			retorno = true;
		}
		else {
			retorno = false;
		}

		return retorno;
	}
}

package controlador;

public class AutenticarControlador {
	
	public String Auntenticar(String usua,String contra){
		String result="";
		if ( usua.equalsIgnoreCase("wilmer") && contra.equalsIgnoreCase("w123")){
			result="BIENVENIDO AL SISTEMA BENEDICTO XVI";
		}else if( (usua=="wilmer"&& contra!="w123") ||  (usua!="wilmer"&& contra=="w123") ){
				result="USUARIO O CONTRASEŅA ES INCORRECT0";	
				}else if(usua.isEmpty() && contra.isEmpty()){
					result="USUARIO Y CONTRASEŅA NO PUEDEN ESTAR VACIOS";
		}
		return result;
	}

}

package Datos;
/**
 * Clase para el mensaje que recibe el usuario
 * @author bmtadeo
 *
 */
public class MensajeUsuario {
	private String cadena;
	
	public MensajeUsuario(String cadena){
		this.cadena=cadena;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

}

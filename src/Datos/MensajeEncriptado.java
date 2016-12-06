package Datos;

public class MensajeEncriptado {
	
	private String clave;
	
	public MensajeEncriptado(String clave){
		this.clave=clave;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	

}

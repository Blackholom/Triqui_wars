package com.example.kevin.triqui_wars;

/**
 * Esta excepci�n se lanza cuando el juego a terminado y quiere generar una nueva marca
 */
public class TerminoException extends Exception
{
	// ------------------------------------------------------------------------------
	// Atributos
	// ------------------------------------------------------------------------------
		
	/**
	 * Es el mensaje, me sirve para indicar si el error fue al eliminar la raiz o algun nodo que tiene subTareas
	 */
	private String mensaje;
		
	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------
		
	/**
	 * Crea una nueva exception por eliminar indevidamente
	 * @param causa Es la causa por la que se elimino indevidamente
	 */
	public TerminoException(String causa)
	{
		super(causa);
		mensaje = causa;
	}
	
	// -----------------------------------------------------------------
	// Metodos
	// -----------------------------------------------------------------
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}

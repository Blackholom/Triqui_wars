package com.example.kevin.triqui_wars;

public class Casilla 
{
	//--------------------------------------------
	// Constantes
	//--------------------------------------------
	
	/**
	 * Es el tama�o que tiene cada casilla en la imagen
	 */
	public static int ANCHO_ALTO = 20;
	
	//--------------------------------------------
	// Atributos
	//--------------------------------------------
	
	/**
	 * Es la marca que posee la casilla
	 */
	private String marca;
	
	//--------------------------------------------
	// Constructor
	//--------------------------------------------

	/**
	 * Crea una nueva casilla
	 */
	public Casilla()
	{
		marca = "";
	}
	
	//--------------------------------------------
	// Metodos
	//--------------------------------------------
	
	/**
	 * Le asigna una marca a la casilla
	 * @param marca Es la marca que se le asigna a la casilla - marca {MARCA_X , MARCA_Y}
	 */
	public void asignarMarcar(String marca)
	{
		this.marca = marca;
	}
	
	/**
	 * Indica si la casilla esta marcada o no
	 * @return marcada Indica si la casilla tiene marca
	 */
	public boolean estaMarcada()
	{
		boolean marcada = (marca.equals(""))?false:true;
		return marcada;
	}
	
	/**
	 * Limpia toda marca que tenga la casilla
	 */
	public void limpiar()
	{
		marca ="";
	}
	
	/**
	 * Entrega la marca que tiene la casilla
	 * @return marca Es la marca que posee la casilla
	 */
	public String getMarca()
	{
		return marca;
	}
}	

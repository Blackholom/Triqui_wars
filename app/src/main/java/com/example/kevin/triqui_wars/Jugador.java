package com.example.kevin.triqui_wars;

public class Jugador 
{
	
	//--------------------------------------------
	// Atributos
	//--------------------------------------------
	/**
	 * Es el nombre del jugador
	 */
	private String nombre;
	/**
	 * Es el puntaje que lleva el jugador
	 */
	private int puntaje;
	/**
	 * Es la marca que se le asigna al jugador
	 */
	private String marca;
	/**
	 * Indica si el juego lo gano
	 */
	private boolean gano;
	
	//--------------------------------------------
	// constructor
	//--------------------------------------------
	
	/**
	 * Crea un nuevo jugador del triqui
	 * @param nombre Es el nombre del jugador
	 * @param marca Es la marca que se le asigna al jugador
	 */
	public Jugador(String nombre,String marca)
	{
		this.nombre = nombre;
		this.marca = marca;
		puntaje = 0;
	}

	//--------------------------------------------
	// Gets and Sets
	//--------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isGano() {
		return gano;
	}

	public void setGano(boolean gano) {
		this.gano = gano;
		puntaje += (gano == true)?1:0;
	}
	
	
}

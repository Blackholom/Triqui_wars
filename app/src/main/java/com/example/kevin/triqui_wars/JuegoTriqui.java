package com.example.kevin.triqui_wars;

public class JuegoTriqui 
{
	//--------------------------------------------
	// Constante
	//--------------------------------------------
	public static String TERMINO_JUEGO = "Ya ha terminado el juego, no puede generar una nueva marca";
	public static String LLENO_TABLERO = "No se puede generar una nueva marca porque el tablero esta lleno y nadie a ganado";
	public static String MARCA_X = "X"; 
	public static String MARCA_Y = "Y";
	public static int JUGADOR_1 = 1;
	public static int JUGADOR_2 = 2;
	public static int FILAS = 3;
	public static int COLUMNAS = 3;
	public static String GANO_JUGADOR_1 = "Gano jugador 1";
	public static String GANO_JUGADOR_2 = "Gano jugador 2";
	public static String NO_TERMINA_JUEGO = "No termina juego";
	
	//--------------------------------------------
	// Atributos
	//--------------------------------------------
	/**
	 * Es el numero del jugador que se encuentra actualmente - {1,2}
	 */
	private int jugadorActual;
	
	/**
	 * Este es el reloj del juego
	 */
	private int minutos;
	private int segundos;
	
	/**
	 * Estos son los jugadores Rojo (primer jugador) y Verde (segundo jugador)
	 */
	private Jugador jugadorRojo,jugadorVerde;
	
	/**
	 * Este es el tablero del juego triqui
	 */
	private Casilla[][] casillas;
	
	//--------------------------------------------
	// Constructor
	//--------------------------------------------
	
	/**
	 * Crea un juego de triqui, creando los jugadores Rojo y Verde, Tambien creando la matriz de casillas
	 */
	public JuegoTriqui()
	{
		jugadorRojo = new Jugador("Rojo",MARCA_X);
		jugadorVerde = new Jugador("Verde",MARCA_Y);
		jugadorActual = JUGADOR_1;
		casillas = new Casilla[FILAS][COLUMNAS];
		
		for(int i = 0 ; i < COLUMNAS ; i++)
		{
			for(int j = 0 ; j < FILAS ; j++)
			{
				casillas[i][j] = new Casilla();
			}
		}
	}

	//--------------------------------------------
	// Metodos
	//--------------------------------------------
	
	/**
	 * Verifica si las filas estan marcadas comprobando que termine el juego
	 * @return estado Es la cadena que indica quien a ganado y si dice que no ha terminado
	 */
	public String verificarJuegoPorFilas()
	{
		String estado = NO_TERMINA_JUEGO;
		boolean termino = false;
		boolean salirColumna = false;
		int contarX = 0;
		int contarY = 0;
		
		for(int i = 0 ; i < FILAS && !termino ; i++)
		{
			for(int j = 0 ; j < COLUMNAS && !salirColumna; j++)
			{
				if(casillas[i][j].estaMarcada())
				{
					if(casillas[i][j].getMarca().equals(MARCA_X))
					{
						contarX++;
					}
					else
					{
						if(casillas[i][j].getMarca().equals(MARCA_Y))
						contarY++;
					}
				}
				else
				{
					salirColumna = true;
					
				}
			}
			if(contarX == 3)
			{
				termino = true;
				estado = GANO_JUGADOR_1;
			}
			else if(contarY == 3)
			{
				termino = true;
				estado = GANO_JUGADOR_2;
			}
			else
			{
				contarX = 0;
				contarY = 0;
				salirColumna = false;
			}
		}

		return estado;
	}
	
	/**
	 * Indica si el juego ya ha terminado por las columnas
	 * @return estado Es una cadena que indica quien ha ganado pero si no indica que no ha terminado el juego
	 */
	public String verificarJuegoPorColumnas()
	{
		String estado = NO_TERMINA_JUEGO;
		boolean termino = false;
		boolean salirFila = false;
		int contarX = 0;
		int contarY = 0;

		for(int i = 0 ; i < COLUMNAS && !termino ; i++)
		{
			for(int j = 0; j < FILAS && !salirFila ; j++)
			{
				if(casillas[j][i].estaMarcada())
				{
					if(casillas[j][i].getMarca().equals(MARCA_X))
					{
						contarX++;
					}
					else
					{
						if(casillas[j][i].getMarca().equals(MARCA_Y))
						contarY++;
					}
				}
				else
				{
					salirFila = true;
				}
			}
			if(contarX == 3)
			{
				termino = true;
				estado = GANO_JUGADOR_1;
			}
			else if(contarY == 3)
			{
				termino = true;
				estado = GANO_JUGADOR_2;
			}
			else
			{
				contarX = 0;
				contarY = 0;
				salirFila = false;
			}
		}
		
		return estado;
	}
	
	/**
	 * Verifica si el juego se ha terminado por la diagonal que comienza desde la izquierda y termina en la derecha
	 * @return estado Es una cadena que indica quien ha ganado pero si no indica que no ha terminado el juego
	 */
	public String verficarJuegoPorDiagonal1()
	{
		String estado = NO_TERMINA_JUEGO;
		int contarX = 0;
		int contarY = 0;
		boolean salir = false;
		
		for(int i = 0 ; i < FILAS && !salir ; i++)
		{
			if(casillas[i][i].estaMarcada())
			{
				if(casillas[i][i].getMarca().equals(MARCA_X))
				{
					contarX++;
				}
				else
				{
					if(casillas[i][i].getMarca().equals(MARCA_Y))
					contarY++;
				}
			}
			else
			{
				salir = true;
			}
		}
		if(contarX == 3)
		{
			estado = GANO_JUGADOR_1;
		}
		else if(contarY == 3)
		{
			estado = GANO_JUGADOR_2;
		}
		return estado;
	}
	
	/**
	 * Verifica si el juego ha terminado teniendo en cuenta la diagonal que comienza por la derecha y termina en la izquierda
	 * @return estado Es una cadena que indica quien ha ganado pero si no indica que no ha terminado el juego
	 */
	public String verificarJuegoPorDiagonal2()
	{
		String estado = NO_TERMINA_JUEGO;
		int contarX = 0;
		int contarY = 0;
		boolean salir = false;
		int contador = 2;
		
		for(int i = 0 ; i <FILAS && !salir ; i++)
		{
							
				if(casillas[i][contador].estaMarcada())
				{
					if(casillas[i][contador].getMarca().equals(MARCA_X))
					{
						contarX++;
					}
					else
					{	
						if(casillas[i][contador].getMarca().equals(MARCA_Y))	
						contarY++;
					}
				}
				else
				{
					salir = true;
				}
				contador--;
			
		}
		if(contarX == 3)
		{
			estado = GANO_JUGADOR_1;
		}
		else if(contarY == 3)
		{
			estado = GANO_JUGADOR_2;
		}
		return estado;
	}
	
	/**
	 * Indica si el juego a terminado por alguna de las opciones
	 * @return termino Indica si el juego ha terminado
	 */
	public boolean terminoJuego()
	{
		boolean termino = false;
		
		String fila = verificarJuegoPorFilas();
		String columna = verificarJuegoPorColumnas();
		String diagonal1 = verficarJuegoPorDiagonal1();
		String diagonal2 = verificarJuegoPorDiagonal2();
		
		if(fila.equals(NO_TERMINA_JUEGO)&& columna.equals(NO_TERMINA_JUEGO) && diagonal1.equals(NO_TERMINA_JUEGO) && diagonal2.equals(NO_TERMINA_JUEGO))
		{
			termino = false;
		}
		
		else
		{
			termino = true;
			
			if(fila.equals(GANO_JUGADOR_1))
			{
				jugadorRojo.setGano(true);
			}
			else if(fila.equals(GANO_JUGADOR_2))
				jugadorVerde.setGano(true);
			
			else if(columna.equals(GANO_JUGADOR_1))
				jugadorRojo.setGano(true);
			
			else if(columna.equals(GANO_JUGADOR_2))
				jugadorVerde.setGano(true);
			
			else if(diagonal1.equals(GANO_JUGADOR_1))
				jugadorRojo.setGano(true);
			
			else if(diagonal1.equals(GANO_JUGADOR_2))
				jugadorVerde.setGano(true);
			
			else if(diagonal2.equals(GANO_JUGADOR_1))
				jugadorRojo.setGano(true);
			
			else if(diagonal2.equals(GANO_JUGADOR_2))
				jugadorVerde.setGano(true);
		}
		
		return termino;
	}
	
	/**
	 * Genera una marca en una posicion aleatoria dependiendo del jugador actual
	 * @throws TerminoException Indica si el juego ya termino y por lo tanto no se puede generar una nueva marca
	 */
	public void generarMarcaAleatoria() throws TerminoException
	{
		double aleatorioX = Math.random() * FILAS;
		double aleatorioY = Math.random() * COLUMNAS;
		boolean marco = false;
		
		if(terminoJuego())
		{
			throw new TerminoException(TERMINO_JUEGO);
		}
		else if(tableroLleno())
		{
			throw new TerminoException(LLENO_TABLERO);
		}
		else
		{
			while (!marco)
			{
				if(casillas[(int)aleatorioX][(int)aleatorioY].estaMarcada())
				{
					aleatorioX = Math.random() * FILAS;
					aleatorioY = Math.random() * COLUMNAS;
				}
				else
				{
					if(jugadorActual == 1)
					{
						casillas[(int)aleatorioX][(int)aleatorioY].asignarMarcar(jugadorRojo.getMarca());
						marco=true;
					}
					else
					{
						casillas[(int)aleatorioX][(int)aleatorioY].asignarMarcar(jugadorVerde.getMarca());
						marco = true;
					}
				}
			}
		}
		
		jugadorActual = (jugadorActual == JUGADOR_1)?JUGADOR_2:JUGADOR_1;
	}
	
	/**
	 * Indica si el tablero esta lleno y aun no ha ganado nadie
	 * @return lleno Indica si el tablero esta lleno y nadie ha ganado
	 */
	public boolean tableroLleno()
	{
		boolean lleno = false;
		int cantidad = 0;
		
		for(int i = 0 ; i < FILAS ; i++)
		{
			for(int j = 0 ; j < COLUMNAS ; j++)
			{
				cantidad += (casillas[i][j].estaMarcada())? 1 : 0;
			}
		}
		
		lleno = (cantidad == 9)? true : false;
		
		return lleno;
	}
	
	/**
	 * Reinicia el juego dejando todo desde el principio
	 */
	public void reiniciarJuego()
	{
		jugadorRojo.setGano(false);
		jugadorVerde.setGano(false);
		
		for(int i = 0 ; i < FILAS ; i++)
		{
			for(int j = 0 ; j < COLUMNAS ; j++)
			{
				casillas[i][j].limpiar();
			}
		}
	}
	
	
	
	
	public boolean generarMarca(int X, int Y) throws TerminoException
	{

		boolean generoMarca = false;
		
		if(terminoJuego())
		{
			throw new TerminoException(TERMINO_JUEGO);
		}
		else if(tableroLleno())
		{
			throw new TerminoException(LLENO_TABLERO);
		}
		
		else if(casillas[X][Y].estaMarcada())
		{
			generoMarca = false;
		}
		
		else
		{
			if(jugadorActual == 1)
			{
				casillas[X][Y].asignarMarcar(jugadorRojo.getMarca());
				generoMarca = true;
			}
			else
			{
				casillas[X][Y].asignarMarcar(jugadorVerde.getMarca());
				generoMarca = true;
			}
		}
		
		jugadorActual = (jugadorActual == JUGADOR_1)?JUGADOR_2:JUGADOR_1;
		
		return generoMarca;
	}
	
	public int JugadorGanador()
	{
		int ganador = (jugadorRojo.isGano())?JUGADOR_1:JUGADOR_2;
		return ganador;
	}

	
	//--------------------------------------------
	// Gets and Sets
	//--------------------------------------------

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public Jugador getJugadorRojo() {
		return jugadorRojo;
	}

	public void setJugadorRojo(Jugador jugadorRojo) {
		this.jugadorRojo = jugadorRojo;
	}

	public Jugador getJugadorVerde() {
		return jugadorVerde;
	}

	public void setJugadorVerde(Jugador jugadorVerde) {
		this.jugadorVerde = jugadorVerde;
	}

	public int getJugadorActual() {
		return jugadorActual;
	}

	public void setJugadorActual(int jugadorActual) {
		this.jugadorActual = jugadorActual;
	}

	public Casilla[][] getCasillas() {
		return casillas;
	}

	public void setCasillas(Casilla[][] casillas) {
		this.casillas = casillas;
	}
	
	
	
	
}

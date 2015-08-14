package com.example.kevin.triqui_wars;

import junit.framework.TestCase;

public class TriquiTest extends TestCase
{
	private JuegoTriqui triqui;
	
	public void setupEscenario()
	{
		triqui = new JuegoTriqui();
		
		Casilla[][] casillas = triqui.getCasillas();
		
		casillas[0][0].asignarMarcar(JuegoTriqui.MARCA_Y);
		casillas[1][1].asignarMarcar(JuegoTriqui.MARCA_Y);
		casillas[2][2].asignarMarcar(JuegoTriqui.MARCA_Y);
		
		triqui.setCasillas(casillas);		
		
	}
	
	public void setupEscenario2()
	{
		triqui = new JuegoTriqui();
		
		Casilla[][] casillas = triqui.getCasillas();
		
		casillas[0][0].asignarMarcar(JuegoTriqui.MARCA_Y);
		casillas[0][1].asignarMarcar(JuegoTriqui.MARCA_Y);
		casillas[0][2].asignarMarcar(JuegoTriqui.MARCA_Y);
		
		triqui.setCasillas(casillas);		
		
	}
	
	public void testVerificarJuegoPorColumnas()
	{
		setupEscenario2();
		String cadena = triqui.verificarJuegoPorColumnas();
		assertEquals(JuegoTriqui.GANO_JUGADOR_2, cadena);
	}
	
	public void testVerificarJuegoPorFilas()
	{
		setupEscenario2();
		String cadena = triqui.verificarJuegoPorFilas();
		assertEquals(JuegoTriqui.GANO_JUGADOR_2, cadena);
	}
	
	public void testVerificarJuegoPorDiagonal()
	{
		setupEscenario();
		String cadena = triqui.verficarJuegoPorDiagonal1();
		assertEquals(JuegoTriqui.GANO_JUGADOR_2, cadena);
	}
	
	
}

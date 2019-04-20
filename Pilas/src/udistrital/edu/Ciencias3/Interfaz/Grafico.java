package udistrital.edu.Ciencias3.Interfaz;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

import udistrital.edu.Ciencias3.Pilas.Nodo;
import udistrital.edu.Ciencias3.Pilas.Pila;

/**
 * Clase que permite dibujar en la interfaz
 * @author anferente97
 * Fecha: 20.4.19
 */
public class Grafico extends JPanel{

	/**
	 * Referencia a la pila
	 */
	private Pila p;
	
	/**
	 * Elemento que permite ubicarse en la gráfica
	 */
	private FontMetrics fm = null;
	
	/**
	 * Mapeo
	 */
    private HashMap posicionNodo = null;
    
    /**
     * Distancia entre los elementos
     */
    int distancia = 15;
    int dye;
    
    /**
     * Constructor
     */
    public Grafico(Pila p) {
    	this.p = p;
    	posicionNodo = new HashMap();
    	repaint();
    }	
    
    public void calcular() {
    	posicionNodo.clear();
    	calcularPosiciones(p.getInicio(),5,20);
    }
    
    public void calcularPosiciones(Nodo nodo, int x, int y) {
    	if(nodo!=null){
             int ancho = fm.stringWidth(String.valueOf(nodo.getValor()));
             posicionNodo.put(nodo, new Rectangle(x-ancho/2,y-fm.getHeight()-3,ancho+6,fm.getHeight()));
             if(y+distancia > 290) {
            	 calcularPosiciones(nodo.getSiguiente(),x+15,20);
             }else
            	 calcularPosiciones(nodo.getSiguiente(),x,y+distancia);
         }
    }
    
    public void dibujar(Graphics2D g){
    	 Nodo referencia = p.getInicio();
         while(referencia!=null){
        	Rectangle rectangulo = (Rectangle) posicionNodo.get(referencia);
            g.draw(rectangulo);
            g.drawString(String.valueOf(referencia.getValor()),rectangulo.x+3,rectangulo.y+dye);
         	referencia = referencia.getSiguiente();
         }
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        fm = g.getFontMetrics();
        calcular();
        Graphics2D graf = (Graphics2D) g;
        graf.translate(0,0);
        dye = fm.getLeading()+fm.getAscent();
        dibujar(graf);
    }
}

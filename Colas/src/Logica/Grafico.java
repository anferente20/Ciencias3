/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author NATA
 */
public class Grafico extends JPanel {

    Cliente cliente;
    Cola[] colas;
    FontMetrics fm = null;
    HashMap posicionNodo = null;
    int [] posicion = new int[3];
    int clienteAcliente = 30;
    int dye;
    
    public Grafico(Cliente cliente, Cola[] colas) {
        this.cliente = cliente;
        this.colas = colas;
        posicionNodo = new HashMap();
        
        repaint();
    }
    
    public void calcularX(){
        posicion[0] = getWidth()/4;
        posicion[1] = getWidth()/2;
        posicion[2] = (3*getWidth())/4;
    }
    
    public void calcular(){
        posicionNodo.clear();
        calcularPosiciones(colas[0].getInicio(),posicion[0],getHeight());
        calcularPosiciones(colas[1].getInicio(),posicion[1],getHeight());
        calcularPosiciones(colas[2].getInicio(),posicion[2],getHeight());
    }
    
    public void calcularPosiciones(Nodo nodo, int x, int y){
        if(nodo!=null){
            int ancho = fm.stringWidth(nodo.getCliente()+" "+Integer.toString(nodo.getProductos()));
            posicionNodo.put(nodo, new Rectangle(x-ancho/2,y-fm.getHeight()-3,ancho+6,fm.getHeight()));
            calcularPosiciones(nodo.getSiguiente(),x,y-clienteAcliente);
        }
    }
    
    public void dibujar(Graphics2D g, int fila){
        Nodo referencia = colas[fila].getInicio();
        while(referencia!=null){
            Rectangle rectangulo = (Rectangle) posicionNodo.get(referencia);
            g.draw(rectangulo);
            g.drawString(referencia.getCliente()+" "+Integer.toString(referencia.getProductos()),rectangulo.x+3,rectangulo.y+dye);
            referencia = referencia.getSiguiente();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        fm = g.getFontMetrics();
        calcularX();
        calcular();
        Graphics2D graf = (Graphics2D) g;
        graf.translate(0,0);
        dye = fm.getLeading()+fm.getAscent();
        dibujar(graf,0);
        dibujar(graf,1);
        dibujar(graf,2);
    }
    
}

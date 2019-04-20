/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *Clase que define la Cola
 * Fecha: 15.4.19
 * @author anfer
 */
public class Cola {
        /**
	 * Atributo que representa el comienzo de la cola
	 */
	private Nodo inicio;
	/**
	 * Atributo que representa el final de la cola
	 */
	private Nodo fin;
	/**
	 * Atributo que guarda el tamaño actual de la cola
	 */
	private int tamano;
	
	/**
	 * Atributo que muestra la cantidad de productos que se han manejado en la caja
	 */
	private int cantidadProducto;
	/**
	 * Constructor	 
	 */
	public Cola (){
		this.inicio = null;
		this.fin = null;
		this.tamano = 0;
		cantidadProducto = 0;
	}
	/**
	 * Método que se encarga de insertar elementos en la cola
	 */
	public void InsCola(int valor, String cliente) {
		Nodo nuevo = new Nodo(valor,cliente);
		if(inicio == null) {
			inicio = nuevo;
		}else {
			fin.setSiguiente(nuevo);
		}
		this.tamano++;
		fin = nuevo;
	}
	/**
	 * Método que se encarga de sacar elementos de la cola
	 * @return Nodo que sale de la cola
	 */
	public Nodo AtenderCola() {	
		Nodo aux = null;		
		if(!ColaVacia()) { 
			aux = inicio;
			cantidadProducto+=aux.getProductos();
			inicio = aux.getSiguiente();
		}
		this.tamano--;
		return aux;
		
	}
	/**
	 * Método que verifica si la cola esta vacia
	 * @return true si esta vacia, false si no lo esta
	 */
	public boolean ColaVacia() {
		return inicio == null;
	}
	/**
	 * Método que se encarga de eliminar la Cola 
	 */
	public void EliminarCola(){
		while(!ColaVacia()) {
			AtenderCola();
		}
	}
	//--------------------Getters y Setters--------------------------
	public Nodo getInicio() {
		return inicio;
	}	
	public Nodo getFin() {
		return fin;
	}	
	public int getTamano() {
		return tamano;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
}

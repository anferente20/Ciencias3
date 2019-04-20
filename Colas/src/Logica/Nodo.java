/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *Clase que define los elementos de la cola
 * Fecha: 15.4.19
 * @author anfer
 *
 */
public class Nodo {
    
        /**
	 * Variable de tipo entero que guardará el valor del dato
	 */
	private int productos;
	
	/**
	 * Variable que guardará el nombre del cliente
	 */
	private String cliente;
	
	/**
	 * Variable de tipo nodo que muestra el siguiente elemento en la lista
	 */
	private Nodo siguiente;
	
	/**
	 * Constructor del nodo
	 * @param valor valor del nodo que se crea
	 * @param cliente Nombre del cliente
	 */
	public Nodo(int valor, String cliente) {
		this.productos = valor;
		this.cliente = cliente;
		this.siguiente = null;
	}

	//GETTERS Y SETTERS
	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public int getProductos() {
		return productos;
	}

	public void setProductos(int valor) {
		this.productos = valor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
}

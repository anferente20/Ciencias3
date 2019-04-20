package udistrital.edu.Ciencias3.Pilas;
/**
 *Clase que define la pila
 * Fecha: 14.4.19
 * @author anfer
 *
 */
public class Pila {

	/**
	 * Atributo que representa el inicio de la pila
	 */
	private Nodo inicio;
	
	/**
	 * Atributo que representa el total de elementos que hay en la pila
	 */
	private int tamano;
	
	/**
	 * Constructor por defecto
	 */
	public Pila() {
		this.inicio = null;
		this.tamano = 0;
	}
	
	/**
	 * M�todo que se asegura si la lista est� vacia
	 * @return true si est� vacia, false si no lo est�
	 */
	public boolean esVacia() {
		return inicio == null;
	}

	/**
	 * M�todo que permite agregar un nuevo elemento a la pila
	 * @param valor Valor del elemento que se va a agregar.
	 */
	public void push(int valor) {
		Nodo nuevo = new Nodo(valor);
		
		if(esVacia()) {
			inicio = nuevo;
		}else {
			nuevo.setSiguiente(inicio);
			inicio = nuevo;
		}
		tamano++;
	}
	
	/**
	 * M�todo que permite retirar un elemento de la pila
	 * @return Nodo que sale de la pila.
	 */
	public Nodo pop() {
		Nodo sale = null;
		if(!esVacia()) {
			sale = inicio;
			inicio = inicio.getSiguiente();
			tamano--;
		}
		return sale;
	}
	
	/**
	 * M�todo que muestra el elemento que se encuentra en el tope de la pila
	 * @return El valor del tope de la pila
	 * @throws Exception Si la pila est� vac�a
	 */
	public String tope() throws Exception {
		if(!esVacia()) {
			return String.valueOf(inicio.getValor());
		}else {
			return "-";
		}
	}
	
	/**
	 * M�todo que permite saber cu�ntas veces est� repetido un elemento
	 * @param valor Valor a buscar
	 * @return Cantidad de veces que est� repetiodo
	 */
	public int buscar(int valor) {
		int esta = 0;
		
		// copia de la pila
		Nodo aux = inicio;
	
		//Buscamos el valor
		while(aux != null) {
			if(valor == aux.getValor()) {
			esta++;
			}
			aux = aux.getSiguiente();
		}
		return esta;
	}
	
	public double promedio() {
		double suma = 0;
		//Copia de la pila
		Nodo aux = inicio;
		while(aux != null) {
			suma += aux.getValor();
			aux = aux.getSiguiente();
		}
		if(suma == 0) {
			return 0;
		}else
			return (double)(suma/tamano);
	}
	//GETTERS Y SETTERS
	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public int getTamano() {
		return tamano;
	}
	
	
}

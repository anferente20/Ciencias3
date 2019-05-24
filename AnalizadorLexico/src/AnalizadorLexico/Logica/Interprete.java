package AnalizadorLexico.Logica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  Clase que permite interpretat que tipo de palabra se ingresa
 * @author anferente97
 *	Fecha: 24.5.19
 */
public class Interprete {
	/**
	 * Entero estático que  hace referencia al token de un entero
	 */
	private static int ENTERO = 280;
	/**
	 * Entero estático que hace referencia al token de un real
	 */
    private static int REAL = 281;
    /**
     * Entero estático que hace referecia al token de un id
     */
    private static int ID = 282;
    
    /**
     * Método que se encarga de verificar si la palabra recibida es un entero
     * @param palabra. Palabra a verificar
     * @return true si es un entero, false si no lo es
     */
    private boolean verificarEntero(String palabra){
        char[] partes = palabra.toCharArray();
        boolean es = true;
        for(int i =0;i<partes.length;i++){
            if(!Character.isDigit(partes[i])){
                es = false;
            }
        }
        return es;
    }
    
    /**
     * Método que se encarga de verificar si la palabra recibida es un real
     * @param palabra. Palabra a verificar
     * @return true si es un real, false si no lo es
     */
    private boolean verificarReal(String palabra){
        boolean es  = true;
        if(palabra.contains(".") ){
            String[] parte;
            parte = palabra.split(".");
            for(int i = 0;i<parte.length;i++){
                if(!verificarEntero(parte[i])){
                    es = false;
                }
            }
        }else if(palabra.contains(",")){
            String[] parte;
            parte = palabra.split(",");
            for(int i = 0;i<parte.length;i++){
                if(!verificarEntero(parte[i])){
                    es = false;
                }
            }
        }else if(verificarEntero(palabra)) {
        	es = false;
        }else {
        	char[] partes = palabra.toCharArray();
        	for(int i =0;i<partes.length;i++){
                if(Character.isLetter(partes[i])){
                    es = false;
                }
            }
        }
        return es;
    }
    /**
     * Método que se encarga de verificar si la palabra recibida es un id
     * @param palabra. Palabra a verificar
     * @return true si es un id, false si no lo es
     */
    private boolean verificarID(String palabra) {
    	boolean es = true;
    	if(verificarReal(palabra) || verificarEntero(palabra)) {
    		es = false;
    	}
    	return es;
    }
	/**
	 * Método que se encarga de verificar la cadena de palabras y asignarles el token que les corresponde    
	 * @param palabras Cadena de palabras a verificar
	 * @return un arreglo de enteros con los tokens correspondientes
	 */
    public int[] verificar (String palabras) {
    	String[] separadas = palabras.split(" ");
    	int[] es = new int[separadas.length];
    	for(int i = 0;i<separadas.length;i++) {
    		if(verificarID(separadas[i])) {
    			es[i] = this.ID;
    		}else if(verificarReal(separadas[i]) && verificarEntero(separadas[i])) {
    			es[i] = this.REAL;
    		}else if(verificarReal(separadas[i]) && !verificarEntero(separadas[i])) {
    			es[i] = this.REAL;
    		}else if(!verificarReal(separadas[i]) && verificarEntero(separadas[i])) {
    			es[i] = this.ENTERO;
    		}
    	}
    	return es;
    } 
}

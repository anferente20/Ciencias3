/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *Clase que define la Cola
 * Fecha: 15.4.19
 * @author anfer
 */
public class Cliente {
    
    int[] tamanos = new int[3];
    Cola[] colas = new Cola[3];
    int cliente = 0;
    int it;
    ArrayList[] clientescolas;
    
    public Cliente() {
        for (it = 0; it<3; it++) {
            colas[it] = new Cola();
        }
        clientescolas = new ArrayList[3];
	for(it = 0; it<3; it++) {
            clientescolas[it] = new ArrayList<String>();
	}
    }
    
    public void ingresarCliente(String nombre, int productos){
        //Para este caso los clientes se trataran como números, pues no tienen ninguna otra informacion relevante								
	for (it = 0; it<3; it++) {					
            tamanos[it] = colas[it].getTamano();
            //System.out.println("tamano: "+ tamanos[it]);
	}
        int temp = DeterminarMenor(tamanos);	
	//System.out.println("temp (menor): "+ temp);
	colas[temp].InsCola(productos,nombre);
	clientescolas[temp].add(nombre);
    }
    public String atenderCaja(int caja){
        String mensaje = null;
        colas[caja].AtenderCola();
        if(!clientescolas[caja].isEmpty()) {
            mensaje = "Se atendio con exito a "+ clientescolas[caja].get(0)+". En total ha vendido "+
                    colas[caja].getCantidadProducto()+" producto(s).";
            clientescolas[caja].remove(0);
	}else {
            mensaje = "La caja que eligio esta vacia.";
	}
        return mensaje;
    }
    
    public static int DeterminarMenor(int[] valores) {
	if((valores[0] <= valores[1]) && (valores[0] <= valores[2])){
	    return 0;
	}else{	        	
	    if((valores[1] <= valores[0]) && (valores[1] <= valores[2])){
                return 1;
	    }else{
	        return 2;
            }
	}
    }
    
    public JPanel graficar(){
        return new Grafico(this, colas);
    }
    
}

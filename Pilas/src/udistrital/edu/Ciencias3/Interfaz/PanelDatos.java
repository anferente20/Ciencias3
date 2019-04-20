package udistrital.edu.Ciencias3.Interfaz;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import udistrital.edu.Ciencias3.Pilas.Pila;

/**
 *Panel de Datos
 * Fecha: 20.4.19
 * @author anferente97
 *
 */
public class PanelDatos extends JPanel {

	/**
	 * Campo de texto que muestra el tope de la pila
	 */
	private JTextField txtTope;
	/**
	 * Campo de texto que muestra la cantidad de elementos
	 */
	private JTextField txtCantidad;
	/**
	 * campo de texto que muestra el promedio de todos los elementos de la pila
	 */
	private JTextField txtPromedio;
	
	/**
	 * Constructor del panel de datos
	 */
	public PanelDatos() {
		setBorder(new TitledBorder("Datos de la pila"));
		setLayout(new GridLayout(3, 2, 5, 3));
		
		JLabel tope = new JLabel("Tope:");
		JLabel cantidad = new JLabel("Cantidad:");
		JLabel promedio = new JLabel("Promedio:");
		
		txtTope = new JTextField();
		txtCantidad = new JTextField();
		txtPromedio = new JTextField();
		
		txtTope.setEditable(false);
		txtCantidad.setEditable(false);
		txtPromedio.setEditable(false);
		
		add(tope);
		add(txtTope);
		add(cantidad);
		add(txtCantidad);
		add(promedio);
		add(txtPromedio);
		
	}
	
	public void cargar(Pila p) throws Exception {
		txtTope.setText(p.tope());
		txtCantidad.setText(String.valueOf(p.getTamano()));
		txtPromedio.setText(String.valueOf(p.promedio()));
		
	}
}

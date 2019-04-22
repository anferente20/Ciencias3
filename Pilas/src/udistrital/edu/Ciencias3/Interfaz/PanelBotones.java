package udistrital.edu.Ciencias3.Interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel que muestra los botones
 * @author anferente97
 * fecha: 20.4.19
 */
public class PanelBotones extends JPanel implements ActionListener {

	/**
	 * Comando del boton Agregar
	 */
	private static String AGREGAR = "agregar";
	/**
	 * comando del boton Buscar
	 */
	private static String BUSCAR = "buscar";
	
	private static String SACAR = "sacar";	
	/**
	 * Boton agregar
	 */
	private JButton btnAgregar;
	/**
	 * boton buscar
	 */
	private JButton btnBuscar;
	/**
	 * Boton sacar
	 */
	private JButton btnSacar;
	
	/**
	 * Referencia a la ventana principal
	 */
	private Interfaz i;
	
	public PanelBotones(Interfaz i) {

		setBorder(new TitledBorder("Opciones"));
		setLayout(new GridLayout(1, 3));
		
		this.i = i;
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(AGREGAR);
		btnAgregar.addActionListener(this);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setActionCommand(BUSCAR);
		btnBuscar.addActionListener(this);
		
		btnSacar = new JButton("Sacar");
		btnSacar.setActionCommand(SACAR);
		btnSacar.addActionListener(this);
		
		add(btnAgregar);
		add(btnBuscar);
		add(btnSacar);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();

		switch (comando) {
		case "agregar":
			try {
				i.agregar();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
		break;
		
		case "buscar":
			i.buscar();
		break;
		
		case "sacar":
			try {
				i.sacar();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"La pila esta vacia");

			}
		break;
		}
		
	}
}

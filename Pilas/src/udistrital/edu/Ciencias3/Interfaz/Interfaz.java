package udistrital.edu.Ciencias3.Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import udistrital.edu.Ciencias3.Pilas.Pila;

/**
 * Interfaz gráfica del programa
 * Fecha: 20.4.19
 * @author anferente97
 *
 */
public class Interfaz extends JFrame{

	/**
	 * Panel de datos de la pila
	 */
	private PanelDatos pd;
	
	/**
	 * panel con las opciones
	 */
	private PanelBotones po;
	
	/**
	 * Pila de datos
	 */
	private Pila p;
	
	/**
	 * panel del grafico 
	 */
	private PanelGrafico pg;
	
	/**
	 * Crea la ventana
	 * 
	 * @param args.
	 */
	public static void main(String[] args) {
		try {
			// Unifica la interfaz para Mac y para Windows.
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

			Interfaz interfaz = new Interfaz();
			interfaz.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Interfaz() throws Exception {
		// Lo b�sico de una ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(820, 355);
		setTitle("Pilas");
		setLayout(new BorderLayout());
		setResizable(false);
		
		pd = new PanelDatos();
		po = new PanelBotones(this);
		p = new Pila();
		pg = new PanelGrafico(p);
		
		JPanel e = new JPanel(new GridLayout(2,1));
		e.add(pd);
		e.add(po);
		e.setMaximumSize(getPreferredSize());
		add(pg,BorderLayout.CENTER);
		add(e,BorderLayout.EAST);
		pd.cargar(p);
		
	}
	
	/**
	 * Acción que permite agregar un nuevo elemento a la pila
	 * @throws Exception 
	 */
	public void agregar() throws Exception {
		p.push(Integer.valueOf(JOptionPane.showInputDialog(null,"Agregue un numero: " )));
		pg.graficar();
		pd.cargar(p);
	}
	
	/**
	 * Acción que permite buscar cuantas veces está repetido un elemento 
	 */
	public void buscar() {
		int numero =Integer.valueOf(JOptionPane.showInputDialog(null,"�que numero desea buscar?: " )); 
		JOptionPane.showMessageDialog(null,"El nu	mero "+ numero+ " esta repetido "+
				p.buscar(numero)+" veces");
	}
	
	/**
	 * Acción que permite agregar un nuevo elemento a la pila
	 * @throws Exception 
	 */
	public void sacar() throws Exception {
		JOptionPane.showMessageDialog(null,"Se sac� el elemento "+p.pop().getValor()+" de la pila.");
		pg.graficar();
		pd.cargar(p);
	}
}

package udistrital.edu.Ciencias3.Interfaz;

import javax.swing.JPanel;

import udistrital.edu.Ciencias3.Pilas.Pila;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

public class PanelGrafico extends JPanel {

	private Pila p;
	private JInternalFrame internalFrame;
	
	public PanelGrafico(Pila p) {
		setLayout(null);
		this.p=p;
		internalFrame = new JInternalFrame("Datos");
		internalFrame.setBounds(0, 0, 630, 325);
		add(internalFrame);
		internalFrame.setVisible(true);
		

	}
	
	  public void graficar(){
	        this.removeAll();
	        Rectangle tamaño = this.internalFrame.getBounds();
	        this.internalFrame = null;
	        this.internalFrame = new JInternalFrame("Datos",true);
	        this.add(this.internalFrame);
	        this.internalFrame.setVisible(true);
	        this.internalFrame.setBounds(tamaño);
	        this.internalFrame.setEnabled(false);
	        this.internalFrame.setResizable(false);
	        this.internalFrame.add(new Grafico(p),BorderLayout.CENTER);
	    }
}

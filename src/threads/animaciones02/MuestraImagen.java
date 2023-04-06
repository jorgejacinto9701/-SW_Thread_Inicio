package threads.animaciones02;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import threads.animaciones01.HiloMuestraHora;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MuestraImagen extends JFrame {


	private HiloMuestraImagen hilo = null;
	
	
	public MuestraImagen() {
			setSize(785,468);
			
			getContentPane().setLayout(null);
			
			JLabel lblImagen = new JLabel("");
			lblImagen.setIcon(new ImageIcon(MuestraImagen.class.getResource("/images/T1.gif")));
			lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		
			lblImagen.setBounds(77, 58, 589, 281);
			getContentPane().add(lblImagen);
			
			setVisible(true);
		
			
			hilo = new HiloMuestraImagen(lblImagen);
			hilo.start();
	}
	
	
	public static void main(String[] args) {
		new MuestraImagen();
	}
	
}

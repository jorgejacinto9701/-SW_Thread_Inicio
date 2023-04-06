package threads.animaciones01;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MuestraHora extends JFrame {

	private HiloMuestraHora hilo = null;
	
	public MuestraHora() {
		getContentPane().setLayout(null);
		
		JLabel lblHora = new JLabel("");
		lblHora.setHorizontalAlignment(SwingConstants.CENTER);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblHora.setBounds(89, 100, 275, 57);
		getContentPane().add(lblHora);
		
		hilo = new HiloMuestraHora(lblHora);
		hilo.start();
		
		setVisible(true);
		setSize(400, 300);
	}

	public static void main(String[] args) {
		new MuestraHora();
	}

	

}

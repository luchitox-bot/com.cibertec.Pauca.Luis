package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtMostrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtMostrar = new JTextArea();
		txtMostrar.setBounds(10, 59, 416, 444);
		contentPane.add(txtMostrar);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        AlquilerLocalComercial alquilerLocal = new AlquilerLocalComercial(23, "Luis Pauca", 10, 8, 150);
		        mostrarAlquilerLocal(alquilerLocal);

		        AlquilerAirbnb alquilerAirbnb = new AlquilerAirbnb(24, "Paola Silva", 9, 100);
		        mostrarAlquilerAirbnb(alquilerAirbnb);
			}
		    public void mostrarAlquilerLocal(AlquilerLocalComercial alquiler) {
		    	txtMostrar.append("Datos del Alquiler Local Comercial:"+"\n");
		    	txtMostrar.append("Código Cliente: " + alquiler.getCodigoCliente()+"\n");
		    	txtMostrar.append("Nombre Cliente: " + alquiler.getNombreCliente()+"\n");
		    	txtMostrar.append("Días de Alquiler: " + alquiler.getDiasAlquiler()+"\n");
		    	txtMostrar.append("Meses de Alquiler: " + alquiler.getMesesAlquiler()+"\n");
		    	txtMostrar.append("Metraje: " + alquiler.getMetraje()+"\n");
		    	txtMostrar.append("Costo de Alquiler: " + alquiler.costoAlquiler()+"\n");
		    	txtMostrar.append("Caracterización: " + alquiler.caracterizar()+"\n");
		    	txtMostrar.append("\n");
		    }
		    public void mostrarAlquilerAirbnb(AlquilerAirbnb alquiler) {
		    	txtMostrar.append("Datos del Alquiler Airbnb:"+"\n");
		    	txtMostrar.append("Código Cliente: " + alquiler.getCodigoCliente()+"\n");
		    	txtMostrar.append("Nombre Cliente: " + alquiler.getNombreCliente()+"\n");
		    	txtMostrar.append("Días de Alquiler: " + alquiler.getDiasAlquiler()+"\n");
		    	txtMostrar.append("Tarifa Diaria: " + alquiler.getTarifaDiaria()+"\n");
		    	txtMostrar.append("Costo de Alquiler: " + alquiler.costoAlquiler()+"\n");
		    	txtMostrar.append("Caracterización: " + alquiler.caracterizar());
		    }
		});
		btnProcesar.setBounds(147, 10, 151, 21);
		contentPane.add(btnProcesar);
	}
}

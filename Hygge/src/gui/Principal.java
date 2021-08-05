package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 1227, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 99, 71));
		panel.setBounds(184, 0, 1005, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("INICIO");
		btnNewButton.setBounds(642, 0, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("BUSCAR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(731, 0, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("PERFIL");
		btnNewButton_1.setBounds(819, 0, 89, 23);
		panel.add(btnNewButton_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1188, 0, 23, 604);
		contentPane.add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setBounds(36, -6, 151, 129);
//		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\usuario\\Downloads\\HYGGE.png"));
		ImageIcon icon= new ImageIcon(getClass().getResource("HYGGE.png"));
		ImageIcon imag= new ImageIcon(icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(imag);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 99, 71));
		panel_1.setBounds(36, 113, 156, 10);
		contentPane.add(panel_1);
		
		JLabel destinos = new JLabel("Destinos destacados");
		destinos.setForeground(new Color(0, 0, 0));
		destinos.setFont(new Font("Calibri", Font.BOLD, 21));
		destinos.setBounds(36, 156, 223, 33);
		contentPane.add(destinos);
		
		JLabel cate = new JLabel("Categorias");
		cate.setFont(new Font("Calibri", Font.BOLD, 21));
		cate.setBounds(36, 358, 166, 33);
		contentPane.add(cate);
		
		JButton btnNewButton_3 = new JButton("Playa");
		btnNewButton_3.setBounds(36, 431, 223, 147);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Deportes extremos");
		btnNewButton_4.setBounds(269, 431, 221, 147);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Gastronomia");
		btnNewButton_5.setBounds(500, 431, 215, 147);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Cultura");
		btnNewButton_6.setBounds(725, 431, 209, 147);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(944, 431, 223, 147);
		contentPane.add(btnNewButton_7);
		
		
		
		
		
	}
}



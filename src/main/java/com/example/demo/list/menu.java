package com.example.demo.list;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.example.demo.ent.PersonRepository;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu {

	private JFrame frame;
	private JPanel pBody;
	private JButton e1;
	private JButton e2;
	private JButton e3;
	 private Rectangle   rectangle     = new Rectangle( 0, 0, 450, 300 );
	 private PersonRepository Data;
	    public menu(PersonRepository Data)  {
	    	System.setProperty( "java.awt.headless", "false" );
	        this.Data=Data;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(rectangle);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		 frame.setLocationRelativeTo( null );
		frame.setVisible(true);
		Image img = Toolkit.getDefaultToolkit().getImage( "img/morocco.png" );
        frame.setIconImage( img );
		pBody = new JPanel();
		pBody.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(pBody);
		pBody.setLayout(new GridLayout(0, 1, 0, 10));
		
		e1 = new JButton("EXEMPLE1");
		e1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new exp1(Data,rectangle);
			}
		});
		e1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		e1.setForeground(Color.WHITE);
		e1.setBackground(Color.BLUE);
		pBody.add(e1);
		
		e2 = new JButton("EXEMPLE2");
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new exp2(Data,rectangle);
			}
		});
		e2.setForeground(Color.WHITE);
		e2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		e2.setBackground(Color.BLUE);
		pBody.add(e2);
		
		e3 = new JButton("EXEMPLE3");
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new exp3(Data,rectangle);
			}
		});
		e3.setForeground(Color.WHITE);
		e3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		e3.setBackground(Color.BLUE);
		pBody.add(e3);
		pBody.repaint();
		pBody.revalidate();
	}
}

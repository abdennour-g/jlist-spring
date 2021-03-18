package com.example.demo.list;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.AbstractListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.ent.PersonRepository;


public class exp1 {
    private JDialog    fr    = new JDialog();
    private Color     c     = new Color( 0, 255, 0 );
    public JPanel     panel = new JPanel();
    private JList       list;
    private JScrollPane scrollPane;
    private PersonRepository Data;
    public exp1(PersonRepository Data,Rectangle   rectangle)  {
    	System.setProperty( "java.awt.headless", "false" );
        this.Data=Data;
        fr.getContentPane().setBackground( c );
        fr.setDefaultCloseOperation( fr.DISPOSE_ON_CLOSE );
        fr.setBounds( rectangle );
        //  fr.setUndecorated( true );
        // fr.setType( Type.UTILITY );
        //   fr.setSize( (int) r.getWidth(), (int) r.getHeight() );
        Image img = Toolkit.getDefaultToolkit().getImage( "img/morocco.png" );
        fr.setIconImage( img );
        fr.setVisible( true );
        fr.setLocationRelativeTo( null );
        panel.setBackground( c );
        fr.getContentPane().setLayout( new GridLayout( 0, 1, 0, 0 ) );

        fr.getContentPane().add( panel );
        panel.setLayout( new GridLayout( 0, 1, 0, 0 ) );

        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy( ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER );
        scrollPane.setHorizontalScrollBarPolicy( ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER );
        panel.add( scrollPane );
        Object[] noms = Data.findAll().toArray();
        list = new JList();
        list.setFont( new Font( "Trebuchet MS", Font.PLAIN, 15 ) );
        list.setModel( new AbstractListModel() {
        	Object[] values = noms;

            @Override
            public int getSize() {
                return values.length;
            }

            @Override
            public Object getElementAt( int index ) {
                return values[index];
            }
        } );
        scrollPane.setViewportView( list );
        panel.repaint();
        panel.revalidate();
    }

   
}

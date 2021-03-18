package com.example.demo.list;


import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;

import com.example.demo.ent.Person;

public class myCell implements ListCellRenderer {
    private DefaultListCellRenderer defaultRenderer  = new DefaultListCellRenderer();
    private DefaultListCellRenderer defaultRenderer2 = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected,
            boolean cellHasFocus ) {
        Person pers = (Person) value;
        JLabel l1 = (JLabel) defaultRenderer.getListCellRendererComponent( list, value, index,
                isSelected, cellHasFocus );
        JLabel l2 = (JLabel) defaultRenderer2.getListCellRendererComponent( list, value, index,
                isSelected, cellHasFocus );
        JPanel pRend = new JPanel();
        Font ft = new Font( "Trebuchet MS", Font.PLAIN, 14 );
        Color back = Color.blue, fore = Color.white, backCell = Color.red, forCell = Color.yellow;
        pRend.setLayout( new GridLayout( 0, 2, 0, 0 ) );

        l1.setForeground( fore );
        l1.setBackground( back );
        l1.setOpaque( true );
        l1.setFont( ft );
        l2.setHorizontalAlignment( SwingConstants.LEFT );
        l1.setText( " " + pers.getNom() );
        pRend.add( l1 );

        l2.setBackground( back );
        l2.setForeground( fore );
        l2.setOpaque( true );
        l2.setFont( ft );
        l2.setHorizontalAlignment( SwingConstants.RIGHT );
        l2.setText( pers.getPrenom() + " " );
        pRend.add( l2 );
        if ( isSelected || cellHasFocus ) {
            l1.setBackground( backCell );
            l2.setBackground( backCell );
            l1.setForeground( forCell );
            l2.setForeground( forCell );
            l1.setBorder( null );
            l2.setBorder( null );
        }
        return pRend;
    }

}

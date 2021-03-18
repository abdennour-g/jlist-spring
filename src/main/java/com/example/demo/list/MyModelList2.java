package com.example.demo.list;


import javax.swing.AbstractListModel;


public class MyModelList2 extends AbstractListModel {
    private Object[] values;

    public MyModelList2( Object[] values ) {
        super();
        this.values = values;
    }

   
    @Override
    public int getSize() {
        return values.length;
    }

    @Override
    public Object getElementAt( int index ) {
        return values[index];
    }

}

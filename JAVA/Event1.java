package com.ust2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends Frame implements ActionListener{
	TextField t;
	
	
	Event1(){
		t= new TextField();
		t.setBounds(50,100,50,100);
		Button b = new Button("Press");
		t.setBounds(100,100,100,100);
        b.addActionListener(this);
        add(t);
        add(b);
        setSize(500,500);
       
        setVisible(true);
        
	}
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		t.setText("Say java");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Event1();
       System.out.println("");
	}

}

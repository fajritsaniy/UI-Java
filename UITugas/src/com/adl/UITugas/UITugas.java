package com.adl.UITugas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;


import javax.swing.JRadioButton;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class UITugas {

	private JFrame frame;
	private JTextField textField;
	private JTextField input;
	
	int halaman=0;
	int angkaSoal =0;
	String jawaban = "";
	String benar ="";
	int jmlBenar = 0;
	int jmlSalah = 0;
	Integer score =0;
	
	
	
	String soal1[]= {"multiplechoice","siapakah nama trainner JC ?","A.Hanif","B.Agung","C.Abdillah","D.Anggito","A","20"};
	String soal2[] = {"essay","10+10 = ?","20","20"};
	String soal3[] = {"essay", "5+5 = ?","10","20"};
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITugas window = new UITugas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UITugas() {
		initialize();
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 45, 389, 80);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton radio0 = new JRadioButton("");
		radio0.setBounds(20, 132, 109, 23);
		frame.getContentPane().add(radio0);
		
		
		
		JRadioButton radio1 = new JRadioButton("New radio button");
		radio1.setBounds(20, 160, 109, 23);
		frame.getContentPane().add(radio1);
		
		JRadioButton radio2 = new JRadioButton("New radio button");
		radio2.setBounds(20, 186, 109, 23);
		frame.getContentPane().add(radio2);
		
		JRadioButton radio3 = new JRadioButton("New radio button");
		radio3.setBounds(20, 212, 109, 23);
		frame.getContentPane().add(radio3);
		
		JButton buttonNext = new JButton("Next");
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				halaman+=1;
				angkaSoal+=1;
				jawaban = input.getText();
				
				if(halaman==1) {
					if (radio0.isSelected()) {
						jmlBenar+=1;
						score+=score.valueOf(soal1[7]);
					}
					else {
						jmlSalah+=1;
					}
				}
				
				
				if(angkaSoal==1) {
					textField.setText(""+soal2[1]);
					radio0.setText("");
					radio1.setText("");
					radio2.setText("");
					radio3.setText("");
					input.setText("");
					
				}
				if(halaman==2) {
					if(jawaban.equalsIgnoreCase(soal2[2])){
						jmlBenar+=1;
						score+=score.valueOf(soal2[3]);
					}
					else {
						jmlSalah+=1;
					}
				}
				
				if(angkaSoal==2) {
					textField.setText(""+soal3[1]);
					radio0.setText("");
					radio1.setText("");
					radio2.setText("");
					radio3.setText("");
					input.setText("");
				}
				if(halaman==3) {
					if(jawaban.equalsIgnoreCase(soal3[2])){
						jmlBenar+=1;
						score+=score.valueOf(soal3[3]);
					}
					else {
						jmlSalah+=1;
					}
				}
				
				if(angkaSoal==3) {
					JOptionPane.showMessageDialog(frame, "Benar: "+jmlBenar+"\nSalah: "+jmlSalah+"\nTotal Score "+score);
					textField.setText("");
					radio0.setText("");
					radio1.setText("");
					radio2.setText("");
					radio3.setText("");
					input.setText("");
					
				}
			}
				
			
		});
		buttonNext.setBounds(135, 186, 89, 23);
		frame.getContentPane().add(buttonNext);
		
		input = new JTextField();
		input.setBounds(135, 161, 125, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		
		
		textField.setText(soal1[1]);
		radio0.setText(soal1[2]);
		radio1.setText(soal1[3]);
		radio2.setText(soal1[4]);
		radio3.setText(soal1[5]);
		
		JLabel lblNewLabel = new JLabel("Jawaban Essay");
		lblNewLabel.setBounds(135, 136, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Form Quiz");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(148, 11, 112, 23);
		frame.getContentPane().add(lblNewLabel_1);
		if(halaman==1) {
			
			if (radio0.isSelected()) {
				jmlBenar+=1;
			}
			else {
				jmlSalah+=1;
			}}
		
		
	}
}

package reconnaissance_vocale;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import t2s.son.LecteurTexte;

public class Reconnaissance extends JFrame implements ActionListener{
	
		JButton bouton = new JButton("play");
		JTextField textField = new JTextField();
		Reconnaissance(){
		JFrame fenetre = new JFrame("Traducteur Vocale");
		
		textField.setBounds( 50 , 50 , 250 , 40 );  
	
		bouton.setBounds( 50 , 100 , 150 , 40 ); 
		bouton.addActionListener(this);
		fenetre.add(textField);
		fenetre.add(bouton);
		fenetre.setSize(new Dimension(400,400));
		fenetre.setLayout( null );  
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		
		}
@Override
public void actionPerformed(ActionEvent e) {
	String texte=textField.getText();
	LecteurTexte lecteur = new LecteurTexte(texte);
	lecteur.playAll();
	textField.setText("");
	
}  

public static void main(String[] args) {
	new Reconnaissance();
}
  
}

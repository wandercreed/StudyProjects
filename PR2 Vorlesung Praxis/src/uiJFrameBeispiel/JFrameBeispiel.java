package uiJFrameBeispiel;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JFrameBeispiel extends JFrame implements ActionListener{
	private JTextField eingabe;
	private JTextArea ausgabe;
	private JButton okButton;
	
	
	
	public static void main(String[] args) {
		JFrameBeispiel jfb = new JFrameBeispiel();
		jfb.setVisible(true);
		
	}
	
	public JFrameBeispiel() {
		this.setTitle("Fernster Beispiel");
		this.setSize(300,300); //große
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x click = schlie0
		
		eingabe = new JTextField(20);
		ausgabe = new JTextArea(5,20);
		ausgabe.setLineWrap(true);// automatisch auf die neue Zeile umbrechen wenn EINGABE zu lange ist
		ausgabe.setWrapStyleWord(true);
		
		//Die Ausgabe automatisch sichtbar machen, wenn Sie nicht mehr auf den Bildschirm passen sollte.
		
		JScrollPane sp = new JScrollPane(ausgabe);
		
		
		okButton = new JButton("Eingabe übernehmen");
		//okButton.addActionListener(this);//wer Informiert werden soll, wenn ich auf die Button clicke. CALL BACK  -  jetzt bin ich gelicht worden
		okButton.addActionListener(new ActionListener() {//Ausgabe Test EINE NEUE CLASSE INNHERHALB ANDERE
			
			@Override
			public void actionPerformed(ActionEvent e) {
System.out.println("Pennis Test");				
			}
		});
		
		
		Container cp = this.getContentPane();
		cp.add(eingabe,"North");
		cp.add(sp,"Center");
		cp.add(okButton,"South");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ausgabe.append(eingabe.getText() + System.getProperty("line.separator"));  //DIRECT VERERBUNG VON JFrameBeispiel AUSGABE
		
		
		/*JFrame jf = new JFrame("Hallo Button");
		jf.setSize(200,200);
		jf.setVisible(true);		
		this.setVisible(false);    //macht die uhrsprungliche Fernster INVISIBLE nach der eingabe
		*/
	}

}

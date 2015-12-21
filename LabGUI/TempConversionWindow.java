//Ubuntu 12.04 "Precise Pangolin"
//Windows NT 10.0.10586 "10"
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField bawks;
    public TempConversionWindow(){
	this.setTitle("Temperature Conversion Tool");
	this.setSize(640, 480);
	this.setLocation(0, 0);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	JButton b = new JButton("Convert to Fahrenheit");
	b.addActionListener(this);
	b.setActionCommand("toF");
	pane.add(b);
	JButton b2 = new JButton("Convert to Celcius");
	b2.addActionListener(this);
	b2.setActionCommand("toC");
	j = new JLabel("Testing");
	bawks = new JTextField(10);
	pane.add(bawks);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
	
	
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("toF")){
	    String s = bawks.getText();
	    double x = Integer.parseInt(s);
	    x = CtoF(x);
	    j.setText(String.valueOf(x));
	}
	if(event.equals("toC")){
	    String s = bawks.getText();
	    double x = Integer.parseInt(s);
	    x = FtoC(x);
	    j.setText(String.valueOf(x));
	}
    }

    public static double CtoF(double c){
	return (9.0/5.0) * c + 32;
    }
    public static double FtoC(double f){
	return (f - 32) * (5.0/9.0);
    }
}

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
    }
    public void actionPerformed(ActionEvent e){
	System.out.println("An event occured!");
    }
    public static double CtoF(double c){
	return (9.0/5.0) * c + 32;
    }
    public static double FtoC(double f){
	return (f - 32) * (5.0/9.0);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class form1  extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;


    public form1(){
        add(panel1);
        setSize(400,200);
        setTitle("Ilk swing denemem!!!");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//carpiya basinca ram uzerinden de silmeye yariyor kapatinca intelli j de duruyor
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Isim: "+textField1.getText());
                System.out.println("Soy Isim: "+textField2.getText());


            }
        });
    }
}

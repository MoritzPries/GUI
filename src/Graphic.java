import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphic extends JFrame {

    public static void main(String[] args)
    {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try
                {
                    Graphic frame = new Graphic();
                    frame.setVisible(true);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

        JButton _button = new JButton("Test");
        _button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JTextField _textfield = new JTextField("Hallo Test");
                JTextField _textfield2 = new JTextField("Hallo Test");


                int a,b;
                a = Integer.parseInt(_textfield.getText());
                _textfield2.setText("Arschling");

            }
        });
        _button.setBounds(159,114,89,23);


    }

}

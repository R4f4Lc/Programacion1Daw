package ejercicio2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
  private JTextField x1C, x2C, y1C, y2C, resultadoC;
  public Ventana(String string) {
    super(string);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    
    JPanel datosP1 = new JPanel();
    datosP1.setLayout(new FlowLayout());
    
    JPanel datosP2 = new JPanel();
    datosP2.setLayout(new FlowLayout());
    
    JLabel x1L = new JLabel("x1: ");
    x1C = new JTextField(10);
    JLabel x2L = new JLabel("x2: ");
    x2C = new JTextField(10);
    
    JLabel y1L = new JLabel("y1: ");
    y1C = new JTextField(10);
    JLabel y2L = new JLabel("y2: ");
    y2C = new JTextField(10);
    
    datosP1.add(x1L);
    datosP1.add(x1C);
    datosP1.add(x2L);
    datosP1.add(x2C);

    datosP2.add(y1L);
    datosP2.add(y1C);
    datosP2.add(y2L);
    datosP2.add(y2C);
    
    
    JPanel salidaP = new JPanel();
    salidaP.setLayout(new FlowLayout());
    
    JButton b1 = new JButton("Calcular");
    b1.addActionListener(this);
    
    resultadoC = new JTextField(10);
    resultadoC.setEnabled(false);
    
    salidaP.add(b1);
    salidaP.add(resultadoC);
    
    cp.add(datosP1, BorderLayout.NORTH);
    cp.add(datosP2, BorderLayout.CENTER);
    cp.add(salidaP, BorderLayout.SOUTH);
    
  }
  @Override
  public void actionPerformed(ActionEvent ae) {
    try {
      double calcX = Math.pow((Double.parseDouble(x1C.getText()) - Double.parseDouble(x2C.getText())),2);
      double calcY = Math.pow((Double.parseDouble(y1C.getText()) - Double.parseDouble(y2C.getText())),2);
      DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
      String resultado = decimalFormat.format(Math.sqrt((calcX+calcY)));
      resultadoC.setText(resultado);
    }catch(NumberFormatException nfe) {
      JOptionPane.showMessageDialog(null, "Error. Introduce un número.");
    }
  }
}

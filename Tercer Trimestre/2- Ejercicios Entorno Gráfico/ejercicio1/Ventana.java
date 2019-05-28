package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame  implements ActionListener{
  private JTextField baseC, alturaC, resultadoL;
  
  public Ventana(String string) {
    super(string);
    setSize(500,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    
    JPanel datosP = new JPanel();
    datosP.setLayout(new FlowLayout());
    JLabel baseT = new JLabel("Base");
    baseC = new JTextField(10);
    JLabel alturaT = new JLabel("Altura");
    alturaC = new JTextField(10);
    
    datosP.add(baseT);
    datosP.add(baseC);
    datosP.add(alturaT);
    datosP.add(alturaC);
    
    JPanel botonP = new JPanel();
    botonP.setLayout(new FlowLayout());
    JButton botonC = new JButton("Calcular");
    botonC.addActionListener(this);
    
    botonP.add(botonC);
    
    JPanel resultadoP = new JPanel();
    resultadoL = new JTextField(10);
    resultadoL.setEnabled(false);
    resultadoP.add(resultadoL);
    
    
    
    cp.add(datosP, BorderLayout.NORTH);
    cp.add(botonP, BorderLayout.AFTER_LAST_LINE);
    cp.add(resultadoP, BorderLayout.AFTER_LAST_LINE);
    
    //Rectangulo rectangulo = new Rectangulo();
    //cp.add(rectangulo);
    
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    try {
    resultadoL.setText(Double.toString(Integer.parseInt(baseC.getText())*Integer.parseInt(alturaC.getText())));
    }catch(NumberFormatException nfe) {
      JOptionPane.showMessageDialog(null, "Error. Introduce números enteros.","Error",JOptionPane.ERROR_MESSAGE);
    }
  }
  
  
  class Rectangulo extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawRect(20, 10, 100, 300);
      g.setColor(Color.black);
    }
  }
}

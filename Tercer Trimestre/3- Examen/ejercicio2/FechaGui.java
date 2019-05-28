package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class FechaGui {

  private JFrame frmValidadorDeFechas;
  private JTextField textFieldFecha;
  private Fecha fecha;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          FechaGui window = new FechaGui();
          window.frmValidadorDeFechas.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public FechaGui() {
    initialize();
  }
  
  /**
   * Valida la fecha
   * @throws ParseException
   * @throws NullPointerException
   */
  private void validarFecha() throws ParseException, NullPointerException{
    if(textFieldFecha.getText().equals("") || textFieldFecha.getText().length()<10)
      throw new NullPointerException();
    fecha = new Fecha(textFieldFecha.getText());
  }
  
  /**
   * Devuelve el dia posterior
   */
  private void diaPosterior() {
    try {
      validarFecha();
      fecha = new Fecha(textFieldFecha.getText());
      JOptionPane.showMessageDialog(null, "El dia posterior es " + fecha.diaPosterior(), "Válida",JOptionPane.INFORMATION_MESSAGE);
    } catch (ParseException | NullPointerException e) {
      JOptionPane.showMessageDialog(null, "La fecha indicada es invalida. Formato: DD/MM/YYYY", "Error",JOptionPane.ERROR_MESSAGE);
    }
  }

  /**
   * Devuelve el dia Anterior
   */
  private void diaAnterior() {
    try {
      validarFecha();
      fecha = new Fecha(textFieldFecha.getText());
      JOptionPane.showMessageDialog(null, "El dia anterior es " + fecha.diaAnterior(), "Válida",JOptionPane.INFORMATION_MESSAGE);
    } catch (ParseException | NullPointerException e) {
      JOptionPane.showMessageDialog(null, "La fecha indicada es invalida. Formato: DD/MM/YYYY", "Error",JOptionPane.ERROR_MESSAGE);
    }
  }
  
  /**
   * Total de dias hasta hoy
   */
  private void diasHastaHoy() {
    try {
      validarFecha();
      fecha = new Fecha(textFieldFecha.getText());
      JOptionPane.showMessageDialog(null, "Hay un total de " + fecha.diasHastaHoy() + " dias de diferencia.", "Válida",JOptionPane.INFORMATION_MESSAGE);
    } catch (ParseException | NullPointerException e) {
      JOptionPane.showMessageDialog(null, "La fecha indicada es invalida. Formato: DD/MM/YYYY", "Error",JOptionPane.ERROR_MESSAGE);
    }
  }
  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmValidadorDeFechas = new JFrame();
    frmValidadorDeFechas.setTitle("Validador de Fechas");
    frmValidadorDeFechas.setBounds(100, 100, 450, 337);
    frmValidadorDeFechas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmValidadorDeFechas.getContentPane().setLayout(null);
    
    textFieldFecha = new JTextField();
    textFieldFecha.setBounds(184, 34, 208, 32);
    frmValidadorDeFechas.getContentPane().add(textFieldFecha);
    textFieldFecha.setColumns(10);
    
    JLabel lblIntroduceLaFecha = new JLabel("Introduce la fecha:");
    lblIntroduceLaFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
    lblIntroduceLaFecha.setForeground(new Color(0, 0, 0));
    lblIntroduceLaFecha.setBounds(40, 38, 208, 24);
    frmValidadorDeFechas.getContentPane().add(lblIntroduceLaFecha);
    
    
    
    JButton btnValidarFecha = new JButton("Validar Fecha");
    btnValidarFecha.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          validarFecha();
          JOptionPane.showMessageDialog(null, "La fecha es válida", "Válida",JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException | ParseException e1) {
          JOptionPane.showMessageDialog(null, "La fecha indicada es invalida. Formato: DD/MM/YYYY", "Error",JOptionPane.ERROR_MESSAGE);
        }
      }
      
    });
    btnValidarFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
    btnValidarFecha.setBounds(40, 111, 132, 24);
    frmValidadorDeFechas.getContentPane().add(btnValidarFecha);
    
    JButton btnDiaPosterior = new JButton("Dia Posterior");
    btnDiaPosterior.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        diaPosterior();
      }
    });
    btnDiaPosterior.setFont(new Font("Tahoma", Font.BOLD, 13));
    btnDiaPosterior.setBounds(244, 111, 132, 25);
    frmValidadorDeFechas.getContentPane().add(btnDiaPosterior);
    
    JButton btnDiaAnterior = new JButton("Dia Anterior");
    btnDiaAnterior.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        diaAnterior();
      }
    });
    btnDiaAnterior.setFont(new Font("Tahoma", Font.BOLD, 13));
    btnDiaAnterior.setBounds(40, 186, 132, 25);
    frmValidadorDeFechas.getContentPane().add(btnDiaAnterior);
    
    JButton btnDiasHastaHoy = new JButton("Dias hasta hoy");
    btnDiasHastaHoy.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        diasHastaHoy();
      }
    });
    btnDiasHastaHoy.setFont(new Font("Tahoma", Font.BOLD, 13));
    btnDiasHastaHoy.setBounds(244, 186, 132, 25);
    frmValidadorDeFechas.getContentPane().add(btnDiasHastaHoy);
    
    JButton btnSalir = new JButton("Salir");
    btnSalir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
    btnSalir.setBounds(150, 243, 116, 32);
    frmValidadorDeFechas.getContentPane().add(btnSalir);
  }
}

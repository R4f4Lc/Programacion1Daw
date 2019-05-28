package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DNIChecker {

  private JFrame frmComprobadorDni;
  private JTextField textDNI;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          DNIChecker window = new DNIChecker();
          window.frmComprobadorDni.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public DNIChecker() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmComprobadorDni = new JFrame();
    frmComprobadorDni.setTitle("Validador DNI");
    frmComprobadorDni.setBounds(100, 100, 343, 226);
    frmComprobadorDni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmComprobadorDni.getContentPane().setLayout(null);
    
    textDNI = new JTextField();
    textDNI.setBounds(85, 43, 158, 22);
    frmComprobadorDni.getContentPane().add(textDNI);
    textDNI.setColumns(10);
    
    JButton btnComprobar = new JButton("Comprobar");
    btnComprobar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni = textDNI.getText();
        if(dni.length()==9) {
          int num = Integer.parseInt(dni.substring(0,8));
          if((dni.charAt(8)) == letras.charAt(num%23)) {
            JOptionPane.showMessageDialog(null, "El DNI es válido.");
          }
          else {
            JOptionPane.showMessageDialog(null, "El DNI no es válido.");
          }
        }
        else {
          JOptionPane.showMessageDialog(null, "El DNI no es válido.");
        }
    }
   });
    btnComprobar.setBounds(108, 78, 110, 54);
    frmComprobadorDni.getContentPane().add(btnComprobar);
  }
}

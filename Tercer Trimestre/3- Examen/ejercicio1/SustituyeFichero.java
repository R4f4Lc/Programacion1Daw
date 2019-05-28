package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

/**
 * Escribe un programa que usando la interfaz gráfica de Java escoja un fichero del sistema de archivos y
 * lo almacene en otro de manera que se sustituyan todas las ocurrencias de los siguientes caracteres
 * (mayúscula o minúscula) del fichero original por sus correspondientes números:
 * A 4
 * B 8
 * E 3
 * I 1
 * O 0
 * S 5
 * T 7
 * 
 * @author Rafael López
 *
 */

public class SustituyeFichero {

  private JFrame frmSustituyeFicheros;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          SustituyeFichero window = new SustituyeFichero();
          window.frmSustituyeFicheros.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public SustituyeFichero() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    
    frmSustituyeFicheros = new JFrame();
    frmSustituyeFicheros.setTitle("Sustituye Ficheros");
    frmSustituyeFicheros.setBounds(100, 100, 585, 459);
    frmSustituyeFicheros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmSustituyeFicheros.getContentPane().setLayout(null);
    
    
    JFileChooser jfcinput = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfcinput.setDialogTitle("Seleccione un fichero...");
    
    JButton btnFicheroInput = new JButton("Selecciona Fichero");
    btnFicheroInput.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        int returnValue = jfcinput.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfcinput.getSelectedFile().getPath() != null)
            btnFicheroInput.setText("Seleccionado");
      }
    });
    btnFicheroInput.setBounds(351, 21, 158, 37);
    frmSustituyeFicheros.getContentPane().add(btnFicheroInput);
    
    JLabel lblFicheroInput = new JLabel("Seleccione el fichero a sustituir los caracteres:");
    lblFicheroInput.setFont(new Font("Tahoma", Font.BOLD, 13));
    lblFicheroInput.setBounds(34, 25, 327, 28);
    frmSustituyeFicheros.getContentPane().add(lblFicheroInput);
    
    JLabel labelFicheroOutput = new JLabel("Seleccione el fichero de salida:");
    labelFicheroOutput.setFont(new Font("Tahoma", Font.BOLD, 13));
    labelFicheroOutput.setBounds(34, 77, 327, 28);
    frmSustituyeFicheros.getContentPane().add(labelFicheroOutput);
    
    JTextPane textPaneOutput = new JTextPane();
    textPaneOutput.setEditable(false);
    textPaneOutput.setBounds(12, 172, 543, 227);
    frmSustituyeFicheros.getContentPane().add(textPaneOutput);
    
    
    JFileChooser jfcoutput = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfcoutput.setDialogTitle("Seleccione un fichero...");
    
    JButton btnFicheroOutput = new JButton("Selecciona Fichero");
    btnFicheroOutput.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int returnValue = jfcoutput.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfcoutput.getSelectedFile().getPath() != null)
            btnFicheroOutput.setText("Seleccionado");
      }
    });
    btnFicheroOutput.setBounds(351, 73, 158, 37);
    frmSustituyeFicheros.getContentPane().add(btnFicheroOutput);
    
    JButton btnSustituir = new JButton("Sustituir");
    btnSustituir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        sustituirLetras(jfcinput, textPaneOutput, jfcoutput);
      }

      private void sustituirLetras(JFileChooser jfcinput, JTextPane textPaneOutput, JFileChooser jfcoutput) {
        try {
          BufferedReader brinput = new BufferedReader(new FileReader(jfcinput.getSelectedFile().getPath()));
          BufferedWriter bwoutput = new BufferedWriter(new FileWriter(jfcoutput.getSelectedFile().getPath()));
          Vector<String> v = new Vector<String>();
          String linea = "";
          String output = "";
          while (linea != null) {
            linea = brinput.readLine();
            if (linea != null) {
              linea = linea.replace("A", "4");
              linea = linea.replace("B", "8");
              linea = linea.replace("E", "3");
              linea = linea.replace("I", "1");
              linea = linea.replace("O", "0");
              linea = linea.replace("S", "5");
              linea = linea.replace("T", "7");
              linea = linea.replace("a", "4");
              linea = linea.replace("b", "8");
              linea = linea.replace("e", "3");
              linea = linea.replace("i", "1");
              linea = linea.replace("o", "0");
              linea = linea.replace("s", "5");
              linea = linea.replace("t", "7");
              v.addElement(linea);
            }
          }
          
          for (String s : v) {
            bwoutput.write(s + "\n");
            output = output + s + "\n";
          }
          
          textPaneOutput.setText(output);
          
          brinput.close();
          bwoutput.close();
          JOptionPane.showMessageDialog(null, "Se ha sustituido correctamente.", "Correcto",JOptionPane.INFORMATION_MESSAGE);
          
        }catch(IOException | NullPointerException ioe) {
          JOptionPane.showMessageDialog(null, "Indica los dos ficheros correctamente.", "Error",JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    btnSustituir.setFont(new Font("Tahoma", Font.BOLD, 15));
    btnSustituir.setBounds(214, 123, 136, 40);
    frmSustituyeFicheros.getContentPane().add(btnSustituir);
  }  
}

package ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class BuscaPalabras {

  private JFrame frmBuscaPalabras;
  private JTextField campoPalabra;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          BuscaPalabras window = new BuscaPalabras();
          window.frmBuscaPalabras.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public BuscaPalabras() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmBuscaPalabras = new JFrame();
    frmBuscaPalabras.setTitle("Busca Palabras");
    frmBuscaPalabras.setBounds(100, 100, 449, 383);
    frmBuscaPalabras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmBuscaPalabras.getContentPane().setLayout(null);
    
    JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc.setDialogTitle("Seleccione un fichero...");
    
    JButton btnSeleccioneUnFichero = new JButton("Seleccionar");
    btnSeleccioneUnFichero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        int returnValue = jfc.showDialog(null, "Seleccionar");
        if(returnValue == JFileChooser.APPROVE_OPTION)
        if(jfc.getSelectedFile().getPath() != null)
          btnSeleccioneUnFichero.setText("Seleccionado");
      }
    });
    btnSeleccioneUnFichero.setBounds(153, 43, 130, 36);
    frmBuscaPalabras.getContentPane().add(btnSeleccioneUnFichero);
    
    
    JLabel labelResultado = new JLabel("");
    labelResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
    labelResultado.setBounds(96, 276, 253, 47);
    frmBuscaPalabras.getContentPane().add(labelResultado);
    
    JLabel lblSeleccioneUnFichero = new JLabel("Seleccione un fichero:");
    lblSeleccioneUnFichero.setFont(new Font("Tahoma", Font.BOLD, 16));
    lblSeleccioneUnFichero.setBounds(131, 13, 204, 28);
    frmBuscaPalabras.getContentPane().add(lblSeleccioneUnFichero);
    
    JLabel lblIndiqueLaPalabra = new JLabel("Indique la palabra a buscar:");
    lblIndiqueLaPalabra.setFont(new Font("Tahoma", Font.BOLD, 16));
    lblIndiqueLaPalabra.setBounds(102, 93, 307, 28);
    frmBuscaPalabras.getContentPane().add(lblIndiqueLaPalabra);
    
    campoPalabra = new JTextField();
    campoPalabra.setBounds(153, 133, 130, 22);
    frmBuscaPalabras.getContentPane().add(campoPalabra);
    campoPalabra.setColumns(10);
    
    JLabel lblResultado = new JLabel("Resultado:");
    lblResultado.setFont(new Font("Tahoma", Font.BOLD, 16));
    lblResultado.setBounds(12, 245, 307, 28);
    frmBuscaPalabras.getContentPane().add(lblResultado);
    
    JButton btnBuscar = new JButton("BUSCAR");
    btnBuscar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        try {
          if(campoPalabra.getText()!=null && jfc.getSelectedFile().getPath() != null)
            buscar(jfc.getSelectedFile().getPath(),campoPalabra.getText());
          else
            JOptionPane.showMessageDialog(null, "Introduce la palabra y fichero a buscar.");
        }
        catch(NullPointerException e) {
          JOptionPane.showMessageDialog(null, "Introduce la palabra y fichero a buscar.");
        }
      }

      private void buscar(String path, String palabra) {
        try {
          BufferedReader br = new BufferedReader(new FileReader(path));
          String linea = "";
          int i = 0;
          int repeticiones = 0;
          JOptionPane.showMessageDialog(null, palabra);
          //if(palabra!=null) {
          while ((linea = br.readLine()) != null) {
            while ((i = linea.indexOf(palabra)) != -1) {
              linea = linea.substring(i + palabra.length(), linea.length());
              repeticiones++;
            }
          }
          
          br.close();
          
          labelResultado.setText("La palabra " + palabra + " se repite " + repeticiones + " veces.");

          //}

        } catch (FileNotFoundException | IndexOutOfBoundsException ioe) {
          JOptionPane.showMessageDialog(null, "No se ha encontrado el fichero.");
        } catch (IOException e) {
          JOptionPane.showMessageDialog(null, "No se ha podido leer el fichero.");
        } catch(NullPointerException e) {
          JOptionPane.showMessageDialog(null, "Introduce la palabra a buscar.");
        }
      }
    });
    btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
    btnBuscar.setBounds(131, 185, 175, 47);
    frmBuscaPalabras.getContentPane().add(btnBuscar);
    
  }
}

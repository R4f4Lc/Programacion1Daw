package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

import java.awt.BorderLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class FusionarFicheros {

  private JFrame frmFusionarFicheros;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          FusionarFicheros window = new FusionarFicheros();
          window.frmFusionarFicheros.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public FusionarFicheros() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmFusionarFicheros = new JFrame();
    frmFusionarFicheros.setTitle("Fusionar Ficheros");
    frmFusionarFicheros.setBounds(100, 100, 535, 301);
    frmFusionarFicheros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmFusionarFicheros.getContentPane().setLayout(null);

    JLabel lblFichero1 = new JLabel("Seleccione el Primer Fichero :");
    lblFichero1.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblFichero1.setBounds(12, 13, 257, 42);
    frmFusionarFicheros.getContentPane().add(lblFichero1);

    JLabel lblFichero2 = new JLabel("Seleccione el Segundo Fichero :");
    lblFichero2.setFont(new Font("Tahoma", Font.BOLD, 15));
    lblFichero2.setBounds(12, 82, 257, 42);
    frmFusionarFicheros.getContentPane().add(lblFichero2);

    JFileChooser jfc1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc1.setDialogTitle("Seleccione un fichero...");

    JButton btnSeleccionarF1 = new JButton("Seleccionar");
    btnSeleccionarF1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int returnValue = jfc1.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfc1.getSelectedFile().getPath() != null)
            btnSeleccionarF1.setText("Seleccionado");
      }
    });
    btnSeleccionarF1.setBounds(326, 19, 133, 32);
    frmFusionarFicheros.getContentPane().add(btnSeleccionarF1);

    JFileChooser jfc2 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc2.setDialogTitle("Seleccione un fichero...");

    JButton btnSeleccionarF2 = new JButton("Seleccionar");
    btnSeleccionarF2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int returnValue = jfc2.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfc2.getSelectedFile().getPath() != null)
            btnSeleccionarF2.setText("Seleccionado");
      }
    });
    btnSeleccionarF2.setBounds(326, 92, 133, 32);
    frmFusionarFicheros.getContentPane().add(btnSeleccionarF2);

    JButton btnFusionar = new JButton("FUSIONAR");
    btnFusionar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          BufferedReader br1 = new BufferedReader(new FileReader(jfc1.getSelectedFile().getPath()));
          BufferedReader br2 = new BufferedReader(new FileReader(jfc2.getSelectedFile().getPath()));
          BufferedWriter bw = new BufferedWriter(new FileWriter("fusionado.txt"));
          Vector<String> v = new Vector<String>();

          String linea = "";
          while (linea != null) {
            linea = br1.readLine();
            if (linea != null)
              v.addElement(linea);

            linea = br2.readLine();
            if (linea != null)
              v.addElement(linea);
          }

          for (String s : v) {
            bw.write(s + "\n");
          }

          br1.close();
          br2.close();
          bw.close();
        } catch (IOException | NullPointerException ioe) {
          JOptionPane.showMessageDialog(null, "Indica los dos ficheros correctamente.", "Error",
              JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    btnFusionar.setFont(new Font("Tahoma", Font.BOLD, 15));
    btnFusionar.setBounds(171, 169, 182, 54);
    frmFusionarFicheros.getContentPane().add(btnFusionar);
  }

}

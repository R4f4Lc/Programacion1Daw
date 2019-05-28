package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DesglosaDinero {

  private JFrame frmDesglosadorDeDinero;
  private JTextField textField;
  private JTextField textField_20euros;
  private JTextField textField_5euros;
  private JTextField textField_10euros;
  private JTextField textField_50euros;
  private JTextField textField_100euros;
  private JTextField textField_500euros;
  private JTextField textField_200euros;
  private JLabel lbl1cts;
  private JTextField textField_1cts;
  private JLabel lbl2cts;
  private JTextField textField_2cts;
  private JLabel lbl5cts;
  private JTextField textField_5cts;
  private JLabel lbl10cts;
  private JTextField textField_10cts;
  private JLabel lbl20cts;
  private JTextField textField_20cts;
  private JLabel lbl50cts;
  private JTextField textField_50cts;
  private JLabel lbl1euros;
  private JTextField textField_1euros;
  private JLabel lbl2euros;
  private JTextField textField_2euros;
  private JLabel lblMonedas;
  private JLabel lblBilletes;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          DesglosaDinero window = new DesglosaDinero();
          window.frmDesglosadorDeDinero.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public DesglosaDinero() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frmDesglosadorDeDinero = new JFrame();
    frmDesglosadorDeDinero.setTitle("Desglosador de Dinero");
    frmDesglosadorDeDinero.setBounds(100, 100, 534, 732);
    frmDesglosadorDeDinero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmDesglosadorDeDinero.getContentPane().setLayout(null);
    
    textField = new JTextField();
    textField.setBounds(214, 23, 253, 40);
    frmDesglosadorDeDinero.getContentPane().add(textField);
    textField.setColumns(10);
    
    JLabel lblIntroduzcaElDinero = new JLabel("Introduzca el dinero:");
    lblIntroduzcaElDinero.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
    lblIntroduzcaElDinero.setBounds(45, 25, 221, 34);
    frmDesglosadorDeDinero.getContentPane().add(lblIntroduzcaElDinero);
    
    JLabel lbl20Euros = new JLabel("20");
    lbl20Euros.setBounds(12, 501, 96, 51);
    Image img20 = new ImageIcon("img/20euros.jpg").getImage();
    ImageIcon img20_2 = new ImageIcon(img20.getScaledInstance(lbl20Euros.getWidth(), lbl20Euros.getHeight(), Image.SCALE_DEFAULT));
    lbl20Euros.setIcon(img20_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl20Euros);
    
    textField_20euros = new JTextField();
    textField_20euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_20euros.setEnabled(false);
    textField_20euros.setBounds(114, 520, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_20euros);
    textField_20euros.setColumns(10);
    
    textField_5euros = new JTextField();
    textField_5euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_5euros.setEnabled(false);
    textField_5euros.setColumns(10);
    textField_5euros.setBounds(114, 456, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_5euros);
    
    JLabel lbl5Euros = new JLabel("5");
    lbl5Euros.setBounds(12, 437, 96, 51);
    Image img5 = new ImageIcon("img/5euros.png").getImage();
    ImageIcon img5_2 = new ImageIcon(img5.getScaledInstance(lbl5Euros.getWidth(), lbl5Euros.getHeight(), Image.SCALE_DEFAULT));
    lbl5Euros.setIcon(img5_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl5Euros);
    
    JLabel lbl10Euros = new JLabel("10");
    lbl10Euros.setBounds(274, 437, 96, 51);
    Image img10 = new ImageIcon("img/10euros.png").getImage();
    ImageIcon img10_2 = new ImageIcon(img10.getScaledInstance(lbl10Euros.getWidth(), lbl10Euros.getHeight(), Image.SCALE_DEFAULT));
    lbl10Euros.setIcon(img10_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl10Euros);
    
    textField_10euros = new JTextField();
    textField_10euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_10euros.setEnabled(false);
    textField_10euros.setColumns(10);
    textField_10euros.setBounds(376, 456, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_10euros);
    
    JLabel lbl50Euros = new JLabel("50");
    lbl50Euros.setBounds(274, 501, 96, 51);
    Image img50 = new ImageIcon("img/50euros.png").getImage();
    ImageIcon img50_2 = new ImageIcon(img50.getScaledInstance(lbl50Euros.getWidth(), lbl50Euros.getHeight(), Image.SCALE_DEFAULT));
    lbl50Euros.setIcon(img50_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl50Euros);
    
    textField_50euros = new JTextField();
    textField_50euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_50euros.setEnabled(false);
    textField_50euros.setColumns(10);
    textField_50euros.setBounds(376, 520, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_50euros);
    
    JLabel lbl100Euros = new JLabel("100");
    lbl100Euros.setBounds(12, 567, 96, 51);
    Image img100 = new ImageIcon("img/100euros.jpg").getImage();
    ImageIcon img100_2 = new ImageIcon(img100.getScaledInstance(lbl100Euros.getWidth(), lbl100Euros.getHeight(), Image.SCALE_DEFAULT));
    lbl100Euros.setIcon(img100_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl100Euros);
    
    textField_100euros = new JTextField();
    textField_100euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_100euros.setEnabled(false);
    textField_100euros.setColumns(10);
    textField_100euros.setBounds(114, 586, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_100euros);
    
    JLabel lbl500Euros = new JLabel("500");
    lbl500Euros.setBounds(12, 621, 96, 51);
    Image img500 = new ImageIcon("img/500euros.jpg").getImage();
    ImageIcon img500_2 = new ImageIcon(img500.getScaledInstance(lbl500Euros.getWidth(), lbl500Euros.getHeight(), Image.SCALE_DEFAULT));
    lbl500Euros.setIcon(img500_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl500Euros);
    
    textField_500euros = new JTextField();
    textField_500euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_500euros.setEnabled(false);
    textField_500euros.setColumns(10);
    textField_500euros.setBounds(114, 640, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_500euros);
    
    JLabel lbl200Euros = new JLabel("200");
    lbl200Euros.setBounds(274, 567, 96, 51);
    Image img200 = new ImageIcon("img/200euros.jpg").getImage();
    ImageIcon img200_2 = new ImageIcon(img200.getScaledInstance(lbl200Euros.getWidth(), lbl200Euros.getHeight(), Image.SCALE_DEFAULT));
    lbl200Euros.setIcon(img200_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl200Euros);
    
    textField_200euros = new JTextField();
    textField_200euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_200euros.setEnabled(false);
    textField_200euros.setColumns(10);
    textField_200euros.setBounds(376, 586, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_200euros);
    
    lbl1cts = new JLabel("0.1");
    lbl1cts.setBounds(12, 138, 67, 51);
    Image img01 = new ImageIcon("img/1cts.png").getImage();
    ImageIcon img01_2 = new ImageIcon(img01.getScaledInstance(lbl1cts.getWidth(), lbl1cts.getHeight(), Image.SCALE_DEFAULT));
    lbl1cts.setIcon(img01_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl1cts);
    
    textField_1cts = new JTextField();
    textField_1cts.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_1cts.setEnabled(false);
    textField_1cts.setColumns(10);
    textField_1cts.setBounds(114, 152, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_1cts);
    
    lbl2cts = new JLabel("0.2");
    lbl2cts.setBounds(274, 133, 67, 51);
    Image img02 = new ImageIcon("img/2cts.png").getImage();
    ImageIcon img02_2 = new ImageIcon(img02.getScaledInstance(lbl2cts.getWidth(), lbl2cts.getHeight(), Image.SCALE_DEFAULT));
    lbl2cts.setIcon(img02_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl2cts);
    
    textField_2cts = new JTextField();
    textField_2cts.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_2cts.setEnabled(false);
    textField_2cts.setColumns(10);
    textField_2cts.setBounds(376, 152, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_2cts);
    
    lbl5cts = new JLabel("0.05");
    lbl5cts.setBounds(12, 197, 67, 51);
    Image img05 = new ImageIcon("img/5cts.png").getImage();
    ImageIcon img05_2 = new ImageIcon(img05.getScaledInstance(lbl5cts.getWidth(), lbl5cts.getHeight(), Image.SCALE_DEFAULT));
    lbl5cts.setIcon(img05_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl5cts);
    
    textField_5cts = new JTextField();
    textField_5cts.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_5cts.setEnabled(false);
    textField_5cts.setColumns(10);
    textField_5cts.setBounds(114, 216, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_5cts);
    
    lbl10cts = new JLabel("0.10");
    lbl10cts.setBounds(274, 197, 67, 51);
    Image img010 = new ImageIcon("img/10cts.png").getImage();
    ImageIcon img010_2 = new ImageIcon(img010.getScaledInstance(lbl10cts.getWidth(), lbl10cts.getHeight(), Image.SCALE_DEFAULT));
    lbl10cts.setIcon(img010_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl10cts);
    
    textField_10cts = new JTextField();
    textField_10cts.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_10cts.setEnabled(false);
    textField_10cts.setColumns(10);
    textField_10cts.setBounds(376, 216, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_10cts);
    
    lbl20cts = new JLabel("0.20");
    lbl20cts.setBounds(12, 253, 67, 51);
    Image img020 = new ImageIcon("img/20cts.png").getImage();
    ImageIcon img020_2 = new ImageIcon(img020.getScaledInstance(lbl20cts.getWidth(), lbl20cts.getHeight(), Image.SCALE_DEFAULT));
    lbl20cts.setIcon(img020_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl20cts);
    
    textField_20cts = new JTextField();
    textField_20cts.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_20cts.setEnabled(false);
    textField_20cts.setColumns(10);
    textField_20cts.setBounds(114, 272, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_20cts);
    
    lbl50cts = new JLabel("0.50");
    lbl50cts.setBounds(274, 253, 67, 51);
    Image img050 = new ImageIcon("img/50cts.png").getImage();
    ImageIcon img050_2 = new ImageIcon(img050.getScaledInstance(lbl50cts.getWidth(), lbl50cts.getHeight(), Image.SCALE_DEFAULT));
    lbl50cts.setIcon(img050_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl50cts);
    
    textField_50cts = new JTextField();
    textField_50cts.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_50cts.setEnabled(false);
    textField_50cts.setColumns(10);
    textField_50cts.setBounds(376, 272, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_50cts);
    
    lbl1euros = new JLabel("1");
    lbl1euros.setBounds(12, 317, 67, 51);
    Image img01e = new ImageIcon("img/1euro.png").getImage();
    ImageIcon img01e_2 = new ImageIcon(img01e.getScaledInstance(lbl1euros.getWidth(), lbl1euros.getHeight(), Image.SCALE_DEFAULT));
    lbl1euros.setIcon(img01e_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl1euros);
    
    textField_1euros = new JTextField();
    textField_1euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_1euros.setEnabled(false);
    textField_1euros.setColumns(10);
    textField_1euros.setBounds(114, 336, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_1euros);
    
    lbl2euros = new JLabel("2");
    lbl2euros.setBounds(274, 317, 67, 51);
    Image img02e = new ImageIcon("img/2euro.png").getImage();
    ImageIcon img02e_2 = new ImageIcon(img02e.getScaledInstance(lbl2euros.getWidth(), lbl2euros.getHeight(), Image.SCALE_DEFAULT));
    lbl2euros.setIcon(img02e_2);
    frmDesglosadorDeDinero.getContentPane().add(lbl2euros);
    
    textField_2euros = new JTextField();
    textField_2euros.setFont(new Font("Tahoma", Font.BOLD, 13));
    textField_2euros.setEnabled(false);
    textField_2euros.setColumns(10);
    textField_2euros.setBounds(376, 336, 116, 22);
    frmDesglosadorDeDinero.getContentPane().add(textField_2euros);
    
    lblMonedas = new JLabel("Monedas:");
    lblMonedas.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblMonedas.setBounds(12, 98, 148, 41);
    frmDesglosadorDeDinero.getContentPane().add(lblMonedas);
    
    lblBilletes = new JLabel("Billetes:");
    lblBilletes.setFont(new Font("Tahoma", Font.BOLD, 18));
    lblBilletes.setBounds(12, 397, 148, 41);
    frmDesglosadorDeDinero.getContentPane().add(lblBilletes);
    
    JButton btnDesglosar = new JButton("Desglosar");
    btnDesglosar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        desglosar_dinero();
      }

      private void desglosar_dinero() {
        double euros = Double.parseDouble(textField.getText());
        int billete500 = 0;
        int billete200 = 0;
        int billete100 = 0;
        int billete50 = 0;
        int billete20 = 0;
        int billete10 = 0;
        int billete5 = 0;
        int moneda2eur = 0;
        int moneda1eur = 0;
        int moneda50ct = 0;
        int moneda20ct = 0;
        int moneda10ct = 0;
        int moneda5ct = 0;
        int moneda2ct = 0;
        int moneda1ct = 0;
            
        while(euros>=500) {
          billete500 = billete500+1;
          euros = euros - 500;
         }
        
        while(euros>=200) {
          billete200= billete200+1;
          euros = euros - 200;
        }
        
        while(euros >= 100) {
          billete100=billete100+1;
          euros = euros - 100;
        }
        
        while(euros >= 50) {
          billete50=billete50+1;
          euros = euros - 50;
        }
        
        while(euros >= 20) {
          billete20= billete20+1;
          euros = euros - 20;
        }
        
        while(euros >=10) {
          billete10 = billete10+1;
          euros = euros-10;
        }
        
        while(euros >=5) {
          billete5=billete5+1;
          euros = euros-5;
        }
        
        while(euros>=2) {
          moneda2eur = moneda2eur+1;
          euros = euros -2;
        }
        
        while(euros>=1) {
          moneda1eur = moneda1eur + 1;
          euros = euros -1;
        }
        
        while(euros>=0.50) {
          moneda50ct= moneda50ct + 1;
          euros = euros - 0.50;
        }
        
        while(euros>=0.20) {
          moneda20ct = moneda20ct + 1;
          euros = euros - 0.20;
        }
        
        while(euros>=0.10) {
          moneda10ct = moneda10ct + 1;
          euros = euros - 0.10;
        }
        
        while(euros>=0.05) {
          moneda5ct= moneda5ct+1;
          euros=euros-0.05;
        }
        
        while(euros>=0.02) {
          moneda2ct = moneda2ct+1;
          euros=euros-0.02;
        }
        
        while(euros>=0.01) {
          moneda1ct= moneda1ct+1;
          euros=euros-0.01;
        }
        
        textField_1cts.setText(Double.toString(moneda1ct));
        textField_2cts.setText(Double.toString(moneda2ct));
        textField_5cts.setText(Double.toString(moneda5ct));
        textField_10cts.setText(Double.toString(moneda10ct));
        textField_20cts.setText(Double.toString(moneda20ct));
        textField_50cts.setText(Double.toString(moneda50ct));
        textField_1euros.setText(Double.toString(moneda1eur));
        textField_2euros.setText(Double.toString(moneda2eur));

        
        textField_5euros.setText(Double.toString(billete5));
        textField_10euros.setText(Double.toString(billete10));
        textField_20euros.setText(Double.toString(billete20));
        textField_50euros.setText(Double.toString(billete50));
        textField_100euros.setText(Double.toString(billete100));
        textField_200euros.setText(Double.toString(billete200));
        textField_500euros.setText(Double.toString(billete500));
      }
    });
    btnDesglosar.setFont(new Font("Tahoma", Font.BOLD, 13));
    btnDesglosar.setBounds(274, 76, 134, 42);
    frmDesglosadorDeDinero.getContentPane().add(btnDesglosar);
  }
}

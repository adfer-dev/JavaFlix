package vista;

import controlador.GestionClientes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import modelo.Cliente;
import modelo.ErrorUI;
import modelo.TarjetaCredito;

public class Registro extends javax.swing.JFrame implements ErrorUI {

    private final JFrame principal;
    private ArrayList<String> datos = new ArrayList();

    /**
     * Creates new form Introducir
     */
    public Registro(JFrame v) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        this.labelError.setVisible(false);

        //añadir todos los dni, correos y tarjetas a una lista para durante el registro comprobar si el que se introduce está disponible.
        if (!(GestionClientes.getClientes().isEmpty())) {
            GestionClientes.getClientes().forEach(c -> {

                datos.add(c.getCorreo());
                datos.add(c.getTarjeta().getNumero());
                datos.add(c.getDni());

            });
        }

    }

    @Override
    public void MostrarError(JLabel label, String textoError) {
        label.setText(textoError);
        label.setVisible(true);
    }

    private boolean comprobarNulo(String cadena) {

        return cadena.isEmpty();
    }

    private boolean comprobarCorreo() {
        Pattern patronCorreo = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = patronCorreo.matcher(tfCorreo.getText());

        if (!(datos.contains(tfCorreo.getText()))) {

            if ((matcher.find())) {
                return true;
            } else {
                MostrarError(labelError, "El formato del correo debe ser el siguiente: aa@org.dom");
                return false;
            }

        } else {
            MostrarError(labelError, "El correo introducido no se encuentra disponible.");
            return false;
        }

    }

    private boolean comprobarTarjeta() {

        if(datos.contains(tfTarjeta.getText())){
            MostrarError(labelError, "El número de tarjeta introducido no se encuentra disponible.");
            return false;
        }
        
        else{
            return true;
        }
    }
    
    private boolean comprobarDNI(){
        
        if(datos.contains(tfDNI.getText())){
            MostrarError(labelError, "El DNI introducido no se encuentra disponible.");
            return false;
        }
        
        else{
            return true;
        }
       
    }
    
    private boolean comprobarFecha(){
        Pattern patronFecha = Pattern.compile("^(0[1-9]|1[012])/([0-9]{2})$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = patronFecha.matcher(tfFechaCad.getText());
        
        if(!(matcher.matches())){
            MostrarError(labelError, "El mes no puede ser mayor que 12.");
            return false;
        }
        
        else{
            return true;
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        pfClave = new javax.swing.JPasswordField();
        tfFechaCad = new javax.swing.JFormattedTextField();
        tfDNI = new javax.swing.JFormattedTextField();
        labelError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfTarjeta = new javax.swing.JFormattedTextField();
        labelTarjeta = new javax.swing.JLabel();
        labelCorreo1 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Usuario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelNombre.setText("Nombre");

        pfClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            tfFechaCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfFechaCad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            tfDNI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelError.setForeground(new java.awt.Color(204, 0, 0));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("jLabel2");

        jLabel1.setText("FC");

        try {
            tfTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("################")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelTarjeta.setText("Tarjeta");

        labelCorreo1.setText("Contraseña");

        labelCorreo.setText("Correo");

        labelDNI.setText("DNI");

        botonAceptar.setText("ACEPTAR");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCorreo1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pfClave)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(438, 438, 438)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(botonAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(tfDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTarjeta))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfTarjeta)
                        .addComponent(tfFechaCad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(122, 122, 122)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo1)
                    .addComponent(pfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(botonAceptar)
                .addGap(35, 35, 35)
                .addComponent(labelError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDNI)
                        .addComponent(labelTarjeta)
                        .addComponent(tfTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelCorreo)
                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(tfFechaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(219, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(739, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        String valorClave = String.valueOf(pfClave.getPassword());//Valor de la contraseña parseado a String.

        //Caso en el que alguno de los campos no ha sido rellenado.
        if ((comprobarNulo(tfDNI.getText())) || (comprobarNulo(tfNombre.getText())) || (comprobarNulo(valorClave)) || (comprobarNulo(tfTarjeta.getText()))) {
            MostrarError(labelError, "Todos los campos deben ser rellenados");
        } 
        //Comprobar que el numero de tarjeta no haya sido introducido antes.
        else if (!(comprobarTarjeta())) {
            tfTarjeta.setText("");
        }
        //Comprobar que el correo cumpla con el formato establecido y que no haya sido introducido antes.
        else if (!(comprobarCorreo())) {
            tfCorreo.setText("");
        }
        //Comprobar que el DNI introducido no sea de otro cliente
        else if(!(comprobarDNI())){
            tfDNI.setText("");
        }
        //Comprobar si el formato de la fecha es correcto
        else if(!(comprobarFecha())){
            tfFechaCad.setText("");
        }
        //Comprobar que la fecha no sea nula.
        //Si no hay nulos ni errores de formato: crear el cliente e introducirlo en la lista.
        else {
            try {
                Date fechaCad = new SimpleDateFormat("MM/yy").parse(tfFechaCad.getText());
                TarjetaCredito tarjetaRegistrada = new TarjetaCredito(tfTarjeta.getText(), fechaCad);
                Cliente clienteRegistrado = new Cliente(tfDNI.getText(), tfNombre.getText(), tfCorreo.getText(), valorClave, tarjetaRegistrada);
                GestionClientes.IntroducirCliente(clienteRegistrado);
                dispose();//Cerrar la ventana pero no la app.
            } catch (ParseException ex) {
                MostrarError(labelError, "El formato de la fecha debe ser el siguiente : MM/AA");

            }

        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelCorreo1;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTarjeta;
    private javax.swing.JPasswordField pfClave;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JFormattedTextField tfDNI;
    private javax.swing.JFormattedTextField tfFechaCad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JFormattedTextField tfTarjeta;
    // End of variables declaration//GEN-END:variables

}

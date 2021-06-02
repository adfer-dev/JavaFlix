package vista;

import controlador.GestionContenido;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Capitulo;
import modelo.ErrorUI;
import modelo.Serie;

public class ModificarSerie extends javax.swing.JFrame implements ErrorUI {

    private final JFrame principal;
    private final ArrayList<Capitulo> capitulos= new ArrayList();
    private File archivoPortada;
    private final int indice;
    
    public ModificarSerie(JFrame v, int indice) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        labelError.setVisible(false);
        this.indice=indice;
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelAnio = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        labelActores = new javax.swing.JLabel();
        labelCorreo1 = new javax.swing.JLabel();
        tfGenero = new javax.swing.JTextField();
        labelCorreo = new javax.swing.JLabel();
        labelDNI = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSinopsis = new javax.swing.JTextArea();
        tfAnio = new javax.swing.JFormattedTextField();
        tfActores = new javax.swing.JTextField();
        labelDuracion = new javax.swing.JLabel();
        tfNumTem = new javax.swing.JFormattedTextField();
        labelPortada = new javax.swing.JLabel();
        botonImagen = new javax.swing.JButton();
        labelDirector = new javax.swing.JLabel();
        tfTituloCap = new javax.swing.JTextField();
        buttonCapitulos = new javax.swing.JButton();
        tfDuracionCap = new javax.swing.JFormattedTextField();
        labelDirector1 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Serie");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelAnio.setText("Año");

        labelError.setForeground(new java.awt.Color(204, 0, 0));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("jLabel2");

        labelActores.setText("Actores");

        labelCorreo1.setText("Sinopsis");

        labelCorreo.setText("Género");

        labelDNI.setText("Titulo");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        taSinopsis.setColumns(2);
        taSinopsis.setLineWrap(true);
        taSinopsis.setRows(5);
        taSinopsis.setTabSize(5);
        taSinopsis.setAutoscrolls(false);
        jScrollPane1.setViewportView(taSinopsis);

        try {
            tfAnio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelDuracion.setText("Temporadas");

        try {
            tfNumTem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNumTem.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelPortada.setText("Portada");

        botonImagen.setText("AÑADIR IMÁGEN");
        botonImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImagenActionPerformed(evt);
            }
        });

        labelDirector.setText("Titulo");

        buttonCapitulos.setText("AÑADIR");
        buttonCapitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCapitulosActionPerformed(evt);
            }
        });

        try {
            tfDuracionCap.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDirector1.setText("Duración");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfAnio))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addComponent(labelDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfTituloCap, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelDirector1)
                                        .addGap(24, 24, 24)
                                        .addComponent(tfDuracionCap, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCapitulos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDuracion)
                                    .addComponent(labelPortada)
                                    .addComponent(labelActores))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfActores, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(tfNumTem)
                                    .addComponent(botonImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelActores)
                            .addComponent(tfActores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDuracion)
                            .addComponent(tfNumTem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonImagen)
                            .addComponent(labelPortada))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDirector)
                                    .addComponent(tfTituloCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDirector1)
                                    .addComponent(tfDuracionCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCapitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGap(30, 30, 30)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDNI)
                            .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCorreo)
                            .addComponent(tfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAnio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(labelError)
                        .addGap(10, 10, 10)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jScrollPane1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(739, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void botonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImagenActionPerformed
        //Filtro para que el selector solo escoja entre imágenes
        FileFilter imageFilter = new FileNameExtensionFilter(
            "Imágenes", ImageIO.getReaderFileSuffixes());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Mostrar la ventama de selector de archivos
        int option = fileChooser.showOpenDialog(this);

        //Leer el achivo y asignárselo al valor de la portada.
        if(option == JFileChooser.APPROVE_OPTION){
            archivoPortada = fileChooser.getSelectedFile();

        }
    }//GEN-LAST:event_botonImagenActionPerformed

    private void buttonCapitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCapitulosActionPerformed

        if(!(tfTituloCap.getText().equals(""))){

            if(!(tfDuracionCap.getText().equals(""))){
                capitulos.add(new Capitulo(tfTituloCap.getText(),Integer.parseInt(tfDuracionCap.getText())));
            }

            //resetear los campos
            tfTituloCap.setText("");
            tfDuracionCap.setText("");

        }

        else{
            MostrarError(labelError, "Ni el título ni la duración del capítulo pueden estar vacíos.");
        }
    }//GEN-LAST:event_buttonCapitulosActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        //Caso en el que alguno de los campos no ha sido rellenado.
        if((comprobarNulo(tfTitulo.getText()))||(comprobarNulo(tfGenero.getText()))||(comprobarNulo(tfAnio.getText()))||(comprobarNulo(taSinopsis.getText()))||(comprobarNulo(labelActores.getText()))||(comprobarNulo(tfNumTem.getText()))||(comprobarNulo(tfNumTem.getText()))){
            MostrarError(labelError, "Todos los campos deben ser rellenados");
        }
        
        else if(capitulos.isEmpty()){
            MostrarError(labelError, "Se debe añadir al menos un capítulo.");
        }

        //Si no hay nulos ni errores de formato: crear el contenidp e introducirlo en la lista.
        else{
            Serie serieRegistrada;
            try {
                
                serieRegistrada = new Serie(tfTitulo.getText(), taSinopsis.getText(), tfGenero.getText(), Integer.parseInt(tfAnio.getText()), labelActores.getText(),new ImageIcon(ImageIO.read(archivoPortada)) ,Integer.parseInt(tfNumTem.getText()), capitulos);
                GestionContenido.modificarContenido(serieRegistrada, indice);
                //Cerrar la ventana, pero no finalizar la app.
                dispose();
            } catch (IOException ex) {
                MostrarError(labelError, "Error al modificar la serie.Vuelva a intentarlo.");
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private boolean comprobarNulo(String cadena){
        
        return cadena.equals("");
    }
    
    @Override
    public void MostrarError(JLabel label, String textoError) {
        label.setText(textoError);
        label.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonImagen;
    private javax.swing.JButton buttonCapitulos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelActores;
    private javax.swing.JLabel labelAnio;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelCorreo1;
    private javax.swing.JLabel labelDNI;
    private javax.swing.JLabel labelDirector;
    private javax.swing.JLabel labelDirector1;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelPortada;
    private javax.swing.JTextArea taSinopsis;
    private javax.swing.JTextField tfActores;
    private javax.swing.JFormattedTextField tfAnio;
    private javax.swing.JFormattedTextField tfDuracionCap;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JFormattedTextField tfNumTem;
    private javax.swing.JTextField tfTitulo;
    private javax.swing.JTextField tfTituloCap;
    // End of variables declaration//GEN-END:variables
}
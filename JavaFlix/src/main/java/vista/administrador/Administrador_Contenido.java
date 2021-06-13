package vista.administrador;

import controlador.GestionClientes;
import controlador.GestionContenido;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import modelo.Calificacion;
import modelo.Cliente;
import modelo.Contenido;
import modelo.ErrorUI;
import modelo.ListaContenidos;
import modelo.PlantillaLista;
import modelo.Pelicula;
import modelo.Serie;
/**
 * 
 * @author Adrián Fernández García
 */
public class Administrador_Contenido extends javax.swing.JFrame implements ListaContenidos, ErrorUI {

    private final JFrame principal;
    //modelo del JList
    private DefaultListModel modeloLista = new DefaultListModel();

    /**
     * Creates new form Introducir
     *
     * @param v
     */
    public Administrador_Contenido(JFrame v) {
        initComponents();
        principal = v;
        principal.setVisible(false);
        this.setVisible(true);
        refrescar();
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
        jLabel1 = new javax.swing.JLabel();
        botonBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        botonAgregarPeli = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonAgregarSerie = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador_GestionContenido");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        //establecer el icono de la aplicación para esta ventana
        try {
            BufferedImage imagen =ImageIO.read(new File("imagenes/logo.JPG"));
            this.setIconImage(imagen);
        } catch (IOException ex) {
            
        }

        jLabel1.setFont(new java.awt.Font("Impact", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTENIDO");

        botonBorrar.setText("BORRAR");
        botonBorrar.setPreferredSize(new java.awt.Dimension(75, 25));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setAutoscrolls(false);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jList1);

        botonAgregarPeli.setText("AGREGAR PELICULA");
        botonAgregarPeli.setPreferredSize(new java.awt.Dimension(75, 25));
        botonAgregarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPeliActionPerformed(evt);
            }
        });

        botonModificar.setText("MODIFICAR");
        botonModificar.setMaximumSize(new java.awt.Dimension(75, 25));
        botonModificar.setMinimumSize(new java.awt.Dimension(75, 25));
        botonModificar.setPreferredSize(new java.awt.Dimension(75, 25));
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonAgregarSerie.setText("AGREGAR SERIE");
        botonAgregarSerie.setPreferredSize(new java.awt.Dimension(75, 25));
        botonAgregarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarSerieActionPerformed(evt);
            }
        });

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAgregarPeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAgregarSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGap(55, 55, 55))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar))
                        .addGap(34, 34, 34)
                        .addComponent(botonAgregarPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(botonAgregarSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(876, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * Método que gestiona el borrado de todos los datos del contenido seleccionado.
     * @param evt 
     */
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed

        if (!(jList1.isSelectionEmpty())) {

            //Borrar todas las calificaciones de los clientes que hayan calificado el contenido que se va a borrar.
            for (Cliente cliente : GestionClientes.getClientes()) {

                if (!(cliente.getCalificaciones().isEmpty())) {
                    for (Calificacion cal : cliente.getCalificaciones()) {

                        if (cal.getContenidoCalificado().equals(GestionContenido.contenidos.get(jList1.getSelectedIndex()))) {
                            cliente.getCalificaciones().remove(cal);
                            break;
                        }

                    }
                }
            }
            //Borrar la imagen asociada al contenido de la carpeta de recursos del proyecto para evitar que sea muy pesada.
            Path ruta = FileSystems.getDefault().getPath("imagenes/"+GestionContenido.contenidos.get(jList1.getSelectedIndex()).getTitulo()+".jpg");
            try {
                Files.delete(ruta);
            } catch (IOException ex) {
                MostrarError("Error al borrar contenido.",ERROR_MESSAGE);
            }
            Contenido c = (Contenido) modeloLista.get(jList1.getSelectedIndex());
            GestionContenido.contenidos.remove(c);
            GestionContenido.guardarContenido();
            refrescar();
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonAgregarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPeliActionPerformed
        OperacionesPelicula a = new OperacionesPelicula(this);
    }//GEN-LAST:event_botonAgregarPeliActionPerformed

    /**
     * Método que gestiona la modificación de contenidos
     * @param evt 
     */
    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        if (jList1.isSelectionEmpty()) {
            MostrarError("Seleccione un contenido.",ERROR_MESSAGE);
        } else if (GestionContenido.contenidos.get(jList1.getSelectedIndex()).getClass().equals(Pelicula.class)) {

            OperacionesPelicula m = new OperacionesPelicula(this, jList1.getSelectedIndex());

        } else if (GestionContenido.contenidos.get(jList1.getSelectedIndex()).getClass().equals(Serie.class)) {
            OperacionesSerie m = new OperacionesSerie(this, jList1.getSelectedIndex());
        }


    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonAgregarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarSerieActionPerformed
        OperacionesSerie a = new OperacionesSerie(this);
    }//GEN-LAST:event_botonAgregarSerieActionPerformed

    /**
     * Método que gestiona la búsqueda de contenidos
     * @param evt 
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        ArrayList<Contenido> resultados = new ArrayList();

        GestionContenido.contenidos.stream().filter((c) -> (c.getTitulo().toLowerCase().contains(tfBuscar.getText().toLowerCase()))).forEachOrdered((c) -> {
            resultados.add(c);
        });

        disposicionLista(resultados);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          refrescar(); 
    }//GEN-LAST:event_formWindowActivated

    /**
     * Método que gestiona la actualización de los contenidos de la lista.
     */
    private void refrescar() {
        //Refrescar la lista
        GestionContenido.cargarContenido();
        disposicionLista(GestionContenido.contenidos);
    }
    
    @Override
    public final void disposicionLista(ArrayList<Contenido> lista) {

        modeloLista.clear();

        lista.forEach(c -> {

            modeloLista.addElement(c);

        });
        jList1.setCellRenderer(new PlantillaLista());
        jList1.setModel(modeloLista);

    }

    @Override
    public void MostrarError(String textoError , int tipoMensaje) {
        JOptionPane.showMessageDialog(this, textoError, "Error", tipoMensaje);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPeli;
    private javax.swing.JButton botonAgregarSerie;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfBuscar;
    // End of variables declaration//GEN-END:variables

}
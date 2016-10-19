package Principal;

import Funcionalidad.Archivo;
import java.awt.Dimension;

import java.io.*;
import javax.swing.*;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {

    private boolean sortir = false;
    private String titulo_aux = "", path_titol = "";
    
    public Principal() {
        setSize(750,600);
        centrarFrame(this);
        CambiarTitulo();
        initComponents();
        btn_imprimir.setEnabled(false);
    }
    
    Archivo exe = new Archivo();

    private void centrarFrame(Principal note)
    {
        //Tomo el tamaño de la pantalla
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        //El ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto:
        note.setLocation((pantallaTamano.width/2)-(note.getWidth()/2), (pantallaTamano.height/2)-(note.getHeight()/2));
    }
    private void centrarDialog(JDialog note)
    {
        //Tomo el tamaño de la pantalla
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
        //El ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto:
        note.setLocation((pantallaTamano.width/2)-(note.getWidth()/2), (pantallaTamano.height/2)-(note.getHeight()/2));
    }
    public void CambiarTitulo()    {
        String final_titol = " - Bloc de Notas";
        if(titulo_aux.compareTo("") == 0)
            titulo_aux = "Sin título";
        final_titol = titulo_aux+final_titol;
        setTitle(final_titol);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btn_nuevo = new javax.swing.JMenuItem();
        btn_abrir = new javax.swing.JMenuItem();
        btn_guargar = new javax.swing.JMenuItem();
        btn_guardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btn_configurar = new javax.swing.JMenuItem();
        btn_imprimir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btn_salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Mi_JNotepad_<3");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");

        btn_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jMenu1.add(btn_nuevo);

        btn_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        btn_abrir.setText("Abrir...");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });
        jMenu1.add(btn_abrir);

        btn_guargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        btn_guargar.setText("Guardar");
        btn_guargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guargarActionPerformed(evt);
            }
        });
        jMenu1.add(btn_guargar);

        btn_guardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btn_guardarComo.setText("Guardar como...");
        btn_guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(btn_guardarComo);
        jMenu1.add(jSeparator1);

        btn_configurar.setText("Configurar página");
        jMenu1.add(btn_configurar);

        btn_imprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        btn_imprimir.setText("Imprimir...");
        jMenu1.add(btn_imprimir);
        jMenu1.add(jSeparator2);

        btn_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jMenu1.add(btn_salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edicion.png"))); // NOI18N
        jMenu2.setText("Edición");

        jMenuItem8.setText("Deshacer");
        jMenu2.add(jMenuItem8);
        jMenu2.add(jSeparator3);

        jMenuItem9.setText("Cortar");
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Copiar");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setText("Pegar");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Eliminar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);
        jMenu2.add(jSeparator4);

        jMenuItem13.setText("Buscar...");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("Buscar siguiente");
        jMenu2.add(jMenuItem14);

        jMenuItem15.setText("Reemplazar");
        jMenu2.add(jMenuItem15);

        jMenuItem16.setText("Ir a...");
        jMenu2.add(jMenuItem16);
        jMenu2.add(jSeparator5);

        jMenuItem17.setText("Seleccionar todo");
        jMenu2.add(jMenuItem17);

        jMenuItem18.setText("Hora y fecha");
        jMenu2.add(jMenuItem18);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formato.png"))); // NOI18N
        jMenu3.setText("Formato");

        jMenuItem19.setText("Ajuste de línea");
        jMenu3.add(jMenuItem19);

        jMenuItem20.setText("Fuente...");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem20);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        jMenu4.setText("Ver");

        jMenuItem21.setText("Barra de estado");
        jMenu4.add(jMenuItem21);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda.png"))); // NOI18N
        jMenu5.setText("Ayuda");

        jMenuItem22.setText("Ver la ayuda");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Acerca del bloc de notas");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem23);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        if(jTextArea1.getText().compareTo("") != 0)
        {
            optionGuardar(false);
        }
        titulo_aux= "";
        path_titol = "";
        CambiarTitulo();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        exe.salir();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        String auxText = jTextArea1.getText();
        int result = 0;
        if(auxText.compareTo("") != 0)
        {
            Object[] options = { "Guardar", "No Guardar", "Cancelar"};
            result = JOptionPane.showOptionDialog (this, "¿Desea Guardar los cambios hechos a "+titulo_aux+"?", "Bloc de Notas",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            switch (result)
            {
                case 0:
                    File aux = null;
                    if((titulo_aux.compareTo("") != 0) && (path_titol.compareTo("") != 0))
                    {
                        aux = new File(path_titol+titulo_aux);
                    }
                    if(aux != null)
                    {
                        if(aux.isFile())
                        {
                            guardarAuto("Guardar",true);
                        }
                    }
                    else
                        guardarAuto("Guardar",false);
                    break;
                case 1:
                    break;
                case 2:
                    break;
            }
        }
        if(result != 2)
            optionObrir();
        CambiarTitulo();
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
       
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void btn_guargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guargarActionPerformed
        File aux = null;
        if((titulo_aux.compareTo("") != 0) && (path_titol.compareTo("") != 0))
        {
            aux = new File(path_titol+titulo_aux);
        }
        if(aux != null)
        {
            if(aux.isFile())
            {
                guardarAuto("Guardar",true);
            }
        }
        else
            guardarAuto("Guardar",false);
    }//GEN-LAST:event_btn_guargarActionPerformed

    private void btn_guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarComoActionPerformed
       guardarAuto("Guardar como...",false);
    }//GEN-LAST:event_btn_guardarComoActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

   private void guardarAuto(String string,boolean automatic) {
        String fitxer = "";
        if(automatic)
        {
            fitxer = path_titol+titulo_aux;
        }
        else
        {
            fitxer = selectFile(string,"Guardar");
            if((fitxer.compareTo("") == 0)&&(sortir))
                sortir = false;
        }
        boolean escriure = true;
        if(fitxer.compareTo("") != 0)
        {
            if(!automatic)
            {
                File fitxerAux = new File(fitxer);
                if(fitxerAux.isFile())
                {
                    escriure = sobreEscriure(fitxer.substring(fitxer.lastIndexOf("\\")+1));
                }
            }
            if(escriure)
            {
                FileWriter fichero = null;
                try
                {
                    int posBack = -1, aux = 0;
                    String fitxerBack = "";

                    fichero = new FileWriter(fitxer);
                    fichero.write(jTextArea1.getText().replaceAll("\n", "\r\n"));
                    fichero.close();

                    aux = fitxer.lastIndexOf("\\");
                    if(aux != -1)
                        posBack = aux;
                    fitxerBack = fitxer.substring(posBack+1);
                    path_titol = fitxer.substring(0,posBack+1);
                    titulo_aux= fitxerBack;
                }
                catch (IOException ex)
                {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                CambiarTitulo();
            }
            else
            {
                guardarAuto(string,automatic);
            }
        }
    }

   private String selectFile(String capsalera, String boto)    {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle(capsalera);
        jFileChooser.setApproveButtonText(boto);
        int retorn = jFileChooser.showOpenDialog (this);
        if (retorn == JFileChooser.APPROVE_OPTION )
        {
            return jFileChooser.getSelectedFile ().toString ();
        }
        else
        {
            return "";
        }
    }
   
   private void optionGuardar(boolean automatic)    {
        int result = 0;
        if((!automatic)&&(!sortir))
        {
            Object[] options = { "Guardar", "No Guardar", "Cancelar"};
            result = JOptionPane.showOptionDialog (this, "¿Desea Guardar los cambios hechos a "+titulo_aux+"?", "Bloc de Notas",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        }
        switch (result)
        {
            case 0:
                String fitxer = "";
                if(automatic)
                {
                    fitxer = path_titol+titulo_aux;
                }
                else
                {
                    fitxer = selectFile("Guardar","Guardar");
                }
                boolean escriure = true;
                if(fitxer.compareTo("") != 0)
                {
                    if(!automatic)
                    {
                        File fitxerAux = new File(fitxer);
                        if(fitxerAux.isFile())
                        {
                            escriure = sobreEscriure(fitxer.substring(fitxer.lastIndexOf("\\")+1));
                        }
                    }
                    if(escriure)
                    {
                        FileWriter fichero = null;
                        try
                        {
                            int posBack = -1, aux = 0;
                            String fitxerBack = "";

                            fichero = new FileWriter(fitxer);
                            fichero.write(jTextArea1.getText().replaceAll("\n", "\r\n"));
                            fichero.close();

                            aux = fitxer.lastIndexOf("\\");
                            if(aux != -1)
                                posBack = aux;
                            fitxerBack = fitxer.substring(posBack+1);
                            path_titol = fitxer.substring(0,posBack+1);
                            titulo_aux = fitxerBack;
                        }
                        catch (IOException ex)
                        {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        CambiarTitulo();
                    }
                    else
                    {
                        optionGuardar(automatic);
                    }
                }
                break;
            case 1:
                jTextArea1.setText("");
                break;
            case 2:
                break;
            default:
                break;
        }
    }
   
   private boolean sobreEscriure(String fichero){
        Object[] options = { "Si", "No"};
        int result = JOptionPane.showOptionDialog (this, "El fichero " + fichero + " ya existe, desea guardar los cambios hechos?", "Bloc de Notas",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        if(result == 0)
            return true;
        else
            return false;
    }
   
   private void optionObrir() {
        String fitxer = selectFile("Abrir","Abrir");
        if(fitxer.compareTo("") != 0)
        {
            FileReader fichero = null;
            try
            {
                int posBack = -1, aux = 0;
                String textCos = "";
                
                fichero = new FileReader(fitxer);
                BufferedReader br = new BufferedReader(fichero);

                String linea;
                while((linea=br.readLine())!=null)
                {
                   textCos += linea + "\n\r";
                }
                if(textCos.length() > 2)
                {
                    textCos = textCos.substring(0, textCos.length()-2);
                }

                jTextArea1.setText(textCos);

                br.close();
                fichero.close();

                aux = fitxer.lastIndexOf("\\");
                if(aux != -1)
                    posBack = aux;
                titulo_aux = fitxer.substring(posBack+1);
                path_titol = fitxer.substring(0,posBack+1);
            }
            catch (IOException ex)
            {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btn_abrir;
    private javax.swing.JMenuItem btn_configurar;
    private javax.swing.JMenuItem btn_guardarComo;
    private javax.swing.JMenuItem btn_guargar;
    private javax.swing.JMenuItem btn_imprimir;
    private javax.swing.JMenuItem btn_nuevo;
    private javax.swing.JMenuItem btn_salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

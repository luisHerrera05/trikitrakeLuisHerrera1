 
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.TipoImagen;


public class FormInicio extends javax.swing.JFrame {

    public FormInicio() {
        init();
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();  
        panelFondo.setOpaque(false);
        Border bordeBoton = BorderFactory.createLineBorder(new Color(243,211,246),2);
        panelBoton.setBorder(bordeBoton);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        lblInicar = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();
        jPanel2 = new javax.swing.JPanel();
        lblInicar2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblInicar4x4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblInicar1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 49));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(450, 10, 30, 30);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Triki Trake");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(-80, 10, 430, 50);

        txtJugador2.setBackground(new java.awt.Color(249, 230, 254));
        txtJugador2.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(202, 105, 220));
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador2.setText("JUGADOR2");
        txtJugador2.setBorder(null);
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt);
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt);
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador2);
        txtJugador2.setBounds(100, 160, 230, 40);

        txtJugador1.setBackground(new java.awt.Color(214, 252, 249));
        txtJugador1.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(101, 175, 245));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("JUGADOR1");
        txtJugador1.setBorder(null);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador1);
        txtJugador1.setBounds(140, 100, 230, 40);

        panelBoton.setBackground(new java.awt.Color(42, 22, 79));

        lblInicar.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblInicar.setForeground(new java.awt.Color(241, 227, 252));
        lblInicar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicar.setText("jugar 3x3");
        lblInicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblInicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelFondo.add(panelBoton);
        panelBoton.setBounds(170, 240, 130, 60);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/Circulo.png");
        panelFondo.add(imagen1);
        imagen1.setBounds(390, 160, 40, 40);

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imagen2);
        imagen2.setBounds(70, 100, 40, 40);

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(40, 160, 40, 40);

        imagen4.setText("imagen1");
        imagen4.setRuta("/resources/Equis.png");
        panelFondo.add(imagen4);
        imagen4.setBounds(390, 100, 40, 40);

        jPanel2.setBackground(new java.awt.Color(51, 0, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));

        lblInicar2.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblInicar2.setForeground(new java.awt.Color(241, 227, 252));
        lblInicar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicar2.setText("jugar4x4");
        lblInicar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicar2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicar2MousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));

        lblInicar4x4.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblInicar4x4.setForeground(new java.awt.Color(241, 227, 252));
        lblInicar4x4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicar4x4.setText("jugar4x4");
        lblInicar4x4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicar4x4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicar4x4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicar4x4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicar4x4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInicar4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicar4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInicar2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblInicar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelFondo.add(jPanel2);
        jPanel2.setBounds(40, 320, 120, 60);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        lblInicar1.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblInicar1.setForeground(new java.awt.Color(241, 227, 252));
        lblInicar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicar1.setText("jugar 5x5");
        lblInicar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicar1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblInicar1)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicar1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelFondo.add(jPanel4);
        jPanel4.setBounds(310, 320, 130, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
        txtJugador1.setBorder(borde);
    }//GEN-LAST:event_txtJugador1MouseEntered

    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null);
    }//GEN-LAST:event_txtJugador1MouseExited

    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(165,40,174),2);
        txtJugador2.setBorder(borde);
    }//GEN-LAST:event_txtJugador2MouseEntered

    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
        txtJugador2.setBorder(null);
    }//GEN-LAST:event_txtJugador2MouseExited

    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
        if(txtJugador1.getText().equals("JUGADOR1"))
            txtJugador1.setText("");
    }//GEN-LAST:event_txtJugador1FocusGained

    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
        if(txtJugador2.getText().equals("JUGADOR2"))
            txtJugador2.setText("");
    }//GEN-LAST:event_txtJugador2FocusGained

    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
        if(txtJugador1.getText().equals(""))
            txtJugador1.setText("JUGADOR1");
    }//GEN-LAST:event_txtJugador1FocusLost

    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
        if(txtJugador2.getText().equals(""))
            txtJugador2.setText("JUGADOR2");
    }//GEN-LAST:event_txtJugador2FocusLost

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador1.getText().length()>=8)
            evt.consume();
        
    }//GEN-LAST:event_txtJugador1KeyTyped

    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador2.getText().length()>=8)
            evt.consume();  
    }//GEN-LAST:event_txtJugador2KeyTyped

    private void lblInicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMouseEntered
        panelBoton.setBackground(new Color(126,49,196));
    }//GEN-LAST:event_lblInicarMouseEntered

    private void lblInicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMouseExited
        panelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblInicarMouseExited

    private void lblInicarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMousePressed
        this.dispose();
        
        Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
        if(txtJugador1.getText().equals(""))
            jugador1.setNombre("JUGADOR1");
        else
            jugador1.setNombre(txtJugador1.getText());
        
        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
        if(txtJugador2.getText().equals(""))
            jugador2.setNombre("JUGADOR2");
        else
            jugador2.setNombre(txtJugador2.getText());
        
        FormTikTacToe tikTacToe = new FormTikTacToe(jugador1,jugador2);
        tikTacToe.setVisible(true);
    }//GEN-LAST:event_lblInicarMousePressed

    private void lblInicar4x4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar4x4MouseEntered
        // TODO add your handling code here
        lblInicar1.setForeground(Color.RED);
    }//GEN-LAST:event_lblInicar4x4MouseEntered

    private void lblInicar4x4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar4x4MouseExited
        // TODO add your handling code here:
         panelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblInicar4x4MouseExited

    private void lblInicar4x4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar4x4MousePressed
        // TODO add your handling code here:
        this.dispose();
        
        Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
        if(txtJugador1.getText().equals(""))
            jugador1.setNombre("JUGADOR1");
        else
            jugador1.setNombre(txtJugador1.getText());
        
        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
        if(txtJugador2.getText().equals(""))
            jugador2.setNombre("JUGADOR2");
        else
            jugador2.setNombre(txtJugador2.getText());
        
        form4x4 tikTacToe = new form4x4(jugador1,jugador2);
        tikTacToe.setVisible(true);

    }//GEN-LAST:event_lblInicar4x4MousePressed

    private void lblInicar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar2MouseEntered
        // TODO add your handling code here: 
        lblInicar2.setForeground(Color.RED);
    }//GEN-LAST:event_lblInicar2MouseEntered

    private void lblInicar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar2MouseExited
        // TODO add your handling code here:
         panelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblInicar2MouseExited

    private void lblInicar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar2MousePressed
        // TODO add your handling code here:
         panelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblInicar2MousePressed

    private void lblInicar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar1MousePressed
        // TODO add your handling code here:
      this.dispose();
        
     Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
        if(txtJugador1.getText().equals(""))
            jugador1.setNombre("JUGADOR1");
        else
            jugador1.setNombre(txtJugador1.getText());
        
        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
        if(txtJugador2.getText().equals(""))
            jugador2.setNombre("JUGADOR2");
        else
            jugador2.setNombre(txtJugador2.getText());
        

       
        form5x5 formFive = new form5x5(jugador1,jugador2);
        formFive.setVisible(true);
    }//GEN-LAST:event_lblInicar1MousePressed

    private void lblInicar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar1MouseExited
        // TODO add your handling code here:
        panelBoton.setBackground(new Color(42,22,79));

    }//GEN-LAST:event_lblInicar1MouseExited

    private void lblInicar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicar1MouseEntered
 // TODO add your handling code here:
          lblInicar1.setForeground(Color.RED);
    }//GEN-LAST:event_lblInicar1MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblInicar;
    private javax.swing.JLabel lblInicar1;
    private javax.swing.JLabel lblInicar2;
    private javax.swing.JLabel lblInicar4x4;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}

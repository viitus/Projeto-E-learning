package View;

import javax.swing.JOptionPane;
import Controller.*;
import Model.Usuario;


public class TelaLogin extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLogin.class.getName());
    private CursoController cursoController;
    private UsuarioController usuarioController;
    
    public TelaLogin(CursoController cursoController, UsuarioController usuarioController) {
     
        this.cursoController = cursoController;
        this.usuarioController = usuarioController;
        initComponents();
        TelaBase.padronizarJanela(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLSenha = new javax.swing.JLabel();
        jLlogin = new javax.swing.JLabel();
        jTFlogin = new javax.swing.JTextField();
        jBentrar = new javax.swing.JButton();
        jPFsenha = new javax.swing.JPasswordField();
        jbtnFechar = new javax.swing.JButton();

        setLocation(new java.awt.Point(300, 200));
        setSize(new java.awt.Dimension(600, 400));

        jLSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLSenha.setText("Senha");

        jLlogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLlogin.setText("Login");

        jTFlogin.setColumns(10);
        jTFlogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jBentrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBentrar.setText("Entrar");
        jBentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBentrarActionPerformed(evt);
            }
        });

        jPFsenha.setColumns(10);
        jPFsenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jbtnFechar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnFechar.setText("Fechar");
        jbtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLlogin)
                    .addComponent(jLSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFlogin)
                    .addComponent(jPFsenha)
                    .addComponent(jBentrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLlogin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jPFsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBentrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnFechar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBentrarActionPerformed
        String login = jTFlogin.getText();
        String senha = new String(jPFsenha.getPassword());
        
        Usuario usuario = usuarioController.autenticar(login, senha);
        
        if (usuario != null) {
            JOptionPane.showMessageDialog(this, "Bem-vindo, " + usuario.getNome() + " (" + usuario.getTipo() + ")");
            TelaInicial tela = new TelaInicial(usuario, cursoController, usuarioController);
            tela.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login ou senha incorretos.");
        }
    }//GEN-LAST:event_jBentrarActionPerformed

    private void jbtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnFecharActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBentrar;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLlogin;
    private javax.swing.JPasswordField jPFsenha;
    private javax.swing.JTextField jTFlogin;
    private javax.swing.JButton jbtnFechar;
    // End of variables declaration//GEN-END:variables
}

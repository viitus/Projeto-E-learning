package View;

import javax.swing.JOptionPane;
import Model.Usuario;

public class TelaInicial extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaInicial.class.getName());

    private Usuario usuarioLogado;
    private Controller.CursoController cursoController;
    
    
    public TelaInicial(Usuario usuario, Controller.CursoController cursoController) {
        initComponents();
        this.cursoController = cursoController;
        this.usuarioLogado = usuario;
        aplicarPermissoes();
        setTitle("Sistema E-Learning - "+ usuarioLogado.getTipo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerCursos = new javax.swing.JButton();
        jbtnGerenciarCursos = new javax.swing.JButton();
        jbtnCriarUsuario = new javax.swing.JButton();
        jbtnLogoff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerCursos.setText("Ver Cursos");
        btnVerCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursosActionPerformed(evt);
            }
        });

        jbtnGerenciarCursos.setText("Gerenciar Cursos");
        jbtnGerenciarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGerenciarCursosActionPerformed(evt);
            }
        });

        jbtnCriarUsuario.setText("Criar Usuário");
        jbtnCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCriarUsuarioActionPerformed(evt);
            }
        });

        jbtnLogoff.setText("Logoff");
        jbtnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnGerenciarCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtnLogoff)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtnLogoff)
                .addGap(67, 67, 67)
                .addComponent(btnVerCursos)
                .addGap(18, 18, 18)
                .addComponent(jbtnGerenciarCursos)
                .addGap(18, 18, 18)
                .addComponent(jbtnCriarUsuario)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosActionPerformed
        TelaCursos tela = new TelaCursos(usuarioLogado, cursoController);
        tela.setVisible(true);
    }//GEN-LAST:event_btnVerCursosActionPerformed

    private void jbtnGerenciarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGerenciarCursosActionPerformed
        TelaGerenciarCursos tela = new TelaGerenciarCursos(usuarioLogado, cursoController);
        tela.setVisible(true);
    }//GEN-LAST:event_jbtnGerenciarCursosActionPerformed

    private void jbtnCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCriarUsuarioActionPerformed
        TelaCriaUsuario tela = new TelaCriaUsuario(usuarioLogado, cursoController);
        tela.setVisible(true);
    }//GEN-LAST:event_jbtnCriarUsuarioActionPerformed

    private void jbtnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoffActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Confirmar Logoff", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.dispose();
            new TelaLogin(cursoController).setVisible(true);
        }
    }//GEN-LAST:event_jbtnLogoffActionPerformed

    private void aplicarPermissoes() {
        String tipo = usuarioLogado.getTipo();
        if (tipo.equals("aluno")) {
            jbtnGerenciarCursos.setVisible(false);
        }
        if (tipo.equals("admin")) {
            jbtnCriarUsuario.setVisible(true);
        }
    }

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(() -> new TelaInicial().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerCursos;
    private javax.swing.JButton jbtnCriarUsuario;
    private javax.swing.JButton jbtnGerenciarCursos;
    private javax.swing.JButton jbtnLogoff;
    // End of variables declaration//GEN-END:variables
}

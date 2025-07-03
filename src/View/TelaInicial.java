package View;

import javax.swing.JOptionPane;
import Model.Usuario;

public class TelaInicial extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaInicial.class.getName());

    private Usuario usuarioLogado;
    private Controller.CursoController cursoController;
    private Controller.UsuarioController usuarioController;
    
    public TelaInicial(Usuario usuario, Controller.CursoController cursoController, Controller.UsuarioController usuarioController) {
   
        this.usuarioController = usuarioController;
        this.cursoController = cursoController;
        this.usuarioLogado = usuario;
        initComponents();
        aplicarPermissoes();
        TelaBase.padronizarJanela(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnLogoff = new javax.swing.JButton();
        jbtnCriarUsuario = new javax.swing.JButton();
        jbtnGerenciarCursos = new javax.swing.JButton();
        btnVerCursos = new javax.swing.JButton();
        jbtnCursosMatriculados = new javax.swing.JButton();

        setLocation(new java.awt.Point(300, 200));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(229, 168, 0));

        jbtnLogoff.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnLogoff.setText("Logoff");
        jbtnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoffActionPerformed(evt);
            }
        });

        jbtnCriarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCriarUsuario.setText("Criar Usuário");
        jbtnCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCriarUsuarioActionPerformed(evt);
            }
        });

        jbtnGerenciarCursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnGerenciarCursos.setText("Gerenciar Cursos");
        jbtnGerenciarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGerenciarCursosActionPerformed(evt);
            }
        });

        btnVerCursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerCursos.setText("Ver Cursos Disponiveis");
        btnVerCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursosActionPerformed(evt);
            }
        });

        jbtnCursosMatriculados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCursosMatriculados.setText("Cursos Matriculados");
        jbtnCursosMatriculados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCursosMatriculadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnLogoff))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbtnGerenciarCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnCriarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnCursosMatriculados, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnLogoff)
                .addGap(183, 183, 183)
                .addComponent(jbtnCursosMatriculados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnGerenciarCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCriarUsuario)
                .addContainerGap(291, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosActionPerformed
        TelaCursos tela = new TelaCursos(usuarioLogado, cursoController, usuarioController);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerCursosActionPerformed

    private void jbtnGerenciarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGerenciarCursosActionPerformed
        TelaGerenciarCursos tela = new TelaGerenciarCursos(usuarioLogado, cursoController, usuarioController);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnGerenciarCursosActionPerformed

    private void jbtnCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCriarUsuarioActionPerformed
        TelaCriaUsuario tela = new TelaCriaUsuario(usuarioLogado, cursoController, usuarioController);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnCriarUsuarioActionPerformed

    private void jbtnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoffActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Confirmar Logoff", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.dispose();
            new TelaLogin(cursoController, usuarioController).setVisible(true);
        }
    }//GEN-LAST:event_jbtnLogoffActionPerformed

    private void jbtnCursosMatriculadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCursosMatriculadosActionPerformed
        TelaCursosMatriculados tela = new TelaCursosMatriculados(usuarioLogado, cursoController, usuarioController);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnCursosMatriculadosActionPerformed

    private void aplicarPermissoes() {
        String tipo = usuarioLogado.getTipo();
        if (tipo.equals("aluno")) {
            jbtnGerenciarCursos.setVisible(false);
        }
        if (!tipo.equals("admin")) {
            jbtnCriarUsuario.setVisible(false);
        }
        if (tipo.equals("professor")) {
            jbtnCursosMatriculados.setVisible(false);
        }
    }
    
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
    private javax.swing.JButton btnVerCursos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCriarUsuario;
    private javax.swing.JButton jbtnCursosMatriculados;
    private javax.swing.JButton jbtnGerenciarCursos;
    private javax.swing.JButton jbtnLogoff;
    // End of variables declaration//GEN-END:variables
}

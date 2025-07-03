package View;

import javax.swing.JOptionPane;
import Model.*;
import Controller.*;

public class TelaCriarAula extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCriarAula.class.getName());
    
    private Usuario usuarioLogado;
    private Curso curso;
    private CursoController cursoController;
    private UsuarioController usuarioController;
    
    public TelaCriarAula(Usuario professorLogado, Curso curso, CursoController cursoController, UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
        this.cursoController = cursoController;
        this.usuarioLogado = professorLogado;
        this.curso = curso;
        initComponents();
        TelaBase.padronizarJanela(this);
        TelaBase.padronizarTextAreas(this.getContentPane());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtConteudo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtTitulo = new javax.swing.JTextField();
        jbtnSalvar = new javax.swing.JButton();

        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(229, 168, 0));

        jbtnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnVoltar.setText("Voltar");
        jbtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVoltarActionPerformed(evt);
            }
        });

        jtxtConteudo.setColumns(20);
        jtxtConteudo.setForeground(new java.awt.Color(30, 30, 30));
        jtxtConteudo.setRows(5);
        jScrollPane1.setViewportView(jtxtConteudo);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("Conteúdo:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Titulo da Aula:");

        jtxtTitulo.setColumns(10);
        jtxtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtTitulo.setForeground(new java.awt.Color(30, 30, 30));

        jbtnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnSalvar.setForeground(new java.awt.Color(30, 30, 30));
        jbtnSalvar.setText("Salvar Aula");
        jbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnVoltar)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSalvar)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVoltarActionPerformed
        this.dispose();
        new TelaInicial(usuarioLogado, cursoController, usuarioController).setVisible(true);
    }//GEN-LAST:event_jbtnVoltarActionPerformed

    private void jbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalvarActionPerformed
        String titulo = jtxtTitulo.getText();
        String conteudo = jtxtConteudo.getText();

        if (titulo.isEmpty() || conteudo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            return;
        }

        Aula novaAula = new Aula(titulo, conteudo);
        curso.adicionarAula(novaAula); // método que você cria na classe Curso

        JOptionPane.showMessageDialog(this, "Aula criada com sucesso!");
        new TelaGerenciarCursos(usuarioLogado, cursoController, usuarioController).setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jbtnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
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
        //java.awt.EventQueue.invokeLater(() -> new TelaCriarAula().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnSalvar;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JTextArea jtxtConteudo;
    private javax.swing.JTextField jtxtTitulo;
    // End of variables declaration//GEN-END:variables
}

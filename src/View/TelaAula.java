package View;

import Model.*;
import Controller.*;

public class TelaAula extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAula.class.getName());
    
    private Usuario usuarioLogado;
    private Curso cursoSelecionado;
    private Aula aulaSelecionada;
    private CursoController cursoController;
    private UsuarioController usuarioController;
    
    public TelaAula(Usuario usuarioLogado, Curso cursoSelecionado, Aula aulaSelecionada, CursoController cursoController, UsuarioController usuarioController) {

        this.cursoController = cursoController;
        this.usuarioLogado = usuarioLogado;
        this.cursoSelecionado = cursoSelecionado;
        this.aulaSelecionada = aulaSelecionada;
        this.usuarioController = usuarioController;
        initComponents();
        carregarDadosAula();
        TelaBase.padronizarJanela(this);
        TelaBase.padronizarTextAreas(this.getContentPane());
    }
    
    private void carregarDadosAula() {
        jlblTituloAula.setText(aulaSelecionada.getTitulo());
        jtxtConteudo.setText(aulaSelecionada.getConteudo());
        jtxtConteudo.setEditable(false); // Apenas leitura
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblTituloAula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtConteudo = new javax.swing.JTextArea();
        jbtnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jlblTituloAula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlblTituloAula.setText("Aula");

        jtxtConteudo.setColumns(20);
        jtxtConteudo.setRows(5);
        jScrollPane1.setViewportView(jtxtConteudo);

        jbtnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnVoltar.setText("Voltar");
        jbtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtnVoltar)
                .addGap(0, 619, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTituloAula)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblTituloAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVoltarActionPerformed
        this.dispose();
        new TelaInicial(usuarioLogado, cursoController, usuarioController).setVisible(true);
    }//GEN-LAST:event_jbtnVoltarActionPerformed


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
        //java.awt.EventQueue.invokeLater(() -> new TelaAula().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JLabel jlblTituloAula;
    private javax.swing.JTextArea jtxtConteudo;
    // End of variables declaration//GEN-END:variables
}

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
        jlCursoSelecionado.setText(cursoSelecionado.getNome());
        jlblTituloAula.setText(aulaSelecionada.getTitulo());
        jtxtConteudo.setText(aulaSelecionada.getConteudo());
        if (usuarioLogado.getTipo().equals("aluno")){
            jtxtConteudo.setEditable(false); // Apenas leitura
        }else{
            jtxtConteudo.setEditable(true);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtConteudo = new javax.swing.JTextArea();
        jlblTituloAula = new javax.swing.JLabel();
        jlCursoSelecionado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
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
        jtxtConteudo.setRows(5);
        jScrollPane1.setViewportView(jtxtConteudo);

        jlblTituloAula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlblTituloAula.setForeground(new java.awt.Color(30, 30, 30));
        jlblTituloAula.setText("Aula");

        jlCursoSelecionado.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jlCursoSelecionado.setForeground(new java.awt.Color(30, 30, 30));
        jlCursoSelecionado.setText("Curso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnVoltar)
                .addContainerGap(871, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addComponent(jlblTituloAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlCursoSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnVoltar)
                .addGap(74, 74, 74)
                .addComponent(jlCursoSelecionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblTituloAula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JLabel jlCursoSelecionado;
    private javax.swing.JLabel jlblTituloAula;
    private javax.swing.JTextArea jtxtConteudo;
    // End of variables declaration//GEN-END:variables
}

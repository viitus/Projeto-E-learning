package View;

import Model.*;
import javax.swing.*;
import Controller.*;

public class TelaListaAulas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaListaAulas.class.getName());
    
    private CursoController cursoController;
    private final Usuario usuarioLogado;
    private final Curso cursoSelecionado;
    private UsuarioController usuarioController;
    
    public TelaListaAulas(Usuario usuario, Curso curso, CursoController cursoController, UsuarioController usuarioController) {
      
        this.usuarioLogado = usuario;
        this.cursoSelecionado = curso;
        this.usuarioController = usuarioController;
        this.cursoController = cursoController;
        initComponents();
        carregarAulas();
        TelaBase.padronizarJanela(this);
        TelaBase.padronizarTextAreas(this.getContentPane());
    }

    private void carregarAulas() {
        jLcurso.setText(cursoSelecionado.getNome());
        jlbDescricao.setText(cursoSelecionado.getDescricao());
        
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Aula aula : cursoSelecionado.getAulas()) {
            model.addElement(aula.getTitulo());
        }
        jlstAulas.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnVoltar = new javax.swing.JButton();
        jbtnAcessar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstAulas = new javax.swing.JList<>();
        jlbDescricao = new javax.swing.JLabel();
        jLcurso = new javax.swing.JLabel();

        setLocation(new java.awt.Point(300, 200));
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

        jbtnAcessar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAcessar.setForeground(new java.awt.Color(30, 30, 30));
        jbtnAcessar.setText("Acessar");
        jbtnAcessar.setAlignmentY(0.6F);
        jbtnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcessarActionPerformed(evt);
            }
        });

        jScrollPane1.setAlignmentY(0.6F);

        jlstAulas.setForeground(new java.awt.Color(30, 30, 30));
        jlstAulas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlstAulas);

        jlbDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbDescricao.setForeground(new java.awt.Color(30, 30, 30));
        jlbDescricao.setText("Descrição do Curso");
        jlbDescricao.setAlignmentY(0.6F);

        jLcurso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLcurso.setForeground(new java.awt.Color(30, 30, 30));
        jLcurso.setText("Curso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAcessar))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jbtnVoltar)
                    .addContainerGap(713, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLcurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnAcessar)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jbtnVoltar)
                    .addContainerGap(558, Short.MAX_VALUE)))
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

    private void jbtnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcessarActionPerformed
        int index = jlstAulas.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma aula.");
            return;
        }

        Aula aulaSelecionada = cursoSelecionado.getAulas().get(index);
        new TelaAula(usuarioLogado, cursoSelecionado, aulaSelecionada, cursoController, usuarioController).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAcessarActionPerformed

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
        //java.awt.EventQueue.invokeLater(() -> new TelaListaAulas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLcurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jbtnAcessar;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JLabel jlbDescricao;
    private javax.swing.JList<String> jlstAulas;
    // End of variables declaration//GEN-END:variables
}

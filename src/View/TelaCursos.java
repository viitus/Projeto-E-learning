package View;

import javax.swing.*;
import Model.Aula;
import Model.Curso;
import Controller.CursoController;

public class TelaCursos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCursos.class.getName());
    
    private Model.Usuario usuarioLogado;
    private CursoController cursoController;
    private Curso cursoSelecionado;
    
    public TelaCursos(Model.Usuario usuario, CursoController cursoController) {
        initComponents();
        this.usuarioLogado = usuario;
        this.cursoController = cursoController;
        carregarCursos();
        aplicarPermissoes();
        configurarSelecaoLista();
    }

    private void configurarSelecaoLista() {
        jlstCursos.addListSelectionListener(e -> {
            int index = jlstCursos.getSelectedIndex();
            if (index != -1 && index < cursoController.getCursos().size()) {
                cursoSelecionado = cursoController.getCursos().get(index);
            }
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstCursos = new javax.swing.JList<>();
        jbtnMatricular = new javax.swing.JButton();
        jbtnAcessar = new javax.swing.JButton();
        jbtnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cursos Disponíveis ");

        jlstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlstCursos);

        jbtnMatricular.setText("Matricular");
        jbtnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMatricularActionPerformed(evt);
            }
        });

        jbtnAcessar.setText("Acessar Aula");
        jbtnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcessarActionPerformed(evt);
            }
        });

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
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(142, 142, 142)
                            .addComponent(jbtnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jbtnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMatricular)
                    .addComponent(jbtnAcessar))
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMatricularActionPerformed
        int index = jlstCursos.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um curso.");
            return;
        }
        
        Model.Curso cursoSelecionado = cursoController.getCursos().get(index);
        
        if (usuarioLogado.getTipo().equals("aluno") || usuarioLogado.getTipo().equals("admin")) {
            boolean matriculado = usuarioLogado.matricularEmCurso(cursoSelecionado);
            if (matriculado) {
                JOptionPane.showMessageDialog(this, "Matrícula realizada com sucesso no curso: " + cursoSelecionado.getNome());
            } else {
                JOptionPane.showMessageDialog(this, "Você já está matriculado nesse curso.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Apenas alunos podem se matricular.");
        }
    }//GEN-LAST:event_jbtnMatricularActionPerformed

    private void jbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVoltarActionPerformed
        this.dispose();
        new TelaInicial(usuarioLogado, cursoController).setVisible(true);
    }//GEN-LAST:event_jbtnVoltarActionPerformed

    private void jbtnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcessarActionPerformed
        if (cursoSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Selecione um curso.");
            return;
        }
        if (cursoSelecionado.getAulas().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Este curso ainda não possui aulas.");
            return;
        }
        new TelaListaAulas(usuarioLogado, cursoSelecionado, cursoController).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnAcessarActionPerformed

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

    private void carregarCursos(){
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Curso c : cursoController.getCursos()) {
            model.addElement(c.getNome());
        }
        jlstCursos.setModel(model);
    }
    
    private void aplicarPermissoes() {
        String tipo = usuarioLogado.getTipo();
        if (tipo.equals("professor")) {
            jbtnMatricular.setVisible(false); // Professores não se matriculam
        }
        // admin vê tudo
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAcessar;
    private javax.swing.JButton jbtnMatricular;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JList<String> jlstCursos;
    // End of variables declaration//GEN-END:variables
}

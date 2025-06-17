package View;

import javax.swing.*;
import Model.Aula;
import Model.Curso;
import Controller.*;

public class TelaCursos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCursos.class.getName());
    
    private UsuarioController usuarioController;
    private Model.Usuario usuarioLogado;
    private CursoController cursoController;
    private Curso cursoSelecionado;
    
    public TelaCursos(Model.Usuario usuario, CursoController cursoController, UsuarioController usuarioController) {
    
        this.usuarioLogado = usuario;
        this.usuarioController = usuarioController;
        this.cursoController = cursoController;
        initComponents();
        carregarCursos();
        aplicarPermissoes();
        configurarSelecaoLista();
        TelaBase.padronizarJanela(this);
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
        setLocation(new java.awt.Point(300, 200));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cursos Disponíveis ");

        jlstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlstCursos);

        jbtnMatricular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnMatricular.setText("Matricular");
        jbtnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMatricularActionPerformed(evt);
            }
        });

        jbtnAcessar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAcessar.setText("Acessar Aula");
        jbtnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcessarActionPerformed(evt);
            }
        });

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
                .addGap(0, 719, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jbtnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jbtnVoltar)
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnMatricular)
                    .addComponent(jbtnAcessar))
                .addContainerGap(179, Short.MAX_VALUE))
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
        
        if (!usuarioLogado.getTipo().equals("professor")) {
            boolean matriculado = usuarioLogado.matricularEmCurso(cursoSelecionado);
            if (matriculado) {
                JOptionPane.showMessageDialog(this, "Matrícula realizada com sucesso no curso: " + cursoSelecionado.getNome());
                usuarioController.salvarUsuarios();
            } else {
                JOptionPane.showMessageDialog(this, "Você já está matriculado nesse curso.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Apenas alunos podem se matricular.");
        }
    }//GEN-LAST:event_jbtnMatricularActionPerformed

    private void jbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVoltarActionPerformed
        this.dispose();
        new TelaInicial(usuarioLogado, cursoController, usuarioController).setVisible(true);
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
        new TelaListaAulas(usuarioLogado, cursoSelecionado, cursoController, usuarioController).setVisible(true);
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

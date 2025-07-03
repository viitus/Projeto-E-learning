package View;

import javax.swing.*;
import Model.Aula;
import Model.Curso;
import Controller.*;

public class TelaCursosMatriculados extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCursos.class.getName());
    
    private UsuarioController usuarioController;
    private Model.Usuario usuarioLogado;
    private CursoController cursoController;
    private Curso cursoSelecionado;
    
    public TelaCursosMatriculados(Model.Usuario usuario, CursoController cursoController, UsuarioController usuarioController) {
    
        this.usuarioLogado = usuario;
        this.usuarioController = usuarioController;
        this.cursoController = cursoController;
        initComponents();
        carregarCursos();
        configurarSelecaoLista();
        TelaBase.padronizarJanela(this);
    }

    private void configurarSelecaoLista() {
        jlstCursos.addListSelectionListener(e -> {
            int index = jlstCursos.getSelectedIndex();
            if (index != -1 && index < usuarioLogado.getCursosMatriculados().size()) {
                cursoSelecionado = usuarioLogado.getCursosMatriculados().get(index);
            }
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstCursos = new javax.swing.JList<>();
        jbtnAcessar = new javax.swing.JButton();
        jbtnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(229, 168, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Cursos Matriculados ");

        jlstCursos.setForeground(new java.awt.Color(30, 30, 30));
        jlstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlstCursos);

        jbtnAcessar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAcessar.setForeground(new java.awt.Color(30, 30, 30));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jbtnVoltar)
                    .addContainerGap(713, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnAcessar)
                .addContainerGap(116, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        for (Curso c : usuarioLogado.getCursosMatriculados()) {
            model.addElement(c.getNome());
        }
        jlstCursos.setModel(model);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAcessar;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JList<String> jlstCursos;
    // End of variables declaration//GEN-END:variables
}

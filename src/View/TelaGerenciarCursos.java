package View;

import Controller.CursoController;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class TelaGerenciarCursos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaGerenciarCursos.class.getName());

    private Controller.CursoController cursoController;
    private Model.Usuario usuarioLogado;
    private Controller.UsuarioController usuarioController;

    public TelaGerenciarCursos(Model.Usuario usuario, CursoController cursoController, Controller.UsuarioController usuarioController) {
      
        this.usuarioController = usuarioController;
        this.usuarioLogado = usuario;
        this.cursoController = cursoController;
        initComponents();
        carregarCursos();
        TelaBase.padronizarJanela(this);
        TelaBase.padronizarTextAreas(this.getContentPane());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlstCursos = new javax.swing.JList<>();
        jbtnAdicionar = new javax.swing.JButton();
        jbtnRemover = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnVoltar = new javax.swing.JButton();
        jbtnCriarAula = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLocation(new java.awt.Point(300, 200));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(229, 168, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Nome do Curso:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("Descrição:");

        jtxtNome.setColumns(10);
        jtxtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtxtNome.setForeground(new java.awt.Color(30, 30, 30));

        jtxtDescricao.setColumns(20);
        jtxtDescricao.setForeground(new java.awt.Color(30, 30, 30));
        jtxtDescricao.setRows(5);
        jScrollPane1.setViewportView(jtxtDescricao);

        jlstCursos.setForeground(new java.awt.Color(30, 30, 30));
        jlstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jlstCursos);

        jbtnAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnAdicionar.setForeground(new java.awt.Color(30, 30, 30));
        jbtnAdicionar.setText("Adicionar Curso");
        jbtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdicionarActionPerformed(evt);
            }
        });

        jbtnRemover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnRemover.setForeground(new java.awt.Color(30, 30, 30));
        jbtnRemover.setText("Remover Curso");
        jbtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoverActionPerformed(evt);
            }
        });

        jbtnEditar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnEditar.setForeground(new java.awt.Color(30, 30, 30));
        jbtnEditar.setText("Editar Curso");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnVoltar.setText("Voltar");
        jbtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVoltarActionPerformed(evt);
            }
        });

        jbtnCriarAula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtnCriarAula.setForeground(new java.awt.Color(30, 30, 30));
        jbtnCriarAula.setText("Criar Aula");
        jbtnCriarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCriarAulaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 30, 30));
        jLabel3.setText("Cursos Disponíveis:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 321, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(jbtnAdicionar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnCriarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jbtnVoltar))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtnAdicionar, jbtnEditar, jbtnRemover});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jbtnVoltar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnAdicionar)
                        .addComponent(jbtnRemover)
                        .addComponent(jbtnEditar)
                        .addComponent(jbtnCriarAula))
                    .addContainerGap()))
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

    private void jbtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdicionarActionPerformed
        String nome = jtxtNome.getText().trim();
        String descricao = jtxtDescricao.getText().trim();

        if (nome.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            return;
        }

        Model.Curso novoCurso = new Model.Curso(nome, descricao);
        cursoController.adicionarCurso(novoCurso);
        cursoController.salvarCursos();
        carregarCursos();

        JOptionPane.showMessageDialog(this, "Curso adicionado com sucesso!");
        jtxtNome.setText("");
        jtxtDescricao.setText("");
    }//GEN-LAST:event_jbtnAdicionarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        int index = jlstCursos.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um curso para editar.");
            return;
        }

        String novoNome = jtxtNome.getText().trim();
        String novaDescricao = jtxtDescricao.getText().trim();

        if (novoNome.isEmpty() || novaDescricao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            return;
        }

        cursoController.editarCurso(index, novoNome, novaDescricao);
        cursoController.salvarCursos();
        carregarCursos();

        JOptionPane.showMessageDialog(this, "Curso editado com sucesso!");
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoverActionPerformed
        int index = jlstCursos.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um curso para remover.");
            return;
        }

        cursoController.removerCurso(index);
        cursoController.salvarCursos();
        carregarCursos();

        JOptionPane.showMessageDialog(this, "Curso removido com sucesso!");
    }//GEN-LAST:event_jbtnRemoverActionPerformed

    private void jbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVoltarActionPerformed
        this.dispose();
        new TelaInicial(usuarioLogado, cursoController, usuarioController).setVisible(true);
    }//GEN-LAST:event_jbtnVoltarActionPerformed

    private void jbtnCriarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCriarAulaActionPerformed
        int index = jlstCursos.getSelectedIndex(); 
        if (index >= 0) {
            Model.Curso cursoSelecionado = cursoController.getCursos().get(index);
            new TelaCriarAula(usuarioLogado, cursoSelecionado, cursoController, usuarioController).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um curso.");
        }
    }//GEN-LAST:event_jbtnCriarAulaActionPerformed

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
        //java.awt.EventQueue.invokeLater(() -> new TelaGerenciarCursos().setVisible(true));
    }

    private void carregarCursos() {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Model.Curso c : cursoController.getCursos()) {
            model.addElement(c.getNome());
        }
        jlstCursos.setModel(model);
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnAdicionar;
    private javax.swing.JButton jbtnCriarAula;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnRemover;
    private javax.swing.JButton jbtnVoltar;
    private javax.swing.JList<String> jlstCursos;
    private javax.swing.JTextArea jtxtDescricao;
    private javax.swing.JTextField jtxtNome;
    // End of variables declaration//GEN-END:variables
}

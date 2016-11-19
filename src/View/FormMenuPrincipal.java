/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControladorUsuario;
import Model.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;

/**
 *
 * @author Aluno
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    private final ControladorUsuario cu;
    private final Usuario user;
    
    public FormMenuPrincipal(Usuario logado) {
        initComponents();
        pnlMenuPrincipal.setBorder(BorderFactory.createTitledBorder("Funcionalidades"));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.user = logado;
        this.cu = new ControladorUsuario();
        lblNome.setText("Seja bem-vindx, " + user.getNome() + ".");
    }

    private FormMenuPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenuPrincipal = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        btnCadastroDeProdutos = new javax.swing.JButton();
        btnAdicaoProdutos = new javax.swing.JButton();
        btnCadastroDeUsuarios = new javax.swing.JButton();
        btnRelatorioValidade = new javax.swing.JButton();
        btnRemocaoProdutos = new javax.swing.JButton();
        btnRelatorioSaida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLogoff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GDS - Menu Principal");
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlMenuPrincipal.setMaximumSize(new java.awt.Dimension(785, 348));
        pnlMenuPrincipal.setMinimumSize(new java.awt.Dimension(785, 348));
        pnlMenuPrincipal.setPreferredSize(new java.awt.Dimension(785, 348));
        pnlMenuPrincipal.setRequestFocusEnabled(false);

        lblNome.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblNome.setText("Seja bem-vindx, Lorem Ipsum.");

        btnCadastroDeProdutos.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        btnCadastroDeProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/produtoadd.png"))); // NOI18N
        btnCadastroDeProdutos.setToolTipText("\n");
        btnCadastroDeProdutos.setVerifyInputWhenFocusTarget(false);
        btnCadastroDeProdutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastroDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDeProdutosActionPerformed(evt);
            }
        });

        btnAdicaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/produtoaddun.png"))); // NOI18N
        btnAdicaoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoProdutosActionPerformed(evt);
            }
        });

        btnCadastroDeUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cadastro.png"))); // NOI18N
        btnCadastroDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDeUsuariosActionPerformed(evt);
            }
        });

        btnRelatorioValidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/report.png"))); // NOI18N
        btnRelatorioValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioValidadeActionPerformed(evt);
            }
        });

        btnRemocaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/produtosubun.png"))); // NOI18N
        btnRemocaoProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemocaoProdutosActionPerformed(evt);
            }
        });

        btnRelatorioSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/reportsaida.png"))); // NOI18N
        btnRelatorioSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuPrincipalLayout = new javax.swing.GroupLayout(pnlMenuPrincipal);
        pnlMenuPrincipal.setLayout(pnlMenuPrincipalLayout);
        pnlMenuPrincipalLayout.setHorizontalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addGroup(pnlMenuPrincipalLayout.createSequentialGroup()
                        .addComponent(btnCadastroDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnAdicaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemocaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastroDeUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRelatorioValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRelatorioSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnlMenuPrincipalLayout.setVerticalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastroDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemocaoProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastroDeUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorioValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorioSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Gerenciamento de Depósito de Suprimentos");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Instituto Federal de Educação, Ciência e Tecnologia de São Paulo");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("campus Capivari");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 10)); // NOI18N
        jLabel7.setText("Software de Gerenciamento de Depósito de Suprimentos - Desenvolvido para o Instituto Federal de Educação, Ciência e Tecnologia de São Paulo - campus Capivari - v0.9.1");
        jLabel7.setToolTipText("");

        btnLogoff.setIcon(new javax.swing.ImageIcon("E:\\IFSP\\4º Semestre\\Projeto Interdisciplinar\\Software\\GDS v0.9.1 - Client\\imagens\\logout.png")); // NOI18N
        btnLogoff.setText("Logoff");
        btnLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(333, 333, 333)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogoff, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogoff)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDeProdutosActionPerformed
        FormCadastroDeProdutos cadastro = new FormCadastroDeProdutos(this.user);
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastroDeProdutosActionPerformed

    private void btnAdicaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoProdutosActionPerformed
        FormAdicionarProduto adicao = new FormAdicionarProduto(this.user);
        adicao.setVisible(true);
    }//GEN-LAST:event_btnAdicaoProdutosActionPerformed

    private void btnCadastroDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDeUsuariosActionPerformed
        FormCadastroDeUsuarios usuarios = new FormCadastroDeUsuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_btnCadastroDeUsuariosActionPerformed

    private void btnRelatorioValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioValidadeActionPerformed
        FormRelatorioValidade relatoriovalidade = new FormRelatorioValidade();
        relatoriovalidade.setVisible(true);
    }//GEN-LAST:event_btnRelatorioValidadeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.cu.deslogarUsuario(this.user);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnRemocaoProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemocaoProdutosActionPerformed
        FormRemoverProduto remocao = new FormRemoverProduto(this.user);
        remocao.setVisible(true);
    }//GEN-LAST:event_btnRemocaoProdutosActionPerformed

    private void btnRelatorioSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioSaidaActionPerformed
        FormRelatorioSaida relatoriosaida = new FormRelatorioSaida();
        relatoriosaida.setVisible(true);
    }//GEN-LAST:event_btnRelatorioSaidaActionPerformed

    private void btnLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoffActionPerformed
        this.cu.deslogarUsuario(this.user);
        FormLogin logoff = new FormLogin();
        logoff.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoffActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicaoProdutos;
    private javax.swing.JButton btnCadastroDeProdutos;
    private javax.swing.JButton btnCadastroDeUsuarios;
    private javax.swing.JButton btnLogoff;
    private javax.swing.JButton btnRelatorioSaida;
    private javax.swing.JButton btnRelatorioValidade;
    private javax.swing.JButton btnRemocaoProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
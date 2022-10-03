/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

import conexao.Conexao; //importação do package de conexão
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; //reconhecimento da JTable
import java.sql.*; //importação do reconhecimento dos comandos SQL

public class frm_TelaPrincipal extends javax.swing.JFrame {

    Conexao con_cliente;
    
    public frm_TelaPrincipal() {
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta();  // chama o método que conecta
        con_cliente.executaSQL("select * from tbclientes order by cod");
        preencherTabela();
        posicionarRegistro();
        tbl_Clientes.setAutoCreateRowSorter(true);// ativa a classificação ordenada da tabela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Cod = new javax.swing.JLabel();
        lbl_Nome = new javax.swing.JLabel();
        lbl_DataNasc = new javax.swing.JLabel();
        lbl_Tel = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_Cod = new javax.swing.JTextField();
        txt_Nome = new javax.swing.JTextField();
        txt_DataNasc = new javax.swing.JTextField();
        txt_Tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        scp_PainelTabela = new javax.swing.JScrollPane();
        tbl_Clientes = new javax.swing.JTable();
        btn_Primeiro = new javax.swing.JButton();
        btn_Anterior = new javax.swing.JButton();
        btn_Proximo = new javax.swing.JButton();
        btn_Ultimo = new javax.swing.JButton();
        btn_Novo = new javax.swing.JButton();
        btn_Salvar = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        lbl_Pesquisa = new javax.swing.JLabel();
        txt_Pesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        lbl_Cod.setText("Código:");

        lbl_Nome.setText("Nome:");

        lbl_DataNasc.setText("Data de Nascimento:");

        lbl_Tel.setText("Telefone:");

        lbl_email.setText("E-mail:");

        txt_DataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataNascActionPerformed(evt);
            }
        });

        tbl_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data de Nascimento", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ClientesMouseClicked(evt);
            }
        });
        tbl_Clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_ClientesKeyPressed(evt);
            }
        });
        scp_PainelTabela.setViewportView(tbl_Clientes);
        if (tbl_Clientes.getColumnModel().getColumnCount() > 0) {
            tbl_Clientes.getColumnModel().getColumn(4).setResizable(false);
        }

        btn_Primeiro.setText("Primeiro");
        btn_Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrimeiroActionPerformed(evt);
            }
        });

        btn_Anterior.setText("Anterior");
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });

        btn_Proximo.setText("Próximo");
        btn_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProximoActionPerformed(evt);
            }
        });

        btn_Ultimo.setText("Último");
        btn_Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UltimoActionPerformed(evt);
            }
        });

        btn_Novo.setText("Novo Registro");
        btn_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovoActionPerformed(evt);
            }
        });

        btn_Salvar.setText("Salvar");
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        btn_Alterar.setText("Alterar");
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        lbl_Pesquisa.setText("Pesquisa por nome do cliente:");

        txt_Pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Nome)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Pesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Cod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lbl_Tel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_Tel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_DataNasc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_DataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Primeiro)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Anterior)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Proximo)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Ultimo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Novo)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Salvar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Alterar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Excluir))
                        .addComponent(scp_PainelTabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cod)
                    .addComponent(txt_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nome)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DataNasc)
                    .addComponent(txt_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Tel)
                    .addComponent(txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Primeiro)
                    .addComponent(btn_Anterior)
                    .addComponent(btn_Proximo)
                    .addComponent(btn_Ultimo)
                    .addComponent(btn_Novo)
                    .addComponent(btn_Salvar)
                    .addComponent(btn_Alterar)
                    .addComponent(btn_Excluir))
                .addGap(18, 18, 18)
                .addComponent(scp_PainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Pesquisa)
                    .addComponent(txt_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataNascActionPerformed

    private void tbl_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ClientesMouseClicked
        int linha_selecionada = tbl_Clientes.getSelectedRow();
        txt_Cod.setText(tbl_Clientes.getValueAt(linha_selecionada,0).toString());
        txt_Nome.setText(tbl_Clientes.getValueAt(linha_selecionada,1).toString());
        txt_DataNasc.setText(tbl_Clientes.getValueAt(linha_selecionada,2).toString());
        txt_Tel.setText(tbl_Clientes.getValueAt(linha_selecionada,3).toString());
        txt_email.setText(tbl_Clientes.getValueAt(linha_selecionada,4).toString());
    }//GEN-LAST:event_tbl_ClientesMouseClicked

    private void tbl_ClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_ClientesKeyPressed
        int linha_selecionada = tbl_Clientes.getSelectedRow();
        txt_Cod.setText(tbl_Clientes.getValueAt(linha_selecionada,0).toString());
        txt_Nome.setText(tbl_Clientes.getValueAt(linha_selecionada,1).toString());
        txt_DataNasc.setText(tbl_Clientes.getValueAt(linha_selecionada,2).toString());
        txt_Tel.setText(tbl_Clientes.getValueAt(linha_selecionada,3).toString());
        txt_email.setText(tbl_Clientes.getValueAt(linha_selecionada,4).toString());
    }//GEN-LAST:event_tbl_ClientesKeyPressed

    private void btn_PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrimeiroActionPerformed
        try{
            
            con_cliente.resultset.first();
            mostrar_Dados();
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null,"Não foi possível acessar o primeiro registro: "+erro,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_PrimeiroActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        try{
            
            con_cliente.resultset.previous();
            mostrar_Dados();
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null,"Não foi possível acessar o registro anterior: "+erro,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    private void btn_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProximoActionPerformed
        try{
            
            con_cliente.resultset.next();
            mostrar_Dados();
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null,"Não foi possível acessar o próximo registro: "+erro,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_ProximoActionPerformed

    private void btn_UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UltimoActionPerformed
        try{
            
            con_cliente.resultset.last();
            mostrar_Dados();
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null,"Não foi possível acessar o último registro: "+erro,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_UltimoActionPerformed

    private void btn_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovoActionPerformed
    
        txt_Cod.setText("");
        txt_Nome.setText("");
        txt_DataNasc.setText("");
        txt_Tel.setText("");
        txt_email.setText("");
        txt_Cod.requestFocus();
        
    }//GEN-LAST:event_btn_NovoActionPerformed

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
    
        String nome = txt_Nome.getText();
        String data_nasc = txt_DataNasc.getText();
        String telefone = txt_Tel.getText();
        String email = txt_email.getText();
        
        try{
            
            String insert_sql = "insert into tbclientes (nome, telefone, email, dt_nasc) values ('"+nome+"','"+telefone+"','"+email+"','"+data_nasc+"')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!!","Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            
            con_cliente.executaSQL("select * from tbclientes order by cod");
            preencherTabela();
            
        }catch(SQLException errosql){
            
            JOptionPane.showMessageDialog(null, "\n Erro ao salvar!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btn_SalvarActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        String nome = txt_Nome.getText();
        String data_nasc = txt_DataNasc.getText();
        String telefone = txt_Tel.getText();
        String email = txt_email.getText();
        String sql;
        String msg= "";
        
        try{
            
            if(txt_Cod.getText().equals("")){
                
                sql = "insert into tbclientes (nome, telefone, email, dt_nasc) values ('"+nome+"','"+telefone+"','"+email+"','"+data_nasc+"',)";
                msg = "Salvo novo registro";
                
            }else{
                
                sql="update tbclientes set nome='" + nome + "',telefone='" + telefone + "', email='" + email + "', dt_nasc='" + data_nasc + "' where cod= " + txt_Cod.getText();
                msg = "Alteração de registro";
                
            }
            
            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!!","Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);
            
            con_cliente.executaSQL("select * from tbclientes order by cod");
            preencherTabela();
            
        }catch(SQLException errosql){
            
            JOptionPane.showMessageDialog(null, "\n Erro ao salvar!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        
        String sql = "";
        try{
            
            int resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja excluir o registro? ", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
            if(resposta == 0){
                
                sql = "delete from tbclientes where cod = "+ txt_Cod.getText();
                int excluir = con_cliente.statement.executeUpdate(sql);
                if(excluir == 1){
                    
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    con_cliente.executaSQL("select * from tbclientes order by cod");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                    
                }
                else{
                    
                    JOptionPane.showMessageDialog(null,"Operação cancelada pelo usuário!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                
            }
            
        }catch(SQLException excecao){
            
            JOptionPane.showMessageDialog(null, "Erro na exclusão: "+excecao,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void txt_PesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PesquisaKeyReleased

        try{
            
            String pesquisa = "select * from tbclientes where nome like '"+ txt_Pesquisa.getText() + "%'";
            con_cliente.executaSQL(pesquisa);
            
            if(con_cliente.resultset.first()){
                
                preencherTabela();
                
            }
            else{
                
                JOptionPane.showMessageDialog(null, "\n Não existe dados com este parâmetro!!","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }catch(SQLException errosql){
            
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n"+ errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }//GEN-LAST:event_txt_PesquisaKeyReleased

    //Método para colocar os dados na tabela
    public void preencherTabela(){
        
        tbl_Clientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tbl_Clientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbl_Clientes.getColumnModel().getColumn(2).setPreferredWidth(11);
        tbl_Clientes.getColumnModel().getColumn(3).setPreferredWidth(14);
        tbl_Clientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) tbl_Clientes.getModel();
        modelo.setNumRows(0);
        
        try{
            
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                
                modelo.addRow(new Object[]{
                
                con_cliente.resultset.getString("cod"),con_cliente.resultset.getString("nome"),con_cliente.resultset.getString("dt_nasc"),con_cliente.resultset.getString("telefone"), con_cliente.resultset.getString("email")
                
                });
                
            }
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    //Método para colocar o primeiro registro nas caixas de texto
    public void posicionarRegistro(){
        
        try{
            
            con_cliente.resultset.first(); // posiciona a seleção no primeiro registro da tabela
            mostrar_Dados();
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    //Método para colocar os dados da tabela nas caixas de texto
    public void mostrar_Dados(){
        
        try{
            
            txt_Cod.setText(con_cliente.resultset.getString("cod"));
            txt_Nome.setText(con_cliente.resultset.getString("nome"));
            txt_DataNasc.setText(con_cliente.resultset.getString("dt_nasc"));
            txt_Tel.setText(con_cliente.resultset.getString("telefone"));
            txt_email.setText(con_cliente.resultset.getString("email"));
            
        }catch(SQLException erro){
            
            JOptionPane.showMessageDialog(null,"Não localizou dados: "+erro,"Mensagemdo Programa",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(frm_TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Primeiro;
    private javax.swing.JButton btn_Proximo;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JButton btn_Ultimo;
    private javax.swing.JLabel lbl_Cod;
    private javax.swing.JLabel lbl_DataNasc;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Pesquisa;
    private javax.swing.JLabel lbl_Tel;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JScrollPane scp_PainelTabela;
    private javax.swing.JTable tbl_Clientes;
    private javax.swing.JTextField txt_Cod;
    private javax.swing.JTextField txt_DataNasc;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Pesquisa;
    private javax.swing.JTextField txt_Tel;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
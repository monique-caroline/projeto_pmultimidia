/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.endereco;

import backendmonique.controle.ControleEndereco;
import backendmonique.modelo.bean.Endereco;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class alterarEndereco {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         String cep = JOptionPane.showInputDialog("Entre com o Cep");
         int nun = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Numero"));
         String compl = JOptionPane.showInputDialog("Entre com o Complemento");
         Endereco end = new Endereco(id,cep,nun,compl);
         ControleEndereco contEnd = new ControleEndereco();
         end = contEnd.altera(end);
         JOptionPane.showMessageDialog(null, end.toString());

    }
    
}

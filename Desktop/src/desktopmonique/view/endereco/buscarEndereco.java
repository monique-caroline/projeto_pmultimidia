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
public class buscarEndereco {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         Endereco end = new Endereco(id);
         ControleEndereco contEnd = new ControleEndereco();
         end = contEnd.busca(end);
         JOptionPane.showMessageDialog(null, end.toString());

    }

    
}

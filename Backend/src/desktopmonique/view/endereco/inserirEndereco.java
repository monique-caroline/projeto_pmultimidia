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
public class inserirEndereco {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         String cep = JOptionPane.showInputDialog("Entre com o Cep");
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Numero"));
         String complemento = JOptionPane.showInputDialog("Entre com o Complemento");
         Endereco end = new Endereco(0,cep,numero,complemento);
         ControleEndereco contEnd = new ControleEndereco();
         end = contEnd.inseri(end);
         JOptionPane.showMessageDialog(null, end.toString());

    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.endereco;

import backendmonique.controle.ControleEndereco;
import backendmonique.modelo.bean.Endereco;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class listarEndereco {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String cep = JOptionPane.showInputDialog("Entre com o CEP");
         Endereco end = new Endereco(cep);
         ControleEndereco contEnd = new ControleEndereco();
         List<Endereco> ends = contEnd.lista(end);

         for (Endereco endL : ends) {
            JOptionPane.showMessageDialog(null, endL.toString());
         }

    }
}

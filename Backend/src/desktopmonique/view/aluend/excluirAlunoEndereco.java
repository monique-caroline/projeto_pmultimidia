/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.aluend;

import backendmonique.controle.ControleAlunoEndereco;
import backendmonique.modelo.bean.AlunoEndereco;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class excluirAlunoEndereco {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         AlunoEndereco aluend = new AlunoEndereco(id);
         ControleAlunoEndereco contAluEnd = new ControleAlunoEndereco();
         aluend = contAluEnd.exclui(aluend);
         JOptionPane.showMessageDialog(null, aluend.toString());
    }

    
}

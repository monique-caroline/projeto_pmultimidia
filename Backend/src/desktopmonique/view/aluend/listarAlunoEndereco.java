/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.aluend;

import backendmonique.controle.ControleAlunoEndereco;
import backendmonique.modelo.bean.AlunoEndereco;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class listarAlunoEndereco {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String obs = JOptionPane.showInputDialog("Entre com o Observacao");
         AlunoEndereco aluEnd = new AlunoEndereco(obs);
         ControleAlunoEndereco contAluEnd = new ControleAlunoEndereco();
         List<AlunoEndereco> aluends = contAluEnd.lista(aluEnd);

         for (AlunoEndereco aluendsL : aluends) {
            JOptionPane.showMessageDialog(null, aluendsL.toString());
            JOptionPane.showMessageDialog(null, aluendsL.getAlu().getNome());
            JOptionPane.showMessageDialog(null, aluendsL.getEnd().getCep());
     
         }
                 

    }
}

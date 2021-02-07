/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.matalu;

import backendmonique.controle.ControleMatriculaAluno;
import backendmonique.modelo.bean.MatriculaAluno;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class listarMatriculaAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String obs = JOptionPane.showInputDialog("Entre com a Observacao");
         MatriculaAluno matalu = new MatriculaAluno(obs);
         ControleMatriculaAluno contMatAlu = new ControleMatriculaAluno();
         List<MatriculaAluno> matalus = contMatAlu.lista(matalu);

         for (MatriculaAluno mataluL : matalus) {
            JOptionPane.showMessageDialog(null, mataluL.toString());
            JOptionPane.showMessageDialog(null, mataluL.getAlu().getNome());
            JOptionPane.showMessageDialog(null, mataluL.getMat().getLogin());
     
         }
                 

    }
}

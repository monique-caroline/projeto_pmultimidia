/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.matalu;

import backendmonique.controle.ControleMatriculaAluno;
import backendmonique.modelo.bean.MatriculaAluno;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class excluirMatriculaAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         MatriculaAluno matAlu = new MatriculaAluno(id);
         ControleMatriculaAluno contMat = new ControleMatriculaAluno();
         matAlu = contMat.exclui(matAlu);
         JOptionPane.showMessageDialog(null, matAlu.toString());
    }

    
}

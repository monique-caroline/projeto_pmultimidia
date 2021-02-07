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
public class alterarMatriculaAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Id")); 
         int idM = Integer.parseInt(JOptionPane.showInputDialog("Entre com o IdMat"));
         int idA = Integer.parseInt(JOptionPane.showInputDialog("Entre com o IdAluno"));
         String obs = JOptionPane.showInputDialog("Entre com o Observacao");

         MatriculaAluno matalu = new MatriculaAluno(id,idM,idA,obs);
         ControleMatriculaAluno contMatAlu = new ControleMatriculaAluno();
         matalu = contMatAlu.altera(matalu);
         JOptionPane.showMessageDialog(null, matalu.toString());
    }
    
}



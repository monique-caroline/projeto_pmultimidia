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
public class inserirMatriculaAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         
         int idM = Integer.parseInt(JOptionPane.showInputDialog("Entre com a IdMatricula"));
         int idA = Integer.parseInt(JOptionPane.showInputDialog("Entre com o IdAluno"));
         String obs = JOptionPane.showInputDialog("Entre com o Observacao");

         MatriculaAluno matalu = new MatriculaAluno(0,idM,idA,obs);
         ControleMatriculaAluno contMatAlu = new ControleMatriculaAluno();
         matalu = contMatAlu.inseri(matalu);
         JOptionPane.showMessageDialog(null, matalu.toString());

    }

    
}

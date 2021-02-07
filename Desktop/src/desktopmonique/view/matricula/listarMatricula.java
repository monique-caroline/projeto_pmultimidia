/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.matricula;

import backendmonique.controle.ControleMatricula;
import backendmonique.modelo.bean.Matricula;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class listarMatricula {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
        String login;   
         login = JOptionPane.showInputDialog("Entre com o Login");
         Matricula mat = new Matricula(login,"");
         ControleMatricula contMat = new ControleMatricula();
         List<Matricula> mats = contMat.lista(mat);

         for (Matricula matL : mats) {
            JOptionPane.showMessageDialog(null, matL.toString());
         }
                 

    }
}

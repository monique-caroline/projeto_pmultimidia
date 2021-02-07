/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.matricula;

import backendmonique.controle.ControleMatricula;
import backendmonique.modelo.bean.Matricula;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class buscarMatricula {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         int id;   
         
         id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));

         Matricula mat = new Matricula(id);
         ControleMatricula contMat = new ControleMatricula();
         mat = contMat.busca(mat);
         JOptionPane.showMessageDialog(null, mat.toString());
    }

    
}

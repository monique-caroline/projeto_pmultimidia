/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.acesso;

import backendmonique.controle.ControleMatricula;
import backendmonique.modelo.bean.Matricula;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class login {
    
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         String login;
         String senha;
         
         login = JOptionPane.showInputDialog("Entre com o Login");
         senha = JOptionPane.showInputDialog("Entre com a Senha");
         Matricula mat = new Matricula(login,senha);
         ControleMatricula contMat = new ControleMatricula();
         mat = contMat.valida(mat);
         JOptionPane.showMessageDialog(null, mat.toString());
       
    }
    
}

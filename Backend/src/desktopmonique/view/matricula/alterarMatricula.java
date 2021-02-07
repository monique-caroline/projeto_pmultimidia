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
public class alterarMatricula {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         int id;   
         String login;
         String senha;
         int numero;
         String status;
         String tipo;
         
         id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         login = JOptionPane.showInputDialog("Entre com o Login");
         senha = JOptionPane.showInputDialog("Entre com a Senha");
         numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Numero"));
         status = JOptionPane.showInputDialog("Entre com o Status");
         tipo = JOptionPane.showInputDialog("Entre com o Tipo");

         Matricula mat = new Matricula(id,login,senha,numero,status,tipo);
         ControleMatricula contMat = new ControleMatricula();
         mat = contMat.altera(mat);
         JOptionPane.showMessageDialog(null, mat.toString());
    }
    
}

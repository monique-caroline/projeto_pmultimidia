/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.aluno;

import backendmonique.controle.ControleAluno;
import backendmonique.modelo.bean.Aluno;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class buscarAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         Aluno alu = new Aluno(id);
         ControleAluno contAlu = new ControleAluno();
         alu = contAlu.busca(alu);
         JOptionPane.showMessageDialog(null, alu.toString());

    }

    
}

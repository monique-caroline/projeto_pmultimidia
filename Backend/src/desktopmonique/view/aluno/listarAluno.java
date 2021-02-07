/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.aluno;

import backendmonique.controle.ControleAluno;
import backendmonique.modelo.bean.Aluno;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class listarAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         Aluno alu = new Aluno(nome);
         ControleAluno contAlu = new ControleAluno();
         List<Aluno> alus = contAlu.lista(alu);

         for (Aluno aluL : alus) {
            JOptionPane.showMessageDialog(null, aluL.toString());
         }

    }
}

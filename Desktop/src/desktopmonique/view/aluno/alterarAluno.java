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
public class alterarAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         String cpf = JOptionPane.showInputDialog("Entre com o Cpf");
         String tipo = JOptionPane.showInputDialog("Entre com o Tipo");
         String email = JOptionPane.showInputDialog("Entre com o Email");
         Aluno alu = new Aluno(id,nome,cpf,tipo,email);
         ControleAluno contAlu = new ControleAluno();
         alu = contAlu.altera(alu);
         JOptionPane.showMessageDialog(null, alu.toString());

    }
    
}

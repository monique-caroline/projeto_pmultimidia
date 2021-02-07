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
public class inserirAluno {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         String cpf = JOptionPane.showInputDialog("Entre com o Cpf");
         String tipo = JOptionPane.showInputDialog("Entre com o Tipo");
         String email = JOptionPane.showInputDialog("Entre com o Email");
         Aluno alu = new Aluno(0,nome,cpf,tipo,email);
         ControleAluno contAlu = new ControleAluno();
         alu = contAlu.inseri(alu);
         JOptionPane.showMessageDialog(null, alu.toString());

    }

    
}

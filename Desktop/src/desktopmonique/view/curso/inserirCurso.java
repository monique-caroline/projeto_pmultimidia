/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.curso;

import backendmonique.controle.ControleCurso;
import backendmonique.modelo.bean.Curso;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class inserirCurso {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         String curso = JOptionPane.showInputDialog("Entre com o Curso");
         String cpf = JOptionPane.showInputDialog("Entre com o Cpf");
         String tipo = JOptionPane.showInputDialog("Entre com o Tipo");
         String email = JOptionPane.showInputDialog("Entre com o Email");
         Curso cur = new Curso(0,curso,cpf,tipo,email);
         ControleCurso contCur = new ControleCurso();
         cur = contCur.inseri(cur);
         JOptionPane.showMessageDialog(null, cur.toString());

    }

    
}

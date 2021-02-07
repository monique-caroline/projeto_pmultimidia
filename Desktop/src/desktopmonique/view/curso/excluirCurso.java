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
public class excluirCurso {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         Curso cur = new Curso(id);
         ControleCurso contCur = new ControleCurso();
         cur = contCur.exclui(cur);
         JOptionPane.showMessageDialog(null, cur.toString());
    }

    
}

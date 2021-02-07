/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopmonique.view.curso;

import backendmonique.controle.ControleCurso;
import backendmonique.modelo.bean.Curso;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author moniquecarolineramos
 */
public class listarCurso {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String curso = JOptionPane.showInputDialog("Entre com o Curso");
         Curso cur = new Curso(curso);
         ControleCurso contCur = new ControleCurso();
         List<Curso> curs = contCur.lista(cur);

         for (Curso curL : curs) {
            JOptionPane.showMessageDialog(null, curL.toString());
         }
                 

    }
}

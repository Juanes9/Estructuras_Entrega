
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Registro_Estudiantes {
    

    public LinkedList<Estudiante_Ingenieria> Registro_Est_Ingenieria(LinkedList<Estudiante_Ingenieria> ListaEI) {
        
 
            Estudiante_Ingenieria EI = new Estudiante_Ingenieria(null, null, null, null, 0, 0);
           
            EI.setCedula(JOptionPane.showInputDialog("Ingrese la cedula"));
            EI.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
            EI.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            EI.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
            EI.setNum_Semestre_Cursado(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el semestre que cursa actualmente")));
            EI.setPromedio_acumulado(Float.parseFloat(JOptionPane.showInputDialog("Ingresa un promedio")));
            EI.setComputador_Portatil(null);

            ListaEI.add(EI);
            
        return ListaEI;
    }
}





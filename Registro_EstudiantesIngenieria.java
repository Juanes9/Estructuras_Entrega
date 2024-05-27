
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Registro_EstudiantesIngenieria {

    public LinkedList<Estudiante_Ingenieria> Registro_Est_Ingenieria(LinkedList<Estudiante_Ingenieria> ListaEI) {

       
        Estudiante_Ingenieria EI = new Estudiante_Ingenieria(null, null, null, null, 0, 0);

        JOptionPane.showMessageDialog(null, "Datos del estudiante");
        EI.setCedula(JOptionPane.showInputDialog("Cedula"));

        for (Estudiante_Ingenieria estudiante : ListaEI) {
            if (estudiante.getCedula().equals(EI)) {
                JOptionPane.showMessageDialog(null,"Ya existe un estudiante con este documento");
                break;
            }
        }

        EI.setNombre(JOptionPane.showInputDialog("Nombre"));
        EI.setApellido(JOptionPane.showInputDialog("Apellido"));
        EI.setTelefono(JOptionPane.showInputDialog("Telefono"));
        EI.setNum_Semestre_Cursado(Integer.parseInt(JOptionPane.showInputDialog("Semestre que cursa actualmente")));
        EI.setPromedio_acumulado(Float.parseFloat(JOptionPane.showInputDialog("Promedio")));
        EI.setComputador_Portatil(null);

        ListaEI.add(EI);

        return ListaEI;
    }
}

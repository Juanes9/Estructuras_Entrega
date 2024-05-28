import java.util.LinkedList;

import javax.swing.JOptionPane;

public class EliminarRegistroIngenieria {
    

    public LinkedList<Estudiante_Ingenieria> eliminarRegistro(LinkedList<Estudiante_Ingenieria> listaEstudiantes, LinkedList<Computador_Portatil> listaComputadores, LinkedList<Estudiante_Ingenieria> listaGP) {
    String cedulaOSerial = JOptionPane.showInputDialog("Ingrese la cédula o serial:");
    boolean encontrar = false;

    for (Estudiante_Ingenieria estudiante : listaEstudiantes) {
        if (estudiante.getCedula().equals(cedulaOSerial) || estudiante.getComputador_Portatil().getSerial().equals(cedulaOSerial)) {
            listaEstudiantes.remove(estudiante);
            listaComputadores.remove(estudiante.getComputador_Portatil());
            listaGP.remove(estudiante);
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
            encontrar = true;
            break;
        }
    }

    if (!encontrar) {
        JOptionPane.showMessageDialog(null, "No se encontró ningún registro con la cédula o serial ingresado.");
    }

    return listaGP;
}
}

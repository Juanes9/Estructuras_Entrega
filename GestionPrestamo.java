
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestionPrestamo {

    public LinkedList<Estudiante_Ingenieria> Prestamo(LinkedList<Estudiante_Ingenieria> ListaEI,
            LinkedList<Computador_Portatil> ListaCP,LinkedList<Estudiante_Ingenieria> Gestor_Prestamo) {
       
        for (Estudiante_Ingenieria estudiante : ListaEI) {

            Computador_Portatil CP = ListaCP.removeFirst();
            estudiante.setComputador_Portatil(CP);
            Gestor_Prestamo.add(estudiante);

        }
        return Gestor_Prestamo;
    }

    public void mostrarDetalleEstudiante(LinkedList<Estudiante_Ingenieria> Gestor_Prestamo) {

        StringBuilder detalle = new StringBuilder();

        for (Estudiante_Ingenieria estudiante : Gestor_Prestamo) {
            detalle.append("Detalle del estudiante modificado:\n");
            detalle.append("Cedula: ").append(estudiante.getCedula()).append("\n");
            detalle.append("Nombre: ").append(estudiante.getNombre()).append("\n");
            detalle.append("Apellido: ").append(estudiante.getApellido()).append("\n");
            detalle.append("Telefono: ").append(estudiante.getTelefono()).append("\n");
            detalle.append("Número de semestre cursado: ").append(estudiante.getNum_Semestre_Cursado()).append("\n");
            detalle.append("Promedio acumulado: ").append(estudiante.getPromedio_acumulado()).append("\n");
            detalle.append("Detalle del computador:\n");
            detalle.append("Serial: ").append(estudiante.getComputador_Portatil().getSerial()).append("\n");
            detalle.append("Marca: ").append(estudiante.getComputador_Portatil().getMarca()).append("\n");
            detalle.append("Tamaño: ").append(estudiante.getComputador_Portatil().getTamano()).append("\n");
            detalle.append("Precio: ").append(estudiante.getComputador_Portatil().getPrecio()).append("\n");
            detalle.append("Sistema Operativo: ").append(estudiante.getComputador_Portatil().getSistema_Operativo())
                    .append("\n");
            detalle.append("Procesador: ").append(estudiante.getComputador_Portatil().getProcesador()).append("\n");
            JOptionPane.showMessageDialog(null, detalle.toString(), "Detalle del estudiante",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}


import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Modificar {

    public LinkedList<Estudiante_Ingenieria> Modificar(LinkedList<Estudiante_Ingenieria> ListaGP,
            LinkedList<Computador_Portatil> ListaCP) {

        Computador_Portatil nuevoComputador = new Computador_Portatil();
        RegistrarComputadorPortatil registrar = new RegistrarComputadorPortatil();
        String cedulaSerial = JOptionPane.showInputDialog("Ingrese la cédula o serial:");

        for (Estudiante_Ingenieria estudiante : ListaGP) {
            if (estudiante.getCedula().equals(cedulaSerial)
                    || estudiante.getComputador_Portatil().getSerial().equals(cedulaSerial)) {

                registrar.RegistroComputador(ListaCP);

                nuevoComputador = ListaCP.removeFirst();

                estudiante.setComputador_Portatil(nuevoComputador);

                JOptionPane.showMessageDialog(null, "Datos del computador actualizados correctamente.");
                ListaGP.add(estudiante);
                break;
            }
        }

        return ListaGP;
    }

}

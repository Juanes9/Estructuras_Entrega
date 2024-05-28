
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Modificar {
    JOptionPane jp = new JOptionPane();

    public LinkedList<Estudiante_Ingenieria> modificarIngenieria(LinkedList<Estudiante_Ingenieria> Gestor_Prestamo,
            LinkedList<Computador_Portatil> ListaCP) {

        Computador_Portatil nuevoComputador = new Computador_Portatil();
        RegistrarComputadorPortatil registrar = new RegistrarComputadorPortatil();
        String cedulaSerial = jp.showInputDialog("Ingrese la cédula o serial:");

        for (Estudiante_Ingenieria estudiante : Gestor_Prestamo) {
            if (estudiante.getCedula().equals(cedulaSerial)
                    || estudiante.getComputador_Portatil().getSerial().equals(cedulaSerial)) {

                registrar.RegistroComputador(ListaCP);

                nuevoComputador = ListaCP.removeFirst();

                estudiante.setComputador_Portatil(nuevoComputador);

                jp.showMessageDialog(null, "Datos del computador actualizados correctamente.");
                Gestor_Prestamo.add(estudiante);
                break;
            }
        }

        return Gestor_Prestamo;
    }

    public LinkedList<Estudiante_Diseño> modificarDiseño(LinkedList<Estudiante_Diseño> Gestor_PrestamoD,
            LinkedList<Tableta_Grafica> ListaTG) {

        Tableta_Grafica nuevaTableta = new Tableta_Grafica();
        RegistroTabletaGrafica register = new RegistroTabletaGrafica();
        String cedulaSerial = jp.showInputDialog("Ingrese la cedula o serial: ");

        for (Estudiante_Diseño estudiante : Gestor_PrestamoD) {
            if (estudiante.getCedula().equals(cedulaSerial)
                    || estudiante.getTableta_Grafica().getSerial().equals(cedulaSerial)) {
                register.registroTabletaGrafica(ListaTG);
                nuevaTableta = ListaTG.removeFirst();
                estudiante.setTableta_Grafica(nuevaTableta);
                jp.showMessageDialog(null, "Datos de la tableta actualizados correctamente.");
                Gestor_PrestamoD.add(estudiante);
                break;
            }
        }
        return Gestor_PrestamoD;
    }

}

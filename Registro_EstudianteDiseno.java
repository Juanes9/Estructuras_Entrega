
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Registro_EstudianteDiseno {
    JOptionPane jp = new JOptionPane();

    public LinkedList<Estudiante_Diseño> registroEstudianteDiseno(LinkedList<Estudiante_Diseño> ListaED) {
        int opcionModalidad = 0, cant_asignatura = 0;
        
        Estudiante_Diseño ED = new Estudiante_Diseño(null, null, null, null, null, 0);
        jp.showMessageDialog(null, "Datos del estudiante");
        ED.setCedula(jp.showInputDialog(null, "Ingrese la cedula: "));
        ED.setNombre(jp.showInputDialog(null, "Ingrese el nombre: "));
        ED.setApellido(jp.showInputDialog(null, "Ingrese el apellido: "));
        ED.setTelefono(jp.showInputDialog(null, "Ingrese el telefono: "));
        ED.setModalidad_Estudio(modalidadEstudio(opcionModalidad));
        ED.setCantidad_Asignaturas(cantidadAsignaturas(cant_asignatura));
        ListaED.add(ED);
        return ListaED;
    }

    public String modalidadEstudio(int opcionModalidad) {

        String Menu = "MENU\n"
                + "1.Presencial \n"
                + "En caso de no ser presencial, se le asigna virtual\n";

        opcionModalidad = Integer.parseInt(jp.showInputDialog(Menu));

        switch (opcionModalidad) {
            case 1:
                return "Presencial";

            default:
                return "Virtual";
        }
    }

    public int cantidadAsignaturas(int cant_asignatura) {
        int actual=0;
       
        do {
            String asignatura = JOptionPane.showInputDialog("Cantidad Asignatura");
            try {
                 actual = Integer.parseInt(asignatura);
                if (actual <=0) {
                    JOptionPane.showMessageDialog(null, "Almenos debes estar viendo una asignatura", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    cant_asignatura = actual;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se permiten letras ni caracteres especiales", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } while (actual <= 0);

        return cant_asignatura;
    }

}

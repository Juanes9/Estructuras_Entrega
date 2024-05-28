import java.util.LinkedList;
import javax.swing.JOptionPane;

public class MenuDiseno {
    JOptionPane jp = new JOptionPane();

    public void menuDis() {

        int continuar;
        int opcion;

        Registro_EstudianteDiseno RD = new Registro_EstudianteDiseno();
        RegistroTabletaGrafica RTG = new RegistroTabletaGrafica();
        GestionPrestamo GP = new GestionPrestamo();
        ExportarEstudiantesDiseno EXD = new ExportarEstudiantesDiseno();
        Modificar MD = new Modificar();
        EliminarRegistro ER = new EliminarRegistro();

        LinkedList<Estudiante_Diseño> ListaED = new LinkedList<>();
        LinkedList<Tableta_Grafica> ListaTG = new LinkedList<>();
        LinkedList<Estudiante_Diseño> Gestor_PrestamoD = new LinkedList<>();

        do {

            String menu = "Menu\n"
                    + "1.Registrar prestamo de equipo\n"
                    + "2.Modificar prestamo de equipo\n"
                    + "3.Devolucion de equipo\n"
                    + "4.Buscar equipo por serial o cedula\n"
                    + "5.Exportar Registro\n"
                    + "6.Mostrar archivo\n"
                    + "0.Salir";

            opcion = Integer.parseInt(jp.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    continuar = jp.showConfirmDialog(null, "Desea registrar un nuevo estudiante", "Mensaje",
                            jp.YES_NO_OPTION);
                    if (continuar == jp.YES_OPTION) {
                        do {

                            RD.registroEstudianteDiseno(ListaED);

                            RTG.registroTabletaGrafica(ListaTG);

                            continuar = jp.showConfirmDialog(null, "Desea registrar un nuevo estudiante",
                                    "Mensaje", jp.YES_NO_OPTION);
                        } while (continuar == jp.YES_OPTION);
                    } else {
                        jp.showMessageDialog(null, "Volviendo al menu principal");
                    }
                    GP.prestamoDiseño(ListaED, ListaTG, Gestor_PrestamoD);
                    break;
                case 2:
                    MD.modificarDiseño(Gestor_PrestamoD, ListaTG);
                    break;
                case 3:
                    ER.eliminarRegistroDiseño(ListaED, ListaTG, Gestor_PrestamoD);
                    break;
                case 4:
                    break;
                case 5:
                    EXD.exportarEstudiantesDiseno(Gestor_PrestamoD);
                    break;
                case 6:
                    GP.mostrarEstudianteDis(Gestor_PrestamoD);
                    break;
                case 0:
                    jp.showMessageDialog(null, "Volviendo al menu principal");
                    break;
                default:
                    jp.showMessageDialog(null, "Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 0);
    }
}

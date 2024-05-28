import java.util.LinkedList;

import javax.swing.JOptionPane;

public class MenuIngenieria {
    JOptionPane jp = new JOptionPane();

    public void menuIng() {

        int continuar;
        int opcion;

        Registro_EstudiantesIngenieria RE = new Registro_EstudiantesIngenieria();
        RegistrarComputadorPortatil RCP = new RegistrarComputadorPortatil();
        GestionPrestamo gp = new GestionPrestamo();
        ExportarEstudiantesIngenieria IE = new ExportarEstudiantesIngenieria();
        Modificar MD = new Modificar();
        EliminarRegistro ER = new EliminarRegistro();

        LinkedList<Estudiante_Ingenieria> ListaEI = new LinkedList<>();
        LinkedList<Computador_Portatil> ListaCP = new LinkedList<>();
        LinkedList<Estudiante_Ingenieria> Gestor_Prestamo = new LinkedList<>();

        do {

            String menu = "Menú\n"
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

                            RE.Registro_Est_Ingenieria(ListaEI);

                            RCP.RegistroComputador(ListaCP);

                            continuar = jp.showConfirmDialog(null, "Desea registrar un nuevo estudiante",
                                    "Mensaje", jp.YES_NO_OPTION);
                        } while (continuar == jp.YES_OPTION);
                    } else {
                        jp.showMessageDialog(null, "Volviendo al menu principal");
                    }
                    gp.prestamoIngenieria(ListaEI, ListaCP, Gestor_Prestamo);
                    break;
                case 2:
                    MD.modificarIngenieria(Gestor_Prestamo, ListaCP);
                    break;
                case 3:
                    ER.eliminarRegistroIngenieria(ListaEI, ListaCP, Gestor_Prestamo);
                    break;
                case 4:
                    break;
                case 5:
                    IE.exportarEstudiantesIngenieria(Gestor_Prestamo);
                    break;
                case 6:
                    gp.mostrarEstudianteIng(Gestor_Prestamo);
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

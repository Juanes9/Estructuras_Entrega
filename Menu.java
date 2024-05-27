import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Menu {

    public void Menu() {

        int continuar;
        int opcion;

       
        Registro_EstudiantesIngenieria RE = new Registro_EstudiantesIngenieria();
        RegistrarComputadorPortatil RCP = new RegistrarComputadorPortatil();
        GestionPrestamo gp = new GestionPrestamo();
        ExportarEstudiantesIngenieria IE = new ExportarEstudiantesIngenieria();
        Modificar MD = new Modificar();

        LinkedList<Estudiante_Ingenieria> ListaEI = new LinkedList<>();
        LinkedList<Computador_Portatil> ListaCP = new LinkedList<>();
        LinkedList<Estudiante_Ingenieria> ListaGP = new LinkedList<>();

        do {

            String menu = "Menú\n"
                    + "1.Registro Prestamo\n"
                    + "2.Exportar Archivo\n"
                    + "3.Modificar\n"
                    + "Ingrese la opcion Deseada";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1:

                    continuar = JOptionPane.showConfirmDialog(null, "Desea registrar un nuevo estudiante", "Mensaje",
                            JOptionPane.YES_NO_OPTION);
                    if (continuar == JOptionPane.YES_OPTION) {
                        do {
                            RE.Registro_Est_Ingenieria(ListaEI);
                            RCP.RegistroComputador(ListaCP);
                            
                            continuar = JOptionPane.showConfirmDialog(null, "Desea registrar un nuevo estudiante",
                                    "Mensaje", JOptionPane.YES_NO_OPTION);
                        } while (continuar == JOptionPane.YES_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                    }

                    gp.Prestamo(ListaEI, ListaCP,ListaGP);
                    break;

                case 2:
                    IE.exportarEstudiantesIngenieria(ListaGP);
                    break;

                case 3:
                    MD.Modificar(ListaGP, ListaCP);
                    break;

                case 4:
                   gp.mostrarDetalleEstudiante(ListaGP);
                    break;

            }
        } while (opcion != 0);
    }

}

    


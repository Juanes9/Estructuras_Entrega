import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Menu {

    public void Menu() {

        int continuar;
        int opcion;
        String Archivo="";

       
        Registro_EstudiantesIngenieria RE = new Registro_EstudiantesIngenieria();
        RegistrarComputadorPortatil RCP = new RegistrarComputadorPortatil();
        GestionPrestamo gp = new GestionPrestamo();
        ExportarEstudiantesIngenieria IE = new ExportarEstudiantesIngenieria();
        Modificar MD = new Modificar();
        EliminarRegistroIngenieria ERI= new EliminarRegistroIngenieria();
        ImportarEstudiantesIngenieria IEI= new ImportarEstudiantesIngenieria();

        LinkedList<Estudiante_Ingenieria> ListaEI = new LinkedList<>();
        LinkedList<Computador_Portatil> ListaCP = new LinkedList<>();
        LinkedList<Estudiante_Ingenieria> ListaGP = new LinkedList<>();
        LinkedList<Estudiante_Ingenieria>lista= new LinkedList<>();

        do {

            String menu = "Menú\n"
                    + "1.Registro Prestamo\n"
                    + "2.Exportar Archivo\n"
                    + "3.Modificar\n"
                    +" 4.ModificarArchivoImportado\n"
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

                    break;

                    case 2:
                    gp.Prestamo(ListaEI, ListaCP,ListaGP);
                    break;

                case 3:
                    IE.exportarEstudiantesIngenieria(ListaGP);
                    break;

                case 4:
                    MD.Modificar(ListaGP, ListaCP);
                    break;

                    case 5:

                    ERI.eliminarRegistro(ListaEI, ListaCP, ListaGP);

                    break;

                case 7:
                   gp.mostrarDetalleEstudiante(ListaGP);
                    break;

            }
        } while (opcion != 0);
    }

}

    


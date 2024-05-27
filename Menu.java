import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Menu {

    public void Menu(){

        Registro_Estudiantes RE= new Registro_Estudiantes();
      RegistrarComputadorPortatil RCP= new RegistrarComputadorPortatil();
      GestionPrestamo gp= new GestionPrestamo();
      ExportarEstudiantesIngenieria IE= new ExportarEstudiantesIngenieria();
      

      LinkedList<Estudiante_Ingenieria> ListaEI=new LinkedList<>();
      LinkedList<Computador_Portatil> ListaCP=new LinkedList<>();
      LinkedList<Estudiante_Ingenieria> ListaGP=new LinkedList<>();

      int opcion;

        do {

            String menu = "Menú\n"
                    + "1.Registro Prestamo\n"
                    + "2.Exportar Archivo\n"
                    + "Ingrese la opcion Deseada";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                   RE.Registro_Est_Ingenieria(ListaEI);
                   RCP.RegistroComputador(ListaCP);
                   gp.Prestamo(ListaEI, ListaCP, ListaGP);
                    break;

                case 2:                    
                 IE.exportarEstudiantesIngenieria(ListaGP);
                    break;
            }
        } while (opcion != 0);
    }

    }
    


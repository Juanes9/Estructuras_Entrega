import java.util.LinkedList;

import javax.swing.JOptionPane;

public class RegistrarComputadorPortatil {

public LinkedList<Computador_Portatil> RegistroComputador(LinkedList<Computador_Portatil> ListaCP) {

    int opcionSO=0;
    int opcionP=0;
        Computador_Portatil CP = new Computador_Portatil(null, null, 0, 0, null, null);
        JOptionPane.showMessageDialog(null,"Datos del computador");
        CP.setSerial(JOptionPane.showInputDialog("Ingresa el serial del computador"));
        CP.setMarca(JOptionPane.showInputDialog("Ingresa la marca del computador"));
        CP.setTamano(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tamaño del computador")));
        CP.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingresa el valor del computador en dolares")));  
        CP.setSistema_Operativo(SistemaOperativo(opcionSO));
        CP.setProcesador(Procesador(opcionP));

        ListaCP.add(CP);
              
    return ListaCP;
}

    public String SistemaOperativo(int opcion) {

        String Menu = "MENU\n" + "1. Windows 7.\n" + "2. Windows 10.\n" + "3. Windows 11.\n"
                + "Ingrese la opcion deseada\n";

        opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));

        switch (opcion) {
            case 1:
               return "Windows 7";
              
            case 2:
               return  "Windows 10";
               
            case 3:
               return "Windows 11";
                
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalidad. Se le asignara Windows 10 por defecto");
                return "Windows 10";
        }
    }

    public String Procesador(int opcionP){

     

        String Menu = "MENU\n" + "1.AMD Ryzen. \n" + "2.Intel® Core™ i5.\n"+ "Ingrese la opcion deseada\n";

        opcionP = Integer.parseInt(JOptionPane.showInputDialog(Menu));

        switch (opcionP) {
            case 1:
               return "AMD Ryzen";
              
            case 2:
               return  "Intel® Core™ i5";
    
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalidad. Se le asignara AMD Ryzen por defecto");
                return "AMD Ryzen";
        }
    }    
}

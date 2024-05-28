import javax.swing.JOptionPane;
public class MenuPrincipal {
    JOptionPane jp = new JOptionPane();

    public void menuPrincipal(){
        int opcion;

        MenuIngenieria MI = new MenuIngenieria();
        MenuDiseno MD = new MenuDiseno();
        
        do {
            String menu = "Menú\n"
                    + "1.Estudiantes de Ingeniera\n"
                    + "2.Estudiantes de Diseño\n"
                    + "3. salir\n";

            opcion = Integer.parseInt(jp.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    MI.menuIng();
                    break;
                case 2:
                    MD.menuDis();
                    break;
                case 3:
                    jp.showMessageDialog(null, "Hasta luego");
                    break;
                default:
                    jp.showMessageDialog(null, "Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 3);
    }
}

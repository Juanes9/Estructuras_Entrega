import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
public class ImportarEstudiantesIngenieria {

    public LinkedList<Estudiante_Ingenieria> importarEstudiantesIngenieria(String Archivo) {
        LinkedList<Estudiante_Ingenieria> lista = new LinkedList<>();
        try {
            BufferedReader importar = new BufferedReader(new FileReader(Archivo));
            String Linea= "";
            while ((Linea = importar.readLine()) != null) {
                String[] Lineas = Linea.split(":");
                String Atributo = Lineas[0].toLowerCase().trim();
                String valor = Lineas[1];
                switch (Atributo) {
                    case "Estudiante":
                        String Cedula = valor.trim();
                        String Nombre = importar.readLine().split(":")[1].trim();
                        String Apellido = importar.readLine().split(":")[1].trim();             
                        String Telefono = importar.readLine().split(":")[1].trim();
                        int Semestre  = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        float Promedio= Float.parseFloat(importar.readLine().split(":")[1].trim());
                        Estudiante_Ingenieria EI = new Estudiante_Ingenieria(Cedula, Nombre, Apellido, Telefono, Semestre, Promedio);
                        lista.add(EI);
                        // Leer la línea en blanco entre empleados
                        importar.readLine();
                        break;

                    default:
                        break;
                }
            }
            importar.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}

    


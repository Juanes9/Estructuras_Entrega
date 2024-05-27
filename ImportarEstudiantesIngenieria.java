import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarEstudiantesIngenieria {

    public LinkedList<Estudiante_Ingenieria> importarEstudiantesIngenieria(String Archivo,
            LinkedList<Estudiante_Ingenieria> lista) {

        try {
            BufferedReader importar = new BufferedReader(new FileReader(Archivo));
            String Linea = "";
            Estudiante_Ingenieria EI = null;
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
                        int Semestre = Integer.parseInt(importar.readLine().split(":")[1].trim());
                        float Promedio = Float.parseFloat(importar.readLine().split(":")[1].trim());

                        // Leer la línea en blanco entre estudiantes
                        importar.readLine();

                        String Serial = valor.trim();
                        String Marca = importar.readLine().split(":")[1].trim();
                        float tamano = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        float precio = Float.parseFloat(importar.readLine().split(":")[1].trim());
                        String Sistema_Operativo = importar.readLine().split(":")[1].trim();
                        String Procesador = importar.readLine().split(":")[1].trim();

                        EI = new Estudiante_Ingenieria(Cedula, Nombre, Apellido, Telefono, Semestre, Promedio);
                        Computador_Portatil CP = new Computador_Portatil(Serial, Marca, tamano, precio,
                                Sistema_Operativo, Procesador);

                        EI.setComputador_Portatil(CP);

                        lista.add(EI);

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

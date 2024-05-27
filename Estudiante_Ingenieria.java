
import javax.swing.JOptionPane;
public class Estudiante_Ingenieria {
    
    JOptionPane jp= new JOptionPane();
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int Num_Semestre_Cursado;
    private float Promedio_acumulado;
    private Computador_Portatil Computador_Portatil;
   
    

    public Estudiante_Ingenieria(String cedula, String nombre, String apellido, String telefono,
            int num_Semestre_Cursado, float promedio_acumulado) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Num_Semestre_Cursado = num_Semestre_Cursado;
        Promedio_acumulado = promedio_acumulado;
        
    }

    public Estudiante_Ingenieria() {
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {

        if(cedula.matches("^[0-9\\s]*$")){
            Cedula = cedula; 
                  
        }else{
            JOptionPane.showMessageDialog(null,"La cedula no permite letras ni caracteres especiales");
        }
}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public int getNum_Semestre_Cursado() {
        return Num_Semestre_Cursado;
    }

    public void setNum_Semestre_Cursado(int num_Semestre_Cursado) {
        Num_Semestre_Cursado = num_Semestre_Cursado;
    }

    public float getPromedio_acumulado() {
        return Promedio_acumulado;
    }

    public void setPromedio_acumulado(float promedio_acumulado) {
        Promedio_acumulado = promedio_acumulado;
    }

    public Computador_Portatil getComputador_Portatil() {
        return Computador_Portatil;
    }

    public void setComputador_Portatil(Computador_Portatil computador_Portatil) {
        Computador_Portatil = computador_Portatil;
    }

    



}



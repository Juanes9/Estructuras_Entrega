public class Computador_Portatil {
    
    private String Serial;
    private String Marca;
    private float Tamano;
    private float Precio;
    private String Sistema_Operativo;
    private String Procesador;

    public Computador_Portatil() {
    }

    public Computador_Portatil(String serial, String marca, float tamano, float precio, String sistema_Operativo,
            String procesador) {
        Serial = serial;
        Marca = marca;
        Tamano = tamano;
        Precio = precio;
        Sistema_Operativo = sistema_Operativo;
        Procesador = procesador;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getTamano() {
        return Tamano;
    }

    public void setTamano(float tamano) {
        Tamano = tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getSistema_Operativo() {
        return Sistema_Operativo;
    }

    public void setSistema_Operativo(String sistema_Operativo) {
        Sistema_Operativo = sistema_Operativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    
    
}


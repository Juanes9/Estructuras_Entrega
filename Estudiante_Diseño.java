public class Estudiante_Diseño {


        private String Cedula;
        private String Nombre;
        private String Apellido;
        private String Telefono;
        private String Modalidad_Estudio;
        private int Cantidad_Asignaturas;
        private int Serial;
      
        public Estudiante_Diseño(String cedula, String nombre, String apellido, String telefono,
                String modalidad_Estudio, int cantidad_Asignaturas, int serial) {
            Cedula = cedula;
            Nombre = nombre;
            Apellido = apellido;
            Telefono = telefono;
            Modalidad_Estudio = modalidad_Estudio;
            Cantidad_Asignaturas = cantidad_Asignaturas;
            Serial = serial;
        }
        public String getCedula() {
            return Cedula;
        }
        public void setCedula(String cedula) {
            Cedula = cedula;
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
        public String getModalidad_Estudio() {
            return Modalidad_Estudio;
        }
        public void setModalidad_Estudio(String modalidad_Estudio) {
            Modalidad_Estudio = modalidad_Estudio;
        }
        public int getCantidad_Asignaturas() {
            return Cantidad_Asignaturas;
        }
        public void setCantidad_Asignaturas(int cantidad_Asignaturas) {
            Cantidad_Asignaturas = cantidad_Asignaturas;
        }
        public int getSerial() {
            return Serial;
        }
        public void setSerial(int serial) {
            Serial = serial;
        }
    
        
        
        
    }


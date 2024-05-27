
import java.util.LinkedList;


public class GestionPrestamo {
    
    public LinkedList<Estudiante_Ingenieria>Prestamo(LinkedList<Estudiante_Ingenieria>ListaEI,LinkedList<Computador_Portatil>ListaCP,
    LinkedList<Estudiante_Ingenieria>Gestor_Prestamo){

            if(!ListaEI.isEmpty()&&!ListaCP.isEmpty()){

                Estudiante_Ingenieria EI=ListaEI.removeFirst();
                Computador_Portatil CP= ListaCP.removeFirst();

                EI.setComputador_Portatil(CP);
                Gestor_Prestamo.add(EI);
            }
        
            return Gestor_Prestamo;
        }

    }

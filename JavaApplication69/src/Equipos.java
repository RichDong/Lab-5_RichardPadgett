
import java.util.ArrayList;


public class Equipos {
    String nombre;
    int presupuesto;
    int copasgan;
    String estadio;
    ArrayList<Jugadores> jug = new ArrayList();

    public Equipos() {
    }

    public Equipos(String nombre, int presupuesto, int copasgan, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copasgan = copasgan;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopasgan() {
        return copasgan;
    }

    public void setCopasgan(int copasgan) {
        this.copasgan = copasgan;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugadores> getJug() {
        return jug;
    }

    public void setJug(ArrayList<Jugadores> jug) {
        this.jug = jug;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}

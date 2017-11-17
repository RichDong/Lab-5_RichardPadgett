
public class Jugadores {
    String nombre;
    int precio;
    String pos;
    String disponibilidad;
    double habilidad;
    double tecnica;
    double resistencia;

    public Jugadores() {
    }

    public Jugadores(String nombre, int precio, String pos, String disponibilidad, double habilidad, double tecnica, double resistencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.pos = pos;
        this.disponibilidad = disponibilidad;
        this.habilidad = habilidad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(double habilidad) {
        this.habilidad = habilidad;
    }

    public double getTecnica() {
        return tecnica;
    }

    public void setTecnica(double tecnica) {
        this.tecnica = tecnica;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", precio=" + precio + ", pos=" + pos + ", disponibilidad=" + disponibilidad + ", habilidad=" + habilidad + ", tecnica=" + tecnica + ", resistencia=" + resistencia + '}';
    }
       
    
}

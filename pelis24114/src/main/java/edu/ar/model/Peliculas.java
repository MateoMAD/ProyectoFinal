package edu.ar.model;

public class  Peliculas {

    //atributos de clase
    private int id;
    private String nombre;
    private String genero;
    private String descripcion;
    private int calificacion;
    private int anio;
    private byte estrellas;
    private String director;
    public Peliculas(int id, String nombre, String genero, String descripcion, int calificacion, int anio,
            byte estrellas, String director) {
    //constructores
                this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.anio = anio;
        this.estrellas = estrellas;
        this.director = director;
    }
    public Peliculas(String nombre, String genero, String descripcion, int calificacion, int anio, byte estrellas,
            String director) {
        this.nombre = nombre;
        this.genero = genero;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.anio = anio;
        this.estrellas = estrellas;
        this.director = director;
    }

    //metodos  getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getgenero() {
        return genero;
    }
    public void setApellido(String apellido) {
        this.genero = apellido;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public byte getEstrellas() {
        return estrellas;
    }
    public void setEstrellas(byte estrellas) {
        this.estrellas = estrellas;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    //metodos personalizados
    @Override
    public String toString() {
        return "Peliculas [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", descripcion=" + descripcion
                + ", calificacion=" + calificacion + ", anio=" + anio + ", estrellas=" + estrellas + ", director="
                + director + "]";
    }
    
    
    
    
    
}

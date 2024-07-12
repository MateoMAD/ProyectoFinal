package edu.ar.model;


  public class Director extends Persona {

    private int cantpelisdirigidas;

    public Director(int id, String nombre, String apellido, String nacionalidad,int cantpelisdirigidas) {
        super(id, nombre, apellido, nacionalidad);
        this.cantpelisdirigidas = cantpelisdirigidas;
    }

    public Director( String nombre, String apellido, String nacionalidad,int cantpelisdirigidas) {
        super( nombre, apellido, nacionalidad);
        this.cantpelisdirigidas = cantpelisdirigidas;
    }

    public int getCantpelisdirigidas() {
        return cantpelisdirigidas;
    }

    public void setCantpelisdirigidas(int cantpelisdirigidas) {
        this.cantpelisdirigidas = cantpelisdirigidas;
    }

    @Override
    public String toString() {
        return "Director [cantpelisdirigidas=" + cantpelisdirigidas + ", toString()=" + super.toString() + "]";
    }
     

    
  }

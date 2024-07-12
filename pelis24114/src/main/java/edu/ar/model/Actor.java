package edu.ar.model;

public class Actor extends Persona{
    private int cantpeliactuadas;
    public Actor(int id, String nombre,String apellido,String nacionalidad,int cantpeliactuadas){
    
        super(id, nombre, apellido, nacionalidad);
        this.cantpeliactuadas =cantpeliactuadas;
       
    }
    public int getCantpeliactuadas() {
        return cantpeliactuadas;
    }
    public void setCantpeliactuadas(int cantpeliactuadas) {
        this.cantpeliactuadas = cantpeliactuadas;
    }
    @Override
    public String toString(){
        return "toString de pers: "+super.toString()+ "cantidad de pelisactuadads "+ getCantpeliactuadas();
    }

}

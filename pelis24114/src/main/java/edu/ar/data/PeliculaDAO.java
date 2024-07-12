package edu.ar.data;
// importacion de clases o obejtos
import static edu.ar.data.conexion.close;
import static edu.ar.data.conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ar.model.Peliculas;


public class PeliculaDAO {
  private static final String  SQL_SELECT =" SELECT * FROM movie";
  private static final String SQL_INSERT="INSERT INTO movie(nombre,descripcion,genero,calificacion,anio,estrellas,director)  values(?,?,?,?,?,?,?)";
  
  
  public static List<Peliculas> seleccionar(){
    
    Connection conn =null;

    PreparedStatement ps=null;
    ResultSet rs =null;
    Peliculas peliculas = null;
    List<Peliculas> pelicula =new ArrayList<>();
    
    try {
   conn = getConexion();
   ps = conn.prepareStatement(SQL_SELECT);
   rs = ps.executeQuery();
   
   // itero resultados del resultSet 
   while (rs.next()){
   int id =rs.getInt("id");
   String nombre =rs.getString("nombre");
   String descripcion =rs.getString("descripcion");
   String genero=rs.getString("genero");
   int calificacion =rs.getInt("calificacion");
   int anio = rs.getInt("anio");
   byte estrellas =rs.getByte("estrellas");
   String director =rs.getString("director");

   peliculas =new Peliculas(id, nombre, genero, descripcion, calificacion, anio, estrellas, director);
 
   //agregar la peliculas en nuestro listado de pelis 
   pelicula.add(peliculas);

}

} catch (Exception e){
       e.printStackTrace(System.out);
    } finally{
      try{
      close(rs);
      close(ps);
      close(conn);
      } catch(Exception e){
         e.printStackTrace();
      }
    }
    return pelicula;
}
 //insertar
 public static int insertar(Peliculas peli){
   Connection conn =null;
    PreparedStatement ps=null;
   int registros =0;  
   
   try{
    conn= getConexion();
    ps= conn.prepareStatement(SQL_INSERT);
    ps.setString(1,peli.getNombre());
    ps.setString(2,peli.getgenero());
    ps.setString(3,peli.getDescripcion());
    ps.setInt(4,peli.getCalificacion());
    ps.setInt(5, peli.getAnio());
    ps.setByte(6, peli.getEstrellas());
    ps.setString(7, peli.getDirector());

    registros =ps.executeUpdate();
   
   } catch(Exception e) {
     

      e.printStackTrace(System.out);

   } finally{
      // cerrar conecciones o close connections
      try{
         close(ps);
         close(conn);
      } catch(SQLException ex){
         ex.printStackTrace(System.out);
      }

   }
   return registros;
 }


}



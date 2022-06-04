
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ICategoria {

int id;
String nombre;
int estado;

Connection cnn;
Statement state;
ResultSet result;

public ICategoria() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ICategoria.class.getName()) .log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ICategoria.class.getName()) .log(Level.SEVERE, null, ex);
        }
}

    public ICategoria(int id, String nombre, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

 public boolean insertarDatos(){
        try {
            String miQuery = "insert into tb_categoria values('" + id + "', '" + nombre + "', '" + estado + "');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(ICategoria.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
 public ArrayList<ICategoria> consultarRegistros(){
        ArrayList<ICategoria> categoria = new ArrayList();
        
        try{
            String miQuery = "select * from tb_categoria;";
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                
                categoria.add(new ICategoria(result.getInt("id_categoria"), result.getString("nom_categoria"), result.getInt("estado_categoria")));
            }
        }catch (SQLException ex) {
            Logger.getLogger(ICategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categoria;
    }
 
 public boolean EliminarRegistro (){
        try {
            String miQuery = "delete from tb_categoria where id_categoria = ('"+id+"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(ICategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 public boolean ModificarRegistro(){
        try {
            String miQuery = "update tb_categoria set nom_categoria =('"+nombre+"'), estado_categoria = ('"+estado+"') where id_categoria =('"+id+"');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(ICategoria.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }

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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

 

}
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IProducto {

    int id;
    String nombre;
    String desProducto;
    double stock;
    double precio;
    String unidadDeMedida;
    int estadoP;
    int categoria;
    int fecha;

    Connection cnn;
    Statement state;
    ResultSet result;

    public IProducto() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ICategoria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ICategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public IProducto(int id, String nombre, String desProducto, float stock, float precio, String unidadDeMedida, int estadoP, int categoria, int fecha) {
        this.id = id;
        this.nombre = nombre;
        this.desProducto = desProducto;
        this.stock = stock;
        this.precio = precio;
        this.unidadDeMedida = unidadDeMedida;
        this.estadoP = estadoP;
        this.categoria = categoria;
        this.fecha = fecha;
    }

    

    public boolean insertarDatosP() {
        try {
            String miQuery = "insert into tb_producto values('" + id + "', '" + nombre + "', '" + desProducto + "', '" + stock + "', '" + precio + "', '" + unidadDeMedida + "', '" + estadoP + "', '" + categoria + "', '" + fecha + "');";
            int estado = 0;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IProducto.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getDesProducto() {
        return desProducto;
    }

    public void setDesProducto(String desProducto) {
        this.desProducto = desProducto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public int getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(int estadoP) {
        this.estadoP = estadoP;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

}

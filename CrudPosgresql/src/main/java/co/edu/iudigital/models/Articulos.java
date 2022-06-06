package co.edu.iudigital.models;

import co.edu.iudigital.db.DbConfig;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Connection;
import java.sql.Statement;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articulos {
    private int codigo;
    private String nombre;
    private String unidad_med;
    private int existencia;
    private int cant_max;
    private int cant_min;
    private int proveedor;

    public void insertArticulos() {
        DbConfig dbConfig = new DbConfig("localhost", "5432", "Merca_Facil");
        Connection connection = dbConfig.connect();
        String query = String.format("INSERT INTO articulos (codigo, nombre, unidad_med, existencia, cant_max, cant_min, proveedor) VALUES (6, 'Equipo de sonido Lg', 'Unidades', 450, 800, 100, 200)");
        try {
            Statement statement = connection.createStatement();
            statement.execute (query);
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

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
public class Cliente {
    private int cedula;
    private String nombre;
    private String direccion;
    private String telefono;

    public void insertCliente(){
        DbConfig dbConfig = new DbConfig("localhost", "5432", "Merca_Facil");
        Connection connection = dbConfig.connect();
        String query = String.format("INSERT INTO cliente (cedula, nombre, direccion, telefono) VALUES(%d, '%s','%s','%s')", cedula, nombre, direccion, telefono);
        try{
            Statement statement = connection.createStatement();
            statement.execute(query);
            statement.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

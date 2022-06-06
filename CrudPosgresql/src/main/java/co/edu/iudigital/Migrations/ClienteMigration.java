package co.edu.iudigital.Migrations;

import co.edu.iudigital.db.DbConfig;

import java.sql.Connection;
import java.sql.Statement;

public class ClienteMigration {

    private DbConfig dbConfig;
    private Connection connection;

    public ClienteMigration(){
        dbConfig = new DbConfig("localhost", "5432", "Merca_Facil");
        connection = dbConfig.connect();
        createTableCliente();
    }
    public void createTableCliente(){
        String query = "CREATE TABLE cliente (ced INT PRIMARY KEY, nom VARCHAR(80), dir VARCHAR(80), tel VARCHAR(30))";
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

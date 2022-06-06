package co.edu.iudigital;



import co.edu.iudigital.Migrations.ConfigMigrations;
import co.edu.iudigital.models.Articulos;
import co.edu.iudigital.models.Cliente;


public class Main {
    public static void main(String[] args) {

        ConfigMigrations configMigrations = new ConfigMigrations();
        configMigrations.init();
    }
}
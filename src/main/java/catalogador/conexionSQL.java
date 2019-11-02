/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DiegoBergondo
 */
public class conexionSQL {
    
    // Librería de MySQL a usar
    public String driver = "com.mysql.cj.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "catalogador";

    // Host
    public String hostname = "localhost";

    // Puerto del servidor
    public String port = "3306";

    // Dirección compuesta de la BBDD
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false&allowPublicKeyRetrieval=true";

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "root";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection conectarMySQL() {
        this.leerFichero();
        Connection con = null;
        this.setUrl("jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false&allowPublicKeyRetrieval=true");
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No fue posible conectar con la base de datos");
        }
        return con;
    }
    
    public void leerFichero(){
        FileReader fileReader;
        try {
            fileReader = new FileReader("servidorSQL.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            DatosArticulo articulo = new DatosArticulo();
            int contador = 0;
            String line;
            try {
                while((line = bufferedReader.readLine()) != null) {
                    if(contador == 0)
                        this.setHostname(line);
                    else if(contador == 1)
                        this.setPort(line);
                    else if(contador == 2)
                        this.setDatabase(line);
                    else if(contador == 3)
                        this.setUsername(line);
                    else if(contador == 4)
                        this.setPassword(line);
                    contador++;
                }                
                bufferedReader.close();         
            } catch (IOException ex) {
                System.out.println("Error de lectura del fichero");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No existe archivo de datos de MySQL por lo que se mantienen los datos por defecto");
        }
    }
    
}

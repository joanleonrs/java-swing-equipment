package com.cibertec.edu.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author joanleonrs
 */
public class Conexion {

    protected Connection connection;
    protected String driver = "com.mysql.cj.jdbc.Driver";
    protected String hostName = "localhost";
    protected String port = "3306";
    protected String dbName = "gestioncomputo";
    protected String serverTimeZoneConfig = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    protected String url = "jdbc:mysql://" + hostName + ":" + port + "/" + dbName + serverTimeZoneConfig;
    protected String username = "root";
    protected String password = "Admin456";
    
    public Connection getConexion() throws SQLException{
        if (connection == null) {
            try {
                Class.forName(driver);
                try {
                    connection = (Connection) DriverManager.getConnection(url, username, password);
                    System.out.println("Conexión exitosa.");
                } catch (SQLException e) {
                    System.out.println("Conexión errónea." + e);
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error con el ClassDriver" + e);
                System.exit(0);
            }
        }
        return connection;
    }
}

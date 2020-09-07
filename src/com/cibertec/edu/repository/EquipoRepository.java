package com.cibertec.edu.repository;

import com.cibertec.edu.connection.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author joanleonrs
 */
public class EquipoRepository {

    protected Connection queryConnection;
    protected PreparedStatement preparedStatement;
    protected Statement statement;
    protected ResultSet resultSet;
    protected String query;
    
    public EquipoRepository(){
        try {
            Conexion connection = new Conexion();
            queryConnection = connection.getConexion();
        } catch (SQLException e) {
            System.out.println("Ocurrió un error; " + e);
        }
    }
    
    public ResultSet buscarEquipos(int codigo){
    	
    	String filter = "codigo = " + codigo,
        query = "SELECT * FROM equipo WHERE " + filter;
    	
        try {
            statement = queryConnection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Exception ex) {
            System.out.println("Ocurrió un error; " + ex);
        }
        return resultSet;
    }
    
    public ResultSet getEquipos(){
        query = "SELECT * FROM equipo";
        try {
            statement = queryConnection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Ocurrió un error; " + e);
        }
        return resultSet;
    }
    
    public ResultSet getUltimoCodigo(){
        query = "SELECT max(codigo) FROM equipo";
        try {
            statement = queryConnection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Ocurrió un error; " + e);
        }
        return resultSet;
    }

    public void addEquipo(int codigo, String modelo, String marca, String categoria, boolean disponible){
        query = "INSERT INTO equipo VALUES(?,?,?,?,?)";
        try {
            preparedStatement = queryConnection.prepareStatement(query);
            preparedStatement.setInt(1, codigo);
            preparedStatement.setString(2, modelo);
            preparedStatement.setString(3, marca);
            preparedStatement.setString(4, categoria);
            preparedStatement.setBoolean(5, disponible);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error; " + e);
        }
    }

    public void updateEquipo(int codigo, String modelo, String marca, String categoria, boolean disponible){
        query = "UPDATE equipo SET modelo=?, marca=?, categoria=?, disponible=? WHERE codigo=?";
        try {
            preparedStatement = queryConnection.prepareStatement(query);
            preparedStatement.setString(1, modelo);
            preparedStatement.setString(2, marca);
            preparedStatement.setString(3, categoria);
            preparedStatement.setBoolean(4, disponible);
            preparedStatement.setInt(5, codigo);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error; " + e);
        }
    }

    public void deleteEquipo(String codigo){
        query = "DELETE FROM equipo WHERE codigo=?";
        try {
            preparedStatement = queryConnection.prepareStatement(query);
            preparedStatement.setString(1, codigo);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println("Ocurrió un error; " + e);
        }
    }

}

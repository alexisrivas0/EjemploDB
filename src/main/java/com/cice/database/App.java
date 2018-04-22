package com.cice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/BBDD1","root","root");
            Statement statement = connection.createStatement();

            //PARA CREAR UNA BASE DE DATOS
            //String sqlNuevaBBDD = "CREATE DATABASE BBDD1";

            //Para Insertar tabla
            //String sqlNuevaTabla = "CREATE TABLE Prueba (user_id SERIAL NOT NULL PRIMARY KEY, user varchar (225) NOT NULL UNIQUE, password varchar(225)) ";

            statement.executeUpdate("sqlStatement");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

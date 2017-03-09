package com.jdbc;

import java.sql.*;

public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Driver driver;
        driver = new FabricMySQLDriver();

        try{
            DriverManager.registerDriver(driver);
        }
        catch (SQLException ex){
            System.out.println("Ya xoch kilo");
            return;

        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement(){

            }
        }

        catch (SQLException ex){
            System.out.println("ne udalos");
            return;

        }
        finally {
            if(connection !=null)
                connection.close();
    }


}}

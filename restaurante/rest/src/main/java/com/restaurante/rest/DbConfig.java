package com.restaurante.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

  private static final String URL =
    "jdbc:postgresql://localhost:5432/RestauranteDB";
  private static final String USER = //adicionar seu usuario do banco de dados ;
  private static final String PASSWORD = //adicionar a senha do seu banco dedados;

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}

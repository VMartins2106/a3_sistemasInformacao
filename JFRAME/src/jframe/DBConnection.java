package jframe;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String usuario = "root";
    private static String senha = "usjt";
    private static String bd = "e_commercejava_db";

    public static Connection getConnection (){

        try{
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta + "/" + bd,
            usuario,
            senha
            );
    
        return c;
}

        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
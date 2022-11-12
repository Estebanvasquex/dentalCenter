package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/h2-dentalclinic";
    private final static String DB_USER ="root";
    private final static String DB_PASSWORD = "";

    private static final String CREATE_TABLE_PATIENT = "DROP TABLE IF EXISTS PATIENT;" +
            "CREATE TABLE PATIENT (" +
            "ID INT PRIMARY KEY," +
            "FIRSTNAME VARCHAR(100) NOT NULL," +
            "LASTNAME VARCHAR(100) NOT NULL," +
            "EMAIL VARCHAR(100) NOT NULL," +
            "PASSWORD VARCHAR(100) NOT NULL," +
            "DNI INT NOT NULL," +
            "DOMICILE VARCHAR(100) NOT NULL," +
            "CURRENTDATE VARCHAR(100) NOT NULL" +
            ")";

    private static final String CREATE_TABLE_DENTIST = "DROP TABLE IF EXISTS DENTIST;" +
            "CREATE TABLE DENTIST (" +
            "ID INT PRIMARY KEY," +
            "FIRSTNAME VARCHAR(100) NOT NULL," +
            "LASTNAME VARCHAR(100) NOT NULL," +
            "EMAIL VARCHAR(100) NOT NULL," +
            "PASSWORD VARCHAR(100) NOT NULL," +
            "REGISTRATION INT NOT NULL" +
            ")";


    private static final String CREATE_TABLE_TURN = "DROP TABLE IF EXISTS TURN;" +
            "CREATE TABLE TURN (" +
            "ID INT PRIMARY KEY," +
            "ID_PATIENT INT NOT NULL," +
            "ID_DENTIST INT NOT NULL," +
            "ADMISSION_DATE VARCHAR(100) NOT NULL" +
            ")";



//DECLARACIÓN METODO CONEXIÓN A BD
    public static Connection getConnection() throws Exception {
        Class.forName(DB_JDBC_DRIVER).getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/h2-dentalclinic4");
    }

    public static void createTable(){
        Connection conn = null;

        try{
            conn = getConnection();

            Statement statementPatient = conn.createStatement();
            statementPatient.execute(CREATE_TABLE_PATIENT);

            Statement statementDentist = conn.createStatement();
            statementDentist.execute(CREATE_TABLE_DENTIST);

            Statement statementTurn = conn.createStatement();
            statementTurn.execute(CREATE_TABLE_TURN);


        }catch (Exception e){
            System.out.println(e);

        }finally {
            try{
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}


package dao;

import model.Patient;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;

//TODO:dudas con la interfase genericos
public class PatientDaoH2 implements IDao<Patient>{

    private static final Logger LOGGER= Logger.getLogger(PatientDaoH2.class);
    private static final String SQL_INSERT_PATIENT = "INSERT INTO PATIENT(ID,FIRSTNAME,LASTNAME,EMAIL,PASSWORD,DNI,DOMICILE,CURRENTDATE)" + "VALUES (?,?,?,?,?,?,?,?)";


    @Override
    public Patient save(Patient patient) {
        LOGGER.info("A patient incorpore");
        Connection conn = null;

        try{
            conn = Database.getConnection();
            PreparedStatement psInsertPatient = conn.prepareStatement(SQL_INSERT_PATIENT);
            psInsertPatient.setLong(1,patient.getId());
            psInsertPatient.setString(2,patient.getFirstName());
            psInsertPatient.setString(3,patient.getLastName());
            psInsertPatient.setString(4,patient.getEmail());
            psInsertPatient.setString(5,patient.getPassword());
            psInsertPatient.setString(6,patient.getDNI());
            psInsertPatient.setString(7,patient.getDomicile());
            psInsertPatient.setString(8,patient.getCurrent_Date());
            psInsertPatient.execute();



        }catch (Exception e){
            e.printStackTrace();

        }finally {
            try {
                conn.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return patient;


    }




}

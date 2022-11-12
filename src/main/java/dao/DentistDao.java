package dao;

import model.Dentist;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DentistDao implements IDao<Dentist>{
    private static final Logger LOGGER= Logger.getLogger(DentistDao.class);

    private static final String SQL_INSERT = "INSERT INTO DENTIST(ID,FIRSTNAME,LASTNAME,EMAIL,PASSWORD,REGISTRATION)" + "VALUES (?,?,?,?,?,?)";


    @Override
    public Dentist save(Dentist dentist) {
        LOGGER.info("A Dentist incorpore");

        Connection connectionDb = null;

        try {
            connectionDb = Database.getConnection();
            //todo: pendiente pon analizar bien set autoCommit

            connectionDb.setAutoCommit(false);

            PreparedStatement psInsertDentist = connectionDb.prepareStatement(SQL_INSERT);
            psInsertDentist.setInt(1,dentist.getId());
            psInsertDentist.setString(2,dentist.getFirstName());
            psInsertDentist.setString(3,dentist.getLastName());
            psInsertDentist.setString(4,dentist.getEmail());
            psInsertDentist.setString(5,dentist.getPassword());
            psInsertDentist.setString(6,dentist.getRegistration());

            psInsertDentist.execute();

            connectionDb.commit();
            connectionDb.setAutoCommit(true);



        }catch (Exception e){
            e.printStackTrace();

        }finally {
            try {
                connectionDb.close();
            }catch (Exception ex){
                ex.printStackTrace();

            }


        }
        //todo:para que se retorna el dentist
        return dentist;
    }
}

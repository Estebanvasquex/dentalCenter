package service;

import dao.IDao;
import dao.PatientDaoH2;
import model.Patient;

public class PatientService {
    private IDao<Patient> patientIDao;

    public PatientService() {
        //todo:cual es el fin de hacer esta instancia
        this.patientIDao = new PatientDaoH2();
    }

    public Patient save(Patient patient){
        return patientIDao.save(patient);
    }


}

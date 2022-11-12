package service;

import dao.DentistDao;
import dao.IDao;
import model.Dentist;

public class DentistService {
    private IDao<Dentist> DentistIDao;

    public DentistService() {
        //todo:cual es el fin de hacer esta instancia
        this.DentistIDao = new DentistDao();
    }

    public Dentist save(Dentist dentist)
    {
        return DentistIDao.save(dentist);
    }


}

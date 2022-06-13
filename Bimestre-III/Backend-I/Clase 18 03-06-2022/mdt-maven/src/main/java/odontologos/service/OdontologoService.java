package odontologos.service;

import odontologos.dao.impl.IDao;
import odontologos.model.Odontologo;

import java.sql.SQLException;
import java.util.List;

public class OdontologoService {

    // implementa IDao
    private IDao<Odontologo> odontologoIDao;

    // Constructor
    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardar(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public List<Odontologo> buscarTodos() throws SQLException {
        return odontologoIDao.buscarTodos();
    }

    public void eliminar(Integer id){
        odontologoIDao.eliminar(id);
    }

}

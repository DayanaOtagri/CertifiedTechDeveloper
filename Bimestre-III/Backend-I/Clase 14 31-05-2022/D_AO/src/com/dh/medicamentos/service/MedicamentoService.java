package com.dh.medicamentos.service;
import com.dh.medicamentos.dao.impl.IDao;
import com.dh.medicamentos.model.Medicamento;

import com.dh.medicamentos.model.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    public Medicamento guardar(Medicamento medicamento){
        return medicamentoDao.guardar(medicamento);

    }

    public  Medicamento buscar(Integer id){
        return medicamentoDao.buscar(id);
    }

    public void eliminar(Integer id){
        medicamentoDao.eliminar(id);
    }
}

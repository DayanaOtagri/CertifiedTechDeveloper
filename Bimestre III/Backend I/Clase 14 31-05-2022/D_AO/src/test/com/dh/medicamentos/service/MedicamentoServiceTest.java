package test.com.dh.medicamentos.service;

import com.dh.medicamentos.dao.impl.MedicamentoDaoH2;
import com.dh.medicamentos.model.Medicamento;
import com.dh.medicamentos.service.MedicamentoService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MedicamentoServiceTest {

    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoH2());

    @Test
    public  void guardarMedicamento(){
        Medicamento medicamento = new Medicamento("Ibuprofeno", "lab123", 1000, 200.0);
        medicamentoService.guardar(medicamento);
        Assert.assertTrue(medicamentoService.buscar(5) != null);

    }
    @Test
    public void traerPorId(){
        Medicamento medicamento = medicamentoService.buscar(5);
        Assert.assertTrue(medicamento != null);
    }

    @Test
    public void eliminarPorId(){
        medicamentoService.eliminar(10);
        Medicamento medicamento = medicamentoService.buscar(10);
        Assert.assertTrue(medicamento == null);
    }

}

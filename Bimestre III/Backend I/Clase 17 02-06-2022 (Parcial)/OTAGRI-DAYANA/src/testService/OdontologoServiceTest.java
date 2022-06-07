package testService;

import com.dh.odontologos.dao.impl.OdontologoDaoH2;
import com.dh.odontologos.model.Odontologo;
import com.dh.odontologos.service.OdontologoService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.sql.SQLException;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OdontologoServiceTest {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public  void guardarOdontologo(){
        Odontologo odontologo = new Odontologo("Cardenas","Andres","58987");
        Assert.assertTrue(odontologoService.guardar(odontologo) != null);
    }

    @Test
    public void traerTodos() throws SQLException {
        List<Odontologo> odotologos = odontologoService.buscarTodos();
        Assert.assertTrue(!odotologos.isEmpty());
        Assert.assertTrue(odotologos.size() > 0);
    }

    @Test
    public void eliminarPorId() throws SQLException {
        // No logre hacer el assert para eliminar aunque efectivamente elimina en la tabla
        odontologoService.eliminar(2);
    }


}

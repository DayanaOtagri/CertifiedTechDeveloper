package com.example.demo1.services.impl;

import com.example.demo1.dominio.Odontologo;
import com.example.demo1.services.OdontologoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {

    @Override
    public List<Odontologo> listaOdontologos() {
        return Arrays.asList(new Odontologo("Fred", 25), new Odontologo("Frida", 23), new Odontologo("Lauren", 45));
    }
}

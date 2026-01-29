package com.example.controle_de_Gastos_Pessoais.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.controle_de_Gastos_Pessoais.Model.gastosModel;
import com.example.controle_de_Gastos_Pessoais.Repository.gastosRepository;

@Service
public class gastosService {
    private final gastosRepository gastosrepository;

    public gastosService(gastosRepository gastosrepository) {
        this.gastosrepository = gastosrepository;
    }

    public List<gastosModel> listarTudo() {
        return gastosrepository.findAll();
    }

    public Optional<gastosModel> listarPorId(Long id) {
        return gastosrepository.findById(id);
    }

    public gastosModel salvarGasto(gastosModel gasto) {
        return gastosrepository.save(gasto);
    }

    public void deletarGasto(Long id) {
        gastosrepository.deleteById(id);
    }



}

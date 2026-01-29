package com.example.controle_de_Gastos_Pessoais.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.controle_de_Gastos_Pessoais.Model.gastosModel;

@Repository
public interface gastosRepository extends JpaRepository<gastosModel, Long> {

    
}

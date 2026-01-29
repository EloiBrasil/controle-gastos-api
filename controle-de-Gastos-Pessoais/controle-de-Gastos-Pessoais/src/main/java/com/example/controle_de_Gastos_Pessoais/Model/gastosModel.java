package com.example.controle_de_Gastos_Pessoais.Model;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gastos")
public class gastosModel {

    // Construtor padrão exigido pelo JPA/Hibernate
    public gastosModel() {
    }

    @Id //chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    Long id;


    String descricao;
    Double valor;
    String categoria;
    LocalDateTime data;

    public gastosModel(String descricao, Double valor, String categoria, LocalDateTime data) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
        this.data = (data != null) ? data : LocalDateTime.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public LocalDateTime getData() {
        return data;
    }
}
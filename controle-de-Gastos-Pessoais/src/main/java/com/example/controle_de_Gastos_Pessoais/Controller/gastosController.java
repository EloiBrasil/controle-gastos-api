package com.example.controle_de_Gastos_Pessoais.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controle_de_Gastos_Pessoais.Model.gastosModel;
import com.example.controle_de_Gastos_Pessoais.Services.gastosService;

@RestController
@RequestMapping("/gastos")
public class gastosController {
    
    private final gastosService gastosservice;

    public gastosController(gastosService gastosservice) {
        this.gastosservice = gastosservice;
    }

   @GetMapping()
   public List<gastosModel> listarGastos() {
        return gastosservice.listarTudo();
   }
   
   @GetMapping("/{id}")
   public ResponseEntity<gastosModel> listarGastosPorId(@PathVariable Long id) {
        return gastosservice.listarPorId(id)
                .map(gasto -> ResponseEntity.ok().body(gasto))
                .orElse(ResponseEntity.notFound().build());
   }
   

   @PostMapping()
   public gastosModel criarGasto(@RequestBody gastosModel gasto) {
        return gastosservice.salvarGasto(gasto);
   }

   @DeleteMapping("/{id}")
    public void deletarGasto(@PathVariable Long id) {
          gastosservice.deletarGasto(id);
    }


    

}

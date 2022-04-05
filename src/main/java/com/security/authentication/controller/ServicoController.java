package com.security.authentication.controller;

import com.security.authentication.domain.Servico;
import com.security.authentication.domain.User;
import com.security.authentication.domain.UserLogin;
import com.security.authentication.services.ServicoService;
import com.security.authentication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("servico")
@CrossOrigin("*")
public class ServicoController {

    @Autowired
    ServicoService servicoService;

    @PostMapping("create")
    public String createServico(@RequestBody Servico servico){
        return servicoService.createServico(servico);
    }

    @PostMapping("delete")
    public String deleteServico(@RequestBody Long id){
        return servicoService.deleteServico(id);
    }

    @GetMapping("servicos")
    public List<Servico> getServicos(){
        return servicoService.getServicos();
    }

    @GetMapping("servico")
    public Optional<Servico> getServico(Long id){
        return servicoService.getServicoById(id);
    }



}

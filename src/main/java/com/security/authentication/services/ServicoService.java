package com.security.authentication.services;

import com.security.authentication.domain.Servico;
import com.security.authentication.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public String createServico(Servico servico) {
        servicoRepository.save(servico);
        return "Serviço criado com sucesso!";
    }

    public String deleteServico(Long id){
        servicoRepository.deleteById(id);
        return "Serviço deletado com sucesso!";
    }

    public List<Servico> getServicos(){
        return servicoRepository.findAll();
    }

    public Optional<Servico> getServicoById(Long id){
        Optional<Servico> servico = servicoRepository.findById(id);

        if (!servico.isEmpty()){
            return servico;
        }
        return null;
    }
}

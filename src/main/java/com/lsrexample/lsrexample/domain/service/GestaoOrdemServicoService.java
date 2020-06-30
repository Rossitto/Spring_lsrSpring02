package com.lsrexample.lsrexample.domain.service;

import java.time.LocalDateTime;

import com.lsrexample.lsrexample.domain.model.OrdemServico;
import com.lsrexample.lsrexample.domain.model.StatusOrdemServico;
import com.lsrexample.lsrexample.domain.repository.OrdemServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestaoOrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    public OrdemServico criar(OrdemServico ordemServico) {
        ordemServico.setStatus(StatusOrdemServico.ABERTA);
        ordemServico.setDataAbertura(LocalDateTime.now());

        return ordemServicoRepository.save(ordemServico);
    }

}
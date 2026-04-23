package com.example.apicomdocker.controller;

import com.example.apicomdocker.entity.dto.criarTransacaoDto;
import com.example.apicomdocker.service.transacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class transacaoController {
    @Autowired
    private transacaoService transacaoService;

    @PostMapping
    private ResponseEntity<UUID> criarTransacaoController(@RequestBody criarTransacaoDto criarTransacaoDto){
        var user = transacaoService.criarTransacao(criarTransacaoDto);
        return ResponseEntity.created(URI.create("/api/v1/" + user)).build();
    }

    @GetMapping
    private ResponseEntity exibirTodasTransacoesController(){
        return ResponseEntity.ok(transacaoService.exibirTodasTransacoes());
    }
}

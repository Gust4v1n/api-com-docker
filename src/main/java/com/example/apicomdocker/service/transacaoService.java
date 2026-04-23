package com.example.apicomdocker.service;

import com.example.apicomdocker.entity.dto.criarTransacaoDto;
import com.example.apicomdocker.entity.dto.editarTransacaoDto;
import com.example.apicomdocker.entity.transacaoEntity;
import com.example.apicomdocker.repository.transacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class transacaoService {
    @Autowired
    private  transacaoRepository transacaoRepository;
    public UUID criarTransacao(criarTransacaoDto criarTransacaoDto){
        var newUser = new transacaoEntity(
                null,
                criarTransacaoDto.valor(),
                criarTransacaoDto.dataHora());
        transacaoRepository.save(newUser);
        return newUser.getTransacaoId();
    }

    public List<transacaoEntity> exibirTodasTransacoes(){
        return transacaoRepository.findAll();
    }

    public void apagarTransacaoById(String transacaoId){
        transacaoRepository.deleteById(UUID.fromString(transacaoId));
    }

    public void editarTransacaoById(String transacaoId, editarTransacaoDto editarTransacaoDto){
        var transacao = transacaoRepository.findById(UUID.fromString(transacaoId));
        if(transacao.isPresent()){
            var transacao2 = transacao.get();
            if(editarTransacaoDto.valor()!=null){
                transacao2.setValor(editarTransacaoDto.valor());
            }
            if(editarTransacaoDto.dataHora()!=null){
                transacao2.setDataHora(editarTransacaoDto.dataHora());
            }
            transacaoRepository.save(transacao2);
        }
    }
}

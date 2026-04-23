package com.example.apicomdocker.entity.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record criarTransacaoDto(UUID transacaoId,
                                Double valor,
                                OffsetDateTime dataHora) {
}

package com.example.apicomdocker.entity.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record editarTransacaoDto(UUID transacaoId,
                                 Double valor,
                                 OffsetDateTime dataHora) {
}

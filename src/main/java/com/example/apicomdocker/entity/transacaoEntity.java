package com.example.apicomdocker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_transacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class transacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID transacaoId;
    private Double valor;
    private OffsetDateTime dataHora;
}

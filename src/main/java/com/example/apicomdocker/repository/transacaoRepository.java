package com.example.apicomdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.apicomdocker.entity.transacaoEntity;

import java.util.UUID;

@Repository
public interface transacaoRepository extends JpaRepository<transacaoEntity, UUID> {
}

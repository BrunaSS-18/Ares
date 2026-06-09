package com.ares.repository;

import com.ares.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository  extends JpaRepository<Aluno,Long> {

    boolean existsByCpf(String cpf);
}

package com.ares.exception;


public class AlunoNotFoundException extends RuntimeException {
    public AlunoNotFoundException(Long id) {
        super("Aluno não encontrado com o id: " + id);
    }
}

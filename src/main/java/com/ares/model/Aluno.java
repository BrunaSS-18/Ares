package com.ares.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório")
    @Column(unique = true)
    private String cpf;

    @NotNull(message = "A data de nascimento é obrigatório")
    private LocalDate dtNascimento;

    @NotNull(message = "A matricula ativa é obrigatória")
    private Boolean matriculaAtiva;

    @NotNull(message = "O plano é obrigatório")
    @Enumerated(EnumType.STRING)
    private Plano plano;
}

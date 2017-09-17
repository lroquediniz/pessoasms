package br.com.gearcode.tutorials.pesssoasms.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Pessoa {

    @Id
    private String id;

    private String nome;

    private Date dataNascimento;


}

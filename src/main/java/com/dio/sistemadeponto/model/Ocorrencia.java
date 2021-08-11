package com.dio.sistemadeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados
@Entity
public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;

}

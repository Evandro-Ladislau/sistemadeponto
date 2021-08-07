package com.dio.sistemadeponto.model;

import lombok.*;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados
public class JornadaTrabalho {
    //trabalhar com long facilita o uso do jpa
    private Long id;
    private String descricao;



}

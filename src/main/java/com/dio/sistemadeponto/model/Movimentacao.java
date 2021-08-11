package com.dio.sistemadeponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados
@Entity
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable // essa anotação server para importar o persistence e referenciar a chave estrangeira
    public static class MovimentacaoId implements Serializable { //Faz um parse de bits em bites para chegar do outro lado
        //Classe coloquei static por orientacao da ide / para criar uma chave estrangeira da entidade usuario
    private long idMovimento;
    private long idUsuario;
    }


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private Ocorrencia ocorrencia;

    @ManyToOne
    private Calendario calendario;
}

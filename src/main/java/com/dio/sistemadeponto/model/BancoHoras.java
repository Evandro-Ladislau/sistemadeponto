package com.dio.sistemadeponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados

public class BancoHoras {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class BancoHorasId implements Serializable { //Faz um parse de bits em bites para chegar do outro lado
        //Classe coloquei static por orientacao da ide / para criar uma chave estrangeira da entidade usuario
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal qtdHorasTrabalhada;
    private BigDecimal saldoHoras;

}

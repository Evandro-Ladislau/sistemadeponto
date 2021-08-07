package com.dio.sistemadeponto.model;

import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados
public class Localidade {
    private long id;
    @ManyToOne // MUITAS LOCALIDADES PODE TER UM NIVEL DE ACESSO- EXP: NO SERT DESENVOLVIMENTO PODER TER GERENTE, DESENVOLVEDOR, ADS
    private NivelAcesso nivelAcesso;
    private String descricao;
}

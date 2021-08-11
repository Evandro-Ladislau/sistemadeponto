package com.dio.sistemadeponto.model;

import lombok.*;


import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados
@Entity
public class Calendario {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}

package com.dio.sistemadeponto.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados
@Entity
public class Usuario {
    @Id
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @OneToOne
    private JornadaTrabalho jornadaTrabalho;
    //java não trabalha muito bem com float então foi criado o BigDecimal para ajudar nesse problema
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

}

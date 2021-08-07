package com.dio.sistemadeponto.model;

import lombok.*;

@Getter //substitui os metodos getters
@Setter //substituiu os metodos setters
@AllArgsConstructor //substituiu o construtor
@NoArgsConstructor //subistituiu o construtor sem argumento
@EqualsAndHashCode // subistituiu o equals e hashcode que esta comenta, primeira vez que vejo
@Builder //teste de softer e passagem de dados
public class Empresa {
    private Long id;
    private String descricao;

    //cnpj poderia ser usao mascar.
    private String cnpj;

    //nesta caso endereço poderia ser uma entidade separada.
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

}

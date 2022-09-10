package com.senac.senac.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPessoa is a Querydsl query type for Pessoa
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QPessoa extends EntityPathBase<Pessoa> {

    private static final long serialVersionUID = 216467161L;

    public static final QPessoa pessoa = new QPessoa("pessoa");

    public final StringPath dataCadastro = createString("dataCadastro");

    public final StringPath endereco = createString("endereco");

    public final StringPath nome = createString("nome");

    public QPessoa(String variable) {
        super(Pessoa.class, forVariable(variable));
    }

    public QPessoa(Path<? extends Pessoa> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoa(PathMetadata metadata) {
        super(Pessoa.class, metadata);
    }

}


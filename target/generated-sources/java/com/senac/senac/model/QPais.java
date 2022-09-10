package com.senac.senac.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPais is a Querydsl query type for Pais
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPais extends EntityPathBase<Pais> {

    private static final long serialVersionUID = 1922006669L;

    public static final QPais pais = new QPais("pais");

    public final ListPath<Governante, QGovernante> governantes = this.<Governante, QGovernante>createList("governantes", Governante.class, QGovernante.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final NumberPath<Double> populacao = createNumber("populacao", Double.class);

    public final StringPath sigla = createString("sigla");

    public QPais(String variable) {
        super(Pais.class, forVariable(variable));
    }

    public QPais(Path<? extends Pais> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPais(PathMetadata metadata) {
        super(Pais.class, metadata);
    }

}


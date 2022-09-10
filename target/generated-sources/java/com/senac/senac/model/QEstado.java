package com.senac.senac.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEstado is a Querydsl query type for Estado
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEstado extends EntityPathBase<Estado> {

    private static final long serialVersionUID = -85512040L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEstado estado = new QEstado("estado");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final QPais pais;

    public final NumberPath<Double> populacao = createNumber("populacao", Double.class);

    public QEstado(String variable) {
        this(Estado.class, forVariable(variable), INITS);
    }

    public QEstado(Path<? extends Estado> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEstado(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEstado(PathMetadata metadata, PathInits inits) {
        this(Estado.class, metadata, inits);
    }

    public QEstado(Class<? extends Estado> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pais = inits.isInitialized("pais") ? new QPais(forProperty("pais")) : null;
    }

}


package com.senac.senac.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCidade is a Querydsl query type for Cidade
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCidade extends EntityPathBase<Cidade> {

    private static final long serialVersionUID = -152482218L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCidade cidade = new QCidade("cidade");

    public final QEstado estado;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath latitude = createString("latitude");

    public final StringPath longitude = createString("longitude");

    public final StringPath nome = createString("nome");

    public final NumberPath<Double> populacao = createNumber("populacao", Double.class);

    public QCidade(String variable) {
        this(Cidade.class, forVariable(variable), INITS);
    }

    public QCidade(Path<? extends Cidade> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCidade(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCidade(PathMetadata metadata, PathInits inits) {
        this(Cidade.class, metadata, inits);
    }

    public QCidade(Class<? extends Cidade> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.estado = inits.isInitialized("estado") ? new QEstado(forProperty("estado"), inits.get("estado")) : null;
    }

}


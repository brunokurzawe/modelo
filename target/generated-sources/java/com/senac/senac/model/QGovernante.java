package com.senac.senac.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGovernante is a Querydsl query type for Governante
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QGovernante extends EntityPathBase<Governante> {

    private static final long serialVersionUID = 789386787L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGovernante governante = new QGovernante("governante");

    public final StringPath cargo = createString("cargo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final QPais pais;

    public QGovernante(String variable) {
        this(Governante.class, forVariable(variable), INITS);
    }

    public QGovernante(Path<? extends Governante> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGovernante(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGovernante(PathMetadata metadata, PathInits inits) {
        this(Governante.class, metadata, inits);
    }

    public QGovernante(Class<? extends Governante> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pais = inits.isInitialized("pais") ? new QPais(forProperty("pais")) : null;
    }

}


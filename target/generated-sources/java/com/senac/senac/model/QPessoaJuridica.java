package com.senac.senac.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPessoaJuridica is a Querydsl query type for PessoaJuridica
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPessoaJuridica extends EntityPathBase<PessoaJuridica> {

    private static final long serialVersionUID = 2068992350L;

    public static final QPessoaJuridica pessoaJuridica = new QPessoaJuridica("pessoaJuridica");

    public final QPessoa _super = new QPessoa(this);

    public final StringPath cnpj = createString("cnpj");

    //inherited
    public final StringPath dataCadastro = _super.dataCadastro;

    //inherited
    public final StringPath endereco = _super.endereco;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath incrEstadual = createString("incrEstadual");

    public final StringPath incrMunicipal = createString("incrMunicipal");

    //inherited
    public final StringPath nome = _super.nome;

    public QPessoaJuridica(String variable) {
        super(PessoaJuridica.class, forVariable(variable));
    }

    public QPessoaJuridica(Path<? extends PessoaJuridica> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoaJuridica(PathMetadata metadata) {
        super(PessoaJuridica.class, metadata);
    }

}


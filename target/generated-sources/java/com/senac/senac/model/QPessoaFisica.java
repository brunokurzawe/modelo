package com.senac.senac.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;


/**
 * QPessoaFisica is a Querydsl query type for PessoaFisica
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPessoaFisica extends EntityPathBase<PessoaFisica> {

    private static final long serialVersionUID = 1034124464L;

    public static final QPessoaFisica pessoaFisica = new QPessoaFisica("pessoaFisica");

    public final QPessoa _super = new QPessoa(this);

    public final StringPath cpf = createString("cpf");

    //inherited
    public final StringPath dataCadastro = _super.dataCadastro;

    //inherited
    public final StringPath endereco = _super.endereco;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath nome = _super.nome;

    public final StringPath nomeMae = createString("nomeMae");

    public final StringPath nomePai = createString("nomePai");

    public final StringPath rg = createString("rg");

    public QPessoaFisica(String variable) {
        super(PessoaFisica.class, forVariable(variable));
    }

    public QPessoaFisica(Path<? extends PessoaFisica> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoaFisica(PathMetadata metadata) {
        super(PessoaFisica.class, metadata);
    }

}


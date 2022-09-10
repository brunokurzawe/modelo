package com.senac.senac.resource.dto;

import com.senac.senac.model.PessoaFisica;
import com.senac.senac.model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaDto extends PessoaDto {

    private Long id;
    private String incrEstadual;
    private String incrMunicipal;
    private String cnpj;

    public PessoaJuridicaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIncrEstadual() {
        return incrEstadual;
    }

    public void setIncrEstadual(String incrEstadual) {
        this.incrEstadual = incrEstadual;
    }

    public String getIncrMunicipal() {
        return incrMunicipal;
    }

    public void setIncrMunicipal(String incrMunicipal) {
        this.incrMunicipal = incrMunicipal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public static PessoaJuridicaDto toDTO(PessoaJuridica pessoa) {
        PessoaJuridicaDto dto = new PessoaJuridicaDto();
        dto.setNome(pessoa.getNome());
        dto.setDataCadastro(pessoa.getDataCadastro());
        dto.setCnpj(pessoa.getCnpj());
        dto.setIncrEstadual(pessoa.getIncrEstadual());
        dto.setIncrMunicipal(pessoa.getIncrMunicipal());
        dto.setEndereco(pessoa.getEndereco());

        return dto;
    }

    public static PessoaJuridica fromDTO(PessoaJuridicaDto dto) {
        PessoaJuridica entity = new PessoaJuridica();
        entity.setNome(dto.getNome());
        entity.setDataCadastro(dto.getDataCadastro());
        entity.setCnpj(dto.getCnpj());
        entity.setIncrEstadual(dto.getIncrEstadual());
        entity.setIncrMunicipal(dto.getIncrMunicipal());
        entity.setEndereco(dto.getEndereco());

        return entity;
    }

    public static List<PessoaJuridicaDto> toDTO(List<PessoaJuridica> pessoas) {
        List<PessoaJuridicaDto> pessoasDtos = new ArrayList<>();
        for (PessoaJuridica p : pessoas) {
            pessoasDtos.add(toDTO(p));
        }
        return pessoasDtos;
    }

    public static List<PessoaJuridica> fromDTO(List<PessoaJuridicaDto> pessoasDtos) {
        List<PessoaJuridica> pessoas = new ArrayList<>();
        for (PessoaJuridicaDto p : pessoasDtos) {
            pessoas.add(fromDTO(p));
        }
        return pessoas;
    }
}

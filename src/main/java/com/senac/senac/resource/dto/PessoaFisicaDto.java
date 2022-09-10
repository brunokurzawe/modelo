package com.senac.senac.resource.dto;

import com.senac.senac.model.Estado;
import com.senac.senac.model.PessoaFisica;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaDto extends PessoaDto {

    private Long id;
    private String rg;
    private String cpf;
    private String nomePai;
    private String nomeMae;

    public PessoaFisicaDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public static PessoaFisicaDto toDTO(PessoaFisica pessoa) {
        PessoaFisicaDto dto = new PessoaFisicaDto();
        dto.setNome(pessoa.getNome());
        dto.setDataCadastro(pessoa.getDataCadastro());
        dto.setCpf(pessoa.getCpf());
        dto.setRg(pessoa.getRg());
        dto.setNomePai(pessoa.getNomePai());
        dto.setNomeMae(pessoa.getNomeMae());

        return dto;
    }

    public static PessoaFisica fromDTO(PessoaFisicaDto dto) {
        PessoaFisica entity = new PessoaFisica();
        entity.setNome(dto.getNome());
        entity.setDataCadastro(dto.getDataCadastro());
        entity.setCpf(dto.getCpf());
        entity.setRg(dto.getRg());
        entity.setNomePai(dto.getNomePai());
        entity.setNomeMae(dto.getNomeMae());

        return entity;
    }

    public static List<PessoaFisicaDto> toDTO(List<PessoaFisica> pessoas) {
        List<PessoaFisicaDto> pessoasDtos = new ArrayList<>();
        for (PessoaFisica p : pessoas) {
            pessoasDtos.add(toDTO(p));
        }
        return pessoasDtos;
    }

    public static List<PessoaFisica> fromDTO(List<PessoaFisicaDto> pessoasDtos) {
        List<PessoaFisica> pessoas = new ArrayList<>();
        for (PessoaFisicaDto p : pessoasDtos) {
            pessoas.add(fromDTO(p));
        }
        return pessoas;
    }
}

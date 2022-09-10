package com.senac.senac.resource.dto;

import com.senac.senac.model.Pais;

import java.util.ArrayList;
import java.util.List;

public class PaisDto {

    private Long id;
    private String nome;
    private String sigla;
    private Double populacao;
    private List<GovernanteDto> governantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    public List<GovernanteDto> getGovernantes() {
        return governantes;
    }

    public void setGovernantes(List<GovernanteDto> governantes) {
        this.governantes = governantes;
    }

    public static PaisDto toDTO(Pais pais) {
        PaisDto dto = new PaisDto();
        dto.setId(pais.getId());
        dto.setNome(pais.getNome());
        dto.setPopulacao(pais.getPopulacao());
        dto.setSigla(pais.getSigla());
        dto.setGovernantes(GovernanteDto.toDTO(pais.getGovernantes()));
        return dto;
    }

    public static Pais fromDTO(PaisDto dto) {
        Pais entity = new Pais();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());
        entity.setSigla(dto.getSigla());
        entity.setGovernantes(GovernanteDto.fromDTO(dto.getGovernantes()));
        return entity;
    }

    public static List<PaisDto> toDTO(List<Pais> pais) {
        List<PaisDto> paises = new ArrayList<>();
        for (Pais p : pais) {
            paises.add(toDTO(p));
        }
        return paises;
    }

    public static List<Pais> fromDTO(List<PaisDto> pais) {
        List<Pais> paises = new ArrayList<>();
        for (PaisDto p : pais) {
            paises.add(fromDTO(p));
        }
        return paises;
    }
}
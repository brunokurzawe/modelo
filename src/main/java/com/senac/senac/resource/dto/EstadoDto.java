package com.senac.senac.resource.dto;

import com.senac.senac.model.Cidade;
import com.senac.senac.model.Estado;

import java.util.ArrayList;
import java.util.List;

public class EstadoDto {

    private Long id;
    private String nome;
    private Double populacao;
    private PaisDto pais;

    public EstadoDto() {
    }

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

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    public PaisDto getPais() {
        return pais;
    }

    public void setPais(PaisDto pais) {
        this.pais = pais;
    }

    public static EstadoDto toDTO(Estado pais) {
        EstadoDto dto = new EstadoDto();
        dto.setNome(pais.getNome());
        dto.setPopulacao(pais.getPopulacao());

        return dto;
    }

    public static Estado fromDTO(EstadoDto dto) {
        Estado entity = new Estado();
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());

        return entity;
    }

    public static List<EstadoDto> toDTO(List<Estado> estados) {
        List<EstadoDto> estadosDtos = new ArrayList<>();
        for (Estado p : estados) {
            estadosDtos.add(toDTO(p));
        }
        return estadosDtos;
    }

    public static List<Estado> fromDTO(List<EstadoDto> estadosDtos) {
        List<Estado> estados = new ArrayList<>();
        for (EstadoDto p : estadosDtos) {
            estados.add(fromDTO(p));
        }
        return estados;
    }
}

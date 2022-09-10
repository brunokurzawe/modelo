package com.senac.senac.resource.dto;

import com.senac.senac.model.Cidade;
import com.senac.senac.model.Pais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CidadeDto {

    private Long id;
    private String nome;
    private String latitude;
    private String longitude;
    private Double populacao;
    private EstadoDto estado;

    public CidadeDto() {
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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    public EstadoDto getEstado() {
        return estado;
    }

    public void setEstado(EstadoDto estado) {
        this.estado = estado;
    }

    public static CidadeDto toDTO(Cidade pais) {
        CidadeDto dto = new CidadeDto();
        dto.setNome(pais.getNome());
        dto.setPopulacao(pais.getPopulacao());

        return dto;
    }

    public static Cidade fromDTO(CidadeDto dto) {
        Cidade entity = new Cidade();
        entity.setNome(dto.getNome());
        entity.setPopulacao(dto.getPopulacao());

        return entity;
    }

    public static List<CidadeDto> toDTO(List<Cidade> cidades) {
        List<CidadeDto> cidadesDtos = new ArrayList<>();
        for (Cidade p : cidades) {
            cidadesDtos.add(toDTO(p));
        }
        return cidadesDtos;
    }

    public static List<Cidade> fromDTO(List<CidadeDto> cidadesDtos) {
        List<Cidade> cidades = new ArrayList<>();
        for (CidadeDto p : cidadesDtos) {
            cidades.add(fromDTO(p));
        }
        return cidades;
    }
}

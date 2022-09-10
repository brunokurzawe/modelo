package com.senac.senac.resource.dto;

import com.senac.senac.model.Governante;

import java.util.ArrayList;
import java.util.List;

public class GovernanteDto {
    private String nome;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static GovernanteDto toDTO(Governante pais) {
        GovernanteDto dto = new GovernanteDto();
        dto.setNome(pais.getNome());
        dto.setCargo(pais.getCargo());
        return dto;
    }

    public static Governante fromDTO(GovernanteDto dto) {
        Governante entity = new Governante();
        entity.setNome(dto.getNome());
        entity.setCargo(dto.getCargo());
        return entity;
    }

    public static List<GovernanteDto> toDTO(List<Governante> pais) {
        List<GovernanteDto> governantes = new ArrayList<>();
        for (Governante p : pais) {
            governantes.add(toDTO(p));
        }
        return governantes;
    }

    public static List<Governante> fromDTO(List<GovernanteDto> governantesDtos) {
        List<Governante> governantes = new ArrayList<>();
        for (GovernanteDto p : governantesDtos) {
            governantes.add(fromDTO(p));
        }
        return governantes;
    }
}

package com.senac.senac.resource;

import com.senac.senac.model.Estado;
import com.senac.senac.repository.EstadoRepository;
import com.senac.senac.resource.dto.EstadoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/estados")
public class EstadoController extends AbstractController {

    @Autowired
    private EstadoRepository repository;

    @PostMapping
    public Estado create(@Valid @RequestBody Estado entity) {
        return repository.save(entity);
    }

    @GetMapping
    public List<EstadoDto> listAll() {
        return EstadoDto.toDTO(repository.findAll());
    }

    @GetMapping("/{id}")
    public EstadoDto getById(@PathVariable(value = "id") Long id) {

        Estado entity = repository.findById(id)
                .orElse(new Estado());

        return EstadoDto.toDTO(entity);
    }

    @PutMapping("/{id}")
    public Estado update(@PathVariable(value = "id") Long id,
                         @RequestBody Estado entity) {
        Estado entityFind = repository.findById(id).orElse(null);
        if (entityFind != null) {
            entityFind.setId(entity.getId());
            entityFind.setNome(entity.getNome());
            entityFind.setPopulacao(entity.getPopulacao());
            entityFind.setPais(entity.getPais());
            return repository.save(entityFind);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long id) {
        Estado entity = repository.findById(id)
                .orElse(null);

        if (entity != null) {
            repository.delete(entity);
        }

        return ResponseEntity.noContent().build();
    }

}

package com.senac.senac.resource;

import com.querydsl.core.types.Predicate;
import com.senac.senac.model.Pais;
import com.senac.senac.repository.PaisRepository;
import com.senac.senac.resource.dto.PaisDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/paises")
public class PaisController extends AbstractController {

    @Autowired
    private PaisRepository repository;

    @PostMapping
    public Pais create(@Valid @RequestBody Pais pais) {

        List<Pais> byNome = repository.findByNome(pais.getNome());

        if (!byNome.isEmpty()) {
            throw new ValidationException("Já existe um Pais cadastrado com esse nome");
        }

        return repository.save(pais);
    }

    @GetMapping
    public List<PaisDto> listAll(@QuerydslPredicate(root = Pais.class) Predicate predicate) {
        List<Pais> paisesEntity = new ArrayList<>();
        Iterable<Pais> paises = repository.findAll(predicate);
        paises.forEach(paisesEntity::add);
        return PaisDto.toDTO(paisesEntity);
    }

    @GetMapping("/{id}")
    public PaisDto getPaisesId(@PathVariable(value = "id") Long id) {

        Pais paisFind = repository.findById(id)
                .orElse(new Pais());

        return PaisDto.toDTO(paisFind);
    }

    @PutMapping("/{id}")
    public Pais update(@PathVariable(value = "id") Long paisId,
                       @RequestBody Pais pais) {
        Pais paisFind = repository.findById(paisId).orElse(null);
        if (paisFind != null) {
            paisFind.setId(pais.getId());
            paisFind.setNome(pais.getNome());
            paisFind.setPopulacao(pais.getPopulacao());

            return repository.save(paisFind);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable(value = "id") Long paisId) {
        Pais paisFind = repository.findById(paisId)
                .orElse(null);

        if (paisFind != null) {
            repository.delete(paisFind);
        }

        return ResponseEntity.noContent().build();
    }

}

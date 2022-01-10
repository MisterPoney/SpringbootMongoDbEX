package marcos.andreo.exercicio.exercicioDBSpringBoot.controller;


import marcos.andreo.exercicio.exercicioDBSpringBoot.model.Pessoa;
import marcos.andreo.exercicio.exercicioDBSpringBoot.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")

public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;
    @GetMapping
    public List<Pessoa>listar(){
        return pessoaRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa adicionar(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}

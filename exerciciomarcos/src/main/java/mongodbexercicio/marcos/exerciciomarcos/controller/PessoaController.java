package mongodbexercicio.marcos.exerciciomarcos.controller;

import mongodbexercicio.marcos.exerciciomarcos.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    @Autowired
    private PessoaController pessoaService;

    @GetMapping
    public List<Pessoa> obterTodos(){
        return this.pessoaService.obterTodos();
    }
    @GetMapping("/{codigo}")
    public Pessoa obterPorCodigo(@PathVariable String codigo){
        return this.pessoaService.obterPorCodigo(codigo);
    }
    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa){
        return this.pessoaService.criar(pessoa);
    }


}

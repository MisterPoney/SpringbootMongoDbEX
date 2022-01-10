package mongodbexercicio.marcos.exerciciomarcos.service;
import mongodbexercicio.marcos.exerciciomarcos.model.Pessoa;

import java.util.List;

public interface PessoaService {
    public  List<Pessoa>obterTodos();
    public Pessoa obterPorCodigo(String codigo);
    public Pessoa criar(Pessoa pessoa);
}

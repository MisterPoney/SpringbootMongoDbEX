package marcos.andreo.exercicio.exercicioDBSpringBoot.repository;

import marcos.andreo.exercicio.exercicioDBSpringBoot.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, Long> {

}

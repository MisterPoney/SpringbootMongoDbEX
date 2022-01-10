package marcos.andreo.exercicio.exercicioDBSpringBoot.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
@Data
@Document
public class Pessoa {
    @Id
    private Long id;

    private String nome;
}

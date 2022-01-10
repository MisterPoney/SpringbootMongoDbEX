package mongodbexercicio.marcos.exerciciomarcos.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Pessoa {
    @Id
    private String codigo;
    private String nome;

}

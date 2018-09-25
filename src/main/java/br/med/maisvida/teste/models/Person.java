package br.med.maisvida.teste.models;

import br.med.maisvida.teste.abstractions.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@Entity
public class Person extends AbstractEntity {

    @NotNull(message = "O preenchimento do nome é obrigatório")
    private String name;

    private LocalDate birthDate;

    private State state;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Document> documents = new ArrayList<>();

    public Person() {
    }

    public Person(String name, LocalDate birthDate, State state, List<Document> documents) {
        this.name = name;
        this.birthDate = birthDate;
        this.state = state;
        this.documents = documents;
    }
}

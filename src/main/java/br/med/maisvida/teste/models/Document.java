package br.med.maisvida.teste.models;

import br.med.maisvida.teste.abstractions.AbstractEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@Entity
public class Document extends AbstractEntity {

    @NotNull(message = "O tipo do documento é obrigatório")
    private String type;

    @NotNull(message = "O número do documento é obrigatório")
    private String number;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id")
    @JsonManagedReference
    private Person person;

}

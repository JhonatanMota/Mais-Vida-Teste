package br.med.maisvida.teste.models;

import br.med.maisvida.teste.abstractions.AbstractEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;

@Builder
@Getter
@Entity
public class State extends AbstractEntity {

    private String name;
    private String acronym;
}

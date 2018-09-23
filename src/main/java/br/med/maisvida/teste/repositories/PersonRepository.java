package br.med.maisvida.teste.repositories;

import br.med.maisvida.teste.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}


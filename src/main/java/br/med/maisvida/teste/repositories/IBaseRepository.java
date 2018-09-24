package br.med.maisvida.teste.repositories;

import br.med.maisvida.teste.abstractions.AbstractEntity;
import br.med.maisvida.teste.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IBaseRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {
}


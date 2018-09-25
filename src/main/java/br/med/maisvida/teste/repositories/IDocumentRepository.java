package br.med.maisvida.teste.repositories;

import br.med.maisvida.teste.models.Document;
import br.med.maisvida.teste.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDocumentRepository extends JpaRepository<Document, Long> {

    public List<Document> findByPerson(Person person);
}


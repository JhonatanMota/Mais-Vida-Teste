package br.med.maisvida.teste.services;

import br.med.maisvida.teste.models.Document;
import br.med.maisvida.teste.models.Person;
import br.med.maisvida.teste.repositories.IDocumentRepository;
import br.med.maisvida.teste.repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {

	@Autowired
	private IDocumentRepository iDocumentRepository;

	public List<Document> findByPerson(Person person){
		return iDocumentRepository.findByPerson(person);
	}

}

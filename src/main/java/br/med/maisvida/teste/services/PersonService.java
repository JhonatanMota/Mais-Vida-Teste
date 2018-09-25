package br.med.maisvida.teste.services;

import br.med.maisvida.teste.models.Person;
import br.med.maisvida.teste.repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

//	@Autowired
//	private IBaseRepository<Person> personIBaseRepository;

	@Autowired
	private IPersonRepository iPersonRepository;

	public Person find(Integer id) {
		Optional<Person> person = iPersonRepository.findById(id.longValue());
		return person.orElseThrow(() -> new RuntimeException(
				"Objeto não encontrado. Id: " + id + ", Tipo: " + Person.class.getName()));
	}

	public List<Person> findAll() {
		return iPersonRepository.findAll();
	}

	public Person save(Person person) {
		return (Person) iPersonRepository.save(person);
	}

	public void remove(Long id) {
		iPersonRepository.deleteById(id);
	}

}

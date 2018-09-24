package br.med.maisvida.teste.services;

import br.med.maisvida.teste.models.Person;
import br.med.maisvida.teste.repositories.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

//	@Autowired
//	private IBaseRepository<Person> personIBaseRepository;

	@Autowired
	private IBaseRepository iBaseRepository;

	public Person find(Integer id) {
		Optional<Person> person = iBaseRepository.findById(id.longValue());
		return person.orElseThrow(() -> new RuntimeException(
				"Objeto não encontrado. Id: " + id + ", Tipo: " + Person.class.getName()));
	}

	public List<Person> findAll() {
		return iBaseRepository.findAll();
	}

	public Person save(Person person) {
		return (Person) iBaseRepository.save(person);
	}

	public void remove(Long id) {
		iBaseRepository.deleteById(id);
	}

}

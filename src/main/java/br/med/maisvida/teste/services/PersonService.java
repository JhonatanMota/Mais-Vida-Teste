package br.med.maisvida.teste.services;

import br.med.maisvida.teste.models.Person;
import br.med.maisvida.teste.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personPersonRepository;

    public Person find(Integer id) {
        Optional<Person> person = personPersonRepository.findById(id.longValue());
        return person.orElseThrow(() -> new RuntimeException(
                "Objeto não encontrado. Id: " + id + ", Tipo: " + Person.class.getName()));
    }

    public List<Person> findAll(){
        return personPersonRepository.findAll();
    }

    public Person save(Person person){
        return personPersonRepository.save(person);
    }

    public void remove(Long id){
        personPersonRepository.deleteById(id);
    }

}

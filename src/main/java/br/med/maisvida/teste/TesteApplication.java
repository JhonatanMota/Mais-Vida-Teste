package br.med.maisvida.teste;

import br.med.maisvida.teste.models.Document;
import br.med.maisvida.teste.models.Person;
import br.med.maisvida.teste.repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TesteApplication implements CommandLineRunner {

	@Autowired
	private IPersonRepository IPersonRepository;

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Document> documentList = new ArrayList<>();
		Person person = Person.builder()
				.name("Jhonatan")
				.birthDate(LocalDate.of(1994, Month.JANUARY, 18))
				.build();

		documentList.add(Document.builder()
				.type("CPF")
				.number("056.198-682-13")
				.person(person)
				.build());
		documentList.add(Document.builder()
				.type("RG")
				.number("4548.484")
				.person(person)
				.build());
		person.setDocuments(documentList);
		IPersonRepository.save(person);

	}
}

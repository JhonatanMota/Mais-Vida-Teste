package br.med.maisvida.teste.resources;

import br.med.maisvida.teste.models.Person;
import br.med.maisvida.teste.services.DocumentService;
import br.med.maisvida.teste.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Person person = personService.find(id);
        return ResponseEntity.ok().body(person);
    }

    //    @CrossOrigin(origins = {"http://localhost:63342", "null", "http://13.59.26.95:8080", "http://app-pos-uft.s3-website.us-east-2.amazonaws.com"})
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity savePerson(@RequestBody Person person) {
        return ResponseEntity.ok(personService.save(person));
    }

    //    @CrossOrigin(origins = {"http://localhost:63342", "null", "http://13.59.26.95:8080", "http://app-pos-uft.s3-website.us-east-2.amazonaws.com"})
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseEntity deletePerson(@RequestBody Integer id) {
        try {
            personService.remove(id.longValue());
            return ResponseEntity.ok("Sucesso!");
        } catch (Exception ex) {
            return ResponseEntity.ok(ex.getMessage());
        }
    }


    @CrossOrigin(origins = {"http://localhost:4200", "null", "http://13.59.26.95:8080", "http://app-pos-uft.s3-website.us-east-2.amazonaws.com"})
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity getAll() {
        return ResponseEntity.ok(personService.findAll());
    }

    @RequestMapping(value = "/documents", method = RequestMethod.POST)
    public ResponseEntity getDocumentsByPerson(@RequestBody Person person){
        return ResponseEntity.ok(documentService.findByPerson(person));
    }
}


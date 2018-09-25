import {Component, OnInit} from '@angular/core';
import {Person} from "../shared/models/person";
import {PersonService} from "../person.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css'],
  providers: [PersonService]
})
export class PersonComponent implements OnInit {

  people: Person[];

  constructor(private personService: PersonService, private router: Router) {
  }

  details(person: Person) {
    console.log(person);
    this.router.navigate(
      ['/details', {queryParams: { pessoa: person.id }}]);
  }

  update(person: Person) {
  }

  delete(person: Person) {
  }

  ngOnInit() {
    this.personService.list().subscribe((data: any) => {
      this.people = data;
      console.log(this.people);
    }, (erro: string) => console.log(erro));
  }

}

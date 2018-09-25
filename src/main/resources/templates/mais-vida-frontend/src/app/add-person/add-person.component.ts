import {Component, OnInit} from '@angular/core';
import {Person} from "../shared/models/person";

@Component({
  selector: 'app-add-person',
  templateUrl: './add-person.component.html',
  styleUrls: ['./add-person.component.css']
})
export class AddPersonComponent implements OnInit {

  constructor(public person: Person) {
  }

  ngOnInit() {
    this.person = new Person()
  }

  onClickBtnSave(){
    console.log("I was clicked! --Save--");
  }

}

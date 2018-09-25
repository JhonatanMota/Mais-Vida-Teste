import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {Person} from "../shared/models/person";

@Component({
  selector: 'app-detail-person',
  templateUrl: './detail-person.component.html',
  styleUrls: ['./detail-person.component.css']
})
export class DetailPersonComponent implements OnInit {

  public person: number;
  public sub: any;

  constructor(private route: ActivatedRoute,
              private router: Router) {
  }

  ngOnInit() {
    this.sub = this.route
      .queryParams
      .subscribe(params => {
        // Defaults to 0 if no query param provided.
        this.person = +params['pessoa'] || 0;
        console.log(this.person);
      });
  }

}

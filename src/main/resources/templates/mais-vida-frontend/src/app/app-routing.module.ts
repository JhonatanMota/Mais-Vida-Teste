import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {PersonComponent} from "./person/person.component";
import {DetailPersonComponent} from "./detail-person/detail-person.component";
import {AddPersonComponent} from "./add-person/add-person.component";


const routes: Routes = [
  {path: '', component: PersonComponent},
  {path: 'details', component: DetailPersonComponent},
  {path: 'cadastrar', component: AddPersonComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}

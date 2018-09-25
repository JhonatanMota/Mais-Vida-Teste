import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {LayoutComponent} from './ui/layout/layout.component';
import {HeaderComponent} from './ui/header/header.component';
import {FooterComponent} from './ui/footer/footer.component';
import {AppRoutingModule} from './/app-routing.module';
import {PersonComponent} from './person/person.component';
import {AddPersonComponent} from './add-person/add-person.component';
import {TableModule} from "primeng/table";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { DetailPersonComponent } from './detail-person/detail-person.component';

@NgModule({
  declarations: [
    AppComponent,
    LayoutComponent,
    HeaderComponent,
    FooterComponent,
    PersonComponent,
    AddPersonComponent,
    DetailPersonComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    TableModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}

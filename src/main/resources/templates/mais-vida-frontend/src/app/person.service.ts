import {Injectable} from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http'

import {Person} from './shared/models/person';
import {Observable} from "rxjs/internal/Observable";
import {catchError} from "rxjs/operators";
import {of} from "rxjs/internal/observable/of";

@Injectable()
export class PersonService {

  private readonly baseUrl: string = "http://localhost:8080/person";

  constructor(protected httpClient: HttpClient) {
  }

  public create(person: Person): Observable<Person> {
    return this.httpClient.post<Person>(`${this.baseUrl}/save`, person);
  }

  public get(id: string): Observable<Person> {
    return this.httpClient.get<Person>(`${this.baseUrl}/${id}`);
  }

  public list(): Observable<Array<Person>> {
    return this.httpClient.get<Array<Person>>(`${this.baseUrl}/`)
      .pipe(
        catchError(this.handleError('Erro ao listar as pessoas', []))
      );
  }

  public update(person: Person): Observable<Person> {
    return this.httpClient.put<Person>(`${this.baseUrl}/${person.id}`, person);
  }


  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      console.error(error);
      // this.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

}

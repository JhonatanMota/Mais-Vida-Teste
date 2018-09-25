import {State} from "./state";
import {Document} from "./document";

export class Person {

  public id: number;
  public name: string;
  public birthDate: Date;
  public state: State;
  public documents: Document[];

  constructor() {
  }

}

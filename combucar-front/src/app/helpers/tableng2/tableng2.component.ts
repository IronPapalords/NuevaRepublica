import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-tableng2',
  templateUrl: './tableng2.component.html',
  styles: [
  ]
})
export class Tableng2Component implements OnInit {

  @Input() source:Array<any> = [];

  settings = {
    actions: false,
    columns: {
      nombre: {
        title: 'Nombre'
      },
      rfc: {
        title: 'RFC'
      },
      identificacion: {
        title: 'Identificación'
      },
      telefono: {
        title: 'Teléfono'
      },
      correo: {
        title: 'Correo'
      },
    }
  };

  constructor() { }

  ngOnInit(): void {
  }

  

}

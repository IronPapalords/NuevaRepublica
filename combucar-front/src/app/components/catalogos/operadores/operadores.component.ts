import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-operadores',
  templateUrl: './operadores.component.html',
  styles: []
})

export class OperadoresComponent implements OnInit {

  // operadoresForm: FormGroup = this.fb.group({
  //   nombre:[ '', Validators.required],
  //   puesto:[ '', Validators.required ]
  // })

  constructor(  ) { }
//private fb: FormBuilder 
  ngOnInit(): void {
  }

  guardar() { 
  }

}

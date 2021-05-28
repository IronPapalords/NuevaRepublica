import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-unidad',
  templateUrl: './unidad.component.html',
  styles: [
  ]
})
export class UnidadComponent implements OnInit {

  @Input() preconversionForm!: FormGroup;
  showAddUnidad: boolean = false;
  
  constructor() { }

  ngOnInit(): void {
  }

  toggleAddUnidad(event:any) {
    console.log('Que pedo con showAddUnidad');
    this.showAddUnidad = !this.showAddUnidad;
  }  

}

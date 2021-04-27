import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-operadores',
  templateUrl: './operadores.component.html',
  styles: ['./operadores.component.css']
})

export class OperadoresComponent implements OnInit {

  operadoresForm: FormGroup = this.fb.group({
    nombre:         ['', Validators.required, Validators.maxLength(150)],
    puesto:         ['']
  });

  operadores : Operador[] = [
    {
      nombre: 'Oscar Hernandez',
      puesto: 'Operador 1',
    },
    {
      nombre: 'Alejandra Medellín',
      puesto: 'Operador 2',
    }
  ];

  opciones : Opcion[] = [
    {
      id: '1',
      desc: 'Operador 1'
    },
    {
      id: '2',
      desc: 'Operador 2'
    },
    {
      id: '3',
      desc: 'Operador 3'
    }
  ];

  constructor( private fb: FormBuilder  ) { }

  ngOnInit(): void {
  }

  campoEsValido( campo: string) {
    return this.operadoresForm.controls[campo].errors && 
           this.operadoresForm.controls[campo].touched
  }

  getPuesto( id: string ) {
    for (let i = 0; i < this.opciones.length; i++) {
      if(this.opciones[i].id == id){
        return this.opciones[i].desc;
      }
    }
    return '';
  }

  guardar() { 
    // if(this.operadoresForm.invalid){
    //   return Object.values(this.operadoresForm.controls).forEach(control => {
    //     control.markAsTouched();
    //   });
    // }

    let puestoDesc = this.getPuesto(this.operadoresForm.get('puesto')?.value);

    

    let operador: Operador = {
      nombre: this.operadoresForm.get('nombre')?.value,
      puesto: puestoDesc
    }

    this.operadores.push(operador);
    Swal.fire({
      position: 'center',
      icon: 'success',
      title: 'Operador Guardado Exitosamente',
      showConfirmButton: false,
      timer: 1500
    });
    
    this.operadoresForm.reset();
  
  }

}

interface Operador{
  nombre: string,
  puesto: string
};

interface Opcion{
  id: string,
  desc: string
};
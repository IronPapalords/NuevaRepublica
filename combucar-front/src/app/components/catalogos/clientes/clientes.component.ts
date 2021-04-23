import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  clientesForm: FormGroup = this.fb.group({
    nombre:         ['', Validators.required, Validators.maxLength(150)],
    rfc:            ['', Validators.required, Validators.maxLength(45)],
    identificacion: ['', Validators.required, Validators.maxLength(45)],
    telefono:       ['', Validators.required, Validators.maxLength(45)],
    correo:         ['', Validators.required, Validators.maxLength(45)]
  });

  clientes : Cliente[] = [
    {
      nombre: 'Alberto Navarrete Garcia',
      rfc: 'RFC000101ABC',
      identificacion: '123456789',
      telefono: '55 5555 5555',
      correo: 'alberto@combucar.com',
    },
    {
      nombre: 'Jonathan De La Torre Díaz',
      rfc: 'RFC000202ABC',
      identificacion: '234567890',
      telefono: '55 3333 3333',
      correo: 'jonathan@combucar.com',
    }
  ];

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  campoEsValido( campo: string) {
    return this.clientesForm.controls[campo].errors && 
           this.clientesForm.controls[campo].touched
  }

  guardar(){
    // if(this.clientesForm.invalid){
    //   return Object.values(this.clientesForm.controls).forEach(control => {
    //     control.markAsTouched();
    //   });
    // }

    let cliente: Cliente = {
      nombre: this.clientesForm.get('nombre')?.value,
      rfc: this.clientesForm.get('rfc')?.value,
      identificacion: this.clientesForm.get('identificacion')?.value,
      telefono: this.clientesForm.get('telefono')?.value,
      correo: this.clientesForm.get('correo')?.value
    }

    this.clientes.push(cliente);
    window.alert('Cliente Guardado Exitosamente');
    this.clientesForm.reset();
  }

}

interface Cliente{
  nombre: string,
  rfc: string,
  identificacion: string,
  telefono: string,
  correo: string
};
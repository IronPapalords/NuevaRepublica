import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-preconversion',
  templateUrl: './preconversion.component.html',
  styles: [
  ]
})
export class PreconversionComponent implements OnInit {

  preconversionForm: FormGroup = this.fb.group({

    fechaActual:    ['',Validators.required],
    taller:         ['',Validators.required],
    horaentrada:    ['',Validators.required],
    horatermino:    ['',Validators.required],
    nombreCliente:  ['',Validators.required],
    telefonoCliente:['',Validators.required],
    vendedor:       ['',Validators.required],
    marca:          ['',Validators.required],
    ruta:           ['',Validators.required],
    tipo:           ['',Validators.required],
    anio:           ['',Validators.required],
    eco:            ['',Validators.required],
    placa:          ['',Validators.required],
    carbspi:        ['',Validators.required],
    mpfi:           ['',Validators.required],    
    
    flexRadio1:     ['',],    
    flexRadio2:     ['',],    
    flexRadio3:     ['',],    
    flexRadio4:     ['',],    
    flexRadio5:     ['',],    
    flexRadio6:     ['',],    
    flexRadio7:     ['',],    
    flexRadio8:     ['',],    
    flexRadio9:     ['',],    
    flexRadio10:    ['',],    
    flexRadio11:    ['',],    
    flexRadio12:    ['',],    
    
  })

  constructor( private fb: FormBuilder ) { }

  ngOnInit(): void {
  }

  campoEsValido( campo: string) {
    return this.preconversionForm.controls[campo].errors && 
           this.preconversionForm.controls[campo].touched
  }

  guardarPreconversion(){
    console.log('se ha guardado la preconversion')
  }

}

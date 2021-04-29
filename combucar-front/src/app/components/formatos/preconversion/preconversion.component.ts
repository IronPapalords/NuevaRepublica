import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-preconversion',
  templateUrl: './preconversion.component.html',
  styles: [
  ]
})
export class PreconversionComponent implements OnInit {

  title: string = 'FORMATO DE PRECONVERSION';

  preconversionForm: FormGroup = this.fb.group({

    fechaActual:     ['',Validators.required],
    taller:          ['',Validators.required],
    horaentrada:     ['',Validators.required],
    horatermino:     ['',Validators.required],
    nombreCliente:   ['',Validators.required],
    telefonoCliente: ['',Validators.required],
    vendedor:        ['',Validators.required],
    marca:           ['',Validators.required],
    ruta:            ['',Validators.required],
    tipo:            ['',Validators.required],
    anio:            ['',Validators.required],
    eco:             ['',Validators.required],
    placa:           ['',Validators.required],
    carbspi:         ['',Validators.required],
    mpfi:            ['',Validators.required],    
     

    // Inspección visual preliminar
    flexRadio1:      ['',],    
    flexRadio2:      ['',],    
    flexRadio3:      ['',],    
    flexRadio4:      ['',],    
    flexRadio5:      ['',],    
    flexRadio6:      ['',],    
    flexRadio7:      ['',],    
    flexRadio8:      ['',],    
    flexRadio9:      ['',],    
    flexRadio10:     ['',],    
    flexRadio11:     ['',],    
    flexRadio12:     ['',],    

    // Estado del chasis y la suspensión


    // Analisis de gases
    monoxidocarbono: [''],
    dioxidocarbono:  [''], 
    hidrocarburos:   [''], 
    oxigeno:         [''], 
    oxidosnitrogeno: [''], 
    lambda:          [''], 
    
    // Sistema refrigeración
    fugaagua:        [''], 
    mangueramedidor: [''],
    ventiladores:    ['',],
    indicadortemp:   ['',],
    enfocador:       ['',],
    tanqueagualiquido:['',],
    nivelliquidoref: ['',],
    taparadiador:    ['',],

    // Estado sistema eléctrico
    voltajenominal:          [''],
    voltajenominalcheck:     [''],
    tensionesfuerzo:         [''],
    tensionesfuerzocheck:    [''],
    tiemporecuperacion:      [''],
    tiemporecuperacioncheck: [''],     
    densidad:                [''],     
    densidadcheck:           [''],       
    nivelliquido:            [''],     
    nivelliquidocheck:       [''],     
    estadocarcasacheck:      [''],     
    anclajecheck:            [''],     
    termcablebateriacheck:   [''],     
    bomecheck:               [''],
    cablebateriacheck:       [''],
    intensidadarranque:      [''],
    estadoarranque:          [''],
    tensioncarga:            [''],
    tensioncargacheck:       [''],
    tensioncargacrucero:     [''],
    tensioncargacrucerocheck:[''],
    

    // Diagnóstico sistema de encendido/Inyeccion
    bujias:                  [''],
    bujiascheck:             [''],
    cablesbujias:            [''],
    cablesbujiascheck:       [''],
    rotor:                   [''],
    rotorcheck:              [''],
    contactostapa:           [''],
    contactostapacheck:      [''],
    rinyectores:             [''],
    rinyectorescheck:        [''],
    ajustecorto:             [''],
    ajustecortocheck:        [''],
    ajustelargo:             [''],
    ajustelargocheck:        [''],

    alimentacionbobina:      [''],
    alimentacionbobinacheck: [''],
    alimentaciontransistor:  [''],
    alimentaciontransistorcheck: [''],
    masamodulardist:         [''],
    masamodulardistcheck:    [''],

    

  })

  constructor( private fb: FormBuilder ) { }

  ngOnInit(): void {
  }

  campoEsValido( campo: string) {
    return this.preconversionForm.controls[campo].errors && 
           this.preconversionForm.controls[campo].touched
  }

  guardarPreconversion(){
    if( this.preconversionForm.invalid ){
      this.preconversionForm.markAllAsTouched();
      return;
    }

    console.log(this.preconversionForm.value);

    this.preconversionForm.reset();
  }

}

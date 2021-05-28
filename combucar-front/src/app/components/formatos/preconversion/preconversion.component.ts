import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { TabDirective, TabsetComponent } from 'ngx-bootstrap/tabs';

@Component({
  selector: 'app-preconversion',
  templateUrl: './preconversion.component.html',
  styles: [
  ]
})
export class PreconversionComponent implements OnInit {

  @ViewChild('staticTabs', { static: false }) staticTabs!: TabsetComponent;

  title: string = 'PRE-CONVERSIÓN';
  value: string = '';
  toggleCliente: boolean = false;
  toggleAddCliente: boolean = false;
  toggleUnidad: boolean = false;
  
  preconversionForm: FormGroup = this.fb.group({

    fechaActual:     ['',Validators.required],
    taller:          ['',Validators.required],
    horaentrada:     ['',Validators.required],
    horatermino:     ['',Validators.required],
    buscarNombreCliente:   ['',],
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
    test:      ['',],    
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

  showCliente(event: any) {
    this.toggleCliente = !this.toggleCliente;
    this.toggleUnidad = false;
  }

  showUnidad(event: any) {
    this.toggleUnidad = !this.toggleUnidad;
    this.toggleCliente = false;
  }

  showAgregarCliente() {
    this.toggleAddCliente = !this.toggleAddCliente;
  }

  
  
  onSelectTab(data: TabDirective) {
    this.value = data.heading;
  }

  campoEsValido( campo: string) {
    return this.preconversionForm.controls[campo].errors && 
           this.preconversionForm.controls[campo].touched
  }

  guardarPreconversion(){
    console.log(this.preconversionForm.value);
    if( this.preconversionForm.invalid ){
      this.preconversionForm.markAllAsTouched();
      return;
    }


    this.preconversionForm.reset();
  }

}

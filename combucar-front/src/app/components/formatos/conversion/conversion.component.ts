import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-conversion',
  templateUrl: './conversion.component.html',
  styles: [
  ]
})
export class ConversionComponent implements OnInit {

  title: string = 'FORMATO DE CONTROL DE CONVERSION';

  conversionForm: FormGroup = this.fb.group({
    numerovin:     [ '', [ Validators.required, Validators.maxLength(17) ]],
    mecanica:      [ '', Validators.required ],
    lineayfrente:  [ '', Validators.required ],
    perforacion:   [ '', Validators.required ],
    cilindros:     [ '', Validators.required ],
    calibracion:   [ false, ],
    anticongelante:[ false, ],
    fugasagua:     [ false, ],
    herramienta:   [ false, ],
    limpieza:      [ false, ],
    funcionamiento:[ false, ],
    soporteBateria:[ false, ],
    // Cilindros
    instalacion:[ false, ],
    fugasGasCilindros:[ false, ],
    herramientaCilindros:[ false, ],
    limpiezaCilindros:[ false, ],
  })

  constructor( private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  guardar() {
    
  }

}

import { Component, Input, Output, EventEmitter } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styles: [
  ]
})
export class InputComponent {

  constructor( ) { }
  
  @Input() nameInput: string = '';
  @Input() placeholder: string = '';
  @Input() parent!: FormGroup;

  campoEsValido( name: string) {
    return (this.parent.controls[name].errors && this.parent.controls[name].touched);
  }

}

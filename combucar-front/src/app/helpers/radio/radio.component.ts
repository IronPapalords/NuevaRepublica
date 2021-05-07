import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-radio',
  templateUrl: './radio.component.html',
  styles: [
  ]
})
export class RadioComponent implements OnInit {

  @Input() nameRadio!: string;
  @Input() ss: string = '';
  @Input() placeholder: string = '';
  @Input() valor1: string = '';
  @Input() valor2: string = '';
  @Input() id: string = '';

  @Input() parent!: FormGroup;

  constructor() { }

  ngOnInit(): void {
  }


  campoEsValido( name: string) {
    return (this.parent.controls[name].errors && this.parent.controls[name].touched);
  }

}

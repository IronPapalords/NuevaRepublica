import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-datetime',
  templateUrl: './datetime.component.html',
  styles: [
  ]
})
export class DatetimeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Input() nameInput: string = '';
  @Input() placeholder: string = '';
  @Input() parent!: FormGroup;

  campoEsValido( name: string) {
    return (this.parent.controls[name].errors && this.parent.controls[name].touched);
  }


}

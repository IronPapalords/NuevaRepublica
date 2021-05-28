import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-switch',
  templateUrl: './switch.component.html',
  styles: [
  ]
})
export class SwitchComponent implements OnInit {

  @Input() parent!: FormGroup;
  @Input() name: string ='';
  
  constructor() { }

  ngOnInit(): void {
  }


}

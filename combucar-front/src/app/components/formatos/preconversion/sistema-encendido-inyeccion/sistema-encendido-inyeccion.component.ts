import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { TabsetComponent } from 'ngx-bootstrap/tabs';

@Component({
  selector: 'app-sistema-encendido-inyeccion',
  templateUrl: './sistema-encendido-inyeccion.component.html',
  styles: [
  ]
})
export class SistemaEncendidoInyeccionComponent implements OnInit {

  @Input() staticTabs!: TabsetComponent;
  @Input() preconversionForm!: FormGroup;

  constructor() { }

  ngOnInit(): void {
  }


  selectTab(tabId: number) {
    this.staticTabs.tabs[tabId].active = true;
    console.log(this.preconversionForm.value);
  }

}

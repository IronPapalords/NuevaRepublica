import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { TabsetComponent } from 'ngx-bootstrap/tabs';

@Component({
  selector: 'app-inspeccion',
  templateUrl: './inspeccion.component.html',
  styles: [
  ]
})
export class InspeccionComponent implements OnInit {

  title: string= 'Inspección visual preliminar';

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

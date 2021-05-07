import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { TabsetComponent } from 'ngx-bootstrap/tabs';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  styles: [
  ]
})
export class ClienteComponent implements OnInit {

  constructor() { }

  @Input() staticTabs!: TabsetComponent;
  @Input() preconversionForm!: FormGroup;

  ngOnInit(): void {
  }

  
  
  selectTab(tabId: number) {
    this.staticTabs.tabs[tabId].active = true;
    console.log(this.preconversionForm.value);
  }
}

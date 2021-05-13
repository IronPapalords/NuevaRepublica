import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { TabsetComponent } from 'ngx-bootstrap/tabs';
import Swal from 'sweetalert2';

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

  buscarCliente () {
    Swal.fire({
      position: 'center',
      icon: 'success',
      title: 'Consulta exitosa',
      showConfirmButton: false,
      timer: 1500
    });
  }

  
  
  selectTab(tabId: number) {
    this.staticTabs.tabs[tabId].active = true;
    console.log(this.preconversionForm.value);
  }
}

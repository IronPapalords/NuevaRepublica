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


  showAddCliente: boolean = false;
  @Input() staticTabs!: TabsetComponent;
  @Input() preconversionForm!: FormGroup;
  @Input() clientesForm!: FormGroup;

  constructor() { }

  ngOnInit(): void {
  }

  buscarCliente(event:any) {
    Swal.fire({
      position: 'center',
      icon: 'success',
      title: 'Buscando Cliente...',
      showConfirmButton: false,
      timer: 1500
    });
  }

  toggleAddCliente(event:any) {
    this.showAddCliente = !this.showAddCliente;
    console.log('Si funka toggleAddCliente?', this.showAddCliente);
  }  
  
  selectTab(tabId: number) {
    this.staticTabs.tabs[tabId].active = true;
  }
}

import { Component, EventEmitter, Input, Output } from '@angular/core';

interface MenuItem  {
  texto: string,
  ruta: string
}

@Component({
  selector: 'app-sidebar-menu',
  templateUrl: './sidebar-menu.component.html',
  styles: [
  ]
})
export class SidebarMenuComponent  {

  @Input() toogleMenu!: boolean;
  @Output() newToggle:EventEmitter<boolean> = new EventEmitter<boolean>();
    
  toggleMenu() {  
    this.toogleMenu = false;
    this.newToggle.emit( this.toogleMenu );
  }

  dashboardMenu: MenuItem[] = [
    {
      texto: 'Ventas',
      ruta: '/graficas/barras'
    }
  ];

  catalogos: MenuItem[] = [
    {
      texto: 'Operadores',
      ruta: '/catalogos/operadores'
    },
    {
      texto: 'Clientes',
      ruta: '/catalogos/clientes'
    },
    {
      texto: 'Alta de Unidades',
      ruta: '/catalogos/altaUnidades'
    }
  ];

  formatosMenu: MenuItem[] = [
    {
      texto: 'Control de conversión',
      ruta: '/formatos/conversion'
    },
    {
      texto: 'Pre-conversión',
      ruta: '/formatos/preconversion'
    },
    {
      texto: 'Control conversiones y cilindros',
      ruta: '/formatos/conversionCilindros'
    },
  ];

  ingresosMenu: MenuItem[] = [
    {
      texto: 'Recepcion',
      ruta: '/ingresos/recepcion'
    },
    {
      texto: 'Entrega',
      ruta: '/ingresos/entrega'
    }    
  ];
  informacionMenu: MenuItem[] = [
    {
      texto: 'Informacion',
      ruta: '/informacion/acerca'
    },
    
  ];

  constructor() { }

}

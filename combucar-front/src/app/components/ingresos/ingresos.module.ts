import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { IngresosRoutingModule } from './ingresos-routing.module';
import { RecepcionComponent } from './recepcion/recepcion.component';
import { EntregaComponent } from './entrega/entrega.component';


@NgModule({
  declarations: [RecepcionComponent, EntregaComponent],
  imports: [
    CommonModule,
    IngresosRoutingModule
  ]
})
export class IngresosModule { }

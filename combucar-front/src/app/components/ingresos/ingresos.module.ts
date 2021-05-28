import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { IngresosRoutingModule } from './ingresos-routing.module';
import { RecepcionComponent } from './recepcion/recepcion.component';
import { EntregaComponent } from './entrega/entrega.component';
import { HelpersModule } from 'src/app/helpers/helpers.module';


@NgModule({
  declarations: [RecepcionComponent, EntregaComponent],
  imports: [
    CommonModule,
    IngresosRoutingModule,
    HelpersModule,
  ]
})
export class IngresosModule { }

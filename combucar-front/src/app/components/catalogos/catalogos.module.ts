import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ChartsModule } from 'ng2-charts';
import { CatalogosRoutingModule } from './catalogos-routing.module';
import { AltaUnidadesComponent } from './alta-unidades/alta-unidades.component';
import { OperadoresComponent } from './operadores/operadores.component';
import { ClientesComponent } from './clientes/clientes.component';


@NgModule({
  declarations: [
    OperadoresComponent, 
    ClientesComponent, 
    AltaUnidadesComponent
  ],
  imports: [
    CommonModule,
    CatalogosRoutingModule,
    ChartsModule
  ]
})
export class CatalogosModule { }
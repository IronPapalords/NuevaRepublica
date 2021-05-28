import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CatalogosRoutingModule } from './catalogos-routing.module';
import { AltaUnidadesComponent } from './alta-unidades/alta-unidades.component';
import { OperadoresComponent } from './operadores/operadores.component';
import { ClientesComponent } from './clientes/clientes.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HelpersModule } from 'src/app/helpers/helpers.module';

@NgModule({
  declarations: [
    OperadoresComponent, 
    ClientesComponent, 
    AltaUnidadesComponent
  ],
  exports: [
    ClientesComponent,
    AltaUnidadesComponent
  ],
  imports: [
    CommonModule,
    CatalogosRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HelpersModule
  ]
})
export class CatalogosModule { }

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TabsModule, TabsetConfig } from 'ngx-bootstrap/tabs';

import { FormatosRoutingModule } from './formatos-routing.module';
import { ConversionComponent } from './conversion/conversion.component';
import { PreconversionComponent } from './preconversion/preconversion.component';
import { ConversionCilindrosComponent } from './conversion-cilindros/conversion-cilindros.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HelpersModule } from '../../helpers/helpers.module';
import { ClienteComponent } from './preconversion/cliente/cliente.component';
import { InspeccionComponent } from './preconversion/inspeccion/inspeccion.component';
import { SistemaElectricoComponent } from './preconversion/sistema-electrico/sistema-electrico.component';
import { SistemaEncendidoInyeccionComponent } from './preconversion/sistema-encendido-inyeccion/sistema-encendido-inyeccion.component';


@NgModule({
  declarations: [
    ConversionComponent,
    PreconversionComponent,
    ConversionCilindrosComponent,
    ClienteComponent,
    InspeccionComponent,
    SistemaElectricoComponent,
    SistemaEncendidoInyeccionComponent
  ],  
  exports: [
    ClienteComponent
  ],
  imports: [
    CommonModule,
    FormatosRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    TabsModule.forRoot(),
    HelpersModule,
  ],
  providers: [
    TabsetConfig
  ],
})
export class FormatosModule { }

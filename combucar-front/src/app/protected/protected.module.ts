import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProtectedRoutingModule } from './protected-routing.module';
import { HomeComponent } from './home/home.component';
import { SharedModule } from '../shared/shared.module';
import { FormatosModule } from '../components/formatos/formatos.module';
import { InicioComponent } from './inicio/inicio.component';
import { HelpersModule } from '../helpers/helpers.module';


@NgModule({
  declarations: [HomeComponent, InicioComponent],
  imports: [
    CommonModule,
    ProtectedRoutingModule,
    FormatosModule,
    SharedModule,
    HelpersModule
  ],
  exports: [
    HomeComponent
  ]
})
export class ProtectedModule { }

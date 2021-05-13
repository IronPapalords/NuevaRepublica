import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProtectedRoutingModule } from './protected-routing.module';
import { HomeComponent } from './home/home.component';
import { SharedModule } from '../shared/shared.module';
import { FormatosModule } from '../components/formatos/formatos.module';
import { InicioComponent } from './inicio/inicio.component';


@NgModule({
  declarations: [HomeComponent, InicioComponent],
  imports: [
    CommonModule,
    ProtectedRoutingModule,
    FormatosModule,
    SharedModule,
  ],
  exports: [
    HomeComponent
  ]
})
export class ProtectedModule { }

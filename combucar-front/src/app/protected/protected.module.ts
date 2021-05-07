import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProtectedRoutingModule } from './protected-routing.module';
import { HomeComponent } from './home/home.component';
import { SharedModule } from '../shared/shared.module';
import { FormatosModule } from '../components/formatos/formatos.module';


@NgModule({
  declarations: [HomeComponent],
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

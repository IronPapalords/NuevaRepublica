import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FormatosRoutingModule } from './formatos-routing.module';
import { ConversionComponent } from './conversion/conversion.component';
import { PreconversionComponent } from './preconversion/preconversion.component';
import { ConversionCilindrosComponent } from './conversion-cilindros/conversion-cilindros.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HelpersModule } from '../../helpers/helpers.module';


@NgModule({
  declarations: [
    ConversionComponent,
    PreconversionComponent,
    ConversionCilindrosComponent
  ],  
  imports: [
    CommonModule,
    FormatosRoutingModule,
    ReactiveFormsModule,
    HelpersModule
  ]
})
export class FormatosModule { }

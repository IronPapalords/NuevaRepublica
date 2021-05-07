import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TitleComponent } from './title/title.component';
import { ReactiveFormsModule } from '@angular/forms';

import { InputComponent } from './input/input.component';
import { DatetimeComponent } from './datetime/datetime.component';
import { RadioComponent } from './radio/radio.component';

@NgModule({
  declarations: [
    TitleComponent,
    InputComponent,
    DatetimeComponent,
    RadioComponent
  ],
  exports: [
    TitleComponent,
    InputComponent,
    DatetimeComponent,
    RadioComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class HelpersModule { }

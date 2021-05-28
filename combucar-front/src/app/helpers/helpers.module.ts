import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TitleComponent } from './title/title.component';
import { ReactiveFormsModule } from '@angular/forms';

import { InputComponent } from './input/input.component';
import { DatetimeComponent } from './datetime/datetime.component';
import { RadioComponent } from './radio/radio.component';
import { ButtonComponent } from './button/button.component';
import { SwitchComponent } from './switch/switch.component';

@NgModule({
  declarations: [
    TitleComponent,
    InputComponent,
    DatetimeComponent,
    RadioComponent,
    ButtonComponent,
    SwitchComponent
  ],
  exports: [
    TitleComponent,
    InputComponent,
    DatetimeComponent,
    RadioComponent,
    ButtonComponent,
    SwitchComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ]
})
export class HelpersModule { }

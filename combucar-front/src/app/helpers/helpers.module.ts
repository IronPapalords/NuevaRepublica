import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { NgxDatatableModule } from '@swimlane/ngx-datatable';
import { PaginationModule } from 'ngx-bootstrap/pagination';
import { Ng2SmartTableModule } from 'ng2-smart-table';

import { TitleComponent } from './title/title.component';
import { InputComponent } from './input/input.component';
import { DatetimeComponent } from './datetime/datetime.component';
import { ButtonComponent } from './button/button.component';
import { SwitchComponent } from './switch/switch.component';
import { TablengxComponent } from './tablengx/tablengx.component';
import { Tableng2Component } from './tableng2/tableng2.component';

@NgModule({
  declarations: [
    TitleComponent,
    InputComponent,
    DatetimeComponent,
    ButtonComponent,
    SwitchComponent,
    TablengxComponent,
    Tableng2Component,
  ],
  exports: [
    TitleComponent,
    InputComponent,
    DatetimeComponent,
    ButtonComponent,
    SwitchComponent,
    TablengxComponent,
    Tableng2Component
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    NgxDatatableModule,    
    Ng2SmartTableModule,
    PaginationModule.forRoot(),
  ]  
})
export class HelpersModule { }

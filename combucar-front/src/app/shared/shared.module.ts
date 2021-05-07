import { ProtectedRoutingModule } from './../protected/protected-routing.module';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RouterModule } from '@angular/router';
import { SidebarMenuComponent } from './sidebar-menu/sidebar-menu.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FormatosModule } from '../components/formatos/formatos.module';


@NgModule({
  declarations: [
    SidebarMenuComponent,
    NavbarComponent,
  ],
  exports:[
    SidebarMenuComponent,
    NavbarComponent,
  ],
  imports: [
    CommonModule,
    RouterModule,
    ProtectedRoutingModule
  ]
})
export class SharedModule { }

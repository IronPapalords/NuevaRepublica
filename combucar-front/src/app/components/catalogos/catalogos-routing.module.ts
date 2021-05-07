import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AltaUnidadesComponent } from '../catalogos/alta-unidades/alta-unidades.component';
import { ClientesComponent } from './clientes/clientes.component';
import { OperadoresComponent } from './operadores/operadores.component';
import { HomeComponent } from '../../protected/home/home.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent,
    children: [
      { path: 'operadores', component: OperadoresComponent },
      { path: 'clientes', component: ClientesComponent },
      { path: 'altaUnidades', component: AltaUnidadesComponent },
      { path: '**', redirectTo: 'catalogos'}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CatalogosRoutingModule { }
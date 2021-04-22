import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AltaUnidadesComponent } from '../catalogos/alta-unidades/alta-unidades.component';
import { ClientesComponent } from './clientes/clientes.component';
import { OperadoresComponent } from './operadores/operadores.component';

const routes: Routes = [
  {
    path:'',
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
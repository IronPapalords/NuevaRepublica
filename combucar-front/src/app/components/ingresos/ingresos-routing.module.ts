import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EntregaComponent } from './entrega/entrega.component';
import { IngresosModule } from './ingresos.module';
import { RecepcionComponent } from './recepcion/recepcion.component';
import { HomeComponent } from '../../protected/home/home.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    children: [
      { path:'recepcion', component: RecepcionComponent },
      { path:'entrega', component: EntregaComponent },
      { path:'**', redirectTo: 'recepcion' },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class IngresosRoutingModule { }

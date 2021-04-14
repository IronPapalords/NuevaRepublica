import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'graficas',
    loadChildren: () => import('./components/graficas/graficas.module').then( m => m.GraficasModule)
  },
  {
    path: 'formatos',
    loadChildren: () => import('./components/formatos/formatos.module').then(m => m.FormatosModule )
  },
  {
    path: 'ingresos',
    loadChildren: () => import('./components/ingresos/ingresos.module').then(m => m.IngresosModule )
  },
  {
    path: 'informacion',
    loadChildren: () => import('./components/informacion/informacion.module').then(m => m.InformacionModule )
  },
  {
    path: '**',
    redirectTo:'formatos'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

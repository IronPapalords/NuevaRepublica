import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BarrasComponent } from './barras/barras.component';
import { HomeComponent } from '../../protected/home/home.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent,
    children: [
      { path: 'barras', component: BarrasComponent },
      {path: '**', redirectTo: 'barras'}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GraficasRoutingModule { }

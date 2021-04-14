import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AcercaComponent } from './acerca/acerca.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path:'acerca', component: AcercaComponent },
      { path:'**', redirectTo: 'acerca' },
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class InformacionRoutingModule { }

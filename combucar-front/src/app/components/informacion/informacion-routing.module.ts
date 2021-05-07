import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from 'src/app/protected/home/home.component';
import { AcercaComponent } from './acerca/acerca.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
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

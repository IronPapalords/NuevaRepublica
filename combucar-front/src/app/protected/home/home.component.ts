import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styles: [
  ]
})
export class HomeComponent implements OnInit {

  title = 'combucar-front';
  toogleMenu: boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  getToggleValue( newToggle: boolean ) {
    this.toogleMenu = newToggle;
  }
}

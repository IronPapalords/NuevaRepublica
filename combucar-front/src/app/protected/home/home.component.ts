import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styles: [
  ]
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  toogleMenu: boolean = false;

  getToggleValue( newToggle: boolean ) {
    console.log({newToggle});
    this.toogleMenu = newToggle;
  }

  title = 'combucar-front';

}

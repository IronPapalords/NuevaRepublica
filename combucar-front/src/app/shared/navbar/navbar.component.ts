import { Component, Output, EventEmitter, Input } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styles: [
  ]
})
export class NavbarComponent {

  @Input() toogleMenu!: boolean;
  @Output() newToggle:EventEmitter<boolean> = new EventEmitter<boolean>();

  constructor( private router: Router){}

  toggleMenu( ) {
  
    this.toogleMenu = !this.toogleMenu;
    console.log('abierto menu',this.toogleMenu );
    this.newToggle.emit( this.toogleMenu );
  }

  logout() {
    this.router.navigateByUrl('/auth');
  }

}

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

  toggleMenu(event:any) {
    this.toogleMenu = !this.toogleMenu;    
    this.newToggle.emit( this.toogleMenu );
  }

  logout(event: any) {
    this.router.navigateByUrl('/auth');
  }

}

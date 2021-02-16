import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HeroesService, Heroe } from '../../services/heroes.service';

@Component({
  selector: 'app-heroe',
  templateUrl: './heroe.component.html'
})
export class HeroeComponent implements OnInit {

  heroe:Heroe;

  constructor(private _activatedRoute:ActivatedRoute, private _heroesService:HeroesService) { }

  ngOnInit(): void {
    this._activatedRoute.params.subscribe(params => {
      //console.log(params['idHeroe']);
      this.heroe = this._heroesService.getHeroe(params['idHeroe']);
    });
  }

  

}

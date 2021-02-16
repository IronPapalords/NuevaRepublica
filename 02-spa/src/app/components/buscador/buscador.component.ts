import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HeroesService, Heroe } from '../../services/heroes.service';

@Component({
  selector: 'app-buscador',
  templateUrl: './buscador.component.html'
})
export class BuscadorComponent implements OnInit {
  heroes:Heroe[] = [];
  searchText:string;

  constructor(private _activatedRoute:ActivatedRoute, private _router:Router, private _heroesService:HeroesService) { }

  ngOnInit(): void {
    this._activatedRoute.params.subscribe(params => {
      this.searchText = params['searchText'];
      this.heroes = this._heroesService.buscarHeroes(this.searchText);
    });
  }

  verHeroe(index:number){
    return this._router.navigate(['/heroe', index]);
  }
}

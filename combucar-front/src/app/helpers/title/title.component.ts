import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-title',
  templateUrl: './title.component.html',
  styleUrls: []
})
export class TitleComponent {

  @Input() titulo: string = "";

}

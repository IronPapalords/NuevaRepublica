import { Component, Input, OnInit, SimpleChanges, ChangeDetectionStrategy } from '@angular/core';
import { ColumnMode } from '@swimlane/ngx-datatable';

@Component({
  selector: 'app-tablengx',
  templateUrl: './tablengx.component.html',
  styles: [
  ],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class TablengxComponent implements OnInit {

  @Input() rows: Array<any> = [];
  temp:Array<any> = [...this.rows];

  loadingIndicator = false;

  columns = [
    { prop: 'name',   sortable: true }, 
    { name: 'Nombre', sortable: true }, 
    { name: 'rfc',    sortable: true }, 
    { name: 'identificacion', sortable: true },
    { name: 'telefono', sortable: true },
    { name: 'correo', sortable: true }
  ];

  /* @ViewChild(DatatableComponent) table!: DatatableComponent; */

  ColumnMode = ColumnMode;

  constructor() {
    
    
    /* this.fetch(data => {
      this.temp = [...data];
      this.rows = data;
    }); */

    this.temp = [...this.rows];
  }

  ngOnChanges(changes: SimpleChanges) {
    this.temp = [...this.rows];
  }
  
  ngOnInit(): void {
    this.temp = [...this.rows];    
  }

  /* fetch(cb) {
    const req = new XMLHttpRequest();
    req.open('GET', `assets/data/company.json`);

    req.onload = () => {
      cb(JSON.parse(req.response));
    };

    req.send();
  } */

  updateFilter(event:any) {
    const val = event.target.value.toLowerCase();

    // filter our data
    const temp = this.temp.filter( (d) => {
      return d.nombre.toLowerCase().indexOf(val) !== -1 || !val;
    });

    // update the rows
    this.rows = temp;
    // Whenever the filter changes, always go back to the first page
    /* this.table.offset = 0; */
  }

}

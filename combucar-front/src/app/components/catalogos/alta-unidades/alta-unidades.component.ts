import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import Swal from 'sweetalert2';



@Component({
  selector: 'app-alta-unidades',
  templateUrl: './alta-unidades.component.html',
  styleUrls: ['./alta-unidades.component.css']
})
export class AltaUnidadesComponent implements OnInit {

  unidadForm: FormGroup = this.fb.group({
    cliente:[''],
    serie: ['', Validators.required, Validators.maxLength(45)],
    marca: ['', Validators.required],
    placas: ['', Validators.required],
    tipo: [''],
    kilometraje: ['', Validators.required],
    cilindro: this.fb.group({
      serie: ['', Validators.required],
      marca: ['', Validators.required],
      capacidad: [''],
      fechaFabricacion: ['', Validators.required]
    })
  });

  unidades : Unidad[] = [
    {
      cliente: 'Alberto Navarrete Garc�a',
      serie: '1598789635645',
      marca: 'Ford',
      placas: 'AHN-15A-N00',
      tipo: 'Pick-up',
      kilometraje: '15',
      cilindros: [
        {
          serie: '15123',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2020-11-01'),
        },
        {
          serie: '15124',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2020-11-01'),
        },
        {
          serie: '15125',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2020-11-01'),
        },
        {
          serie: '15126',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2020-11-01'),
        }
      ]
    },
    {
      cliente: 'Alberto Navarrete Garc�a',
      serie: '1532159635311',
      marca: 'Ford',
      placas: 'NHA-36B-ANK',
      tipo: 'Pick-up',
      kilometraje: '4200',
      cilindros: [
        {
          serie: '13321',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2021-02-15'),
        },
        {
          serie: '13322',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2021-02-15'),
        },
        {
          serie: '13323',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2021-02-15'),
        },
        {
          serie: '13324',
          marca: 'Ford',
          capacidad: '4',
          fechaFabricacion: new Date('2021-02-15'),
        }
      ]
    }
  ];
  cilindros : Cilindro[] = [];

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  get isSerieInvalid(){
    return this.unidadForm.get('serie')?.invalid && this.unidadForm.get('serie')?.touched;
  }
  get isMarcaInvalid(){
    return this.unidadForm.get('marca')?.invalid && this.unidadForm.get('marca')?.touched;
  }
  get isPlacasInvalid(){
    return this.unidadForm.get('placas')?.invalid && this.unidadForm.get('placas')?.touched;
  }
  get isKilometrajeInvalid(){
    return this.unidadForm.get('kilometraje')?.invalid && this.unidadForm.get('kilometraje')?.touched;
  }
  get isCilindroSerieInvalid(){
    return this.unidadForm.get('cilindro.serie')?.invalid && this.unidadForm.get('cilindro.serie')?.touched;
  }
  get isCilindroMarcaInvalid(){
    return this.unidadForm.get('cilindro.marca')?.invalid && this.unidadForm.get('cilindro.marca')?.touched;
  }
  get isCilindroFechaFabricacionInvalid(){
    return this.unidadForm.get('cilindro.fechaFabricacion')?.invalid && this.unidadForm.get('cilindro.fechaFabricacion')?.touched;
  }

  guardar(){
    if(this.unidadForm.invalid){
      return Object.values(this.unidadForm.controls).forEach(control => {
        control.markAsTouched();
        if(this.cilindros.length <= 0 && control instanceof FormGroup){
          Object.values(control.controls).forEach(control => control.markAsTouched());
        }
      });
    }

    if(this.cilindros.length <= 0){
      Swal.fire({
        position: 'center',
        icon: 'warning',
        title: 'Favor de agregar el detalle de los cilindros de la unidad',
        showConfirmButton: false,
        timer: 1500
      });
      
      return;
    }

    let unidad: Unidad = {
      cliente: this.unidadForm.get('cliente')?.value,
      serie: this.unidadForm.get('serie')?.value,
      marca: this.unidadForm.get('marca')?.value,
      placas: this.unidadForm.get('placas')?.value,
      tipo: this.unidadForm.get('tipo')?.value,
      kilometraje: this.unidadForm.get('kilometraje')?.value,
      cilindros: this.cilindros
    }
    
    this.unidades.push(unidad);
    this.cilindros = [];

    Swal.fire({
      position: 'center',
      icon: 'success',
      title: 'Unidad Guardada',
      showConfirmButton: false,
      timer: 1500
    });

    this.unidadForm.reset();
  }

  agregarCilindro(){
    let valid: boolean = true;
    Object.values(this.unidadForm.controls).forEach(control => {
      if(control instanceof FormGroup){
        Object.values(control.controls).forEach(control => {
          if(control.invalid){
            valid = false;
            control.markAsTouched();
          }
        });
      }
    });
    
    if(valid){
      let cilindro: Cilindro = {
        serie: this.unidadForm.get('cilindro.serie')?.value ,
        marca: this.unidadForm.get('cilindro.marca')?.value,
        capacidad : this.unidadForm.get('cilindro.capacidad')?.value,
        fechaFabricacion: this.unidadForm.get('cilindro.fechaFabricacion')?.value,
      }

      this.cilindros.push(cilindro);

      this.unidadForm.reset({
        cliente: this.unidadForm.get('cliente')?.value,
        serie: this.unidadForm.get('serie')?.value,
        marca: this.unidadForm.get('marca')?.value,
        placas: this.unidadForm.get('placas')?.value,
        tipo: this.unidadForm.get('tipo')?.value,
        kilometraje: this.unidadForm.get('kilometraje')?.value,
      })
    }
  }

}

interface Cilindro{
  serie: string,
  marca: string,
  capacidad: string,
  fechaFabricacion: Date,
};

interface Unidad{
  cliente: string,
  serie: string,
  marca: string,
  placas: string,
  tipo: string,
  kilometraje: string,
  cilindros: Cilindro[]
};

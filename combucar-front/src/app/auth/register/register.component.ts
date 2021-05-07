import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styles: [
  ]
})
export class RegisterComponent implements OnInit {

  registerForm: FormGroup = this.fb.group({
    user:     ['', [Validators.required, Validators.minLength(4)] ],
    password: ['', [Validators.required, Validators.minLength(6)] ],
    email:    ['', [Validators.required, Validators.email] ],
  })

  constructor( private fb: FormBuilder ) { }

  ngOnInit(): void {
  }

  register() {
    console.log(this.registerForm.value);
    console.log(this.registerForm.valid);
  }


}

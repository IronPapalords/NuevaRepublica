import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styles: [
  ]
})
export class LoginComponent {

  loginForm: FormGroup = this.fb.group({
    user:     ['jona', [Validators.required, Validators.minLength(4)] ],
    password: ['123456', [Validators.required, Validators.minLength(6)] ],
  })

  constructor( private fb: FormBuilder,
               private router: Router ) { }

  login() {
    console.log(this.loginForm.value);
    console.log(this.loginForm.valid);

    this.router.navigateByUrl('/home/inicio');

  }

}

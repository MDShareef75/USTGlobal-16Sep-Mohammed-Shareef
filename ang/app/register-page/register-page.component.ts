import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css']
})
export class RegisterPageComponent implements OnInit {

  form = new FormGroup({
    email : new FormControl('',[Validators.required]),
    password : new FormControl('',[Validators.required])
  })
  constructor() { }
  
  ngOnInit() {
  }

}

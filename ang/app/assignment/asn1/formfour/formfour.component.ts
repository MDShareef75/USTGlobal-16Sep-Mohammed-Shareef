import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms';
@Component({
  selector: 'app-formfour',
  templateUrl: './formfour.component.html',
  styleUrls: ['./formfour.component.css']
})
export class FormfourComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form.value);
  }
}

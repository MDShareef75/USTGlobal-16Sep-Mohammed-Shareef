import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms';
@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
    
  
  form1Data(form: NgForm) {
    console.log(form.value);
  }

}

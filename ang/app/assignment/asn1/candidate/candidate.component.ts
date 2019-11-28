import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms';

@Component({
  selector: 'app-candidate',
  templateUrl: './candidate.component.html',
  styleUrls: ['./candidate.component.css']
})
export class CandidateComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  form2Data(form: NgForm) {
  console.log(form.value);
}
}

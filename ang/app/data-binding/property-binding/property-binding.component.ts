import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name : string = 'AWESOME';
  imgUrl : string = 'https://cdn.pixabay.com/photo/2019/04/07/13/58/pond-4109750__340.jpg';
  address : string = 'UPPALLI CHICKMAGALUR - 577101';
  colorName : string = "maroon";
  isActive : boolean = false;
  colSpanValue : number =2;

  constructor() {
    setInterval(() => {
      this.colorName= 'red';
      this.isActive = !this.isActive;
    },1500);
    setInterval(() => {
      this.colorName = 'blue';
    },4000);
    setInterval(() => {
      this.colorName = 'purple';
    },6000);
    setInterval(() => {
      this.colorName = 'yellow';
    },8000);
   }

  ngOnInit() {
    // setInterval(() => {
    //   this.colorName = 'blue';
    // },2000);
    // setInterval(() => {
    //   this.colorName = 'purple';
    // },4000);
    // setInterval(() => {
    //   this.colorName = 'yellow';
    // },6000);
  }

}

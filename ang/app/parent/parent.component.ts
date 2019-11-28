import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;

  cars = [{
    name : 'Aston Martin',
    imgUrl : 'https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857__340.jpg'
  },
  {
    name : 'Mercedes AMG',
    imgUrl : 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg'
  },
  {
    name : 'Meserati',
    imgUrl : 'https://cdn.pixabay.com/photo/2016/09/06/13/37/maserati-1649119__340.jpg'
  },
  {
    name : 'Lamborghini',
    imgUrl : 'https://cdn.pixabay.com/photo/2017/03/20/04/57/truck-2158284__340.png'
  }]

  constructor() { }

  ngOnInit() {
  }

  sendCar(car){
    console.log(car);
    this.selectedCar = car;
  }

}

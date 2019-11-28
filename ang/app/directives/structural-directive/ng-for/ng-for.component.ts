import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
  products = [
    {
      img : 'https://cdn.pixabay.com/photo/2014/07/31/23/00/wristwatch-407096__340.jpg',
      name : 'RADO watch',
      price : 15000
    },
    {
      img : 'https://cdn.pixabay.com/photo/2018/01/16/10/18/headphone-3085681__340.jpg',
      name : 'Marshall HeadPhone',
      price : 3000
    },
    {
      img : 'https://cdn.pixabay.com/photo/2016/03/09/09/57/drone-1245980__340.jpg',
      name : 'Drone',
      price : 7000
    }
  ]
  constructor() { }

  ngOnInit() {
  }

}

import { Component } from "@angular/core";
import { HttpClient } from '@angular/common/http';





@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})

export class HomeComponent {
    news: any[];
    constructor(private http: HttpClient) {
        this.getNews();
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=2b514484a52d4b0983f41d87c93b4dd2').subscribe(data => {
            this.news = data.articles;
        }, err => {
            console.log(err);
        }, () => {
            console.log('news got successfully');
        });
    }
}

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
// import { HomeComponent } from './home/home.component';
// import { CarsComponent } from './cars/cars.component';
// import { CarDetailsComponent } from './car-details/car-details.component';
// import { RecipesComponent } from './recipes/recipes.component';
// import { RecipeDetailsComponent } from './recipe-details/recipe-details.component';
// import { NewsComponent } from './news/news.component';
// import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
// import { NewsDetailsComponent } from './news-details/news-details.component';
// import { MobileComponent } from './mobile/mobile.component';
import { MoviesComponent } from './movies/movies.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MoviesComponent,
    AddmovieComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path:'movies', component:MoviesComponent},
      { path:'addmov',component:AddmovieComponent},
      { path:'login',component:LoginComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

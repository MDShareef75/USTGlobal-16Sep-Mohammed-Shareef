import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './HOME/home.component';
import { AboutComponent } from './ABOUT/about.component';
import { RouterModule } from '@angular/router';
import { HelpComponent } from './HELP/help.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { StructuralDirectiveComponent } from './directives/structural-directive/structural-directive.component';
import { NgIfComponent } from './directives/structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directive/ng-switch/ng-switch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { ExperienceComponent } from './assignment/asn1/experience/experience.component';
import { CandidateComponent } from './assignment/asn1/candidate/candidate.component';
import { SignUpComponent } from './assignment/asn1/sign-up/sign-up.component';
import { FormfourComponent } from './assignment/asn1/formfour/formfour.component';
import { RegisterPageComponent } from './register-page/register-page.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarPipe } from './dollar.pipe';
import { Header1Component } from './header1/header1.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    HelpComponent,
    AboutComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectivesComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    ExperienceComponent,
    CandidateComponent,
    SignUpComponent,
    FormfourComponent,
    RegisterPageComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarPipe,
    Header1Component
],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home' , component:HomeComponent },
      {path : 'about' ,component:AboutComponent},
      {path : 'help' ,component:HelpComponent},
      {path : 'property-binding', component: PropertyBindingComponent},
      {path : 'event-binding', component: EventBindingComponent},
      {path : 'two-way', component: TwoWayBindingComponent},
      {path : 'login', component: NgIfComponent},
      {path : 'ng-for', component: NgForComponent},
      {path : 'ng-switch', component: NgSwitchComponent},
      {path : 'register', component:RegisterComponent},
      {path : 'experience', component:ExperienceComponent},
      {path : 'candidate', component:CandidateComponent},
      {path : 'sign-up', component:SignUpComponent},
      {path : 'formfour', component:FormfourComponent},
      {path : 'reactive-form', component:ReactiveFormComponent},
      {path : 'parent', component:ParentComponent},
      {path : 'comment-details', component:CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

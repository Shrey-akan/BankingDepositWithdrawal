import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DepositeComponent } from './deposite/deposite.component';
import { HttpClientModule } from '@angular/common/http';
import { WithdrawComponent } from './withdraw/withdraw.component'

@NgModule({
  declarations: [
    AppComponent,
    DepositeComponent,
    WithdrawComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

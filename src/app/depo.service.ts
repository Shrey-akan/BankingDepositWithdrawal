import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DepoService implements OnInit{
  depositurl = "http://localhost:9001/depositeservice";
  withdrawurl ="http://localhost:9001/withdrawlservice";
  constructor(private h1:HttpClient) { }

  ngOnInit(): void{

  }
  depositservice(data:any)
  {
    return this.h1.post(this.depositurl,data);
  }

  withdrawlservice(data:any){
    return this.h1.post(this.withdrawurl,data);
  }
}

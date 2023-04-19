import { Component, OnInit } from '@angular/core';
import { DepoService } from '../depo.service';

@Component({
  selector: 'app-deposite',
  templateUrl: './deposite.component.html',
  styleUrls: ['./deposite.component.css']
})
export class DepositeComponent implements OnInit{

  constructor(private b1:DepoService) { }

  ngOnInit():void{
  }
  depositedata(depositeform:{value:any;}){
    return this.b1.depositservice(depositeform.value).subscribe();
  }
}

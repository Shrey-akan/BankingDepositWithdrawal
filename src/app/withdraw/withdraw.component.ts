import { Component, OnInit } from '@angular/core';
import { DepoService } from '../depo.service';

@Component({
  selector: 'app-withdraw',
  templateUrl: './withdraw.component.html',
  styleUrls: ['./withdraw.component.css']
})
export class WithdrawComponent implements OnInit{

  constructor(private b1:DepoService){  }
  
  ngOnInit() : void{
  }
    
    withdrawldata(withdrawlform:{value:any;}){
      return this.b1.withdrawlservice(withdrawlform.value).subscribe();
    }

}

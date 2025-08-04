import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class EmployeeService {

  constructor(private _httpClient:HttpClient) { }
}

import { AfterViewInit, Component, inject, OnInit, ViewChild } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';

import {MatFormFieldModule} from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { MatSort, MatSortModule } from '@angular/material/sort';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatDialog } from '@angular/material/dialog';
import { EmployeeFormComponent } from '../employee-form/employee-form.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [MatFormFieldModule,MatInputModule,MatButtonModule,MatTableModule,MatSortModule,MatPaginatorModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{

  displayedColumns = ['id', 'name', 'email', 'salary'];
  dataSource = new MatTableDataSource<Employee>();
  constructor(private employeeService:EmployeeService) { }
  
  employees: Employee[]=[];
  filteredEmployees: Employee[]=[];


  ngOnInit(): void {
    this.employeeService.fetchAllEmployees().subscribe((data) => {
      this.employees=data;
      this.dataSource = new MatTableDataSource<Employee>(data);
    })
  }

  searchEmployee(input: any) {
    this.filteredEmployees = this.employees.filter(item => item.name.toLowwerCase().includes)
  }
}

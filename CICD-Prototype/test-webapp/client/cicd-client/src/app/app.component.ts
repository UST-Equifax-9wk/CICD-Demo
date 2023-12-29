import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { environment } from '../environments/environment';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'cicd-client';
  httpClient: HttpClient;
  response: string = "";

  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  options = {

  }

  marco() {
    this.httpClient.get(environment.apiUrl + "/marco", this.options).subscribe({
      next: (data) => {this.response = (data as Dto).message}
    })
  }

  ping() {
    this.httpClient.get(environment.apiUrl + "/ping", this.options).subscribe({
      next: (data) => {this.response = (data as Dto).message}
    })
  }
}

interface Dto {
  message: string;
}
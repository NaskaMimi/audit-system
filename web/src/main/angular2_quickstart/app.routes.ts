import { provideRouter, RouterConfig }  from '@angular/router';
import { HeroesComponent } from './heroes.component.ts';
import { DashboardComponent } from './dashboard.component.ts';
import { HeroDetailComponent } from  './hero-detail.component.ts';

const routes: RouterConfig = [
    {
        path: 'heroes',
        component: HeroesComponent
    },
    {
        path: 'dashboard',
        component: DashboardComponent
    },
    {
        path: 'detail/:id',
        component: HeroDetailComponent
    }
];

export const APP_ROUTER_PROVIDERS = [
    provideRouter(routes)
];
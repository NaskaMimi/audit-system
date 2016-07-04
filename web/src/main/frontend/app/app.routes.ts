import { provideRouter, RouterConfig }  from '@angular/router';
import { AuditsComponent } from './audit/audits.component'
import { ReportsComponent } from "./report/reports.component";

const routes: RouterConfig = [
    {
        path: 'audits',
        component: AuditsComponent
    },
    {
        path: 'reports',
        component: ReportsComponent
    }
];

export const APP_ROUTER_PROVIDERS = [
    provideRouter(routes)
];
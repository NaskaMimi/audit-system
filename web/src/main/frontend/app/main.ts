import { bootstrap }    from '@angular/platform-browser-dynamic';

import { AuditApplicationComponent } from './audit-app.component';
import { APP_ROUTER_PROVIDERS } from './app.routes';
import { HTTP_PROVIDERS } from '@angular/http';

bootstrap(AuditApplicationComponent, [
    APP_ROUTER_PROVIDERS, HTTP_PROVIDERS
]);
import { bootstrap }    from '@angular/platform-browser-dynamic';

import { AuditApplicationComponent } from './audit-app.component';
import { APP_ROUTER_PROVIDERS } from './app.routes';

bootstrap(AuditApplicationComponent, [
    APP_ROUTER_PROVIDERS
]);
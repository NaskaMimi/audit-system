import { bootstrap }    from '@angular/platform-browser-dynamic';

import { AppComponent } from './app.component.ts';
import { APP_ROUTER_PROVIDERS } from './app.routes.ts';

bootstrap(AppComponent, [
    APP_ROUTER_PROVIDERS
]);
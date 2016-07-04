import { Component } from "@angular/core";
import { ROUTER_DIRECTIVES } from '@angular/router';
import { AuditService } from "./service/audit.service";

@Component({
    selector: "audit-app",
    templateUrl: "app/audit-app.component.html",
    directives: [ROUTER_DIRECTIVES]
})

export class AuditApplicationComponent {

}
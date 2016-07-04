import { Component, OnInit } from "@angular/core";
import { Audit } from "../model/audit";
import { AuditService } from "../service/audit.service"

@Component({
    selector: "audits",
    templateUrl: "app/audit/audits.component.html",
    providers: [AuditService]
})

export class AuditsComponent implements OnInit {
    audits:Audit[];
    selectAudit:Audit;

    constructor(
        private auditService:AuditService) {
    }

    ngOnInit() {
        this.audits = this.auditService.loadAudits();
    }
}
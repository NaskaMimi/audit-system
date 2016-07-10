import { Component, OnInit } from "@angular/core";
import { AuditDto } from "../model/audit";
import { AuditService } from "../service/audit.service"

@Component({
    selector: "audits",
    templateUrl: "app/audit/audits.component.html",
    providers: [AuditService]
})

export class AuditsComponent implements OnInit {
    audits:AuditDto[];
    selectAudit:AuditDto;

    constructor(
        private auditService:AuditService) {
    }

    ngOnInit() {
        this.auditService.loadAudits()
            .then(audits => this.audits = audits);
    }
}
import { Injectable } from "@angular/core";
import { Audit } from "../model/audit";

export var AUDITS:Audit[] = [
    {id: 1, name: "audit1", description: "1"},
    {id: 2, name: "audit2", description: "2"}
];

@Injectable()
export class AuditService {
    loadAudits() {
        return AUDITS;
    }
}

import { Injectable } from "@angular/core";
import { AuditDto } from "../model/audit";
import { Http, Response, Headers } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import '../service/base.service';

@Injectable()
export class AuditService {
    private LOAD_ALL_AUDITS_URL = '/rest/audits';
    private AUDIT_URL = '/rest/audit';
    private HEADERS = new Headers({'Content-Type': 'application/json'});

    constructor(private http: Http) {}

    loadAudits():Promise<AuditDto[]> {
        return this.http.get(this.LOAD_ALL_AUDITS_URL)
            .toPromise()
            .then(response => response.json())
            .catch(handleError);
    }

    /*addAudit(audit:AuditDto):Promise<AuditDto> {
        return this.http
            .post(this.AUDIT_URL, JSON.stringify(audit), {headers: this.HEADERS})
            .toPromise()
            .then(response => response.json())
            .catch(handleError);
    }*/
}

import { Injectable } from "@angular/core";
import { AuditDto } from "../model/audit";
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import '../service/base.service';

@Injectable()
export class AuditService {
    private auditsUrl = '/rest/audits';

    constructor(private http: Http) {}

    loadAudits():Promise<AuditDto[]> {
        return this.http.get(this.auditsUrl)
            .toPromise()
            .then(response => response.json())
            .catch(handleError);
    }
}

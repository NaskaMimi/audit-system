import { Injectable } from "@angular/core";
import { AuditDto } from "../model/audit";
import { Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';

@Injectable()
export class AuditService {
    private auditsUrl = 'rest/audits';

    constructor(private http: Http) { }

    loadAudits():Promise<AuditDto[]> {
        return this.http.get(this.auditsUrl)
            .toPromise()
            .then(response => response.json().data)
            .catch(this.handleError);
    }


    private handleError(error: any) {
        console.error('An error occurred', error);
        return Promise.reject(error.message || error);
    }
}

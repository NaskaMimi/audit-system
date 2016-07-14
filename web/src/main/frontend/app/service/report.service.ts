import { Injectable } from "@angular/core";
import { ReportDto } from "../model/report";
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import '../service/base.service';

@Injectable()
export class ReportService {
    private reportUrl = '/rest/reports';

    constructor(private http:Http) {}

    loadReports():Promise<ReportDto[]> {
        return this.http.get(this.reportUrl)
            .toPromise()
            .then(responce => responce.json())
            .catch(handleError);
    }
}
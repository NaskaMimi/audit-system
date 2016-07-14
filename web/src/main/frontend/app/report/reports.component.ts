import { Component, OnInit} from '@angular/core';
import { ReportDto}  from "../model/report";
import { ReportService } from "../service/report.service";

@Component({
    selector: 'reports',
    templateUrl: 'app/report/reports.component.html',
    providers: [ReportService]
})

export class ReportsComponent implements OnInit {
    reports:ReportDto[];
    reportDto:ReportDto;

    constructor(private reportService:ReportService) {}

    ngOnInit()
    {
        this.reportService.loadReports().then(reports => this.reports = reports);
    }
}
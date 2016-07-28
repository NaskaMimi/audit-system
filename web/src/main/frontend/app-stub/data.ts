import { AuditDto } from "../app/model/audit";
import { ReportDto } from "../app/model/report";

const AUDITS:AuditDto[] = [
    {id:1, name:'name_audit_1', description:'description1'},
    {id:2, name:'name_audit_2', description:'description2'},
    {id:3, name:'name_audit_3', description:'description2'},
    {id:4, name:'name_audit_4', description:'description4'}
];

const REPORTS:ReportDto[] = [
    {id:100, nameReport:'name_report_1', nameAudit:'name_audit_1', date:new Date()},
    {id:101, nameReport:'name_report_2', nameAudit:'name_audit_2', date:new Date()},
    {id:102, nameReport:'name_report_3', nameAudit:'name_audit_3', date:new Date()}
];
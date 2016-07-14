INSERT INTO RULES VALUES(nextval('rule_id_seq'), 'Rule1');
<!-- need order column hack -->
INSERT INTO AUDITS VALUES(nextval('audit_id_seq'), 'description1', 'name1');

INSERT INTO REPORTS VALUES(nextval('report_id_seq'), '2001-02-16', 'name_repotr_1', 1);
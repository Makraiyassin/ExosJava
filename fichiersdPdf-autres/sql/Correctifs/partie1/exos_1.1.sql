CREATE TABLE T_office(
    office_id INTEGER ,
    office_address VARCHAR(30),
    CONSTRAINT PK_office PRIMARY KEY (office_id)
);

CREATE TABLE T_course (
    crs_code CHAR(8),
    crs_name VARCHAR(30),
    CONSTRAINT UK_crs_name UNIQUE (crs_name)
);

CREATE TABLE T_Professor (
    prf_id INTEGER PRIMARY KEY,
    prf_name VARCHAR(30),
    prf_course INTEGER NULL ,
    office_id INTEGER NULL ,
    CONSTRAINT FK_professor_course FOREIGN KEY(prf_course) REFERENCES T_course(crs_code) ON DELETE SET NULL ON UPDATE CASCADE,
    CONSTRAINT FK_professor_office FOREIGN KEY(office_id ) REFERENCES T_office(office_id) ON DELETE SET NULL ON UPDATE CASCADE,
    CONSTRAINT UK_prf_name UNIQUE (prf_name)
);

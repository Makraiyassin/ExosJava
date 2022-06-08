CREATE TABLE T_MAINTENANCE_MTN(
	day CHAR(3) NOT NULL,
    machine VARCHAR(50) NOT NULL,
    num INT,
    speed INT,
    temp INT,
    hour TIME NOT NULL,
    eventName VARCHAR(500) NOT NULL,
    
    CONSTRAINT CK CHECK(speed >= 0),
    CONSTRAINT UK UNIQUE(num, machine),
    CONSTRAINT PK_num PRIMARY KEY(num)
);
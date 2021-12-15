SELECT * FROM SAMPLE s ;

DELETE sample;

INSERT INTO sample (deptNo, deptName, depLoc, depManager)
VALUES (50, '영업실', '부산', '가나다');

UPDATE SAMPLE SET DEPTNAME = 'IT부서' WHERE DEPTNO = 40;

DROP TABLE SAMPLE ;
--ROLLBACK;
--COMMIT;

-- not null
-- 기본 null 허용
CREATE TABLE null_test(
	col1	varchar2(20) NOT NULL ,
	col2 	varchar2(20) NULL,
	col3	varchar2(20)
);

INSERT INTO NULL_TEST (col1)
VALUES ('cc');

INSERT INTO NULL_TEST (col1, COL3)
VALUES ('cc', 'dd');

INSERT INTO NULL_TEST (col2, COL3)
VALUES ('cc', 'dd');

INSERT INTO NULL_TEST (col1, COL2)
VALUES ('aa', 'bb');


SELECT * FROM NULL_TEST nt ;

-----------------------------------------------------------
-- unique
CREATE TABLE unique_test(
	col1	varchar2(20) UNIQUE NOT NULL,
	col2	varchar2(20) UNIQUE ,
	col3 	varchar2(20) NOT NULL ,
	col4	varchar2(20) NOT NULL 	
);

INSERT INTO UNIQUE_TEST (col1, col2, COL3, COL4)
VALUES ('aa4', null, 'dd','ee');

INSERT INTO UNIQUE_TEST (col1, col2, COL3, COL4)
VALUES ('aa1', 'bb1', 'dd','ee');

INSERT INTO UNIQUE_TEST (col1, col2, COL3, COL4)
VALUES ('aa', 'bb', 'dd','ee');

SELECT * FROM unique_test;

---------------------------------------------------------------
-- unique 제약으로 들어가는 컬럼들은 그들의 조합이 유일해야 한다. 
-- 각 컬럼의 데이터의 유일함은 의미가 없고, 조합이 유일해야 한다.
CREATE TABLE unique_test2(
	col1	varchar2(20) ,
	col2	varchar2(20) ,
	CONSTRAINTS temp_unique unique(col1, col2)
	-- CONSTRAINTS 제약명 unique (컬럼1, 컬럼2)
);

SELECT * FROM unique_test2 
ORDER BY COL1,COL2 ;

INSERT INTO UNIQUE_TEST2 (col1, col2)
VALUES ('bb', 'aa');

SELECT * FROM JOB_HISTORY jh ORDER BY EMPLOYEE_ID ;

-- pk(unique + not null)
-- 그럼 여기도 'aa'-'aa' 이렇게 들어가있으면 
-- 'aa'-'bb'는 되도 'aa'-'aa' 는 pk때문에 안된다.

-- 만약 한명의 사원이 같은날 부서이동을 두번하면 JOB_HISTORY에 입력이 되지 않는다.
----------------------------------------------------

CREATE TABLE PRIMARY_test(
	student_id 	number(10) PRIMARY KEY,
	name		varchar2(20)
);

CREATE TABLE PRIMARY_test2(
	student_id 	number(10),
	name		varchar2(20),
	CONSTRAINTS student_pk PRIMARY KEY(student_id)
);
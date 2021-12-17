-- view
SELECT * FROM EMP_DETAILS_VIEW edv;

-- create view
CREATE VIEW v_emp(
	emp_id, first_name, job_id, hire_date, dept_id
) AS
SELECT 	EMPLOYEE_ID , FIRST_NAME , JOB_ID , HIRE_DATE , DEPARTMENT_ID 
FROM 	EMPLOYEES e 
WHERE 	JOB_ID = 'ST_CLERK'
;

-- Julia
SELECT * FROM v_emp WHERE EMP_ID = 125;
SELECT * FROM EMPLOYEES e  WHERE EMPLOYEE_ID = 125;

UPDATE V_EMP SET FIRST_NAME = 'Julia' WHERE EMP_ID = 125;

-- DROP 
DROP VIEW v_emp;


-- create view
-- 함수로 작성된 부분은 수정 불가
CREATE VIEW v_emp2(
	emp_id, first_name,last_name, job_id, hire_date, dept_id
) AS
SELECT 	EMPLOYEE_ID , NVL(FIRST_NAME, '')  , LAST_NAME , 
		JOB_ID , HIRE_DATE , DEPARTMENT_ID 
FROM 	EMPLOYEES e 
WHERE 	JOB_ID = 'ST_CLERK'
;

SELECT * FROM v_emp2;
-- Julia
SELECT * FROM v_emp2 WHERE EMP_ID = 125;
SELECT * FROM EMPLOYEES e  WHERE EMPLOYEE_ID = 125;

UPDATE V_EMP2 SET FIRST_NAME = 'test' WHERE EMP_ID = 125;

-- v_emp_salary
CREATE OR REPLACE VIEW v_emp_salary(
	emp_id, last_name, salary, total_sal
) AS 
SELECT 	EMPLOYEE_ID , LAST_NAME , SALARY ,
		(SALARY + (SALARY*NVL(COMMISSION_PCT,0)))*12
FROM 	EMPLOYEES e 
;

SELECT * FROM v_emp_salary;
DROP VIEW V_EMP_SALARY ;

-- read_only
CREATE VIEW v_emp_readonly(
	emp_id, last_name, total_sal
) AS
SELECT 	EMPLOYEE_ID , LAST_NAME  ,
		(SALARY + (SALARY*NVL(COMMISSION_PCT,0)))*12
FROM 	EMPLOYEES e
WITH READ ONLY
;

SELECT * FROM V_EMP_READONLY ;
UPDATE V_EMP_READONLY SET last_name = 'kjh' WHERE emp_id = 100;

-- Steven
SELECT * FROM EMP_DETAILS_VIEW edv WHERE EMPLOYEE_ID = 100;

UPDATE 	EMP_DETAILS_VIEW 
SET 	FIRST_NAME = 'kjh' 
WHERE 	EMPLOYEE_ID = 100;

-- view join
CREATE VIEW v_emp(
	emp_id, first_name, job_id, hire_date, dept_id, dept_name
) AS
SELECT 	e.EMPLOYEE_ID , e.FIRST_NAME , e.JOB_ID , e.HIRE_DATE , 
		e.DEPARTMENT_ID, d.department_name 
FROM 	EMPLOYEES e
	INNER JOIN DEPARTMENTs D 
	ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE 	JOB_ID = 'ST_CLERK'
;

SELECT * FROM v_emp;


SELECT 	e.EMPLOYEE_ID , e.FIRST_NAME , e.JOB_ID , e.HIRE_DATE , 
		e.DEPARTMENT_ID, d.department_name 
FROM 	EMPLOYEES e
	INNER JOIN DEPARTMENTs D 
	ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE 	JOB_ID = 'ST_CLERK'
;

------------------------------------------------------------------
-- sequence
CREATE SEQUENCE seq_serial_no
INCREMENT BY 1
START WITH 100
MAXVALUE 110
MINVALUE 99
CYCLE 
cache 2
;

CREATE TABLE good(
	good_no 	number(3),
	good_name	varchar2(10)
);

-- nextval ; 다음값
INSERT INTO GOOD 
VALUES (seq_serial_no.nextval, '제품1');

SELECT * FROM GOOD g WHERE GOOD_NO = 102;
DELETE FROM GOOD g; WHERE GOOD_NO = 102;
SELECT * FROM GOOD ORDER BY GOOD_NO ;


-- currval : 현재 값
INSERT INTO GOOD 
VALUES (seq_serial_no.currval, '제품19');

-- 현재 sequence 값 확인
SELECT seq_serial_no.currval FROM DUAL ;

-- sequence 삭제
DROP SEQUENCE  seq_serial_no;


-- sequence 초기화
ALTER SEQUENCE  seq_serial_no INCREMENT BY 1;

ALTER SEQUENCE  seq_serial_no INCREMENT BY -10; 

DROP SEQUENCE seq_serial_no;


-- index
CREATE TABLE EMPLOYEES3 AS SELECT * FROM EMPLOYEES e ;
SELECT 	rowid, EMPLOYEE_ID 
FROM 	EMPLOYEES3 e; 
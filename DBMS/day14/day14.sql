-- create employees4
CREATE TABLE EMPLOYEES4
AS SELECT * FROM EMPLOYEES e ;

SELECT * FROM EMPLOYEES4;

SELECT 	* 
FROM 	EMPLOYEES4 e
WHERE 	EMPLOYEE_ID = 200
;

INSERT INTO EMPLOYEES4 (employee_id, FIRST_NAME, LAST_NAME)
VALUES (200, 'Ismael', 'Chen');

-- unique index 생성
CREATE UNIQUE INDEX idx_employee4_id 
ON EMPLOYEES4(employee_id);

-- non-unique index 생성
CREATE INDEX idx_employee4_id 
ON EMPLOYEES4(employee_id);

-- index 삭제
DROP INDEX idx_employee4_id;

-- 중복 데이터 삭제
SELECT 	*
FROM 	EMPLOYEES4 e 
WHERE 	FIRST_NAME = 'Ismael'
AND 	LAST_NAME  = 'Chen'
;
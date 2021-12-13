-- DDL
-- CREATE 
CREATE TABLE EMPLOYEES2(
	employee_id 	number(10),
	name			varchar2(20),
	salary			number(7,2)
);

-- 컬럼추가, ALTER 
ALTER TABLE EMPLOYEES2 add(
	manager_id 		varchar2(10)
);

-- 컬럼수정
ALTER TABLE EMPLOYEES2 modify(
	manager_id 		varchar2(20)
);

-- 컬럼삭제
ALTER TABLE EMPLOYEES2 DROP COLUMN manager_i;

-- 테이블 삭제
DROP TABLE EMPLOYEES2 ;

-- 기존 테이블과 동일하게 작성
CREATE TABLE EMPLOYEES3
AS 
SELECT * FROM EMPLOYEES e 
;

SELECT 	* FROM EMPLOYEES2 e ;

-- 데이터 넣기
INSERT INTO EMPLOYEES2 values(1, '테스트', 3000);
SELECT 	* FROM EMPLOYEES2 e ;

-- 데이터 비워내기
TRUNCATE TABLE EMPLOYEES2 ;
SELECT 	* FROM EMPLOYEES2 e ;

SELECT * FROM EMPLOYEES3 e ;
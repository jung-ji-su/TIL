-- 1. dual
--  1-1. oracle에서 기본으로 제공하는 dummy table
--  1-2. 오라클 자체에서 제공되는 테이블
--  1-3. 간단하게 함수를 이용해서 계산 결과값을 확인 할 때 사용하는 테이블
--  1-4. dual테이블은 사용자가 함수(계산)를 실행할 때 임시로 사용하는데 적합
--  1-5. 함수에 대한 쓰임을 알고 싶을떄 특정 테이블을 생성할 필요 없이
--  dual 테이블을 이용하여 함수의 결과 값을 return 받을 수 있다.

-- 오름차순
SELECT 	FIRST_NAME ,
		LAST_NAME ,
		COMMISSION_PCT 
FROM 	EMPLOYEES e 
WHERE 	COMMISSION_PCT IS NOT NULL 
ORDER BY COMMISSION_PCT , FIRST_NAME 
;

-- 내림차순 : desc
SELECT 	FIRST_NAME ,
		LAST_NAME ,
		COMMISSION_PCT 
FROM 	EMPLOYEES e 
WHERE 	COMMISSION_PCT IS NOT NULL 
ORDER BY COMMISSION_PCT desc
;

-- sum() : 합계
SELECT 	sum(SALARY)
FROM 	EMPLOYEES e 
;

-- count() : 카운트
SELECT 	count(*)
FROM 	EMPLOYEES e 
;

SELECT 	COUNT(EMPLOYEE_ID)
FROM 	EMPLOYEES e 
;

SELECT 	COUNT(MANAGER_ID)
FROM 	EMPLOYEES e 
;

SELECT 	COUNT(COMMISSION_PCT)
FROM 	EMPLOYEES e 
;

SELECT 	COUNT(DISTINCT EMPLOYEE_ID)
FROM 	EMPLOYEES e 
;

SELECT 	COUNT(DISTINCT DEPARTMENT_ID)
FROM 	EMPLOYEES e 
;

SELECT 	count(DISTINCT DEPARTMENT_ID)
FROM 	EMPLOYEES e 
;

-- EMPLOYEES 테이블에서 first_name의 갯수와, first_name의 중복을 제거한 갯수 조회
-- 107, 91
SELECT 	count(FIRST_NAME) , 
		COUNT(DISTINCT FIRST_NAME) AS "dFirst_name",
		COUNT(DISTINCT FIRST_NAME) AS dFirst_name
FROM 	EMPLOYEES e 
;

SELECT 	*
FROM 	EMPLOYEES e 
WHERE 	MANAGER_ID IS NULL 
;

-- avg() : 평균
SELECT 	AVG(SALARY) 
FROM 	EMPLOYEES e 
;

-- EMPLOYEES테이블에서 department_id = 80인 부서의 급여 평균
-- 8,955.xxx
SELECT 	AVG(SALARY) 
FROM 	EMPLOYEES e
WHERE 	DEPARTMENT_ID = 80
;

-- max() : 최대값
SELECT 	MAX(SALARY) ,MIN(SALARY) 
FROM 	EMPLOYEES e 
;

-- min() : 최소값
SELECT 	MIN(SALARY) 
FROM 	EMPLOYEES e 
;

SELECT 	MAX(SALARY) ,SALARY
FROM 	EMPLOYEES e 
;

SELECT 	SALARY
FROM 	EMPLOYEES e 
;

SELECT 	sum(salary), 
		min(SALARY), 
		max(SALARY),
		count(*),
		count(MANAGER_ID)
FROM	EMPLOYEES e 
;

-- EMPLOYEES테이블에서 고용일자가 가장 높은사람과, 가장 낮은사람을 구하여라
SELECT 	max(HIRE_DATE), min(HIRE_DATE)
FROM 	EMPLOYEES e 
;

-- abs() : 절대값 리턴
SELECT 	abs(-23)
FROM	dual
;

SELECT 	abs(25)
FROM	dual
;

SELECT 	*
FROM 	dual
;

-- round() : 반올림 함수
SELECT 	ROUND(0.123), ROUND(0.543)
FROM	dual
;

SELECT 	ROUND(0.123), ROUND(3.543)
FROM	dual
;

SELECT 	AVG(SALARY), ROUND(AVG(SALARY)) 
FROM 	EMPLOYEES e 
;

-- trunc() : 잘라냄, 절삭
-- trunc(n1, n2) : n1을 소수점 이하 n2번째에서 잘라냄
SELECT 	TRUNC(1234.56789) 
FROM 	dual
;

SELECT 	TRUNC(1234.56789, 2) 
FROM 	dual
;

SELECT 	TRUNC(1234.56789, 0) 
FROM 	dual
;

SELECT 	TRUNC(1234.56789, -1) 
FROM 	dual
;

-- 1. 급여가 12000 이상되는 직원들의 last_name 및 급여을 급여 오름차순으로 조회한다.
-- 9건
SELECT 	SALARY ,
		LAST_NAME 
FROM 	EMPLOYEES e 
WHERE 	SALARY >= 12000
ORDER BY SALARY 
;



-- 2. 사원번호가 176인 사람의 last_name과 부서번호, 급여를 조회한다.
-- Taylor	80	8600
SELECT 	LAST_NAME ,
		DEPARTMENT_ID ,
		SALARY 
FROM 	EMPLOYEES e 
WHERE 	EMPLOYEE_ID = 176
;

-- 3. 급여가 5000에서 12000의 범위 이외의 사람들의 last_name 및 급여를 조회한다.
-- 57건
SELECT 	LAST_NAME ,
		SALARY 
FROM 	EMPLOYEES e 
WHERE 	NOT SALARY BETWEEN 5000 AND 12000
;

-- 4. 20번 및 50번 부서에서 근무하는 모든 사원들의 
-- last_name 및 부서번호를 last_name의 알파벳순(오름차순)으로 조회한다.
-- 47건
SELECT 	LAST_NAME ,
		DEPARTMENT_ID 	
FROM 	EMPLOYEES e 
WHERE 	DEPARTMENT_ID = 20
OR 		DEPARTMENT_ID = 50
ORDER BY LAST_NAME asc
;


-- 5. 20번 또는 50번 부서에 근무하며, 급여가 5000 ~ 12000사이인 사원들의
-- last_name 및 급여을 조회한다.
-- 6건
-- 정답
SELECT 	LAST_NAME,SALARY 
FROM 	EMPLOYEES 
WHERE 	SALARY BETWEEN 5000 AND 12000 
--AND 	(DEPARTMENT_ID=20 OR DEPARTMENT_ID=50)
AND 	DEPARTMENT_ID IN (20, 50)
ORDER BY LAST_NAME ASC;

----------------------------------------------
-- 1번
-- 7건
SELECT 	LAST_NAME,SALARY ,DEPARTMENT_ID
FROM 	EMPLOYEES 
WHERE 	DEPARTMENT_ID=20 
OR 		DEPARTMENT_ID=50
AND 	SALARY BETWEEN 5000 AND 12000 
ORDER BY LAST_NAME ASC;

----------------------------------------------
-- 2번
-- 46건
SELECT 	LAST_NAME,SALARY ,DEPARTMENT_ID
FROM 	EMPLOYEES 
WHERE 	SALARY BETWEEN 5000 AND 12000 
AND 	DEPARTMENT_ID=20 
OR 		DEPARTMENT_ID=50
ORDER BY LAST_NAME ASC
;

----------------------------------------------
--3번
--7건
SELECT 	LAST_NAME,SALARY ,DEPARTMENT_ID
FROM 	EMPLOYEES 
WHERE 	SALARY BETWEEN 5000 AND 12000 
AND 	DEPARTMENT_ID=50
OR 		DEPARTMENT_ID=20
ORDER BY LAST_NAME ASC
;

-- 6. last_name 첫 글자가 A인 사원들의 last_name을 조회한다.
-- 4건
SELECT 	LAST_NAME 
FROM 	EMPLOYEES e 
WHERE 	LAST_NAME LIKE 'A%'
;

-- 7. 매너저가 없는 사람들의 last_name, job_id, 사원번호를 
-- 사원번호 내림차순으로 조회한다.
-- 1건
SELECT 	LAST_NAME ,
		JOB_ID 
FROM 	EMPLOYEES e 
WHERE 	MANAGER_ID IS NULL 
ORDER BY EMPLOYEE_ID DESC 
;


-- 8. 커미션을 버는 모든 사원들의 last_name, 급여 및 커미션을 급여 역순으로 조회한다.
SELECT 	LAST_NAME ,
		SALARY ,
		COMMISSION_PCT 
FROM 	EMPLOYEES e 
WHERE 	COMMISSION_PCT IS NOT NULL 
ORDER BY SALARY DESC 
;
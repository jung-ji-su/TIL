SELECT  * FROM  EMPLOYEES e ;

-- concat(char1, char2), || : 문자열의 연결
SELECT 	CONCAT('Hello','bye'), CONCAT('good','bad') 
FROM 	dual 
;

SELECT  CONCAT('good','bad') concats, 
		'good' || 'bad' operators
FROM dual
;

-- INITCAP(char) : 첫 글자를 대문자로
SELECT 	INITCAP('good morning')
FROM	dual
;

SELECT 	INITCAP('GOOD MORNING')
FROM	dual
;

-- 대/소문자
-- lower(char), upper(char)
SELECT 	LOWER('GOOD'),	UPPER('good') 
FROM	dual
;


-- LPAD(값, 총 문자길이, 채움문자)
SELECT 	LPAD('good',6) "LPAD1",
		LPAD('good', 7, '#') "LPAD2",
		LPAD('good', 8, 'L')  "LPAD3"
FROM	dual
;

-- RPAD(값, 총 문자길이, 채움문자)
SELECT 	RPAD('good', 6) "RPAD1",
		RPAD('good', 7, '#') "RPAD2",
		RPAD('good', 8, 'L') "RPAD3"
FROM	dual
;

-- LTRIM(문자열, 옵션) : 문자열을 옵션만큼 왼쪽에서 제거
SELECT 	LTRIM('goodbye','g'),
		LTRIM('goodbye','o'),
		LTRIM('goodbye','go'),
		LTRIM('goooooodbye','god'),
		LTRIM('goooooodbye','gdo'),
		LTRIM('goooooodbye','do')
FROM	dual
;

-- RTRIM(문자열, 옵션) : 문자열을 옵션만큼 오른쪽에서 제거
SELECT 	RTRIM('goodbye','e'),
		RTRIM('goodbye','i')
FROM	dual
;

SELECT
	RTRIM('goodbye', 'e'),
	RTRIM('goodbye', 'bye'),
	RTRIM('goodbye', 'eybdo'),
	RTRIM('goodbye', 'ybdo'),
	RTRIM('goodbye', 'ybedo'),
	RTRIM('goodbye', 'eb')
FROM	dual
;

SELECT  RTRIM('goodbye', 'deb'),
        RTRIM('goodbye', 'goode')
FROM    dual
;


-- substr('문자열','시작위치','길이')
SELECT 	SUBSTR('good morning john',1,4)
FROM	dual
;

SELECT 	SUBSTR('good morning john',8,4)
FROM	dual
;

SELECT 	SUBSTR('good morning john',8)
FROM	dual
;

SELECT 	SUBSTR('good morning john',-4)
FROM	dual
;

-- replace(char, src_str, rep_str) : 문자열 일부를 대체
SELECT 	REPLACE('good morning tom', 'morning', 'evening' )
FROM	dual
;

SELECT 	replace('You are not alone', 'You', 'We')
FROM	dual
;

-- translate('문자열', '대상문자', '변환문자') : 1대1 대응
SELECT 	TRANSLATE('You are not alone uuuuuu', 'You', 'Wei'),
		TRANSLATE('You are not alone uuooYY', 'You', 'Wei'),
		TRANSLATE('You are not alone uuuu', 'You', 'We')
FROM 	dual
;

-- sysdate
-- 현재 서버의 시간
SELECT 	SYSDATE FROM dual;

-- add_months()
-- 7개월 후
SELECT 	ADD_MONTHS(SYSDATE, 7) FROM dual; 

-- 현재달의 마지막 날짜 : last_day
SELECT 	LAST_DAY(SYSDATE) FROM dual; 


SELECT 	SYSDATE + (INTERVAL '1' YEAR),
		SYSDATE + (INTERVAL '1' MONTH),
		SYSDATE + (INTERVAL '1' DAY),
		SYSDATE + (INTERVAL '1' HOUR),
		SYSDATE + (INTERVAL '1' MINUTE),
		SYSDATE + (INTERVAL '1' SECOND),
		SYSDATE 
FROM	dual
;

-- to_char() : 문자열 변환
SELECT 	SYSDATE,
		TO_CHAR(SYSDATE, 'yyyy/mm/dd'),
		TO_CHAR(SYSDATE, 'yyyy-mm-dd'),
		TO_CHAR(SYSDATE, 'yyyymmdd'),
		TO_CHAR(SYSDATE, 'yyyy-mm-dd HH24:MI:SS'),
		TO_CHAR(SYSDATE, 'yyyy-mm-dd HH12:MI:SS')
FROM	dual
;

-- nvl() : 널값을 다른 데이터로 변경하는 함수
SELECT * FROM EMPLOYEES e ;
SELECT 	FIRST_NAME , LAST_NAME ,
		COMMISSION_PCT ,
		NVL(COMMISSION_PCT, 0) commition 
FROM 	EMPLOYEES e ;


-- decode() : switch 문 역할을 하는 함수
SELECT * FROM DEPARTMENTS d ;
SELECT * FROM JOBS j ;

SELECT 	DEPARTMENT_ID ,
		DECODE(DEPARTMENT_ID, 20, 'MA', 60, 'IT', 90,'EX', 'ETC') 
FROM 	EMPLOYEES e ; 
# SQL

#### 1. SQL

1-1. SQL 기능에 따른 분류

    - 데이터 정의어(DDL)
    -> 테이블이나 관계의 구조를 생성하는데 사용하며
    create, alter, drop문 등이 있다.

    - 데이터 조작어(DML)
    -> 테이블에 데이터를 검색, 삽입, 수정, 삭제 하는데
    사용하며 select, insert, delete, update 문 등이
    있다. 

    - 데이터 제어어(DCL)
    -> 데이터의 사용 권한을 관리하는데 사용하며
    grant, revoke문 등이 있다. 

  1-2. 데이터 조작어 - 검색

    - SELECT 

    SELECT 	컬럼명1, 컬럼명2, ....
    FROM	테이블명
    WHERE	조건
    OR	조건
    AND	조건
    ;

    SELECT 	EMPLOYEE_ID, LAST_NAME
    FROM	EMPLOYEES
    WHERE	LAST_NAME = 'ostin'
    ;
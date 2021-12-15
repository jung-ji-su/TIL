# commit & rollback & primary key

#### 1. COMMIT
    - 모든 작업을 정상적으로 처리하겠다고 확정하는 명령어이다.
    - 트랜젝션의 처리 과정을 데이터베이스에 반영하기 위해서, 변경된 
    내용을 모두 영구 저장한다.
    - COMMIT을 수행하면, 하나의 트랜젝션 과정을 종료하게 된다.
    - 트랜젝션(insert, update, delete) 작업 내용을 실제 DB에 
    저장한다.
    - 이전 데이터가 완전히 UPDATE된다.
    - 모든 사용자가 변경한 데이터의 결과를 볼 수 있다.
 
#### 2. ROLLBACK
    - 작업 중 문제가 발생했을 때, 트랜젝션의 처리 과정에서 발생한 변경 사항을 취소하고,
    트랜젝션 과정을 종료시킨다.
    - 트랜젝션으로 인한 하나의 묶음 처리가 시작되기 이전의 상태로 되돌린다.
    - 트랜젝션(insert, update, delete)작업 내용을 취소한다.
    - 이전 commit한 곳까지만 복구 한다.
    - 트랜젝션 작업 중 하나라도 문제가 발생하면, 모든 작업을 취소해야 하기 때문에 하나의
    논리 적인 단위로 구성해 놓아야 한다.
    - 문제가 발생하면, 논리적인 작업의 단위를 모두 취소해 버리면 되기 때문이다.

#### 3. Commit과 Rollback 명령어의 장점
    - 데이터 무결성을 지킬수 있다.
    - 영구적으로 변경하기 전에 데이터의 변경사항을 확인할 수 있다.
    - 논리적으로 연관된 작업을 그룹화 할 수 있다.

#### 4. 자동 rollback되는 경우
    - 비정상적인 종료

#### 5. 자동 commit 되는 경우
    - DDL문(create, alter, drop, truncate)
    - DCL문(grant, revoke) 사용권한
    - insert, update, delete 작업 후 commit하지 않고 오라클 정상 종료시에
    commit 명령어 입력하지 않아도 정상 commit 후 오라클 종료

#### 6. 컬럼속성(무결성 제약조건)
    - not null : 널값이 입력되지 못하게 하는 조건
    - unique : 중복된 값이 입력되지 못하게 하는 조건
    - primary key : not null + unique (+ index)의 의미
    - foreign key : 다른 테이블의 필드(컬럼)를 참조해서 무결성을 검사하는 조건

    6-1. primary key 
    - 기본키 역시 기본적인 제약조건들은 테이블을 생성할때 같이 정의한다.
    - 테이블당 하나만 정의 가능하다.
    (두개 이상의 pk는 조합키/복합키 라고 불립니다. 묶어서 하나로 본다)
    - pk는 not null + unique + index 의 기능을 가지고 있다.
    - 기본키/식별자/주키/pk 등으로 불리고 있다.
    - 자동 index가 생성되는데 이는 검색 키로서 검색 속도를 향상시킨다.

    6-2. 기본키(primary key)선언방법

    create table pkTest(
        col1	varchar2(20) primary key
    );

    1. 컬럼명 옆에 주키를 선언
    --------------------------------------------------------------
    create table pkTest(
        col1	varchar2(20) constraints con_pk primary key
        
    );

    2. 해당컬럼에 constraints [제약조건명] primary key
    --------------------------------------------------------------
    create table pkTest(
        col1	varchar2(20),
        col2	varchar2(20),
        constraints con_pk primary key(col1,col2)
    );
    3. constraints con_pk primary key(col1,col2, ..)
    --------------------------------------------------------------
    create table pkTest(
        col1	varchar2(20),
        col2	varchar2(20)
    );
    alter table pkTest add constraints con_pk primary key(컬럼명);

    4. alter table [테이블명] add constraints [제약조건명] primary key(컬럼명);
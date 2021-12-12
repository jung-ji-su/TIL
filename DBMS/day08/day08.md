# join & subQuery

### 1. join
    1-1. full outer join
    - 양쪽 테이블 모두가 기준이 된다.
    - 조인 조건에 부합하는 데이터가 조인 당하는 테이블(양쪽)에 있으면
    해당 데이터를, 부재하면 NULL로 select가 된다.

### 2. 서브쿼리(subQuery)란?
    - Main Query에 반대되는 개념으로 이름을 붙인 것
    - 메인쿼리를 구성하는 소단위 쿼리
    - select, insert, delete, update 절에서 모두 사용 가능
    - 서브쿼리의 결과 집합을 메인 쿼리가 중간 결과값으로 사용
    - 서브 쿼리 자체는 일반 쿼리와 다를 바가 없다.
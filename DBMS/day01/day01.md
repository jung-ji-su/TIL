# What is "DBMS"?

#### 1. DBMS

1-1. 데이터베이스 개요

      - 자료(Data)
      -> 현실 세계에서 관찰이나 측정을 통해 수집한 단순한 
      사실이나 값
      - 정보(Information)
      -> 의사 결정에 도움을 줄 수 있는 유용한 형태
      -> 자료를 가공(처리)해서 얻을 수 있는 결과를 의미
      - 데이터베이스
      -> 어느 한 조직체의 여러 응용 시스템들이 공동으로 사용할 수 
      있도록 통합하여 저장한 운영데이터의 집합.
      -> 공동의 목적을 지원하기 위한 서로 관련된 자료들의 모임
      -> 주제와 관련된 의미 있는 데이터들의 모음

  1-2. DBMS(DataBase Management System)

      - 사용자에게 데이터베이스를 생성하고 유지할 수 있게 하는 프로그램 집합
      - DBMS는 데이터베이스 언어를 가지고 있으며 이를 통해 데이터의
      삽입/삭제/수정을 할 수 있다.
      - Oracle, maria, mysql, Django, postgresql, tibero, 
      sqlite, h2, db2,SQL Server

  1-3. DBMS의 기능

      - 데이터의 무결성 유지
      -> DB의 데이터는 실세계를 적용하여 규칙을 항상 만족해야 함.
      -> 서로 다른 부분에 있는 두개의 데이터가 서로 모순되지 않아야 함.
      데이터의 일관성 유지 

  1-4. DBMS의 3가지 특성

      1. 데이터의 논리적 독립성
      -> 한 속성에 가해진 변경이 동일한 테이블에서 다른 속성에 영향을 주지 
      않는 것을 의미.
      -> 응용프로그램에 영향을 주지 않고 데이터 구조를 변경할 수 있게 하는 것

      2. 참조 무결성과 데이터 무결성
      -> 응용프로그램 개발 시 무결성 제약 조건을 신경쓰지 않아도 된다.

      3. 비정규 질의
      -> 사용자는 작업을 실행하는 방법을 명시하지 않고도, 데이터베이스에게
      어떤 데이터를 조회할 것인지를 명령할 수 있다.

  1-5. 데이터베이스 모델의 종류

      - 계층데이터 모델
      -> 데이터를 저장하는 단위(Entity)의 구조가 상하 종속적인 관계로 구성
      -> 개체를 노드로 표현하고 개체 집합들 사이의 관계를 링크로 연결한
      트리(tree)형태의 자료구조

      - 망 데이터 모델
      -> 그래프를 이용해서 데이터 논리구조를 표현한 데이터 모델
      -> 상위와 하위 레코드 사이에서 다대다(N:M) 대응관계를 만족하는 구조

      - 관계 데이터 모델(Relational Data Model)
      -> 개체 집합에 대한 속성 관계를 표현하기 위하여 개체를 테이블(table)로
      사용하고 개체 집합들 사이의 관계는 공통 속성으로 연결하는 독립된
      형태의 데이터 모델

  1-6. 관계형 모델의 구성요소

      - 관계형 데이터 모델의 용어
      -> 테이블(table)
      -> 열(column)
      -> 행(row)
      - 관계 데이터베이스에 데이터를 저장할 수 있는 형식 테이블(Table=Relation)
      (릴레이션보다는 테이블이란 용어를 사용)
      - 행과 열의 교차점은 원자 값이라는 오직 하나의 값으로만 구성
      - 테이블에서 행은 순서가 정해져 있지 않다.
      - 테이블의 내용은 실제적인 행의 집합으로 간주된다.

  1-7. SQL

      - SQL(Structured Query Language)은 관계형 데이터베이스 언어이다.
      - 데이터의 삽입, 삭제, 갱신, 질의, 보호(보안)명령문으로 구성
      - SQL은 관계 데이터베이스 언어로써 비절차적 데이터베이스 언어로 분류한다.
      - oracle XE 11g R2
      - username : system
      - pw : 1234
      - cmd -> sqlplus -> system -> 1234

      Connected to:
      Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production
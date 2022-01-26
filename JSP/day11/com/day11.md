
## 1. DTO(Data Transfer Object)/VO(Value Object)
    - 양쪽으로 전송되어 오고가는 데이터들을 담은 객체, jsp에서는 bean이라고 부른다.
    - 여러 데이터들을 포장해서 만든 데이터 포장 객체
    - 사용자가 입력한 값을 객체 형태로 받을 수 있게 클래스 구성
    - 폼에서 입력된 데이터들은 하나의 DTO객체로 변환 가능
    - 하나의 테이블에 저장될 데이터 50개이면 DTO 객체도 50개
    - 하나의 테이블은 빈즈 클래스 객체 하나로 매핑 
    - 데이터가 포함된 객체를 한 시스템에서 다른 시스템으로 전달하는 작업을 처리하는 객체

## 2. DAO(Data Access Object)
    - 데이터에 접근, 데이터를 관리하기 위한 객체 데이터들을 관리(추가,수정,삭제,읽기)하는
    여러 메소드들이 정의되어 있다.
    - insert, delete, update, select 등 레코드 처리를 주 목적으로 한다.
    - DTO객체를 데이터베이스 서버에 저장
    - 데이터베이스 서버로부터 레코드를 select한 후, DTO 객체로 변경해서 가져옴
    - SQL을 직접 실행하는 기능을 가짐
    - 데이터 접근을 목적으로 하는 객체
    - DB를 사용해 데이터를 조회하거나 조작하는 기능을 전담하도록 만든 오브젝트

## 3. Database
    - 실행창 : window + r
    - 계정생성 : create user jsp identified by jsp;
    - 권한 : grant connect, resource to jsp;
        
    3-1. ojdbc란
    - jdbc란?
    -> Java DataBase Connectivity
    -> java에서 데이터베이스에 접속/관리할 수 있게 해주는 라이브러리
    -> 자바로 작성된 프로그램으로 DB와 관련된 작업처리를 할 수 있도록 제공되는
    기능(코드)들을 모아놓은 것

    - ojdbc란?
    -> Oracle에서 제공하는 오라클 DB를 관리할 수 있도록 도와주는 jdbc이다.


## 1. resultset
    - select 쿼리 실행시 executeQeury() 메서드를 사용하며, 실행 결과로 
    java.sql.ResultSet형으로 리턴한다.
    - next() : 다음행으로 커서를 이동(다음행이 없으면 false를 리턴)
    - get...(int columnindex) : columnindex번째 컬럼의 값을 
            ... 타입으로 가져온다
    - get...(String columnName) : columnName 컬럼의 값을 ... 타입으로 가져온다.

## 2. 자바빈즈 태그
    - UserBean
    - 객체 생성
    java : UserBean user = new UserBean();
    jsp : <jsp:userBean class="패키지명.UserBean" id="user">

    - setter()
    java : user.setName("자바학생");
    jsp : <jsp:setProperty name="user" property="name" value="자바학생">

    - getter()
    java : user.getName();
    jsp : <jsp:getProperty name="user" property="name">
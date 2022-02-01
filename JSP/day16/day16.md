
## 1. MyBatis(모델과 DB의 매개체)
    - 객체 지향 언어인 자바의 관계형 데이터베이스 프로그래밍을 좀 더 쉽게 할 수 
    있게 도와주는 개발 프레임 워크로서 JDBC를 통해 데이터베이스에 엑세스하는
    작업을 캡슐화하고 일반 SQL쿼리, 저장 프로시저 및 고급 매핑을 지원하며 모든
    JDBC 코드 및 매개 변수의 중복 작업을 제거합니다. 
    - Mybatis에서는 프로그램에 있는 SQL 쿼리들을 한 구성파일에 구성하여
    프로그램코드와 SQL을 분리할 수 있는 장점을 가지고 있습니다. 
    - Mybatis는 기존 JDBC방식과 달리 SQL문을 XML파일에 작성함으로써 코드가
    줄어들고 SQL문만 따로 관리하기 때문에 수정이 편해진다.
    - 또한 DBCP를 사용하여 커넥션을 여러개 생성하기 때문에 JDBC만 
    사용하는 것보다 효율과 가독성이 좋다.

    1-1. 다운로드
    blog.mybatis.org/p/products.html

    1-2. MyBatis 흐름도
    - 응용 프로그램 시작시 수행되는 프로세스
    (1). 응용 프로그램이 SqlSeesionFactoryBuilder를 위해
    SqlSessionFactory를 빌드하도록 요청한다.
    (2). SqlSessionFactoryBuilder는 SqlSessionFactory를 생성하기
    위한 MyBatis 구성 파일을 읽습니다.
    (3). SqlSessionFactoryBuilder는 MyBatis구성 파일의 정의에 따라
    SqlSessionFactory를 생성한다

    - 클라이언트 각 요청에 대해 수행되는 프로세스
    (4). 클라이언트가 응용 프로그램에 대한 프로세스를 요청한다.
    (5). 응용 프로그램은 SqlSessionFactoryBuilder를 사용하여 빌드된 SqlSessionFactory
    에서 SqlSession을 가져옵니다.
    (6). SqlSessionFactory는 SqlSession을 생성하고 이를 애플리케이션에 반환한다.
    (7). 응용 프로그램이 SqlSession에서 매퍼 인터페이스의 구현 개체를 가져옵니다.
    (8). 응용 프로그램이 매퍼 인터페이스 메서드를 호출한다
    (9). 매퍼 인터페이스의 구현 개체가 SqlSession 메서드를 호출하고 SQL실행을 요청한다.
    (10). SqlSession 매핑 파일에서 실행할 SQL을 가져와서 SQL을 실행한다.

    1-3. Mybatis 결과 값
    - select : select문에 해당하는 결과
    - insert : 1
    - update : update가 된 행의 갯수(없으면 0)
    - delete : delete된 행의 갯수(없으면0)

## 2. JSTL(JSP Standard Tab Library)
    - 연산이나 조건문, 반복문을 편하게 처리할 수 있으며, JSP 페이지 내에서 자바코드를 
    사용하지 않고도 로직을 구현할 수 있도록 효율적인 방법을 제공한다.

    자바
    for(초기식; 조건식; 증감식){}
    ->
    JSTL
    <c:forEach></c:forEach>

    2-1. lib
    - archive.apache.org/dist/jakarta/taglibs/standard/binaries/

    2-2. jstl core 태그
    <c:set />
    : 변수를 만들때 사용
    <c:out> </c:out>
    : 값을 출력할때 쓴다.(EL문을 좀 더 많이 쓴다)
    <c:if> </c:if>
    : 조건 제어(if문)
    <c:choose> </c:choose>
    : 조건 제어(switch문)
    내부에 c:when, c:otherwise만 있어야 한다.
    <c:when> </c:when>
    : 조건 제어(case문)
    <c:otherwise> </c:otherwise>
    : 조건 제어(default)
    <c:forEach> </c:forEach>
    : 반복 제어(for문)
## 1. 빌드 툴(Maven/Gradle)

    - Maven과 Gradle은 프로젝트에 필요한 의존성을 관리하고 빌드 라이프사이클을 
    관리해주는 툴이다.
    - 과거에는 Maven을, 최근에는 Gradle을 사용하는 추세이다.

## 2. Spring Boot : 버전선택

    - SNAPSHOT이 붙은 것은 현재 개발중인 버전
    - M(Minor)은 정식 릴리즈 되지 않은 버전
    - 아무것도 붙어있지 않은 것이 정식 릴리즈된 버전이다.

## 3. 설정파일

    - application.properties

## 4. @SpringBootApplication

    - @SpringBootApplication이라는 어노테이션으로 인해 스프링 부트의 자동 설정
    읽기와 생성이 모두 자동으로 설정된다.
    - ComponentScan + configuration + EnableAutoConfiguration 이 합친
    어노테이션이라고 볼 수 있다.

## 5. @Controller

    - Controller의 역할을 하는 Class에다가 꼭 붙여준다. 
    - Controller에서 mapping url을 찾는다.

## 6. @GetMapping 

    - get 방식의 요청
    - 파라미터 MVC중에서 Model을 받아온다.
    - return "helloview"; -> helloview라는 화면을 return 해준다

## 7. 컨트롤러 return 값

    - 컨트롤러 리턴 값으로 문자를 반환하면 뷰 리졸버(viewResolver)가 화면을 찾아서 
    처리한다. 
    - 스프링 부트 템플릿엔진 기본 viewName 매핑
    - resources:templates/ + {viewname} + .html

## 8. DispatcherServlet

    - 스프링 MVC도 프론트 컨트롤러 패턴으로 구현되어 있다. 
    - 스프링 MVC의 프론트 컨트롤러가 바로 디스패처 서블릿이다.
    - DispatcherServlet -> FrameworkServlet -> HttpServletBean -> httpServlet
    - 즉, DispatcherServlet도 부모 클래스에서 httpServlet을 상속 받아서 사용하고,
    서블릿으로 동작한다.

    8-1. 
    5) ModelAndView 반환 : 핸들러 어댑터는 핸들러가 반환하는 정보를 ModelAndView로
    변환해서 반환한다.
    6) viewResolver 호출 : 뷰 리졸버를 찾고 실행한다.
    7) View 반환 : 뷰 리졸버는 뷰의 논리이름을 물리이름으로 바꾸고, 렌더링 역할을 
    담당하는 뷰 객체를 반환한다
    8) 뷰 렌더링 : 뷰를 통해서 뷰를 렌더링 한다.
 
## ** 빌드(Build)란?

    - 소스 코드 파일을 컴퓨터에서 실행할 수 있는 독립적인 형태로 변환하는 과정과 그 
    결과를 말한다.
    - 예를들어 java프로젝트를 진행한다면 개발자가 작성한 A.java와 여러가지 정적 파일에
    해당하는 resource가 존재한다. 
    빌드를 한다면 소스코드를 컴파일해서 A.java -> A.class로 변환하고, resource를
    .class에서 참조할 수 있는 적절한 위치로 옮기고 META-INF와 MANIFEST.MF 들을
    하나로 압축하는 과정을 의미한다.
    - 컴파일은 빌드의 부분집합이라고하고, 빌드 과정을 도와주는 도구를 Build Tool 이라고
    한다. 
    - 즉, 컴파일된 코드를 실제 실행할 수 있는 상태로 만드는 일을 Build 라는 개념으로
    생각하면 된다.

## ** 컴파일이란

    - 컴퓨터가 이해할 수 있는 언어로 바꾸어주는 과정을 말하며, java의 경우 컴파일의 결과로
    자바 가상머신(JVM)에서 실행가능한 "*.class"파일이 생깁니다.컴파일을 빌드와 같다고
    생각할 수 있지만, 컴파일은 빌드를 진행하는 과정의 일종인 하나의 task(잡, job)입니다.
    - 즉, 소스코드를 컴퓨터가 이해할 수 있는 기계어로 변환하는 작업을 말한다.

## ** 빌드 툴(Build Tool)

    - 빌드에서는 컴파일, 테스트, 배포 등 과정이 포함될 수 있고, 빌드 과정을 도와주는
    도구를 빌드 툴이라고 합니다. 
    - 일반적으로 빌드 툴이 제공해주는 기능은 전처리(preprocessing),
    컴파일(compile), 패키징(packaging), 테스팅(testing), 배포(distribution)
    이 있다.
    - 빌드 툴로는 Ant, Maven, Gradle 등이 있다.

## ** 정리

    - Build = compile + 그 외 작업
    - Run = Build + 실행
        = (compile + 그 외 작업) + 실행
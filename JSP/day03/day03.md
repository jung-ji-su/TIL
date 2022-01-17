
### 1. 명령어
    taskkill /f /pid 14540
    netstat -nao | findstr 8080

### 2. 서블릿(Servlet)
    - 클라이언트의 요청을 처리하고, 그 결과를 반환하는 Servlet 클래스의 구현 규칙을
    지킨 자바 웹 프로그래밍 기술
    - 자바를 사용하여 웹을 만들기 위해 필요한 기술이다. 클라이언트가 어떠한 요청을 하면
    그에 대한 결과를 다시 전송해주어야 하는데, 이러한 역할을 하는 자바 프로그램이다.
    - 요청순서
    -> 사용자(클라이언트)가 URL을 입력하면 HTTP Requeset가 SerlvetContainer로
    전송합니다. 
    -> 요청을 전송받은 Servlet Container는 	HTTPServletRequest,HTTPServletResponse 객체를 생성한다. 
    -> web.xml을 기반으로 사용자가 요청한 URL이 어느 서블릿에 대한 요청인지를 찾는다. 
    -> 해당 서블릿의 service 메소드를 호출한다.
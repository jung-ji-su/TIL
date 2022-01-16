### 1. WAS(Tomcat)설치
    - 명령어
    netstat -nao | findstr 8080
    taskkill /f /pid [pid번호]
    - 확인
    http://localhost:8080/
    http://127.0.0.1:8080/

### 2. web-was 서버 차이
    2-1. Web 서버
    - WEB 서버는 정적인 자료를 처리하는 서버입니다.
    - html, css, image등 내용이 변하지 않는 정적인 파일들을 만들어
    줍니다. 서버에 정적인 모든 파일을 저장하고 클라이언트에서 요청이
    생길 때마다 서버에 저장된 파일을 내려주기 때문에 서버 자원의 한계가 
    생기고 리소스를 많이 차지하게 되는 단점이 있습니다. 이를 해결하기
    위해 동적으로 파일을 처리하는 WAS 서버입니다.

    2-2. WAS 서버
    - WAS 서버는 동적인 자료를 처리하는 서버입니다.
    - 요청이 올 때마다 페이지에 필요한 정보를 그때그때 생성하므로
    서버의 리소스의 부하를 줄일 수 있습니다.

    - Apache Server 라 함은 WEB 역할을 하는 서버의 이름
    - Tomcat Server 라 함은 WAS 역할을 하는 서버의 이름
    - Apache Tomcat Server는 WEB + WAS 서버라 칭할 수 있다.
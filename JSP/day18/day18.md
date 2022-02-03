
## 1. 프론트 컨트롤러
    - 프론트 컨트롤러 도입 전에는 각 컨트롤러 마다 공통 로직을 항상 
    다시 작성했어야했다.
    - 프론트 컨트롤러가 도입된 이후부터는 공통의 로직을 관리하는 서블릿을
    만들어 처리하도록 했다.

    1-1. 특징
    - 프론트 컨트롤러 서블릿 하나로 클라이언트의 요청을 받는다.
    - 프론트 컨트롤러가 클라이언트 요청에 맞는 컨트롤러를 찾아 호출해준다.
    - 컨트롤러에 대한 공통 로직에 대한 처리가 가능하다.
    - 프론트 컨트롤러를 제외한 나머지 컨트롤러는 서블릿을 사용하지 않아도 된다.

## 2. 경로
    - 절대경로
    / 	: 루트(root)
    ./	: 현재 위치
    ../	: 현재 위치의 상단 폴더

    - http://localhost:8080/project01/abc.jsp
    -> ${pageContext.request.contextPath}
    : /project01
    : 알아서 위치를 맞춰준다.
    예를들어서 ../resource/img/cat01.png , 
    ./resource/img/cat01.png 이 경로를 알아서 맞춰준다.

    -> ${pageContext.request.requestURL}
    : http://localhost:8080/project01/abc.jsp

    -> ${pageContext.request.schema}
    : http

    -> ${pageContext.request.serverName}
    : localhost

    -> ${pageContext.request.serverPort}
    : 8080

    -> ${pageContext.request.requestURI}
    : /project01/abc.jsp

    -> ${pageContext.request.servletPath}
    : /abc.jsp

    3. redirect
    -> 이전의 값이 남아있지 않도록 하기 위해 사용
    -> 결제 페이지 => 새로고침 => 결제 페이지

    4. forward
    -> 이전 값이 남아있도록 하기 위해 사용
    -> 검색 => 검색에 대한 결과가 남아있도록
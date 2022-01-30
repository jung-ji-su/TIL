
## 1. Ajax(Asynchronous javascript and xml) - 비동기적 통신
    - Ajax는 웹 페이지 전체를 다시 로딩하지 않고도, 웹 페이지의 일부분만을
    갱신할 수 있고 백그라운드 영역에서 서버와 통신하여 그 결과를 웹 페이지의
    일부분에만 표시할 수 있다. 
    - 이 때 서버와 데이터를 주고 받을 수 있는데 대표적인 데이터는 JSON, XML,
    HTML, 텍스트 파일등이있다.

    1-1. ajax 장점
    - 웹 페이지 전체를 다시 로딩하지 않고도 웹 페이지 일부분만을 갱신 할 수 있다.
    - 웹 페이지가 로드 된 후에 서버로 데이터 요청을 보내거나 받을 수 있다.

    1-2. ajax의 단점
    - 반복적인 데이터 요청이 있으면 느려지거나 작동하지 않게 된다.

    1-3. ajax 통신
    - XMLHttpRequest 객체
    -> Ajax의 가장 핵심적인 구성 요소는 바로 XMLHttpRequest 객체이다
    -> 이 객체는 웹 브라우저가 서버와 데이터를 교환할 때 사용한다.
    -> 웹 브라우저가 백그라운드에서 서버와 계속해서 통신할 수 있는 것은
    바로 이 객체를 사용하기 때문이다. 
    -> Ajax는 우리가 직접 객체 생성 후 서버와 통신을 요청

    1-4. Request
    - XMLHttpRequest 객체 생성
    -> let xhr = new XMLHttpRequest();

    - open()
    -> 서버로 보낼 ajax 요청의 형식을 결정
    -> open(전달방식, url 주소, 동기여부)
    -> 전달방식 : get, post 방식 중 하나 선택
    -> url 주소 : 요청을 처리할 서버의 파일 주소 전달
    -> 동기 여부 : 요청을 동기식으로 전달할지, 비동기식으로 전달할지 선택
    (비동기 :  true, 기본값 / 동기 : false)

    - send()
    -> 작성된 ajax 요청을 서버로 전달

    1-5. response
    - readyState  : XMLHttpRequest 통신 완료 여부
    1. UNSENT : XMLHttpRequest 객체가 생성됨
    2. OPENED : open() 메서드가 성곡적으로 실행됨
    3. HEADERS_RECEIVED : 모든 요청에 대한 응답이 도착함
    4. LOADING : 요청한 데이터를 처리 중
    5. DONE : 요청한 데이터의 처리가 완료되어 응답할 준비가 완료됨.
    - state : http 통신 상태값(1XX, 2XX, ..., 5XX)
    - onreadystatechange 프로퍼티
    -> XMLHttpRequest 객체의 readyState 값이 변할 때마다 자동으로 호출되는 함수

    1-6. json
    - 경량화된 데이터 교환 형식
    - 서로 다른 언어들 간 데이터를 주고받을 수 있도록 만들어진 텍스트 기반의 형식
    - 프로그래밍 언어가 아닌 데이터 표기 방법 중 하나이고 기본적으로 key:value 형식의
    구조를 가지고 있다.
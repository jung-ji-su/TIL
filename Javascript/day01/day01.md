
### 1. HTML Layout Elements
    - <header> : 문서의 서론이나 섹션의 목차, 검색, 로고등이 들어가는 곳이다.
    - <nav> : 네비게이션 영역이며 페이지 이동을 위한 메뉴들이 모여 있는 곳이다.
    - <section> : 글을 구분하는데 사용한다. 단락의 개념으로 보면된다.
    - <article> : 컨텐츠의 내용이 들어가는 부분이다.
    - <aside> : 보조 메뉴나 광고를 배치하는 곳이다.
    - <footer> : 저작자의 이름이나 문서의 날짜 , 연락처 등이 들어간다
    - <details> : 사용자가 필요에 따라 열고 닫을 수 있는 추가 세부 정보를 정의한다.
    - <summary> : <details>요소의 제목을 정의한다.

### 2. background
    - 배경을 지정한다.
    - 배경이 없는 무료 이미지 : https://www.pngwing.com/ko 
    - background-size: cover;	: 이미지를 공간안에 꽉 채운다
    - background-size: contain;	: 이미지의 삭제없이 다 채운다

### 3. link와 import
    - 외부로 파일을 빼내는 방법은 크게 두가지이다.
    1. <link rel="stylesheet" href="style.css"> - html 태그로 하는 법
    2. <style>@import url('style.css')</style> - css로 style 태그하는 법

    - network를 통해서 확인하면 해당 css를 다운로드 받는다. 즉, 실제로는 용량이 줄어들지
    않았고, 다운로드시에 PC 자원을 소비한다. 그럼에도 불구하고 이러한 방법을 사용하는 
    이유는 브라우저에는 cache 메모리가 존재하기 때문이다.
    - web cache : 사용자가 웹사이트에 접속할 때, 정적 컨텐츠(이미지, js, css 등)를
    특정 위치에 저장하여, 웹 사이트 서버에 해당 컨텐츠를 매번 요청하여 받는 것이 아니라,
    특정 위치에서 불러옴으로써 사이트 응답시간을 줄이고, 서버 트래픽 감소 효과도 볼 수있다.

    - import방식이 css안에서 css로드 가능하다는 점 제외하고 link방식과 css방식은
    완전히 같은 기능

### 4. 무료 template 사이트
    - https://themewagon.com/theme-price/free       

### 5. javaScript
    5-1. 바닐라 스크립트(vanilla js)
    - 바닐라 자바스크립트란 플러그인이나, 라이브러리를 사용하지 않은 순수 자바스크립트를
    이야기합니다. 즉 바닐라 자바스크립트 = 자바스크립트라고 생각하면 된다.
    - 외국에서의 소프트웨어 세계에서는 바닐라(vanilla) = 일반(plain)을 의미한다.
    - 아무것도 다운받지 않아도 되니 가볍고 빠르다.
    - 프론트에서의 react, vue, angular가 자바스크립트의 es6의 문법을 사용하면서
    자바스크립트에 대한 중요성이 높아졌다. 

    5-2. javascript에 영향을 준언어
    - java : 기본적인 문법

    5-3. javascript 버전
    - https://www.w3schools.com/js/js_versions.asp

    5-4. 숫자와 문자
    - 데이터형(datatype)
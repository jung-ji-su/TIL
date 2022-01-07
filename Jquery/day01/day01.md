
### 1. jQuery
    1.  라이브러리 : 자주 사용하는 로직을 재사용할 수 있도록 고안된 소프트웨어를
    라이브러리라고 한다.
    - jQuery : jQuery는 DOM을 내부에 감추고 보다 쉽게 웹페이지를 조작할 수 있도록
        돕는 도구이다.
        엘리먼트를 선택하는 강력한 방법과 선택된 엘리먼트들을 효율적으로
        제어할 수 있는 다양한 수단을 제공하는 자바스크립트 라이브러리

    - https://jquery.com/

    2. 
    - javascript
    window.onload = function(){

    };

    - jQuery
    $(document).ready(function(){

    });

    - jQuery 축약
    $(function(){

    }); 

    3. selector
    - 클래스
    $('.클래스이름')

    - id
    $('#id')

    - 태그명
    $('태그명')

    - 자식
    $('#list li')
    -> list라는 id를 가진 태그 안에있는 모든 li태그들을 선택

    - 여러개 선택
    $('a, b')
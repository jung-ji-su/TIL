
### 1. 기본동작의 취소
    1-1. inline
    - return false;

    1-2. property 
    - return false;

    1-3. addEventListener
    - e.preventDefault();

    1-4.  querySelector() : css선택자를 사용하여 요소를 찾는다.
    querySelectorAll() : querySelector와 동일하게 작동하나 차이점은
                해당 선택자에 해당하는 모든 요소를 가져온다.

### 2. event type : form
    - submit : 폼의 정보를 서버로 전송하는 명령어인 submit

### 3. change event
    - 값이 변경되었을 때 발생하는 이벤트이다.
    - 입력을 끝내고 focus를 빠져나왔을때 발생한다.
    - input(text,radio,checkbox), textarea 태그에 적용된다.


### 4. innerHTML
    - 엘리먼트(element)내에 포함 된 HTML 또는 XML 마크업을 가져오거나 설정한다.

### 5. blur, focus event
    - focus : 엘리먼트에 포커스가 생겼을때
    - blur : 포커스가 사라졌을 때 발생하는 이벤트

### 6. 문서의 로딩
    - 웹페이지를 프로그래밍적으로 제어하기 위해서는 웹페이지의 모든 요소에 대한 처리가
    끝나야 한다. 이것을 알려주는 이벤트가 load, DOMContentLoaded이다

### 1. .off() 메소드
  - off() 메소드는 더 이상 사용하지 않는 이벤트를 제거한다.

### 2. .one() 메소드
  - one() 메소드는 이벤트가 한번만 실행되고 나서는, 더는 실행되지 않는다.

### 3. 마우스 이벤트 - click() : 클릭, dblclick() : 더블 클릭

### 4. effect 효과 
    - show() : 선택한 요소를 나타나게 한다.
    - hide(): 선택한 요소를 사라지게 한다.

    4-1. effect 효과 속도 설정
    - 인수로 밀리초(ms)를 설정하거나, 'slow', 'fast'와 같은
    예약어를 전달하여, 이펙트 효과의 속도를 설정할 수도 있다.

    4-2. toggle : 선택한 요소의 현재 표시 상태에 따라 다른 동작을 한다.
            선택한 요소가 현재 사라진 상태라면 show()메소드의 동작을
            수행하고, 나타나 있는 상태라면 hide()메소드의 동작을
            수행한다.
 
### 5. 엘리먼트 제어
    5-1. 자식으로 삽입
    - append(), appendTo(), html(), prepend(), prependTo(), .text()
    - https://api.jquery.com/category/manipulation/dom-insertion-inside/

    5-2. 형제로 삽입
    - after(), before(), insertAfter(), insertBefore()

    5-3. 부모로 감싸기
    - unwrap(), wrap(), wrapAll(), wrapInner()
### 1. 링크와 관련된 선택자

	- :link -> 	방문한 적이 없는 링크
	- :visited -> 	방문한 적이 있는 링크
		보안상의 이유로 color, background-color, border-color,
		outline-color 이 속성들만 변경이 가능하다.
	- :hover -> 	마우스를 롤오버 했을때
	- :active -> 	마우스를 클릭했을 때

### 2. fontsize

	- 글꼴의 크기를 지정한다. 주요 단위는 px, em, rem이 있다.
	- rem
	-> 브라우저에 따라 가변적
	-> html 태그에 적용된 font-size의 영향을 받는다.
	-> html 태그의 폰트 크기에 따라서 상대적으로 크기가 결정되기 때문에 이해하기 쉽다.
	-> 이것을 사용
	- px
	-> 폰트 크기가 고정
	-> 모니터 상의 화소 하나의 크기에 대응되는 단위
	-> 고정된 값이기 때문에 이해하기 쉽지만, 사용자가 글꼴의 크기를 조정할 수 없기 때문에
	사용하지 않는다.
	- em
	-> 폰트의 크기가 브라우저에 따라 가변적
	-> 부모 태그의 영향을 받는 상대적인 크기
	-> 부모의 크기에 영향을 받기 때문에 파악하기가 어렵다.
	-> rem이 등장하면서 이 단위 역시 사용이 권장되지 않는다.

### 3. text-align

	- left
	- right
	- center
	- justify

### 4. font

	- font-family 는 서체를 지정하는 속성이다.

	h1{
		font-family : "Times New Roman", Times, serif;
	}

	- serif : 장식이 있는 폰트
	- sans-serif : 장식이 없는 폰트
	- cursive : 흘림체
	- fantasy
	- monospace : 고정폭

	- 폰트축약
	-> 폰트와 관련된 여러 속성을 축약형으로 표현하는 속성
	-> 순서를 지켜서 기술해야 한다.

	font : font-style font-variant font-weight font-size/line-height
	font-family|caption|icon|menu|message-box|small-caption|status-bar|initial|inherit;

	-> 이 중에서 font-size와 font-family는 필수로 포함

	- 웹폰트
	-> 웹폰트는 사용자가 가지고 있지 않은 폰트를 웹페이지에서 사용할 수 있는 방법이다.
	폰트를 서버에서 다운로드하는 방식이라고 할 수 있다.(google fonts)
	https://fonts.google.com/

### 5. 상속

	- 상속은 부모 엘리먼트의 속성을 자식 엘리먼트가 물려받는 것을 의미한다. 
	상속은 CSS에서 생산성을 높이기 위한 중요한 기능이다. 
	- border는 상속이 되지 않는다. 모든 속성이 상속을 지원하는 것은 아니다.
	상속을 하면 오히려 비효율적인 속성들이 있다.

	https://www.w3.org/TR/CSS21/propidx.html

### 6. 선택자 우선순위

	1. style attribute
	2. id selector
	3. class selector
	4. tag selector

	-> 구체적인 것을 기준으로 우선순위가 정해진다.

	- !important : 우선순위가 가장 먼저 적용된다. 쉬운 방법이긴 하나 좋은 방법은
		아니다.


### 7. html 엘리먼트

	- 화면 전체를 사용하는 태그	-> block element
	- 화면의 일부를 차지하는 태그	-> inline level element
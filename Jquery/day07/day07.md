### 1. $.extend() 메소드
    - $.extend() 메소드는 두 개 이상의 객체의 모든 프로퍼티를 하나의 객체로
    병합한다. 
    - 이 메소드는 인수로 전달받은 첫 번째 객체에 두 번째 객체의 모든
    프로퍼티를 추가한다. 그리고서 첫 번째 객체에 세번째 객체의 모든 프로퍼티
    추가한다. 이와 같은 순서대로 인수로 전달받은 모든 객체의 프로퍼티를 첫 번째
    객체에 모두 추가한다.

### 2. 
    - <canvas id="myCanvas" width="600" height="450"></canvas>
    - canvas는 처음에는 src, alt 속성이 없다는 점만 제외하면 <img> 태그처럼
    보인다. 실제로는 canvas 태그는 width와 height의 두 속성만 있다.

    2-1. fillStyle
    - fillStyle = color
    -> 도형을 채우는 색을 설정한다.
    -> ctx.fillStyle = "orange";
    -> ctx.fillStyle = "#FFA500";
    -> ctx.fillStyle = "rgb(255,165,0)";

    2-2. fillRect(x,y,width,height)
    -> 색칠된 직사각형을 그립니다.(윤곽선을 그린다)

    2-3. strokeStyle = color
    -> 도형의 윤곽선 색을 설정합니다.

### 1. chain
    - jquery의 메소드들은 반환값으로 자기 자식을 반환해야 한다는 규칙을 가지고 있다.
    이를 이용하여 한번 선택한 대상에 대해서 연속적인 제어를 할 수 있다.
    - chain의 장점
    -> 코드가 간결해진다.
	
### 2. event
    - id가 btn인 요소를 클릭했을 때 

    $('#btn').bind('click', function(event){
        // 실행로직
    });

    $('#btn').click(function(event){
        // 실행로직
    });

    $('#btn').on('click',function(event){
        // 실행로직
    });	
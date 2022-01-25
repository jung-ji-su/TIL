
## 1. EL(Expression Language)

    1-1. EL 표현식
    - request.setAttribute("cnt",30);
    -> request.getAttribute("cnt");
    -> ${cnt}

    - List list = new ArrayList(){"1", "test"};
    request.setAttribute("list", list);
    -> ((List)request.getAttribute("list")).get(0)
    -> ${list[0]}

    - Map n = new HashMap("title", "제목");
    request.setAttribute("n", n);
    -> ((Map)request.getAttribute("n")).get("title");
    -> ${n.title}

    1-2. EL연산자
    - 산술연산자
    -> +(더하기), -(빼기), *(곱하기), 
    /,div(나누기), %, mod(나머지)

    - 비교연산자
    -> ==, eq
    -> !=, ne
    -> <, lt
    -> >, gt
    -> <=, le
    -> >=, ge

    - 논리 연산자
    -> &&, and
    -> ||, or
    -> !, not

    - 삼항 연산자
    -> a?b:c = a 조건이 만족하면 b를 리턴, 아니면 c를 반환

    - empty 연산자
    -> 객체의 값이 null 이거나 비어 있는지 판단하는 메소드로 값이 
    null일경우 true 반환
    -> 값이 null : true
    -> 값이 빈 문자열("")이면 : true
    -> 값의 길이가 0인 배열 : true
    -> 값이 빈 Map이면 : true
    -> 값이 빈 collection 이면 : true
    -> 이외의 경우는 : false

    1-3. EL 데이터 저장소
    - 각 객체에 동일한 변수가 있을 시 EL로 출력하면 아래 순서로 출력된다.
    - page > request > session > application
    - 특정 객체에 값을 가져오려면 scope을 사용한다
    -> pageScope : page 영역의 생명 주기에서 사용되는 저장소
    -> requestScope : Request 영역의 생명주기에서 사용되는 저장소
    -> sessionScope : session영역의 생명주기에서 사용되는 저장소
    -> applicationScope : application 영역의 생명주기에서
    사용되는 저장소
    -> param : 파라미터 값을 저장하고있는 저장소
    -> paramValues : 파라미터 값을 배열로 저장하고 있는 저장소
    -> cookie : 쿠키 정보를 저장하고 있는 저장소
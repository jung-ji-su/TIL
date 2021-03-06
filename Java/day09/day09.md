# inheritance & Polymorphism & static

#### 클래스 배열

	객체를 여러개 선언해야 하는 경우 배열 타입으로 한번에 선언 후 사용
	각 객체는 규칙성이 없기 때문에 규칙성을 부여하기 위해서 사용한다.

#### 클래스 배열 선언

	클래스명[] 배열명 = new 클래스명[칸수];
	클래스명[] 배열명 = {
		new 생성자(),
		new 생성자(),
		...
	};

#### 클래스 배열 사용

	각 배열의 방 자체가 객체로 볼 줄 알아야 한다.

	배열명[idx].변수
	배열명[idx].메소드()

#### 상속(inheritance)

	1. 기존에 선언된 클래스의 필드를 다른 클래스에서 사용하고자 할 때
	2. 클래스들을 만들다 보니 공통 요소가 보여서 부모로 묶은 후
	상속시켜 주어서 사용하고자 할 때

    class A{
        A의 필드
    }

    class B extends A{
        B의 필드
    }

    B b = new B();
    b 객체는 실제로는 A의 필드와 B의 필드 둘 다 가지고 있다.

    A : 부모 클래스, 상위 클래스, 슈퍼 클래스, 기반 클래스
    B : 자식 클래스, 하위 클래스, 서브 클래스, 파생 클래스

#### 자식 클래스 생성자 호출 시 일어나는 일

	자식 클래스의 객체는 자식 생성자를 호출하여 객체화를 진행한다.
	메모리에 자식 클래스의 필드만 올라갔다면 자식 객체로 절대
	부모 클래스에 선언되어 있는 필드에 접근할 수 없다. 따라서
	자식 생성자를 호출하게 되면 상속받고 있는 클래스가 있는지 확인 후
	부모의 생성자가 자동으로 먼저 호출이 된다.(부모의 필드가 먼저 만들어진다)
	그 이후에 자식 객체는 부모 필드가 메모리에 먼저 생성되어 있기 때문에
	그 필드쪽에 접근할 수 있게 된다.
	>> 자식 생성자 첫 줄에는 항상!!!!!!! super클래스의 생성자가 호출된다.
		명시적으로 적지 않으면 보이지는 않지만 super() 호출(부모의 기본생성자)

#### 다형성(Polymorphism)

	1. Overloading(오버로딩)
		같은 이름의 메소드를 넘쳐서(여러개) 불러오는(선언하는) 기법
		매개변수의 개수 혹은 타입이 다르면 같은 이름의 메소드로
		여러개 선언할 수 있다. 이름이 아닌 매개변수로 구분하기 때문이다.
		오버로딩된 메소드를 사용할 시, 전달된 값의 타입 혹은 개수로
		구분하여 알맞은 메소드가 자동으로 호출된다.

	2. 오버라이딩(Overriding) : 재정의
		부모 필드에 이미 a()라는 메소드가 존재한다면
		자식 객체 생성시 부모 생성자가 먼저 호출되기 때문에
		부모 클래스의 a()가 먼저 메모리에 올라간다.
		그 다음 자식의 필드를 완성시킬 때 같은 이름의 a() 라는
		메소드가 선언되어 있다면, 같은 이름으로 두개가 만들어지는 것이
		아니고, 기존에 만들어진 부모 필드의 a() 메소드에 자식에서
		작성한 메소드 내용이 덮어 씌워진다. 그러므로 자식 객체로
		a() 메소드를 사용하게 되면 재정의된 기능으로 사용하며
		이것을 오버라이딩 이라고 한다.

#### static(정적)

	static이 붙은 변수, 메소드, 구역 등은 프로그램 실행시 가장 먼저 메모리에 올라간다.
    따라서 static이 붙은 메소드는 내부에서 객체의 필드에 올라오는 일반 전역변수와 
    일반 메소드는 사용할 수 없다. (메모리에 올라오지 않았기 때문에)
	그러므로 static이 붙은 전역변수, static이 붙은 메소드, 자기 자신 안에 선언된 
    지역변수만 사용할 수 있다.

	static이 붙은 전역변수, 메소드는 모든 객체가 공유한다.
	따라서 static 필드는 클래스 이름으로 직접 접근이 가능하다.
	실제로 모든 객체가 공유해야 하는 값, 메소드에는 static을
	붙여서 사용한다.(공유하지 않아야 하는 값들에는 무조건 붙이면 안된다.)
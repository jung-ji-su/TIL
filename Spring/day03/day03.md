
## 1. POJO란?
    - Plain Old Java Object, 단순한 자바 오브젝트
    - POJO란, 객체 지향적인 원리에 충실하면서 환경과 기술에 종속되지 않고 필요에 따라
    재활용될 수 있는 방식으로 설계된 오브젝트를 말한다. 그러한 POJO에 애플리케이션의 핵심 
    로직과 기능을 담아 설계하고 개발하는 방법을 POJO프로그래밍이라고 할 수 있다.

## 2. DI란?
    - 의존성 주입(DI : Dependency Injection)
    - 객체간의 의존성이 존재할 경우 개발자가 직접 객체를 생성하거나 제어하는 것이 아니라,
    제어반전에 의하여 특정 객체에 필요한 다른 객체를 프레임워크가 자동으로 연결시켜 주는 것을
    말한다.
    - 개발자는 자신에게 필요한 객체를 직접 할당하지 않고, 인터페이스를 통해 선언한 객체에
    스프링 프레임워크에 의해 주입받아 사용할 수 있기 때문에 비지니스 로직 개발에만 집중할 수 있다.
    - 개발자는 객체를 선언만 할 뿐, 할당은 프레임워크에 의해서 자동으로 이루어 진다.

## 3. @Autowired
    - 필요한 의존 객체의 "타입"에 해당하는 빈을 찾아 주입한다.
    - Autowired는 기본값이 true이기 때문에 의존성 주입을 할 대상을 찾지 못하면 애플리케이션
    구동에 실패한다.

## 4. 참고사항
    - 스프링은 스프링 컨테이너에 스프링 빈을 등록할 때, 기본으로 싱글톤으로 등록한다
    (유일하게 하나만 등록해서 공유한다).
    - 따라서 같은 스프링 빈이면 모두 같은 인스턴스다.
    - 설정으로 싱글톤이 아니게 설정할 수 있지만, 특별한 경우를 제외하면 대부분 싱글톤을 사용한다.

## 5. 스프링 빈을 등록하는 2가지 방법
    - 컴포넌트 스캔과 자동 의존관계 설정(@Component)
    -> 컴포넌트 스캔의 대상은 main 메서드가 있는 class의 동일 패키지 또는 하위 패키지만
    Spring이 스캔을 하는 대상이 된다. 
    (당연히 설정을 통해서 다른 패키지의 클래스도 가능하지만)

    - 자바 코드로 직접 스프링 빈 등록하기

## 6. DI의 3가지 방법
    - Field Injection(필드 주입)
    : @Autowired private MemberService memberService;

    - Setter Injection(수정자 주입)
    : 
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    - Constructor Injection(생성자 주입)


## 7. 순환 참조
    - 개발을 하다 보면 여러 객체들 간에 의존성이 생긴다. 그 중에서도 A 가 B를 참조하고,
    B 가 다시 A를 참조하는 순환 참조가 발생할 수 있다.
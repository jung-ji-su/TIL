
## 1. Datasource
    - 순수 jdbc로 데이터베이스에 접근을 하면, 데이터베이스에 접근할 때마다
    connection을 맺고 끊는 작업을 한다.이 connection을 맺고 끊는 작업을 줄이기
    위해 미리 connection 생성해 두고, 데이터베이스에 접근하고자 하는 사용자에게
    미리 생성된 connection을 제공하고 돌려 받는다. 이 connection들을 모아두는
    장소를 connection pool 이라 하며, Datasource는 java에서
    connection pool을 지원하기 위한 인터페이스이다.
    - Spring boot는 WAS(tomcat)가 내장되어 있다. Datasource를 직접 구현하여
    사용할 수 있지만, 코드 내에서 connection 을 모두 관리하는 것은 비효율적이다.
    하나의 WAS에 여러가지 프로그램이 실행될 수 있으며, 이 모든 프로그램마다 각각의
    Datasource를 가지고 connection을 관리한다면 개발자 또는 운영자가 전체를 
    관리하기 힘들어 진다. 그래서 WAS내에서 모든 connection을 관리하는 방법이
    효율적이며, spring boot 또한 내장되어 있는 WAS에 connection pool을 
    제공한다.

## 2. 좋은 객체 지향 설계의 5가지 원칙(SOLID)
    - 클린코드로 유명한 로버트 마틴이 객체지향 설계의 5가지 원칙 정리
    1. SRP : 단일 책임 원칙(single responsibility principle)
    - 한 클래스는 하나의 책임만 가져야 한다.
    - 중요한 기준은 변경이다. 변경이 있을 때 파급효과가 적으면 단일 책임 원칙을
    잘 따른 것이다.
    2. OCP : 개방-폐쇄 원칙(Open/Closed principle)
    - 확장에는 열려있고, 수정, 변경에는 닫혀있어야한다.
    - 스프링의 DI을 사용하면 기존 코드를 전혀 손대지 않고, 설정만으로 구현 클래스를
    변경할 수 있다.
    3. LSP : 리스코프 치환 원칙(Liskov substitution principle)
    - 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 객체로
    바꿀수 있어야 한다.
    - 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야 한다는 것.
    4. ISP : 인터페이스 분리 원칙(Interface segregation principle)
    - 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
    - 인터페이스가 명확해지고, 대체 가능성이 높아진다.
    5. DIP : 의존 관계 역전 원칙(Dependency inversion principle)
    - 구현 클래스에 의존하지 말고, 인터페이스에 의존하라는 뜻
    - 역할에 의존하게 해야 한다는 것과 같다. 구현체에 의존하게 되면 변경이
    아주 어려워 진다.
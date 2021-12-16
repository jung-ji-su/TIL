# Foreign key

#### 1. Foreign key(외래키)

    - 외부키, 외래키, 참조키, 외부 식별자, FK라고도 불린다.
    - FK가 정의된 테이블을 자식 테이블이라 칭한다.
    - 참조되는 테이블을 부모 테이블이라고 한다.
    - 부모테이블 컬럼에 존재하는 데이터만 자식테이블에 입력할 수 있다
    - 부모테이블은 자식의 데이터나 테이블이 삭제된다고 영향을 받지 않는다
    - 참조하는 데이터 컬럼과 데이터 타입이 반드시 일치해야 한다
    - 참조할 수 있는 컬럼은 기본키(PK)이거나 Unique만 가능하다.(보통 PK랑 엮음.)

#### 2. 외래키 설정
	
    create table 테이블(
        컬럼 	데이터타입	CONSTRAINTS 제약조건이름 FOREIGN KEY
                REFERENCES 참조할테이블(참조할컬럼)
                [ON DELETE CASCADE | ON DELETE SET NULL]	
    );

    create table 테이블(
        컬럼	데이터타입,

        CONSTRAINTS 제약조건이름 FOREIGN KEY(컬럼)
                REFERENCES 참조할테이블(참조할컬럼)
                [ON DELETE CASCADE | ON DELETE SET NULL]
    );

#### 3. 외래키 삭제 옵션

    3-1. ON DELETE CASCADE
    - 참조되는 부모 테이블의 행에 대한 DELETE를 허용한다.
    즉, 참조되는 부모테이블 값이 삭제되면 연쇄적으로 자식 테이블 값 역시 삭제된다.

    3-2. ON DELETE SET NULL
    - 참조되는 부모 테이블의 행에 대한 delete를 허용한다.
    이건 cascade와 다른데 부모 테이블의 값이 삭제되면 해당 참조하는 자식테이블의 
    값들은 null값으로 설정된다.
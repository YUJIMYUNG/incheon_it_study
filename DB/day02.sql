-- 학생 테이블
-- DEFAULT, CHECK
CREATE TABLE TBL_STUDENT(
	ID NUMBER, --학번
	NAME VARCHAR2(100),
	MAJOR VARCHAR2(100),
	GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTARAINT BAN_CHAR CHECK(GENDER='M' OR GENDER='W'),
	BIRTH DATE CONSTRAINT BAN_DATE CHECK(BIRTH >= TO_DATE('1980-01-01','YYYY-MM-DD')),
	CONSTRAINT STD_PK PRIMARY KEY(ID)
);


--DEFAULT 와 NOT NULL 

-- GENDER CHAR(1) DEFAULT 'W'
-- QUERT1
-- INSERT INTO TBL_STUDENT GENDER VALUES(NULL);
-- 'NULL' 이라는 특정한 값을 받았다고 생각하여, 아무일도 일어나지 않는다. 
-- QUERT2
-- INSERT INTO TBL_STUDENT GENDER VALUES();
-- 아무런 입력도 받지 않았다고 생각하기 때문에 DEFAULT값인 'W' 로 설정된다.

--1. NOT NULL만 선언한 경우
-- NULL 값을 넣어 추가한 경우 : NOT NULL 이 동작 
-- 아무값도 넣지 않고 추가했을 때 : NOT NULL 이 동작 

--2. NOT NULL과 DEFAULT 둘 다 선언한 경우
-- 아무값도 넣지 않고 추가했을 때 : DEFAULT가 동작하여 기본값이 들어감 
-- NULL 값을 ㅓㄴㅎ고 추가했을 때 : NOT NULL이 동작


-- 무결성
-- 데이터베이스에 저장된 데이터 값과 그것이 표현하는 현실 세계의 실제 값이 일치는지 정확성을 의미한다. 
-- 무결성 제약조건은 DB에 들어있는 데이터의 정확성을 보장하기 위해 부정확한 자가 DB 내에 저장되는
-- 것을 방지하기 위한 제약조건을 말한다. 
--데이터의 정확성, 일관성, 유효성이 유지되게 하는 것 
-- 정확성 : 중복이나 누락이 없는 상태 
-- 일관성 : 원인이나 결과의 의미가 연속적으로 보장되어 변하지 않는 상태 
-- 유효성 : 사용자로부터 값을 입력받았을 때 정확한 값만 입력되도록 하는 것 

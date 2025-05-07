# Java
# Java 서버 개발 로드맵

---

## ✅ 1단계: Java 기초 문법 완전 정복

서버를 만들려면 **기초 문법**은 자유자재로 다룰 수 있어야 해.

### 학습 내용
- 변수, 조건문, 반복문
- 클래스, 객체지향 (상속, 다형성, 캡슐화)
- 컬렉션 (`List`, `Map`, `Set`)
- 예외 처리 (`try-catch`)
- 입출력 (`Scanner`, `BufferedReader` 등)
- 기본 쓰레드 (`Thread`, `Runnable`)

### 목표
- 알고리즘 문제나 미니 프로젝트 하나 정도는 혼자서 짤 수 있어야 함

---

## ✅ 2단계: 자바 중급 — 객체지향과 병렬 처리, 입출력 심화

서버는 많은 요청을 동시에 처리하니까 **멀티스레딩**이나 **동기화**도 중요해.

### 학습 내용
- 멀티스레드 & 동기화 (`synchronized`, `wait/notify`, `ExecutorService`)
- 입출력 스트림 (`InputStream`, `OutputStream`, `Reader`, `Writer`)
- 네트워크 기초 (`Socket`, `ServerSocket`)
- 직렬화 (`Serializable`, JSON 변환)

### 목표
- 간단한 **채팅 서버**, **파일 서버** 만들어보기

---

## ✅ 3단계: Java 웹 서버 개발 입문 (Servlet & Spring)

실제 웹 서버는 보통 **Spring Framework**로 만들어. 하지만 먼저 **Servlet**부터 이해해야 해.

### 학습 내용
- HTTP 프로토콜 기초 (GET, POST, 응답 코드 등)
- Servlet 기본 (`HttpServlet`, `doGet`, `doPost`)
- JSP (Java Server Pages) 이해
- Tomcat 같은 WAS 사용법

### 목표
- 직접 Tomcat 위에서 간단한 웹 페이지 서버 만들어보기

---

## ✅ 4단계: Spring Framework 사용

**Spring Boot**는 요즘 서버 개발의 거의 표준이야.

### 학습 내용
- Spring Core (DI, IoC 개념)
- Spring MVC (컨트롤러, 라우팅)
- Spring Boot (설정 간소화, 내장 서버)
- REST API 만들기
- JSON 파싱 (`Jackson`, `Gson`)
- DB 연결 (`JPA`, `MyBatis`, `H2`, `MySQL` 등)

### 목표
- 회원가입/로그인 API나 **게시판 서버 직접 만들기**

---

## ✅ 5단계: 서버 실전 기술 & 운영 관련

서버가 돌아가려면 **실제로 배포하고 운영**해야 해.

### 학습 내용
- RESTful API 설계
- JWT, OAuth2 등 인증/보안
- Docker, Git, CI/CD
- 서버 로그, 모니터링
- WebSocket (실시간 통신)
- 비동기 처리 (`@Async`, `CompletableFuture`)
- 대용량 처리 (`Redis 캐시`, 메시지 큐 등)

### 목표
- 실제로 **클라우드나 VPS에 서버 배포**해보기  
  (예: AWS, Render, Heroku)

---


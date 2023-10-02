# response-entity
Spring 프레임워크에서 responseEntity를 핸들링 하는 것을 공부하기 위한 프로젝트입니다.

Spring 에서 제공하는 ResponseEntity답게 사용하기에는 편리하다.

간단 HTTPStatus 변경 및 어느정도는 가능하지만,
ERRORCode를 직접 핸들링 하려면 새 객체를 생성후 그 안에 정의한다음 body에 딸려 보내는 밖에 없어 보인다.


테스트 케이스 
1) ResponseEntity status 11로 변경 후 api제공 \
결과 : 무한 로딩 REST의 api status 규칙을 무시하여 무한 로딩에 걸리는 것으로 추정

2) Spring framework에서 제공하는 ResponseEntity를 Custom \
결과: Spring framework에서 제공하는 HTTPEntity의 getBody의 타입이 General type을 따라가 response body의 custom의 한계를 느낌

3) ResponseBody용 Model정의 및 ResponseEntity Custom \
결과: HTTP Status와 서비스의 Status를 전부 핸들링 가능

3번 케이스로 서비스에 적용 후 문제점 발견시 테스트 케이스 추가 예정

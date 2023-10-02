# response-entity
Spring 프레임워크에서 responseEntity를 핸들링 하는 것을 공부하기 위한 프로젝트입니다.

Spring 에서 제공하는 ResponseEntity답게 사용하기에는 편리하다.

간단 HTTPStatus 변경 및 어느정도는 가능하지만,
ERRORCode를 직접 핸들링 하려면 새 객체를 생성후 그 안에 정의한다음 body에 딸려 보내는 밖에 없어 보인다.


테스트 케이스 
1) ResponseEntity status 11로 변경 후 api제공 \
결과 : 무한 로딩 REST의 api status 규칙을 무시하여 무한 로딩에 걸리는 것으로 추정

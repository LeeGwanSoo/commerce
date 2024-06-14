# commerce
SpringBootStudy(Gradle)

- 로컬
  - Tasks > bootJar

- Docker 확인
  - docker ps
  - docker images
  
- Docker Image 빌드
  - 현재 디렉토리
    - docker build -t test:latest .
  - 다른 Dockerfile
    - docker build -t test:latest -f path/to/Dockerfile .
  - 캐시 사용하지 않고 빌드
    - docker build -t test:latest --no-cache .
  - 포트 매핑 하여 실행
    - docker run -p 8080:8080 -d test:latest
- Doker 내부 접속
  - docker exec -it 컨테이너명 /bin/sh


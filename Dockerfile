# 베이스 이미지를 지정합니다. 여기서는 OpenJDK 17 사용합니다.
FROM openjdk:17-jdk-slim

# 작업 디렉터리를 설정합니다.
WORKDIR /app

# 빌드된 JAR 파일을 컨테이너의 작업 디렉터리로 복사합니다.
COPY build/libs/app.jar app.jar

RUN rm -rf /etc/localtime
RUN ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime

# Docker 컨테이너에서 외부에 노출할 포트 번호
EXPOSE 8080

# 애플리케이션을 실행합니다.
ENTRYPOINT ["java", "-jar", "app.jar"]
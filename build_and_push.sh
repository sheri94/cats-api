./gradlew clean build
docker build . -t volsky94/cats-api:1.0.0
docker push volsky94/cats-api:1.0.0


run:
	./gradlew run

package:
	./gradlew distTar

build:
	./gradlew --no-daemon shadowJar

docker-up:
	docker compose up --build

docker-down:
	docker compose down
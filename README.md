# Example springboot with Docker


To create the jar

```bash
./gradlew  build
```
To build  with Docker

```bash
docker build -t  java8 .
```

To run the container

```bash
docker run -p 8080:8080 -d java8
```

To see the images

```bash
docker images
```

To see the containers 

```bash
docker ps
```

To see the log

```bash
docker logs {container id}
```


To get a console

```bash
sudo docker exec -it {container id}  bin/sh
```
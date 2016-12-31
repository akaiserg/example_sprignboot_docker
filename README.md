# Example Springboot, Mysql and Docker


To create the jar

```bash
./gradlew  build
```
To build the mysql image 

```bash
docker build  -f DockerfileMysql -t mysql5 . 
```

To build the java image 

```bash
docker build  -f DockerfileJava -t java8 . 
```

To create a docker volume

```bash
docker volume create. —name mysql
```

To run mysql, open  the port 3366 and use the volume

```bash
docker run --name my-mysql -p 3366:3306  -v mysql5:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123asd  -d mysql5
```

Bash access to create the data base

```bash
docker exec  -it my-mysql bin/bash
```

Once you're inside of the container

```bash
sh install-db.sh
```

To see the mysql container and  its id

```bash
docker ps
```

To Run the springboot project and link  with mysql  container 

```bash
docker run -p 8080:8080  --link my-mysql:mysql  --name springboot  -d java8
```

To see the log 

```bash
docker logs container_id
```

Bash access to the java container 

```bash
sudo docker exec -it container_id  bin/sh
```
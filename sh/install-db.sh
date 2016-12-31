#!/bin/bash
mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "CREATE DATABASE tests"
mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "CREATE TABLE tests.person ( id bigint NOT NULL AUTO_INCREMENT, name VARCHAR(250),PRIMARY KEY (id))ENGINE=InnoDB DEFAULT CHARSET=utf8;"
mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "INSERT INTO tests.person (name) VALUES ('person1');"
mysql -uroot -p$MYSQL_ROOT_PASSWORD -e "INSERT INTO tests.person (name) VALUES ('person2');"

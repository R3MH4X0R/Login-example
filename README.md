# Login-example
Spring security login example

## Install
Clone the project
```
git clone https://github.com/n7-remax/Login-example.git
```
In aplication.properties file setup your database information
```
spring.datasource.url=
spring.datasource.username = root
spring.datasource.password = root
```

Use maven to build project

```
mvn clean install
```
Launch it
```
java -jar login-example-1.0.jar
```
You can access project through http://localhost:8080/
## Database Schema
```
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) 

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `active` int(11) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`)
) 

CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) 
```
## Built With

* [Thymeleaf](https://www.thymeleaf.org/)
* [Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* [Spring Security](https://spring.io/projects/spring-security)
* [MySQL](https://www.mysql.com/)

## License

This project is licensed under the MIT License - see the LICENSE file for details

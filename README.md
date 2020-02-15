# [Conference Scheduling App](https://conf-schedule.com/)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

### Project Description

A web [app](https://conf-schedule.com/) for booking to attend conference.

### Table of Content

[Features](#features)<br/>
[Technology Used](#technology-used)<br/>
[Building](#building)<br/>
[Testing](#testing)<br/>
[License](#license)<br/>
[Author](#author)

### Features


### Technology Used

Modern Java features and technology was used for this [project](https://conf-schedule.com/).

PostgreSQL - PostgreSQL, also known as Postgres, is a free and open-source relational database management system emphasizing extensibility and technical standards compliance. It is designed to handle a range of workloads, from single machines to data warehouses or Web services with many concurrent users.

Docker - Docker is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers.

### Building from Source
You need Java 1.8 and a bash-like shell.

### Building
Invoke the build at the root of the project:

----
    $ ./mvnw spring-boot:run
----

The app runs on port 8080.


```bash
DATABASE_URL='jdbc:postgresql://localhost:5432/conf_schedule_app'
```


---

### Testing

This project uses [JUnit](https://junit.org/junit5/)

#### APP URL

The APP was hosted on Heroku and can be access via [Conference Scedule](https://conf-schedule.herokuapp.com/)

### API Documentation

API Documentation was done using Swagger, acccess via [Conference Schedule](https://conf-schedule.com/api-doc/)

### License

Conference Schedule App is Open Source software released under the [MIT](https://opensource.org/licenses/MIT)

### Author

[Russell Nyorere](https://neorusse.github.io/)

`This Is Home Task from Allica :`

1. Create Spring boot application from spring initialization.io **https://start.spring.io/**
2. Added dependencies **spring-boot-starter-data-jpa,spring-boot-starter-web,h2database,spring-boot-starter-test**
3. Created 3 rest apis 
    a. GET  -  http://localhost:8080/customer 
    b. GET - http://localhost:8080/customer/1
    c. POST - http://localhost/8080/customer - body - {"firstName":"Dhaneswar5","lastName":"Majhi","dateOfBirth":"2021-01-01T06:30:00.000+00:00"} as json
4. check data in h2 db :
 **username : sa 
 password : 123
 jdbc url : jdbc:h2:mem:allica**
 5. Swagger Ui to access url is : http://localhost:8080/swagger-ui.html
 6. Changed SPRING banner to ALLICA BANK Banner while starting Application by Adding banner.txt file
 
 
 **`Docker:`**
 1. to build a docker image : docker build -t spring-boot-rest-api-allica .
 2. to run the application in Docker : docker run -p 8080:8080 spring-boot-rest-api-allica
 
 
 
# quizUnivision
use ./mvnw spring-boot:run to run project or ./mvnw clean package to compile it.

RESTful Web Service. The service should have a GET end-point that accepts an ID and returns a message object.

GET /v1/messages/{id} HTTP/1.1
Accept: application/json

{
  "id": "0c80dacb-597c-4692-8396-00af6bb65ed7",
  "message": "Hello World!"
}

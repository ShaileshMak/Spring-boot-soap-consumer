# spring-boot-soap-mysql
Spring Boot Rest API - Student API consuming SOAP api

- Rest API request and response for CRUD operations.
  - CREATE addStudent
    - POST
```aidl
http://localhost:8082/api/v1/students
```
  - Request
```$xslt
{
    "name": "Maggie Ma",
    "grade": "9",
    "classTeacher": "Mrs. Jullie Brown",
    "schoolName": "Fowler Middle School",
    "schoolDistrict": "FSD"
}
```
 - Response
```$xslt
{
    "studentId": 6,
    "name": "Maggie Ma",
    "grade": "9",
    "classTeacher": "Mrs. Jullie Brown",
    "schoolName": "Fowler Middle School",
    "schoolDistrict": "FSD"
}
```
  - READ getStudentById
    - GET
```aidl
http://localhost:8082/api/v1/students/6
```
 - Response
```$xslt
{
    "studentId": 6,
    "name": "Maggie Ma",
    "grade": "9",
    "classTeacher": "Mrs. Jullie Brown",
    "schoolName": "Fowler Middle School",
    "schoolDistrict": "FSD"
}
```
  - READ getAllStudents
    - GET
```aidl
http://localhost:8082/api/v1/students
```
   - Response
```
[
    {
        "studentId": 1,
        "name": "John Doe",
        "grade": "9",
        "classTeacher": "Mr. Nasir Hussain",
        "schoolName": "Liberty High School",
        "schoolDistrict": "FSD"
    },
    {
        "studentId": 2,
        "name": "Michael Ross",
        "grade": "6",
        "classTeacher": "Mr. Nasir Hussain",
        "schoolName": "Woodrow Wilson Middle School",
        "schoolDistrict": "ESD"
    }
]
```
  - UPDATE updateStudent
    - PUT
```aidl
http://localhost:8082/api/v1/students/update
```
  - Request
```
{
    "studentInfo": {
        "studentId": 2,
        "grade": 6
    }
}
```
    - Response
```
{
    "studentId": 2,
    "name": "Michael Ross",
    "grade": "6",
    "classTeacher": "Mr. Nasir Hussain",
    "schoolName": "Woodrow Wilson Middle School",
    "schoolDistrict": "ESD"
}
```
  - DELETE deleteStudent
    - DELETE
```aidl
http://localhost:8082/api/v1/students/delete/4
```
   - Response
```
{
   "studentId": 4,
   "name": "Michael John",
   "grade": "2",
   "classTeacher": "Miss Eich",
   "schoolName": "Taylor Elementery School",
   "schoolDistrict": "FSD"
}
```
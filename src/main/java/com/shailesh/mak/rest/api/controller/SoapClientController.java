package com.shailesh.mak.rest.api.controller;

import com.shailesh.mak.rest.api.service.SoapClient;
import com.shailesh.mak.soap.api.generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SoapClientController {

    @Autowired
    SoapClient soapClientService;

    @PostMapping("/students")
    public ResponseEntity<StudentInfo> addStudent(@RequestBody AddStudentRequest request) {
        AddStudentResponse response = soapClientService.addStudent(request);
        if (response != null) {
            return new ResponseEntity<StudentInfo>(response.getStudentInfo(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentInfo>> getAllStudents() {
        GetAllStudentsResponse response = soapClientService.getAllStudent(new GetAllStudentsRequest());
        if (response != null) {
            return new ResponseEntity<List<StudentInfo>>(response.getStudentInfo(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentInfo> getStudentById(@PathVariable long id) {
        GetStudentByIdResponse response = soapClientService.getStudentById(id);
        if (response != null) {
            return new ResponseEntity<StudentInfo>(response.getStudentInfo(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/students/update")
    public ResponseEntity<StudentInfo> updateStudentById(@RequestBody UpdateStudentRequest request) {
        UpdateStudentResponse response = soapClientService.updateStudent(request);
        if (response != null) {
            return new ResponseEntity<StudentInfo>(response.getStudentInfo(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/students/delete/{id}")
    public ResponseEntity<StudentInfo> deleteStudentById(@PathVariable long id) {
        DeleteStudentResponse response = soapClientService.deleteStudent(id);
        if (response != null) {
            return new ResponseEntity<StudentInfo>(response.getStudentInfo(), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

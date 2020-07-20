package com.shailesh.mak.rest.api.service;

import com.shailesh.mak.soap.api.generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public AddStudentResponse addStudent(AddStudentRequest request) {
        template = new WebServiceTemplate(marshaller);
        AddStudentResponse addStudentResponse = (AddStudentResponse) template.marshalSendAndReceive("http://localhost:8081/ws",
                request);
        return addStudentResponse;
    }

    public GetAllStudentsResponse getAllStudent(GetAllStudentsRequest request) {
        template = new WebServiceTemplate(marshaller);
        GetAllStudentsResponse getAllStudentsResponse = (GetAllStudentsResponse) template.marshalSendAndReceive("http://localhost:8081/ws",
                request);
        return getAllStudentsResponse;
    }

    public GetStudentByIdResponse getStudentById(Long id) {
        GetStudentByIdRequest request = new GetStudentByIdRequest();
        request.setStudentId(id);
        template = new WebServiceTemplate(marshaller);
        GetStudentByIdResponse getStudentByIdResponse = (GetStudentByIdResponse) template.marshalSendAndReceive("http://localhost:8081/ws",
                request);
        return getStudentByIdResponse;
    }

    public UpdateStudentResponse updateStudent(UpdateStudentRequest request) {
        template = new WebServiceTemplate(marshaller);
        UpdateStudentResponse updateStudentResponse = (UpdateStudentResponse) template.marshalSendAndReceive("http://localhost:8081/ws",
                request);
        return updateStudentResponse;
    }

    public DeleteStudentResponse deleteStudent(Long id) {
        DeleteStudentRequest request = new DeleteStudentRequest();
        request.setStudentId(id);

        template = new WebServiceTemplate(marshaller);
        DeleteStudentResponse deleteStudentResponse = (DeleteStudentResponse) template.marshalSendAndReceive("http://localhost:8081/ws",
                request);
        return deleteStudentResponse;
    }
}

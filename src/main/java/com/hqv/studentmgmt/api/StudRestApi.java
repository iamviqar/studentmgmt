package com.hqv.studentmgmt.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.studentmgmt.entity.StudentDocument;
import com.hqv.studentmgmt.repository.StudentDocRepo;

@RestController
public class StudRestApi {

	@Autowired
	StudentDocRepo studentDocRepo;

	@PostMapping("/student")
	StudentDocument saveStudent(@RequestBody StudentDocument studentDocument) {
		studentDocRepo.save(studentDocument);
		return studentDocument;
	}

}

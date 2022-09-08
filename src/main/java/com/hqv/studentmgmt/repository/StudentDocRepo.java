package com.hqv.studentmgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hqv.studentmgmt.entity.StudentDocument;

@Repository
public interface StudentDocRepo extends MongoRepository<StudentDocument, String> {

}
	
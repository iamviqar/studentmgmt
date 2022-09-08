package com.hqv.studentmgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hqv.studentmgmt.entity.DepartmentDocument;

@Repository
public interface DepartmentDocumentRepo extends MongoRepository<DepartmentDocument, String> {

}

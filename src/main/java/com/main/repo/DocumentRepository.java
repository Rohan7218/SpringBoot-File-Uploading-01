package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Document;

@Repository
public interface DocumentRepository  extends JpaRepository<Document, Integer>
{

}

package com.bhut.bhutapi.repository;

import com.bhut.bhutapi.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}

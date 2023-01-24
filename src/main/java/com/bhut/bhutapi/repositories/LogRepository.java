package com.bhut.bhutapi.repositories;

import com.bhut.bhutapi.models.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}

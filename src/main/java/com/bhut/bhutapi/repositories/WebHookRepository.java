package com.bhut.bhutapi.repositories;

import com.bhut.bhutapi.models.WebHook;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WebHookRepository extends MongoRepository<WebHook, String> {
}

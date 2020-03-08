package com.stackroute.keepnote.repository;

import com.stackroute.keepnote.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
* This class is implementing the MongoRepository interface for User.
* Annotate this class with @Repository annotation
* */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

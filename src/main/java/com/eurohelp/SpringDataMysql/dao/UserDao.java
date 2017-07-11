package com.eurohelp.SpringDataMysql.dao;

import com.eurohelp.SpringDataMysql.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by eneko on 11/07/17.
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public User findByEmail(String email);

}
package com.gdou.survey.demo.repository;

import com.gdou.survey.demo.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

}

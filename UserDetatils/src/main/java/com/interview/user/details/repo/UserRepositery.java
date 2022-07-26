package com.interview.user.details.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.interview.user.details.dto.User;

@Repository
public interface UserRepositery extends PagingAndSortingRepository<User, Long> {

	//@Query("from User where name like %:searchString%")
	Page<User> findByName(@Param("searchString") String searchString, Pageable pageable);

	//@Query("from User where age like %:searchString%")
	Page<User> findByAge(@Param("searchString") Integer searchString, Pageable pageable);


}

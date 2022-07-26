package com.interview.user.details.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.interview.user.details.dto.User;

public interface IUserService {
	List<User> findPaginated(int pageNo, int pageSize);
	
	List<User> findPaginated(int pageNo, int pageSize,String sortField,String sortDirection);
	
	List<User> findSearchByName(String searchString,Pageable pageable);
	
	List<User> findSearchByAge(Integer searchString,Pageable pageable);


}

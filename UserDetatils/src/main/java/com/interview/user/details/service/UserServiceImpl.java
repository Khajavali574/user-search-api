package com.interview.user.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.interview.user.details.dto.User;
import com.interview.user.details.repo.UserRepositery;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepositery userRepo;

	@Override
	public List<User> findPaginated(int pageNo, int pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<User> pagedResult = userRepo.findAll(paging);
        return pagedResult.toList();
	}

	@Override
	public List<User> findPaginated(int pageNo, int pageSize,String sortField,String sortDirection) {
		Pageable paging = PageRequest.of(pageNo, pageSize,Sort.by(sortDirection.equals("desc") ?Sort.Direction.DESC:Sort.Direction.ASC, sortField));
        Page<User> pagedResult = userRepo.findAll(paging);
        return pagedResult.toList();
	}
	
	@Override
	public List<User> findSearchByName(String searchString,Pageable pageable) {
        Page<User> users = userRepo.findByName(searchString, pageable);
        return users.toList();
	}
	
	@Override
	public List<User> findSearchByAge(Integer searchString,Pageable pageable) {
        Page<User> users = userRepo.findByAge(searchString, pageable);
        return users.toList();
	}

}

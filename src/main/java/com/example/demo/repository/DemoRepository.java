package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Administrator on 2020/9/19.
 */
public interface DemoRepository extends PagingAndSortingRepository<User, Long> {
}

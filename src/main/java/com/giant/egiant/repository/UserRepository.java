package com.giant.egiant.repository;

import com.giant.egiant.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author by chhai.chivon  on 11/27/17.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
}

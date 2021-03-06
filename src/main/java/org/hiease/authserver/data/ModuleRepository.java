package org.hiease.authserver.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface ModuleRepository extends CrudRepository<Module, Long> {
//    @Query("from Module where id in (select distinct appId from UserRole where userId = :userId) order by id")
//    List<Module> findByUser(@Param("userId") String userId);
    @Query("from Module order by id")
    List<Module> findAll();
}

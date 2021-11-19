package com.bootmvc.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.bootmvc.entities.ContactsMasterEntity;

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

}

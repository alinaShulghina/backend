package com.hello;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by alin- on 18.08.2017.
 */
public interface ContactsRepo extends CrudRepository<Contact, Long> {

}

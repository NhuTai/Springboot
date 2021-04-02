package com.nnt.demo.repository;

import com.nnt.demo.model.Person;
import com.nnt.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}

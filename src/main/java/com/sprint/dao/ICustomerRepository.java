package com.sprint.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.entities.Customer;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}

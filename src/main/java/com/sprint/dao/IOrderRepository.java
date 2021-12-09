package com.sprint.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sprint.entities.Orders;


@Repository
public interface IOrderRepository extends JpaRepository<Orders, Integer> {

}

package com.stephenowinoh.Springboot.DockerInsideK8S.repository;


import com.stephenowinoh.Springboot.DockerInsideK8S.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}

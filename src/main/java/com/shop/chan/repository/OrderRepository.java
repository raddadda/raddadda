package com.shop.chan.repository;

import com.shop.chan.entity.Member;
import com.shop.chan.entity.Order;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findOrdersByMemberId(Long id);
}

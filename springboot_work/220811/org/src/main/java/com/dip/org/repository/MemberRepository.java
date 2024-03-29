package com.dip.org.repository;

import com.dip.org.entity.Customer;
import com.dip.org.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

}

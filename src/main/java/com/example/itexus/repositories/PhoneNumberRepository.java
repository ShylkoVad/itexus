package com.example.itexus.repositories;

import com.example.itexus.domain.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {
    List<PhoneNumber> findByUserId(int userId);
}

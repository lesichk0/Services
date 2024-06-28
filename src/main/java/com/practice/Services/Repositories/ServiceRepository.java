package com.practice.Services.Repositories;

import com.practice.Services.Entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}

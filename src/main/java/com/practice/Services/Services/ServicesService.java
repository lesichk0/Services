package com.practice.Services.Services;

import com.practice.Services.Entities.Service;

import java.util.List;

public interface ServicesService {
    List<Service> getAllServices();
    Service saveService(Service service);
    Service updateService(Service service);
    Service getServiceById(Long id);
    void deleteServiceById(Long id);
}
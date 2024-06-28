package com.practice.Services.Services.Implement;

//import org.springframework.stereotype.Service;

import com.practice.Services.Entities.Service;
import com.practice.Services.Repositories.ServiceRepository;
import com.practice.Services.Services.ServicesService;

import java.util.List;

@org.springframework.stereotype.Service
public class ServicesServiceImpl implements ServicesService {
    private ServiceRepository serviceRepository;

    public ServicesServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<Service> getAllServices(){
        return serviceRepository.findAll();
    }
}

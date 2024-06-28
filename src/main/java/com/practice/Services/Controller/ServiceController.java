package com.practice.Services.Controller;

import com.practice.Services.Services.ServicesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {
    private ServicesService servicesService;

    public ServiceController(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @GetMapping("/services")
    public String listServuces(Model model){
        model.addAttribute("services", servicesService.getAllServices());
        return "services";
    }
}

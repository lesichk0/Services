package com.practice.Services.Controller;

import com.practice.Services.Services.ServicesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.practice.Services.Entities.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/services/new")
    public String createServiceForm(Model model){
        Service service = new Service();
        model.addAttribute("service", service);
        return "create_service";
    }

    @PostMapping("/services")
    public String saveService(@ModelAttribute("service") Service service){
        servicesService.saveService(service);
        return "redirect:/services";
    }
}

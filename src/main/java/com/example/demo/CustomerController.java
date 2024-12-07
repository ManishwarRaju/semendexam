package com.example.demo;


import com.example.Customer;
import com.example.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerDao customerService;

    @PutMapping("/{id}")
    public Customer updateCustomerDetails(
            @PathVariable("id") Long customerId,
            @RequestParam String name,
            @RequestParam String address) {
        return customerService.updateCustomer(customerId, name, address);
    }
}

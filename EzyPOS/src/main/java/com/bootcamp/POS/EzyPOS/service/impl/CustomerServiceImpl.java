package com.bootcamp.POS.EzyPOS.service.impl;

import com.bootcamp.POS.EzyPOS.Repo.CustomerRepo;
import com.bootcamp.POS.EzyPOS.dto.request.CustomerDto;
import com.bootcamp.POS.EzyPOS.entity.Customer;
import com.bootcamp.POS.EzyPOS.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String saveCustomer(CustomerDto dto) {
        Customer c1=new Customer(
                "id",
                dto.getName(),
                dto.getAddress(),
                dto.getSalary()
        );
        customerRepo.save(c1);
        return c1.getId()+"-saved";
    }

    @Override
    public String updateCustomer(CustomerDto dto, String id) {
        return null;
    }

    @Override
    public String findCustomer(String id) {
        return null;
    }

    @Override
    public String deleteCustomer(String id) {
        return null;
    }

    @Override
    public String findAllCustomer() {
        return null;
    }
}

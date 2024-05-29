package com.bootcamp.POS.EzyPOS.service;

import com.bootcamp.POS.EzyPOS.dto.request.CustomerDto;

public interface CustomerService {
    public String saveCustomer(CustomerDto dto);
    public String updateCustomer(CustomerDto dto, String id);
    public String findCustomer(String id);
    public String deleteCustomer(String id);
    public String findAllCustomer();

}

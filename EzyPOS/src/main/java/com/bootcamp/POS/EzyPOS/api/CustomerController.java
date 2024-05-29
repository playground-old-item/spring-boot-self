package com.bootcamp.POS.EzyPOS.api;

import com.bootcamp.POS.EzyPOS.dto.request.CustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDto dto){
        return dto.toString();
    }
    @PutMapping(path = "/modify",params = "{id}")
    public String updateCustomer(@RequestBody CustomerDto dto, @RequestParam String id){
        return id+"Updated";
    }
    @GetMapping("/{id}")
    public String findCustomer(@PathVariable String id){
        return id+" find";
    }
    @DeleteMapping("/remove/{id}")
    public String deleteCustomer(@PathVariable String id){
        return id+" deleted";
    }
    @GetMapping("/list")
    public String findAllCustomer(){
        return "find all ";
    }
}

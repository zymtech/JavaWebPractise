package org.smart4j.chapter2.service;

import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 10/23/2016.
 */
public class CustomerService {
    public List<Customer> getCustomerList(){
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }
    public Customer getCustomer(long id){
        String sql = "SELECT * FROM customer WHERE id=" + String.valueOf(id);
        return DatabaseHelper.queryEntity(Customer.class, sql);
    }
    public boolean createCustomer(Map<String,Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }
    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class, id , fieldMap);
    }
    public boolean deleteCustomer(long id){
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}

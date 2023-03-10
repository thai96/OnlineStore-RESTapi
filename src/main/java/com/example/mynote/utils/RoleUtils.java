package com.example.mynote.utils;

import com.example.mynote.exception.ResourceNotFoundException;
import com.example.mynote.payload.Role;

public class RoleUtils {
    public static Role getRoleByInt(int roleId){
        switch (roleId){
            case 1: {
                return Role.EMPLOYEE;
            }
            case 2:{
                return Role.CUSTOMER;
            }
            default:
                throw new ResourceNotFoundException("Role not existed!");
        }
    }

    public static Integer getRoleIdByRole(Role role){
        switch (role){
            case EMPLOYEE: {
                return 1;
            }
            case CUSTOMER:{
                return 2;
            }
            default:
                throw new ResourceNotFoundException("role not existed!");
        }
    }

    public static int getRoleByString(String role){
        switch (role.trim().toLowerCase()){
            case "employee":{
                return 1;
            }
            case "customer":{
                return 2;
            }
            default:
                throw new ResourceNotFoundException("Role not existed!");
        }
    }

    public static String getRoleString(int roleId){
        switch (roleId){
            case 1: {
                return "Employee";
            }
            case 2:{
                return "Customer";
            }
            default:
                throw new ResourceNotFoundException("Role not existed!");
        }
    }
}

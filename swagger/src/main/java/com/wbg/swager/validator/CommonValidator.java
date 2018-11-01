package com.wbg.swager.validator;

import com.wbg.swager.entitys.Order;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

public class CommonValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        if (aClass == Order.class) {
            System.out.println("Ordsssss的。");

        }
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (o == null) {
            errors.reject("err.d");
        }

        Order order=(Order) o;

        if(order.getEmail()==null||!Pattern.matches("^[a-zA-Z0-9]+@[a-zA-Z.]+$", order.getEmail())){
            errors.rejectValue("email",null,"s,你是不是");

        }
        if(order.getOrderId()==null||order.getOrderId().trim().length()!=10){
            errors.rejectValue("orderId", null, "你s");
        }

    }
}

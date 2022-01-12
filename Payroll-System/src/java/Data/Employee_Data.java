/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Num1
 */
public class Employee_Data {

    private String code ;
    private String code_value;
    private double salary ;
    private String pay_method ;
    private double salary_to_date ;
    private String city ; 

    
    public void setCode(String code) {
        this.code = code;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }

    public void setSalary_to_date(double salary_to_date) {
        this.salary_to_date = salary_to_date;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    

    public String getCode() {
        return code;
    }

    public double getSalary() {
        return salary;
    }

    public String getPay_method() {
        return pay_method;
    }

    public double getSalary_to_date() {
        return salary_to_date;
    }

    public String getCity() {
        return city;
    }
    
    public String getCode_value() {
        return code_value;
    }

    public void setCode_value(String code_value) {
        this.code_value = code_value;
    }
    
}

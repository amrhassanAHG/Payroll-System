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
public class result_Data {

    private int Emp_code;
    private double salary;
    private int month_num;
    private int week_num;
    private double salary_to_date;
    private double total_pay_to_date;
    private double pay_table_A;
    private double total_taxable;
    private double total_tax_due;

    public int getEmp_code() {
        return Emp_code;
    }

    public double getSalary() {
        return salary;
    }

    public int getMonth_num() {
        return month_num;
    }

    public int getWeek_num() {
        return week_num;
    }

    public double getSalary_to_date() {
        return salary_to_date;
    }

    public double getTotal_pay_to_date() {
        return total_pay_to_date;
    }

    public double getPay_table_A() {
        return pay_table_A;
    }

    public double getTotal_taxable() {
        return total_taxable;
    }

    public double getTotal_tax_due() {
        return total_tax_due;
    }

    public void setEmp_code(int Emp_code) {
        this.Emp_code = Emp_code;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMonth_num(int month_num) {
        this.month_num = month_num;
    }

    public void setWeek_num(int week_num) {
        this.week_num = week_num;
    }

    public void setSalary_to_date(double salary_to_date) {
        this.salary_to_date = salary_to_date;
    }

    public void setTotal_pay_to_date(double total_pay_to_date) {
        this.total_pay_to_date = total_pay_to_date;
    }

    public void setPay_table_A(double pay_table_A) {
        this.pay_table_A = pay_table_A;
    }

    public void setTotal_taxable(double total_taxable) {
        this.total_taxable = total_taxable;
    }

    public void setTotal_tax_due(double total_tax_due) {
        this.total_tax_due = total_tax_due;
    }

}

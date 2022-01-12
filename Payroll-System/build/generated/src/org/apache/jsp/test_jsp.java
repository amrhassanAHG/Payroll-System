package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Data.Employee_Data;
import Data.DB_operation;
import Data.Conn;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"ErrorPages/Alert.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      Data.Employee_Data Emp_obj = null;
      synchronized (session) {
        Emp_obj = (Data.Employee_Data) _jspx_page_context.getAttribute("Emp_obj", PageContext.SESSION_SCOPE);
        if (Emp_obj == null){
          Emp_obj = new Data.Employee_Data();
          _jspx_page_context.setAttribute("Emp_obj", Emp_obj, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      Data.result_Data result_obj = null;
      synchronized (session) {
        result_obj = (Data.result_Data) _jspx_page_context.getAttribute("result_obj", PageContext.SESSION_SCOPE);
        if (result_obj == null){
          result_obj = new Data.result_Data();
          _jspx_page_context.setAttribute("result_obj", result_obj, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title> </title>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");

            int code = Integer.parseInt(Emp_obj.getCode());
            int code_value = Integer.parseInt(Emp_obj.getCode_value());
            out.print(code_value);
            double salary = Emp_obj.getSalary();
            int pay_method = Integer.parseInt(Emp_obj.getPay_method());
            double salary_to_date = Emp_obj.getSalary_to_date();
            int city = Integer.parseInt(Emp_obj.getCity());

            int month_number = 0;
            int week_number = 0;

            double value_table_A = 0.0;
            int total_taxable = 0;
            double taxes = 0.0;
            double month[] = {0, 416.67, 833.34, 1250.01, 1666.68, 2083.35, 2500.02, 2916.69, 3333.36, 3750.03, 4166.70, 4583.37, 5000.04};
            double week[] = {0, 96.16, 192.32, 288.48, 384.64, 480.80, 576.96, 673.12, 769.28, 865.44,
                961.60, 1057.76, 1153.92, 1250.08, 1346.24, 1442.40, 1538.56, 1634.72, 1730.88, 1827.04,
                1923.20, 2019.36, 2115.52, 2211.68, 2307.84, 2404.00, 2500.16, 2500.16, 2692.48, 2788.64,
                2884.80, 2980.96, 3077.12, 3173.28, 3269.44, 3365.60, 3461.76, 3557.92, 3654.08, 3750.24,
                3846.40, 3942.56, 4038.72, 4134.88, 4231.04, 4327.20, 4423.36, 4519.52, 4615.68, 4711.84,
                4808.00, 4904.16, 5000.32};

            result_obj.setEmp_code(code);
            result_obj.setSalary(salary);
            result_obj.setSalary_to_date(salary_to_date);

            try {
                DB_operation op = new DB_operation();
                if (code_value == 200) {
                    if (city < 0) {
                        if (pay_method < 0) {
                            month_number = pay_method * (-1);
                            result_obj.setMonth_num(month_number);
                        }

                        double max_salary_to_date = salary * (month_number);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.20);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    } else if (pay_method > 0) {
                        week_number = pay_method;
                        result_obj.setWeek_num(week_number);

                        double max_salary_to_date = salary * (week_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.20);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    }
                } else if (city > 0) {
                    if (pay_method < 0) {
                        month_number = pay_method * (-1);
                        result_obj.setMonth_num(month_number);

                        double max_salary_to_date = salary * (month_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.20);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    } else {
                        week_number = pay_method;
                        result_obj.setWeek_num(week_number);

                        double max_salary_to_date = salary * (week_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.20);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    }
                } else if (code_value == 201) {
                    if (city < 0) {
                        if (pay_method < 0) {
                            month_number = pay_method * (-1);
                            result_obj.setMonth_num(month_number);
                        }

                        double max_salary_to_date = salary * (month_number);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.40);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    } else if (pay_method > 0) {
                        week_number = pay_method;
                        result_obj.setWeek_num(week_number);

                        double max_salary_to_date = salary * (week_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.40);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    }
                } else if (city > 0) {
                    if (pay_method < 0) {
                        month_number = pay_method * (-1);
                        result_obj.setMonth_num(month_number);

                        double max_salary_to_date = salary * (month_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.40);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    } else {
                        week_number = pay_method;
                        result_obj.setWeek_num(week_number);

                        double max_salary_to_date = salary * (week_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.40);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    }
                    ////// calculate for D1 //////
                } else if (code_value == 202) {
                    if (city < 0) {
                        if (pay_method < 0) {
                            month_number = pay_method * (-1);
                            result_obj.setMonth_num(month_number);
                        }

                        double max_salary_to_date = salary * (month_number);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.45);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    } else if (pay_method > 0) {
                        week_number = pay_method;
                        result_obj.setWeek_num(week_number);

                        double max_salary_to_date = salary * (week_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.45);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    }
                } else if (city > 0) {
                    if (pay_method < 0) {
                        month_number = pay_method * (-1);
                        result_obj.setMonth_num(month_number);

                        double max_salary_to_date = salary * (month_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.45);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    } else {
                        week_number = pay_method;
                        result_obj.setWeek_num(week_number);

                        double max_salary_to_date = salary * (week_number - 1);
                        double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                        if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                            response.sendRedirect("New calculate.html");
                        } else {
                            double total_pay_to_date = salary + salary_to_date;
                            result_obj.setTotal_pay_to_date(total_pay_to_date);
                            total_taxable = (int) (total_pay_to_date - value_table_A);
                            result_obj.setTotal_taxable(total_taxable);
                            taxes = total_taxable * (0.45);
                            result_obj.setTotal_tax_due(taxes);
                        }
                        response.sendRedirect("print_result.jsp");
                    }
                } else if (code_value == 203) {
                    if (city < 0) {
                        if (pay_method < 0) {
                            month_number = pay_method * (-1);
                            result_obj.setMonth_num(month_number);
                            if (code > 500) {
                                double x = (code / 500) * month[month_number];
                                int y = code % 500;
                                float z = op.getCodeValue_M(y, month_number);
                                value_table_A = z + x;
                                result_obj.setPay_table_A(value_table_A);

                            } else {
                                value_table_A = op.getCodeValue_M(code, month_number);
                                result_obj.setPay_table_A(value_table_A);

                            }
                            double max_salary_to_date = salary * (month_number - 1);
                            double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                            if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                                response.sendRedirect("New calculate.html");
                            } else {
                                double total_pay_to_date = salary + salary_to_date;
                                result_obj.setTotal_pay_to_date(total_pay_to_date);
                                total_taxable = (int) (total_pay_to_date - value_table_A);
                                result_obj.setTotal_taxable(total_taxable);
                            }

                            int check_value = op.checkValue_M(month_number);
                            if (total_taxable <= check_value) {
                                taxes = total_taxable * (0.20);
                                result_obj.setTotal_tax_due(taxes);
                            } else {
                                int column2_c = op.getC_column2_M(month_number);
                                if (total_taxable <= column2_c) {
                                    double newValue = (total_taxable - check_value) * (0.40);
                                    taxes = newValue + op.getC_column3_M(month_number);
                                    result_obj.setTotal_tax_due(taxes);
                                } else {
                                    double newValue = (total_taxable - op.getC_column2_M(month_number)) * (0.45);
                                    taxes = newValue + op.getC_column4_M(month_number);
                                    result_obj.setTotal_tax_due(taxes);
                                }
                            }
                            response.sendRedirect("print_result.jsp");
                        } else if (pay_method > 0) {
                            week_number = pay_method;
                            result_obj.setWeek_num(week_number);
                            if (code > 500) {
                                double x = (code / 500) * week[week_number];
                                int y = code % 500;
                                float z = op.getCodeValue_W(y, week_number);
                                value_table_A = z + x;
                                result_obj.setPay_table_A(value_table_A);
                            } else {
                                value_table_A = op.getCodeValue_W(code, week_number);
                                result_obj.setPay_table_A(value_table_A);
                            }
                            double max_salary_to_date = salary * (week_number - 1);
                            double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                            if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                                response.sendRedirect("New calculate.html");
                            } else {
                                double total_pay_to_date = salary + salary_to_date;
                                result_obj.setTotal_pay_to_date(total_pay_to_date);
                                total_taxable = (int) (total_pay_to_date - value_table_A);
                                result_obj.setTotal_taxable(total_taxable);
                            }

                            int check_value = op.checkValue_W(week_number);
                            if (total_taxable <= check_value) {
                                taxes = total_taxable * (0.20);
                                result_obj.setTotal_tax_due(taxes);
                            } else {
                                int column2_c = op.getC_column2_W(week_number);
                                if (total_taxable <= column2_c) {
                                    double newValue = (total_taxable - check_value) * (0.40);
                                    taxes = newValue + op.getC_column3_W(week_number);
                                    result_obj.setTotal_tax_due(taxes);
                                } else {
                                    double newValue = (total_taxable - op.getC_column2_W(week_number)) * (0.45);
                                    taxes = newValue + op.getC_column4_W(week_number);
                                    result_obj.setTotal_tax_due(taxes);
                                }
                            }
                            response.sendRedirect("print_result.jsp");
                        }
                    } else if (city > 0) {
                        if (pay_method < 0) {
                            month_number = pay_method * (-1);
                            result_obj.setMonth_num(month_number);
                            if (code > 500) {
                                double x = (code / 500) * month[month_number];
                                int y = code % 500;
                                float z = op.getCodeValue_M(y, month_number);
                                value_table_A = z + x;
                                result_obj.setPay_table_A(value_table_A);
                            } else {
                                value_table_A = op.getCodeValue_M(code, month_number);
                                result_obj.setPay_table_A(value_table_A);
                            }
                            double max_salary_to_date = salary * (month_number - 1);
                            double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                            if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                                response.sendRedirect("New calculate.html");
                            } else {
                                double total_pay_to_date = salary + salary_to_date;
                                result_obj.setTotal_pay_to_date(total_pay_to_date);
                                total_taxable = (int) (total_pay_to_date - value_table_A);
                                result_obj.setTotal_taxable(total_taxable);
                            }

                            int check_value = op.checkValue_M_scottish(month_number);
                            if (total_taxable <= check_value) {
                                taxes = total_taxable * (0.20);
                                result_obj.setTotal_tax_due(taxes);
                            } else {
                                int column2_c = op.getC_column2_M_scottish(month_number);
                                if (total_taxable <= column2_c) {
                                    double newValue = (total_taxable - check_value) * (0.40);
                                    taxes = newValue + op.getC_column3_M_scottish(month_number);
                                    result_obj.setTotal_tax_due(taxes);
                                } else {
                                    double newValue = (total_taxable - op.getC_column2_M_scottish(month_number)) * (0.45);
                                    taxes = newValue + op.getC_column4_M_scottish(month_number);
                                    result_obj.setTotal_tax_due(taxes);
                                }
                            }
                            response.sendRedirect("print_result.jsp");
                        } else {
                            week_number = pay_method;
                            result_obj.setWeek_num(week_number);
                            if (code > 500) {
                                double x = (code / 500) * week[week_number];
                                int y = code % 500;
                                float z = op.getCodeValue_W(y, week_number);
                                value_table_A = z + x;
                                result_obj.setPay_table_A(value_table_A);
                            } else {
                                value_table_A = op.getCodeValue_W(code, week_number);
                                result_obj.setPay_table_A(value_table_A);
                            }
                            double max_salary_to_date = salary * (week_number - 1);
                            double min_salary_to_date = max_salary_to_date - (max_salary_to_date * 30 / 100);

                            if (!(salary_to_date >= min_salary_to_date && salary <= max_salary_to_date)) {
                                response.sendRedirect("New calculate.html");
                            } else {
                                double total_pay_to_date = salary + salary_to_date;
                                result_obj.setTotal_pay_to_date(total_pay_to_date);
                                total_taxable = (int) (total_pay_to_date - value_table_A);
                                result_obj.setTotal_taxable(total_taxable);
                            }

                            int check_value = op.checkValue_W_scottish(week_number);
                            if (total_taxable <= check_value) {
                                taxes = total_taxable * (0.20);
                                result_obj.setTotal_tax_due(taxes);

                            } else {
                                int column2_c = op.getC_column2_W_scottish(week_number);
                                if (total_taxable <= column2_c) {
                                    double newValue = (total_taxable - check_value) * (0.40);
                                    taxes = newValue + op.getC_column3_W_scottish(week_number);
                                    result_obj.setTotal_tax_due(taxes);
                                } else {
                                    double newValue = (total_taxable - op.getC_column2_W_scottish(week_number)) * (0.45);
                                    taxes = newValue + op.getC_column4_W_scottish(week_number);
                                    result_obj.setTotal_tax_due(taxes);
                                }
                            }
                            response.sendRedirect("print_result.jsp");
                        }
                    }
                }
            } catch (Exception e) {

            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

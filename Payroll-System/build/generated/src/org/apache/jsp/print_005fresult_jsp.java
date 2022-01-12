package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Data.result_Data;

public final class print_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 8192, true);
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <link href=\"css/payroll_Design.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("            <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("            <link href=\"//fonts.googleapis.com/css?family=Hind:300,400,500,600,700\" rel=\"stylesheet\"> \n");
      out.write("            <title> Result </title>\n");
      out.write("        </head>\n");
      out.write("    ");

        int code = result_obj.getEmp_code();
        double salary = result_obj.getSalary();
        int month_num = result_obj.getMonth_num();
        int week_num = result_obj.getWeek_num();
        double salary_to_date = result_obj.getSalary_to_date();
        double total_pay_to_date = result_obj.getTotal_pay_to_date();
        double pay_table_A = result_obj.getPay_table_A();
        double total_taxable = result_obj.getTotal_taxable();
        double total_tax_due = result_obj.getTotal_tax_due();
    
      out.write("\n");
      out.write("    <body> \n");
      out.write("        <header>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <ul class=\"main-nav\" class=\"active\">\n");
      out.write("                    <li class=\"active\"> <a href=\"About.html\" > Getting started </a></li>\n");
      out.write("                    <li> <a href=\"Login.html\" > LOG IN </a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"payroll_layout\">\n");
      out.write("                <div class=\"outdiv\"> \n");
      out.write("                    <div class=\"text_layer\">\n");
      out.write("                        <h3 class=\"headerh3\"> Your result </h3>\n");
      out.write("\n");
      out.write("                        <form>\n");
      out.write("                            Code : ");
      out.print( code);
      out.write(" <br><br>\n");
      out.write("                            Salary : ");
      out.print( salary);
      out.write("<br><br>\n");
      out.write("                            Month number : ");
      out.print( month_num);
      out.write(" <br><br>\n");
      out.write("                            Week number : ");
      out.print( week_num);
      out.write("<br><br>\n");
      out.write("                            Salary to date : ");
      out.print( salary_to_date);
      out.write("<br><br>\n");
      out.write("                            Total pay to date : ");
      out.print( total_pay_to_date);
      out.write("<br><br>\n");
      out.write("                            Pay in table A : ");
      out.print( pay_table_A);
      out.write("<br><br>\n");
      out.write("                            Total taxable : ");
      out.print( total_taxable);
      out.write("<br><br>\n");
      out.write("                            Total tax due : ");
      out.print( total_tax_due);
      out.write("<br><br>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("\n");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Num1
 */
public class DB_operation {

    public float getCodeValue_M(int code, int month) {

        float value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from month" + month);
            while (rs.next()) {
                if (rs.getInt("code") == code) {
                    value = rs.getFloat("data");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public float getCodeValue_W(int code, int week) {

        float value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from week" + week);
            while (rs.next()) {
                if (rs.getInt("code") == code) {
                    value = rs.getFloat("data");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public int checkValue_M(int month) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from monthly_paid_uk");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getInt("column1");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public int checkValue_W(int week) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from weekly_paid_uk");
            while (rs.next()) {
                if (rs.getInt("week") == week) {
                    value = rs.getInt("column1");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public int getC_column2_M(int month) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_monthly_paid_uk");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getInt("column2");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column3_M(int month) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_monthly_paid_uk");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getDouble("column3");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column4_M(int month) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_monthly_paid_uk");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getDouble("column4");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public int getC_column2_W(int week) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_weekly_paid_uk");
            int weeks = 1;
            while (rs.next()) {
                if (weeks == week) {
                    value = rs.getInt("column2");
                    break;
                }
                ++weeks;
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column3_W(int week) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_weekly_paid_uk");
            int weeks = 1;
            while (rs.next()) {
                if (weeks == week) {
                    value = rs.getDouble("column3");
                    break;
                }
                ++weeks;
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column4_W(int week) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_weekly_paid_uk");
            int weeks = 1;
            while (rs.next()) {
                if (weeks == week) {
                    value = rs.getDouble("column4");
                    break;
                }
                ++weeks;
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }
//////////////////////////Scottish//////////////////////////
    public int checkValue_M_scottish(int month) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from monthly_paid_scottish");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getInt("column1");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public int checkValue_W_scottish(int week) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from weekly_paid_scottish");
            while (rs.next()) {
                if (rs.getInt("week") == week) {
                    value = rs.getInt("column1");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public int getC_column2_M_scottish(int month) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_monthly_paid_scottish");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getInt("column2");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column3_M_scottish(int month) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_monthly_paid_scottish");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getDouble("column3");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column4_M_scottish(int month) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_monthly_paid_scottish");
            while (rs.next()) {
                if (rs.getInt("month") == month) {
                    value = rs.getDouble("column4");
                    break;
                }
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public int getC_column2_W_scottish(int week) {

        int value = 0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_weekly_paid_scottish");
            int weeks = 1;
            while (rs.next()) {
                if (weeks == week) {
                    value = rs.getInt("column2");
                    break;
                }
                ++weeks;
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column3_W_scottish(int week) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_weekly_paid_uk_scottish");
            int weeks = 1;
            while (rs.next()) {
                if (weeks == week) {
                    value = rs.getDouble("column3");
                    break;
                }
                ++weeks;
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    public double getC_column4_W_scottish(int week) {

        double value = 0.0;
        try {
            Conn c = new Conn();
            Connection con = c.getConnection();

            ResultSet rs = con.createStatement().executeQuery("select * from table_c_weekly_paid_scottish");
            int weeks = 1;
            while (rs.next()) {
                if (weeks == week) {
                    value = rs.getDouble("column4");
                    break;
                }
                ++weeks;
            }

            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return value;
    }
}


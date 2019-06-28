package com.pavithra.dropwizard.db.utils;


import model.Employee;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeMapper implements ResultSetMapper<Employee> {


    public Employee map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {



        Employee employee=new Employee(
                resultSet.getString("E_Id"),
                resultSet.getString("E_Name"),
                resultSet.getInt("E_Age"),
                resultSet.getString("E_Dob"),
                resultSet.getString("E_Place"),
                resultSet.getInt("E_PhoneNumber"),
                resultSet.getString("D_Id")
        );
        return employee;
    }
}

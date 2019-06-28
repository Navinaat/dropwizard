package com.pavithra.dropwizard.db;


import com.pavithra.dropwizard.db.utils.EmployeeMapper;
import model.Employee;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDAO {


    @SqlQuery("select * from  `employee` ")
    public List<Employee> getEmployee();
    @SqlQuery("select * from  `employee`  where E_Id= :E_Id")
    public Employee getEmploye(@Bind("E_Id") final String E_Id);
}

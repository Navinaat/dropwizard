package api.resource.Service;

import com.pavithra.dropwizard.db.EmployeeDAO;
import model.Employee;

import java.util.List;

public class EmployeeService {

    private   EmployeeDAO employeeDAO;


    public EmployeeService(final EmployeeDAO employeeDAO) {
        this.employeeDAO=employeeDAO;
    }
    public List<Employee> getEmployee(){
        return this.employeeDAO.getEmployee();
    }
    public Employee getEmploye(final String E_Id)
    {
        return  this.employeeDAO.getEmploye(E_Id);
    }

}

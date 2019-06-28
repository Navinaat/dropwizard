package api.resource.Service;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/employee")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResources {
    private EmployeeService employeeService;
    public EmployeeResources(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GET
    public Response getEmployee()
    {
        return Response.ok().entity(this.employeeService.getEmployee()).build();
    }


    @GET
    @Path("{E_Id}")
    public Response getEmploye(@PathParam("E_Id") final String E_Id)
    {
        return Response.ok().entity(this.employeeService.getEmploye(E_Id)).build();
    }



}

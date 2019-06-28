package model;

public class Employee {

    private String E_Id;
    private String E_Name;
    private int E_Age;
    private String E_Place;
    private String E_Dob;
    private int E_PhoneNumber;
    private String D_Id;


    @Override
    public String toString() {
        return "EmployeeApplication{" +
                "E_Id=" + E_Id +
                ",E_Name='" + E_Name + '\'' +
                ",E_Age=" + E_Age +
                ",E_Place='" + E_Place + '\'' +
                ",E_Dob='" + E_Dob + '\'' +
                ",E_PhoneNumber='" + E_PhoneNumber + '\'' +
                ",D_Id=" + D_Id +
                '}';
    }

    public Employee(String E_Id, String E_Name, int E_Age, String E_Place, String E_Dob, int E_PhoneNumber, String D_Id) {
        this.E_Id= E_Id;
        this.E_Name = E_Name;
        this.E_Age = E_Age;
        this.E_Place = E_Place;
        this.E_Dob = E_Dob;
        this.E_PhoneNumber = E_PhoneNumber;
        this.D_Id = D_Id;
    }

    public String getE_Id() {
        return E_Id;
    }

    public void setE_Id(String E_Id) {
        this.E_Id= E_Id;
    }

    public String getE_Name() {
        return E_Name;
    }

    public void setE_Name(String E_Name) {
        this.E_Name = E_Name;
    }

    public int getE_Age() {
        return E_Age;
    }

    public void setE_Age(int E_Age) {
        this.E_Age = E_Age;
    }

    public String getE_Place() {
        return E_Place;
    }

    public void setE_Place(String E_Place) {
        this.E_Place = E_Place;
    }

    public String getE_Dob() {
        return E_Dob;
    }

    public void setE_Dob(String E_Dob) {
        this.E_Dob = E_Dob;
    }

    public int getE_PhoneNumber() {
        return E_PhoneNumber;
    }

    public void setE_PhoneNumber(int E_PhoneNumber) {
        this.E_PhoneNumber = E_PhoneNumber;
    }

    public String getD_Id() {
        return D_Id;
    }

    public void setD_Id(String D_Id) {
        this.D_Id = D_Id;
    }



}

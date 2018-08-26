/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import daos.QueryEnum;

/**
 *
 * @author Ignatius
 */
public enum EntitiesEnum {
    COUNTRY("Countries"), COUNTRYID("countryId"), COUNTRYNAME("countryName"),
    DEPARTMENT("Departments"), DEPARTMENTID("departmentId"), DEPARTMENTNAME("departmentName"),
    EMPLOYEE("Employees"), EMPLOYEEID("employeeId"), EMPLOYEEFIRSTENAME("firstName")
    , EMPLOYEELASTNAME("lastName"), EMPLOYEEEMAIL("email"), EMPLOYEEPHONE("phoneNumber")
    , EMPLOYEEHIRE("hireDate"), EMPLOYEESALARY("salary"), EMPLOYEECOMMISSION("commissionPct"),
    JOB("Jobs"), JOBID("jobId"), JOBTITLE("jobTitle"), JOBMINSAL("minSalary"), JOBMAXSAL("maxSalary"),
    LOCATION("Locations"), LOCATIONID("locationId"), LOCATIONSTREETADDRESS("streetAddress")
    , LOCATIONPOSTALCODE("postalCode"), LOCATIONCITY("city"), LOCATIONSTATEPROVICE("stateProvince"),
    REGION("Regions"), REGIONID("regionId"), REGIONNAME("regionName");

    private final String property;

    private EntitiesEnum(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
    
    public QueryEnum getQueryEnum(EntitiesEnum entitiesEnum){
        switch(this){
            case COUNTRY: return QueryEnum.COUNTRY;
            case DEPARTMENT: return QueryEnum.DEPARTMENT;
            case EMPLOYEE: return QueryEnum.EMPLOYEE;
            case JOB: return QueryEnum.JOB;
            case LOCATION: return QueryEnum.LOCATION;
            case REGION: return QueryEnum.REGION;
        }
        return null;
    }
}

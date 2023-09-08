public class Employee {
    private String fullName;
    private String identifier;
    private long departmentId;

    public Employee(String name, String identifier, long departmentId) {
        this.fullName = fullName;
        this.identifier = identifier;
        this.departmentId = departmentId;
    }
    public String getIdentifier() {
        return identifier;
    }

    public long getDepartmentId() {
        return departmentId;
    }
}


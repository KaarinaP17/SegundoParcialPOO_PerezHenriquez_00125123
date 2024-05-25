class Employee extends OrganizationalUnit {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Empleado: " + name);
    }
}

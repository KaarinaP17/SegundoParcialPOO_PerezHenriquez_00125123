// Client
public class Main {
    public static void main(String[] args) {
        // Crear empleados
        OrganizationalUnit emp1 = new Employee("Juan");
        OrganizationalUnit emp2 = new Employee("María");
        OrganizationalUnit emp3 = new Employee("Pedro");

        // Crear departamentos
        OrganizationalUnit mainDept = new Department("Departamento Principal");
        OrganizationalUnit subDept1 = new Department("Departamento Secundario 1");
        OrganizationalUnit subDept2 = new Department("Departamento Secundario 2");

        // Agregar empleados a los departamentos
        ((Department) mainDept).addSubunit(emp1);
        ((Department) mainDept).addSubunit(emp2);
        ((Department) subDept1).addSubunit(emp3);

        // Agregar subdepartamentos al departamento principal
        ((Department) mainDept).addSubunit(subDept1);
        ((Department) mainDept).addSubunit(subDept2);

        // Mostrar la estructura organizativa
        mainDept.displayInfo();
    }
}

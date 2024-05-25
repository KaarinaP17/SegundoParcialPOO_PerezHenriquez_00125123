import java.util.ArrayList;
import java.util.List;

class Department extends OrganizationalUnit {
    private List<OrganizationalUnit> subunits;

    public Department(String name) {
        super(name);
        this.subunits = new ArrayList<>();
    }

    public void addSubunit(OrganizationalUnit unit) {
        subunits.add(unit);
    }

    public void removeSubunit(OrganizationalUnit unit) {
        subunits.remove(unit);
    }

    @Override
    public void displayInfo() {
        System.out.println("Departamento: " + name);
        for (OrganizationalUnit unit : subunits) {
            unit.displayInfo();
        }
    }
}
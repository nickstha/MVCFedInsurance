package fedinsurance;

public class Salary {
    int salaryMax;
    int salaryMin;
    String salaryRange;
    String salaryType;
    int projectedSalary;
    int currentSalary;

    public Salary(int aSalarymax, int aSalarymin) {
        this.salaryMax = aSalarymax;
        this.salaryMin = aSalarymin;
    }

    public int getSalaryMin() {
        return this.salaryMin;
    }
    public void setSalaryMin(int aSalary) {
        this.salaryMin = aSalary;
    }

    public int getSalaryMax() {
        return this.salaryMax;
    }
    public void setSalaryMax(int aSalary) {
        this.salaryMax = aSalary;
    }
}
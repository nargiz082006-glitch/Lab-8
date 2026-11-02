public class Vacancy {
    private int id;
    private String title;
    private String company;
    private double salary;

    public Vacancy(int id, String title, String company, double salary) {
        this.id = id;
        this.title = title;
        this.company = company;
        setSalary(salary);
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
        }
    }

    @Override
    public String toString() {
        return "Вакансия #" + id + ": " + title + " (" + company + ") — З/П: " + salary;
    }
}
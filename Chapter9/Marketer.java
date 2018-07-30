public class Marketer extends Employee {
    public Marketer() {
        super.setBaseSalary(50000);
    }
    public int getHours() {
		super.getHours();                // 40 hours/week
	}

	public double getSalary() {
		super.getSalary();               // $40,000.00
	}

	public int getVacationDays() {
		super.getVacationDays();         // 10 days
	}

	public String getVacationForm() {
		super.getVacationForm;         // yellow
	}
    
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
}

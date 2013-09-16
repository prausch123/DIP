package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyWage;
    private double totalHrsForYear;
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double t) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(t);
    }
    
    public void setHourlyRate(double h) {
        if(h > 0) {
            this.hourlyWage = h;
        }
    }
    
    public void setTotalHrsForYear(double h) {
        if(h > -1) { // Greater then negative one, because it's possible the employee worked 0 hours this year.
            this.totalHrsForYear = h;
        }
    }

    @Override
    public double getAnnualWages() {
        return this.hourlyWage * this.totalHrsForYear;
    }

}

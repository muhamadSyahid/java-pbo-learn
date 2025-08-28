
import java.time.LocalDate;

public class Report {
    private Integer income;
    private LocalDate date;

    public Report(Integer income, LocalDate date) {
        this.income = income;
        this.date = date;
    }

    public Integer getIncome() {
        return this.income;
    }
    public LocalDate getDate() {
        return this.date;
    }
}

package childs;

import parent.Employee;
import parent.Ranksenum;

public class Developer extends Employee {
    private final Ranksenum gradesen;
    private String ranks;
    private String phrase;

    public Ranksenum getGradesen() {
        return gradesen;
    }

    public Developer(String fio, int age, int salary, String ranks, Ranksenum gradesen, String phrase) {
        super(fio, age, salary);
        this.ranks = ranks;
        this.gradesen = gradesen;
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    @Override
    public void print() {
        System.out.println(ranks);
    }

    public void goToDayOff() {
        System.out.println("I am sick");
    }

    public void writeCode() {
        System.out.println("I am writing my algorithm!");
    }

    public void printPhrase(){ System.out.println(phrase); }

    @Override
    public String toString() {
        return "Developer{" +
                "gradesen=" + gradesen +
                ", ranks='" + ranks + '\'' +
                '}';
    }
}
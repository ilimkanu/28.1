package childs;

import parent.Manager;

public class Ceo extends Manager {
    private boolean hasCompanyCar;

    public Ceo(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public void print() {
        System.out.println(hasCompanyCar);
    }
    public void goToDayOff() {
        System.out.println("I will stay home");
    }

    public void goPublic(){
        System.out.println("I am going to public!");
    }
}

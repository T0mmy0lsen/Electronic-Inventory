package models;

public class BuildPrice {
    int cpu;

    public BuildPrice(int cpu) {
        this.cpu = cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getPrice() {
        return cpu;
    }
}

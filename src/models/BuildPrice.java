package models;

public class BuildPrice {
    int cpu, motherboard, cabinet, cooler, powersupply, ram, storage;

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setMotherboard(int motherboard) {
        this.motherboard = motherboard;
    }

    public void setPowersupply(int powersupply) {
        this.powersupply = powersupply;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public void setCooler(int cooler) {
        this.cooler = cooler;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getCpu() {
        return cpu;
    }

    public int getMotherboard() {
        return motherboard;
    }

    public int getCabinet() {
        return cabinet;
    }

    public int getCooler() {
        return cooler;
    }

    public int getPowersupply() {
        return powersupply;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getPrice() {
        return cpu + motherboard + storage + ram + powersupply + cooler + cabinet;
    }
}

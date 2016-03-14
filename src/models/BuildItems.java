package models;

import java.util.ArrayList;

public class BuildItems {
    int cpu = -1, motherboard = -1, cabinet = -1, cooler = -1, powersupply = -1, ram = -1, storage = -1;

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setMotherboard(int motherboard) {
        this.motherboard = motherboard;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }

    public void setCooler(int cooler) {
        this.cooler = cooler;
    }

    public void setPowersupply(int powersupply) {
        this.powersupply = powersupply;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public ArrayList<Integer> getIds(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(cpu); list.add(motherboard); list.add(cabinet); list.add(cooler);
        list.add(powersupply); list.add(ram); list.add(storage);
        return list;
    }
}

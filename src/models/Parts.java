package models;

public class Parts {
    String manufacturer = null, modelname = null, size = null, socket = null, memory_type = null, type = null;
    int price = 0, cache = 0, power_com = 0, power_out = 0, cores = 0, memory = 0;
    double speed = 0;
    boolean cooler = false, onboard_graphic = false;

    public Parts(String manufacturer, String modelname, String size, String socket, String memory_type, String type, int price, int cache, int power_com, int power_out, double speed, int cores, int memory, boolean cooler, boolean onboard_graphic) {
        this.manufacturer = manufacturer;
        this.modelname = modelname;
        this.size = size;
        this.socket = socket;
        this.memory_type = memory_type;
        this.price = price;
        this.cache = cache;
        this.power_com = power_com;
        this.power_out = power_out;
        this.speed = speed;
        this.cores = cores;
        this.type = type;
        this.memory = memory;
        this.cooler = cooler;
        this.onboard_graphic = onboard_graphic;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelname() {
        return modelname;
    }

    public String getSize() {
        return size;
    }

    public String getSocket() {
        return socket;
    }

    public String getMemory_type() {
        return memory_type;
    }

    public int getPrice() {
        return price;
    }

    public int getCache() {
        return cache;
    }

    public int getPower_com() {
        return power_com;
    }

    public int getPower_out() {
        return power_out;
    }

    public double getSpeed() {
        return speed;
    }

    public int getCores() {
        return cores;
    }

    public String getType() {
        return type;
    }

    public int getMemory() {
        return memory;
    }

    public boolean isCooler() {
        return cooler;
    }

    public boolean isOnboard_graphic() {
        return onboard_graphic;
    }

}



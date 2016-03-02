package models;

public class Cpu {

    private String _socket, _manufacture, _modelname, _type;
    private int _price, _cores, _speed, _power_com, _cache;
    private boolean _cooler;

    public Cpu(String manufacture, String socket, int cache, int power_com, boolean cooler, String modelname,
               int speed, int cores, int price, String type) {

        _manufacture = manufacture;
        _cache = cache;
        _socket = socket;
        _power_com = power_com;
        _cooler = cooler;
        _modelname = modelname;
        _speed = speed;
        _cores = cores;
        _price = price;
        _type = type;
    }

    public String getManufacture(){
        return _manufacture;
    }

    public String getSocket(){
        return _socket;
    }

    public int getCache(){
        return _cache;
    }

    public int getPower(){
        return _power_com;
    }

    public boolean getCooler() {
        return _cooler;
    }

    public String getModelname(){
        return _modelname;
    }

    public int getSpeed(){
        return _speed;
    }

    public int getCores(){
        return _cores;
    }

    public int getPrice(){
        return _price;
    }

    public String getType(){
        return _type;
    }
}

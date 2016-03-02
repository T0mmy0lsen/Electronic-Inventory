package models;

public class Ram {

    private String _type, _manufacture, _modelname;
    private int _speed, _memory, _price;

    public Ram(String manufacture, int speed, String type, int memory, int price, String modelname) {
        _manufacture = manufacture;
        _speed = speed;
        _type = type;
        _memory = memory;
        _price = price;
        _modelname = modelname;

    }

    public String getManufacture(){
        return _manufacture;
    }

    public String getModelname(){
        return _modelname;
    }

    public int getSpeed(){
        return _speed;
    }

    public int getMemory(){
        return _memory;
    }

    public int getPrice(){
        return _price;
    }

    public String getType(){
        return _type;
    }
}

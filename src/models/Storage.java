package models;

public class Storage {

    private String _type, _manufacture, _modelname;
    private int _memory, _price;

    public Storage(String manufacture, String modelname, String type, int memory, int price) {
        _manufacture = manufacture;
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

package models;

public class Graphiccard {

    private String _manufacture;
    private String _name_processor;
    private String _modelname;
    private int _price, _memory, _power_com;

    public Graphiccard(String manufacture, String name_processor, String modelname,  int memory, int power_com, int price) {
        _manufacture = manufacture;
        _memory = memory;
        _name_processor = name_processor;
        _power_com = power_com;
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

    public int getPowercom(){
        return _power_com;
    }

    public int getPrice(){
        return _price;
    }

    public String getNameproc(){
        return _name_processor;
    }
}

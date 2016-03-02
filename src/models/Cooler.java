package models;

public class Cooler {

    private String _manufacture, _modelname;
    private int _price;

    public Cooler(String manufacture, String modelname, int price) {

        _manufacture = manufacture;
        _modelname = modelname;
        _price = price;
    }

    public String getManufacture(){
        return _manufacture;
    }

    public String getModelname(){
        return _modelname;
    }

    public int getPrice(){
        return _price;
    }
}

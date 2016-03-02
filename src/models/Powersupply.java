package models;

public class Powersupply {

    private String _manufacture, _modelname;
    private int _price, _powerout;

    public Powersupply(String manufacture, String modelname, int powerout, int price) {
        _manufacture = manufacture;
        _price = price;
        _powerout = powerout;
        _modelname = modelname;

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

    public int getPowerout(){
        return _powerout;
    }
}

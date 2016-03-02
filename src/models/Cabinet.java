package models;

public class Cabinet {

    private String _manufacture, _modelname, _size;
    private int _price;

    public Cabinet(String manufacture, String modelname, String size, int price) {

        _manufacture = manufacture;
        _modelname = modelname;
        _size = size;
        _price = price;
    }

    public String getManufacture(){
        return _manufacture;
    }

    public String getModelname(){
        return _modelname;
    }

    public String getSize(){
        return _size;
    }

    public int getPrice(){
        return _price;
    }
}

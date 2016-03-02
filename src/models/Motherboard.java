package models;

public class Motherboard {

    private String _socket_type, _manufacture, _modelname, _size, _memory_type;
    private int _price;
    private boolean _onboard;

    public Motherboard(String manufacture, String modelname, String socket_type, String size,
                       String memory_type, int price, boolean onboard) {

        _manufacture = manufacture;
        _size = size;
        _socket_type = socket_type;
        _memory_type = memory_type;
        _price = price;
        _modelname = modelname;
        _onboard = onboard;
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

    public String getMemorytype(){
        return _memory_type;
    }

    public int getPrice(){
        return _price;
    }

    public String getSocket(){
        return _socket_type;
    }

    public Boolean getOnboard(){
        return _onboard;
    }
}

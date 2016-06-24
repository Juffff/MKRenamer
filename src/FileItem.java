
public class FileItem {
    private String manufacturer;
    private String type;
    private String colour;
    private String netPrice;
    private String listPrice;

    public FileItem(String manufacturer, String type, String colour, String netPrice, String listPrice) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.colour = colour;
        this.netPrice = netPrice;
        this.listPrice = listPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getNetPrice() {
        return netPrice;
    }

    public String getListPrice() {
        return listPrice;
    }

    @Override
    public String toString() {
        return "FileItem{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", netPrice='" + netPrice + '\'' +
                ", listPrice='" + listPrice + '\'' +
                '}';
    }
}


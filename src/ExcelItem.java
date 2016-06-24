
public class ExcelItem {

    private String pn;
    private String type;
    private String manufacturer;
    private String colour;
    private String netPrice;
    private String listPrice;

    public ExcelItem(String pn, String type, String manufacturer, String colour, String netPrice, String listPrice) {
        this.pn = pn;
        this.type = type;
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.netPrice = netPrice;
        this.listPrice = listPrice;
    }

    public String getPn() {
        return pn;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
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
        return "ExcelItem{" +
                "pn='" + pn + '\'' +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", colour='" + colour + '\'' +
                ", netPrice='" + netPrice + '\'' +
                ", listPrice='" + listPrice + '\'' +
                '}';
    }
}

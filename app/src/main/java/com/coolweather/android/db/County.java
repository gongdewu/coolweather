import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countName;
    private String weathherId;
    private int cityId;
    public int getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }
    public String getWeathherId() {
        return weathherId;
    }
    public void setCountName(String countName) {
        this.countName = countName;
    }
    public String getWeatherId() {
        return weathherId;
    }
    public void setWeathherId(String weathherId) {
        this.weathherId = weathherId;
    }
    public int getCityId() {
        return cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
package Parsers;


import java.util.ArrayList;
import java.util.Date;


public class Scheduls {

    private String busNumber;
    private Date dateEnd;
    private Date dateStart;
    private long id;
    private String locationEnd;
    private String locationStart;
    private long price;
    private ArrayList<String> waypoints;


    public Scheduls() {
        this.waypoints = new ArrayList<String>();
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = (int) id;
    }

    public String getLocationStart() {
        return locationStart;
    }

    public void setLocationStart(String locationStart) {
        this.locationStart = locationStart;
    }

    public String getLocationEnd() {
        return locationEnd;
    }

    public void setLocationEnd(String locationEnd) {
        this.locationEnd = locationEnd;
    }

    public ArrayList getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(ArrayList waypoints) {
        this.waypoints = waypoints;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Scheduls(String busNumber, Date dateEnd, Date dateStart, int id, String locationEnd, String locationStart, long price, ArrayList waypoints) {
        this.busNumber = busNumber;
        this.dateEnd = dateEnd;
        this.dateStart = dateStart;
        this.id = id;
        this.locationEnd = locationEnd;
        this.locationStart = locationStart;
        this.price = price;
        this.waypoints = waypoints;
    }

    @Override
    public String toString() {
        return "Scheduls{" +
                "busNumber=" + busNumber +
                ", dateEnd=" + dateEnd +
                ", dateStart=" + dateStart +
                ", id=" + id +
                ", locationEnd='" + locationEnd + '\'' +
                ", locationStart='" + locationStart + '\'' +
                ", price=" + price +
                ", waypoints=" + waypoints +
                '}';
    }

	

}

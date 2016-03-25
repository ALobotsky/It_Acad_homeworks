package Parsers;


import java.util.ArrayList;
import java.util.Date;

public class Root {

    private Date date;
    private String name;
    private ArrayList<Scheduls> schedulses;

    public Root() {
        schedulses = new ArrayList<>();
    }

    public Root(String name, Date date, ArrayList<Scheduls> schedulses) {
        this.date = date;
        this.name = name;
        this.schedulses =schedulses;
    }


    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public ArrayList<Scheduls> getSchedulses() {
        return schedulses;
    }

    protected void setSchedulses(ArrayList<Scheduls> schedulses) {
        this.schedulses = schedulses;
    }

    public Date getDate() {
        return date;
    }

    protected void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Root{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", schedulses=" + schedulses +
                '}';
    }
}

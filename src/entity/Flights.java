package entity;

import java.util.Date;

public class Flights {

    private int id;
    private int plane_id;
    private int pilot_id;
    private Date date;
    private Date time;
    private String flight_number;

    public Flights(int id, int plane_id, int pilot_id, Date date, Date time, String flight_number) {
        this.id = id;
        this.plane_id = plane_id;
        this.pilot_id = pilot_id;
        this.date = date;
        this.time = time;
        this.flight_number = flight_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlane_id() {
        return plane_id;
    }

    public void setPlane_id(int plane_id) {
        this.plane_id = plane_id;
    }

    public int getPilot_id() {
        return pilot_id;
    }

    public void setPilot_id(int pilot_id) {
        this.pilot_id = pilot_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate_(Date date_) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime_(Date time_) {
        this.time = time;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", plane_id=" + plane_id +
                ", pilot_id=" + pilot_id +
                ", date_=" + date +
                ", time_=" + time +
                ", flight_number='" + flight_number + '\'' +
                '}';
    }
}

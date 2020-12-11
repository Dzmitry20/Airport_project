package entity;

import java.sql.Date;
import java.sql.Time;

public class ResInfoFlight {

    String flight_number;
    java.sql.Date date;
    java.sql.Time time;
    String board_number;
    String plane;
    int capacity;
    String fio;
    String pilot_number;

    public ResInfoFlight(String flight_number, Date date, Time time, String board_number, String plane, int capacity, String fio, String pilot_number) {
        this.flight_number = flight_number;
        this.date = date;
        this.time = time;
        this.board_number = board_number;
        this.plane = plane;
        this.capacity = capacity;
        this.fio = fio;
        this.pilot_number = pilot_number;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate_(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime_(Date time_) {
        this.time = time;
    }

    public String getBoard_number() {
        return board_number;
    }

    public void setBoard_number(String board_number) {
        this.board_number = board_number;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPilot_number() {
        return pilot_number;
    }

    public void setPilot_number(String pilot_number) {
        this.pilot_number = pilot_number;
    }

    @Override
    public String toString() {
        return "ResInfoFlight{" +
                "flight_number='" + flight_number + '\'' +
                ", date_=" + date +
                ", time_=" + time +
                ", board_number='" + board_number + '\'' +
                ", plane='" + plane + '\'' +
                ", capacity=" + capacity +
                ", fio='" + fio + '\'' +
                ", pilot_number='" + pilot_number + '\'' +
                '}';
    }
}

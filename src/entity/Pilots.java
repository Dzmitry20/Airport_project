package entity;

public class Pilots {
    private int id;
    private String first_name;
    private String last_name;
    private final Rank rank;
    private String pilot_code;

    public Pilots(int id, String first_name, String last_name, Rank rank, String pilot_code) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.rank = rank;
        this.pilot_code = pilot_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getPilot_code() {
        return pilot_code;
    }

    public void setPilot_code(String pilot_code) {
        this.pilot_code = pilot_code;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rank='" + rank + '\'' +
                ", pilot_code='" + pilot_code + '\'' +
                '}';
    }
}


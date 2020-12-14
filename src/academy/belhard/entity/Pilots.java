package academy.belhard.entity;

public class Pilots {
    private int id;
    private String first_name;
    private String last_name;
    private final Rank pilot_rank;
    private String pilot_code;

    public Pilots(int id, String first_name, String last_name, Rank pilot_rank, String pilot_code) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.pilot_rank = pilot_rank;
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

    public Rank getPilot_rank() {
        return pilot_rank;
    }

    public String getPilot_code() {
        return pilot_code;
    }

    public void setPilot_code(String pilot_code) {
        this.pilot_code = pilot_code;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", pilot_rank=" + pilot_rank +
                ", pilot_code='" + pilot_code + '\'' +
                '}';
    }
}





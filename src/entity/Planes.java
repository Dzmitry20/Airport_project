package entity;

public class Planes {

    private int id;
    private String mark;
    private String model;
    private int capacity;
    private String board_number;

    public Planes(int id, String mark, String model, int capacity, String board_number) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.capacity = capacity;
        this.board_number = board_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBoard_number() {
        return board_number;
    }

    public void setBoard_number(String board_number) {
        this.board_number = board_number;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "id=" + id +
                ", marka='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", board_number='" + board_number + '\'' +
                '}';
    }
}

package electricity.meter.models;

public class Input {
    private Long id;
    private Integer period;
    private Double data;

    public Input(Long id, Integer period, Double data){
        this.id = id;
        this.period = period;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Integer getPeriod(){
        return period;
    }

    public Double getData(){
        return data;
    }
}

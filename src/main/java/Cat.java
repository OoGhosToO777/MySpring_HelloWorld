
public class Cat {
    private Long id; // идентификатор
    private String name;
    private int weight;

    private String say;

    public Cat() {
    }

    public Cat(Long id, String name, int weight, String say) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.say = say;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }
}

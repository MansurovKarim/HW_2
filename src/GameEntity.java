public class GameEntity {
    private String name;
    private int healt;

    public GameEntity(String name, int healt){
        this.name = name;
        this.healt = healt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }
}

package quality.education.q1.Model;

public class Project {

    private Long id;
    private String name;
    private String steamField;
    private String discription;

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

    public String getSteamField() {
        return steamField;
    }

    public void setSteamField(String steamField) {
        this.steamField = steamField;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", steamField='" + steamField + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}

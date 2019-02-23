package quality.education.q1.Model;

public class Project {

    private Integer id;
    private String name;
    private String steamField;
    private String description;


    public Project(Integer id, String name, String steamField, String description) {
        this.id = id;
        this.name = name;
        this.steamField = steamField;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", steamField='" + steamField + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

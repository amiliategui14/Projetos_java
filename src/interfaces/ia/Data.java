package interfaces.ia;
//class
class Data {
    private String name;
    private String version;
    private String creator;

    public Data(String name, String version, String creator) {
        this.name = name;
        this.version = version;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }
    public String getVersion() {
        return version;
    }
    public String getCreator() {
        return creator;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
}

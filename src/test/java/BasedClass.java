public class BasedClass {
    public int id;
    public String name;
    private String description;
    @TestField(textInAnnotation = "This is the text in annotation")
    public String textInClass = "tic";

    public BasedClass (int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

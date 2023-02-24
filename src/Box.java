public class Box <T> {
    private T name;

    public Box(T name) {
        this.name = name;
    }

    public static <T> T method(T  box){
        return box;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                '}';
    }
}

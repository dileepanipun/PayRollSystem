package entitiy;

public class Constants {
    private String element;
    private int value;

    public Constants() {
    }

    public Constants(String element, int value) {
        this.element = element;
        this.value = value;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

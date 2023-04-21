package cz.czechitas.webapp;

public class BoyfriendForm {

    private int age;
    private int height;
    private String haircolor;
    private String eyecolor;
    private String figure;

    public BoyfriendForm() {
    }

    public BoyfriendForm(int age, int height, String haircolor, String eyecolor, String figure) {
        this.age = age;
        this.height = height;
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
        this.figure = figure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newValue) {
        age = newValue;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int newValue) {
        height = newValue;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String newValue) {
        haircolor = newValue;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String newValue) {
        eyecolor = newValue;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String newValue) {
        figure = newValue;
    }

    @Override
    public String toString() {
        return "BoyfriendForm " +
                "age=" + age + ", " +
                "height=" + height + ", " +
                "haircolor=\"" + haircolor + "\"" + ", " +
                "eyecolor=\"" + eyecolor + "\"" + ", " +
                "figure=\"" + figure + "\"";
    }
}

package HW7;

public abstract class Shape implements Viewer{
      private String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return name;
    }
}





package animals;

public class Dog extends Animal {

    private String kind;

    public Dog(String name, int age, String kind) {
       super(name,age);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int dodaj(int a, int b) {
       return super.add(a,b);

    }

    @Override
    public String food() {
        return "wszystko";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                '}';
    }


    public String whoAreYou() {
        return super.whoAreYou() + "Pies";
    }
}

package lesson1;

public class ThirdTaskFruit {
   private String name;
    private float weight;

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Apple extends ThirdTaskFruit{
    final String name = "Apple";
    private final float weight = 1.0f;

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Orange extends ThirdTaskFruit{
    String name = "Orange";
    float weight = 1.5f;

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}

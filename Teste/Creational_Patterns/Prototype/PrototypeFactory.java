package Creational_Patterns.Prototype;

import java.util.HashMap;

public class PrototypeFactory {
    public static enum ModelType {
        MOVIE, ALBUM, SHOW
    }

    private static java.util.Map<ModelType, PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapable getInstance(ModelType modelType) throws CloneNotSupportedException {
        return prototypes.get(modelType).clone();
    }
}

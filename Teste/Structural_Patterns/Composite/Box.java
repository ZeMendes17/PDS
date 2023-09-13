package Structural_Patterns.Composite;

import java.util.List;
import java.util.ArrayList;

public class Box extends Entity {
    private List<Entity> children = new ArrayList<>();
    private int value;

    public Box(int value) {
        this.value = value;
    }

    public void add(Entity entity) {
        children.add(entity);
    }

    @Override
    public void traverse() {
        System.out.println(indent.toString() + value);
        indent.append("   ");
        for (Entity child : children) {
            child.traverse();
        }
        indent.setLength(indent.length() - 3);
    }
}

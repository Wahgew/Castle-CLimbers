package ASG;

import java.util.ArrayList;

public class Updater {
    private static ArrayList<Updateable> updateables= new ArrayList<Updateable>();
    private static ArrayList<Updateable> addUpdatables = new ArrayList<Updateable>();
    private static ArrayList<Updateable> removeUpdatables = new ArrayList<Updateable>();

    public static void update() {
        for (Updateable object: updateables) {
            object.update();
        }
        updateables.removeAll(removeUpdatables);
        updateables.addAll(addUpdatables);

        addUpdatables.clear();
        removeUpdatables.clear();
    }

    public static void addUpdatables(Updateable o) {
        addUpdatables.add(o);
    }

    public static void RemoveUpdatables(Updateable o) {
        removeUpdatables.add(o);
    }
}

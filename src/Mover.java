import java.util.Random;

/**
 * This is a test mover
 *
 * @author magicyoung6768
 */
public class Mover {
    private static final int with = 480;
    private static final int height = 800;
    private PVector location;
    private PVector velocity;
    private PVector acceleration;
    private float topSpeed;

    public Mover(PVector location, PVector velocity, float topSpeed) {
        this.location = location;
        this.velocity = velocity;
        this.topSpeed = topSpeed;
    }

    public void update() {
        PVector mouse = new PVector(new Random().nextFloat() * height, new Random().nextFloat() * with);
        PVector dir = PVector.sub(mouse, location);

        dir = PVector.normalize(dir);
        acceleration = PVector.mult(dir, 0.5f);
        velocity.add(acceleration);
        velocity.limit(topSpeed);
        location.add(velocity);
    }

    private void checkEdges() {
        if (location.getX() > with) {
            location.setX(0);
        } else if (location.getX() < 0) {
            location.setX(with);
        }
        if (location.getY() > height) {
            location.setY(0);
        } else if (location.getY() < 0) {
            location.setY(height);
        }
    }
}

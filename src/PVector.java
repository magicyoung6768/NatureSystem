/**
 * a vector
 */
public class PVector {
    private float x;
    private float y;

    public PVector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String toString() {
        return "PVector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * a = (x,y), add vector(x,y),
     *
     * @param vector
     */
    public void add(PVector vector) {
        x = x + vector.x;
        y = y + vector.y;
    }

    /**
     * a = (x,y), sub vector(x,y),
     *
     * @param vector
     */
    public void sub(PVector vector) {
        x = x - vector.x;
        y = y - vector.y;
    }

    /**
     * a = (x,y), mult n,
     */
    public void mult(float n) {
        x = x * n;
        y = y * n;
    }

    /**
     * a = (x,y), div n,
     */
    public void div(float n) {
        x = x / n;
        y = y / n;
    }
}
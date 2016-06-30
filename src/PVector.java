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

    /**
     * a = (x,y), add vector(x,y),
     *
     * @param vector1
     * @param vector2
     * @return PVector
     */
    public static PVector add(PVector vector1, PVector vector2) {
        return new PVector(vector1.x + vector2.x, vector1.y + vector2.y);
    }

    /**
     * a = (x,y), sub vector(x,y),
     *
     * @param vector1
     * @param vector2
     * @return PVector
     */
    public static PVector sub(PVector vector1, PVector vector2) {
        return new PVector(vector1.x - vector2.x, vector1.y - vector2.y);
    }

    /**
     * a = (x,y), mult n,
     *
     * @param n
     * @param vector
     * @return PVector
     */
    public static PVector mult(PVector vector, float n) {
        return new PVector(vector.x * n, vector.y * n);
    }

    /**
     * a = (x,y), div n,
     */
    public static PVector div(PVector vector, float n) {
        return new PVector(vector.x /n, vector.y / n);
    }

    /**
     * calculate the length of vector
     * @param vector
     * @return
     */
    public static float mag(PVector vector) {
        return (float) Math.sqrt(vector.x * vector.x+ vector.y * vector.y);
    }

    /**
     *
     * @param vector
     * @return
     */
    public static PVector normalize(PVector vector) {
        float m = mag(vector);
        if (m != 0) {
            return div(vector, m);
        }
        throw null;
    }

    public void limit(float topSpeed) {
    }
}
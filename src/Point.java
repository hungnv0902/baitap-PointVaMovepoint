public class Point {
    public float x = 0;
    public float y = 0;

    public Point() {
    }

    public Point(float x, float y) {
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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public String toString() {
        return "A point2D "
                + "toa do la"
                +getXY()[0]
                +","
                +getXY()[1];
    }
}

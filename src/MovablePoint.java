public class MovablePoint extends Point {
    private float xSpeed = 1;
    private float ySpeed = 1;

    MovablePoint () {

    }

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] speedXY = new float[2];
        speedXY[0] = xSpeed;
        speedXY[1] = ySpeed;
        return speedXY;
    }

    @Override
    public String toString() {
        return "toa do "
                + super.getX()
                + super.getY();
    }

    public MovablePoint move() {
        super.x += xSpeed;
        super.y += ySpeed;
        return this;
    }
}

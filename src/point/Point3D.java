package point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float z) {
        super();
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] point3D = {super.getX(), super.getY(), this.getZ()};
        return point3D;
    }

    @Override
    public String toString() {
        return "(" + super.getX()
                + ","
                + super.getY()
                + ","
                + this.z + ")";
    }
}

package vector;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getLength(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double getScalarMultip(Vector vector){
        return x*vector.x+y*vector.y+z*vector.z;
    }

    public Vector getVectorMultip(Vector vector){
        return new Vector(
                y*vector.z-z*vector.y,
                z*vector.x-x*vector.z,
                x*vector.y-y*vector.x);
    }

    public double cos(Vector vector){
        return getScalarMultip(vector)/(getLength()*vector.getLength());
    }

    public Vector getSum (Vector vector){
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector getDiff (Vector vector){
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    public static Vector[] randomVector(int n){
        Vector[] vectors = new Vector[n];
        for (int i=0; i<n; i++){
            vectors[i] = new Vector(Math.random(),Math.random(),Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{"+"x="+x+", y="+y+", z="+z+"}";
    }
}

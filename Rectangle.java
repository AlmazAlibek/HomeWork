public class Rectangle {
    private float length;
    private float width;

    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }
    public float countArea () {
        return length*width;
    }
}

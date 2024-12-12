public class Triangle {
    private float lengthsSide1;
    private float lengthsSide2;
    private float lengthsSide3;

    public Triangle(float lengthsSide1, float lengthsSide2, float lengthsSide3){
        this.lengthsSide1 = lengthsSide1;
        this.lengthsSide2 = lengthsSide2;
        this.lengthsSide3 = lengthsSide3;

    }

    public void printAreaAndPerimetrOfTriangle (){
        float perimetr = lengthsSide1 + lengthsSide2+lengthsSide3;
        System.out.println("Периметр триугольника: "+perimetr);

        float semiperimetr = perimetr/2;

        double area = Math.sqrt(semiperimetr * (semiperimetr-lengthsSide1)*(semiperimetr-lengthsSide2)*(semiperimetr-lengthsSide3));
        System.out.println("Площадь триугольника: "+ area);
    }
}

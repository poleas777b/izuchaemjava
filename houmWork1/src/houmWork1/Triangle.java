package houmWork1;

public class Triangle {
	double area;
    int height;
    int lenght;
	public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];
		while(x<4) {
		ta[x] = new Triangle();
		ta[x].height = (x+1)*2;
		ta[x].lenght = x+4;
		ta[x].setArea();
		System.out.print("треугольник "+x+", зона");
		System.out.println(" = " + ta[x].area);
		x = x + 1;
		}
		int y = x;
		x=27;
		Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = " + y);
		System.out.println(", зона т5 = "+ t5.area);
        
	}
	
	void setArea() {
		area= (height*lenght) / 2;
	}
}

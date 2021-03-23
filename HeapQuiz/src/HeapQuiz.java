import System.out;
public class HeapQuiz {
	int id = 0;	
	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		int x = 0;
		HeapQuiz[] hd = new HeapQuiz[5];
		while(x<3) {
			hd[x] = new HeapQuiz();
			hd[x].id = x;
			x++;
		}
		hd[3] = hd[1];
		hd[4] = hd[1];
		hd[3] = null;
		hd[4] = hd[0];
		hd[0] = hd[3];
		hd[3] = hd[2];
		hd[2] = hd[0];
		for(int y = 0; y<5; y++)
			System.out.println("hd["+y+"] id = "+hd[y].id);
	}

}

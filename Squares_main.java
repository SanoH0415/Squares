package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Excel�ŌX���ƐؕЂ����߂Ă݂܂����B
		//�X���́A2.5357
		//�ؕЂ́A0.5214
		//�ɂȂ�܂����B
		//�����ł�������ʂ�
		//�X��2.535342...
		//�ؕ�0.521680...�������̂ŗǂ����ʂ��o���Ǝv���܂��B
		
		double x[] = {0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2};
		double y[] = {0.5, 1.1, 1.5, 2.0, 2.6, 3.0, 3.6};
		//double x[] = {0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.2};
		//double y[] = {1.0, 1.9, 3.2, 4.3, 4.8, 6.1, 7.2};
		double theta[] = new double[2];
		
		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getRx());
		}
	}

}

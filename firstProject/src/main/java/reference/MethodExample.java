package reference;

public class MethodExample {

	public static void main(String[] args) {
		
		
		//비만도 계산공식. 
		double w1 = 83.1, h1 = 1.77;
		checkBMI(w1, h1);
		//bmi < 18.5 저체중. 
		//18.5 ~ 23 정상.
		//23 ~ 25 과제충. 
		//25 ~ 30 비만. 
		//30 이상은 고도비만. */  
		
		double w2, h2; 
		double w3, h3;
//		사람마다 비만도를 구하려면 코드가 엄청 많아진다. 그래서 반복되는 처리를 할 수 있는 기능을
//	 	정의하고 호출할 수 있다면 코드가 줄고 편리해진다. 그게 메소도의 목적이다. 
	}
		
	
	public static void checkBMI(double weight, double height) {
			double bmi = weight / (height * height);
			if(bmi < 18.5) {
				System.out.println("저체중");
			} else if (bmi >= 18.5 && bmi <23) {
				System.out.println("적정체중");
			} else if (bmi >= 23 && bmi <25) {
				System.out.println("과제중");
			} else if (bmi >= 25) {
				System.out.println("비만");
			} else {
				System.out.println("고도비만..");
			}
			
		}
		
		
	}



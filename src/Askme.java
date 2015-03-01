
public class Askme {
	static void answer(Answers result){
		switch(result){
		case NO:
			System.out.println("Нет");
			break;
		case YES: 
			System.out.println("Да");
		case MAYBE:
			System.out.println("Может быть");
			break;
		case NEVER: 
			System.out.println("Никогда");
			break;
		case LATER:
			System.out.println("Позже");
			break;
		case SOON:
			System.out.println("Вскоре");
			break;
		}
		
	}
	public static void main(String args[]){
		Question q = new Question();
		for(int i=0;i<15;i++){
			answer(q.ask());
		}
		
		
	}
}

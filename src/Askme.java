
public class Askme {
	static void answer(Answers result){
		switch(result){
		case NO:
			System.out.println("���");
			break;
		case YES: 
			System.out.println("��");
		case MAYBE:
			System.out.println("����� ����");
			break;
		case NEVER: 
			System.out.println("�������");
			break;
		case LATER:
			System.out.println("�����");
			break;
		case SOON:
			System.out.println("������");
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

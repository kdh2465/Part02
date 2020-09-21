package pack08_innerclassandinterface.sec05_innerinterface.EX02_ButtonAPIExample;

/*일반적인 UI API의 구조 예시 (버튼)*/

class Button{
	OnClickListener ocl;
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	interface OnClickListener{
		public abstract void onClick();
	}
	void click(){
		ocl.onClick();
	}
}

public class EX02_ButtonAPIExample {
	public static void main(String[] args) {
		
		//#1. 개발자 1. 클릭했을때 음악재생
		Button button1 = new Button();
		button1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자1. 음악 재생");
			}
		});
		button1.click();
		
		//#2. 개발자2. 클릭했을때 네이버 접속
		Button button2 = new Button();
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자2. 네이버 접속");
			}
		});
		button2.click();
		
	}
}

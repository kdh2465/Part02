package pack07_innerclassandinterface.sec05_innerinterface.EX11_ButtonAPIExample;

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

public class EX11_ButtonAPIExample {
	public static void main(String[] args) {
		
		//#1. ������ 1. Ŭ�������� �������
		Button button1 = new Button();
		button1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������1. ���� ���");
			}
		});
		button1.click();
		
		//#2. ������2. Ŭ�������� ���̹� ����
		Button button2 = new Button();
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("������2. ���̹� ����");
			}
		});
		button2.click();
		
	}
}

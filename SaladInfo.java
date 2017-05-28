import java.util.ArrayList;
public class SaladInfo {
	ArrayList<Salad> salad = new ArrayList<Salad>();
	
	public SaladInfo() {
		salad.add(new Salad("한치튀김", 22000));
		salad.add(new Salad("크랩튀김", 26000));
		salad.add(new Salad("치즈튀김", 21000));
		
		salad.add(new Salad("푸아그라", 45000));
		salad.add(new Salad("치즈그라탕", 20000));
		salad.add(new Salad("치즈 바게트 그라탕", 23000));
		
		salad.add(new Salad("미트볼", 17000));
		salad.add(new Salad("한치그릴", 27000));
		salad.add(new Salad("문어 라따뚜이", 29000));
	}
}

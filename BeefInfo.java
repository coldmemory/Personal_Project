import java.util.ArrayList;
public class BeefInfo {
	ArrayList<Beef> beef = new ArrayList<Beef>();
	
	public BeefInfo() {
		beef.add(new Beef("립아이 스테이크", 30000));
		beef.add(new Beef("안심스테이크", 25000));
		beef.add(new Beef("양갈비구이", 22000));
		
		beef.add(new Beef("티본스테이크", 33000));
		beef.add(new Beef("쇠고기찜요리", 28000));
		beef.add(new Beef("오늘의생선", 27000));
		
		beef.add(new Beef("돼지고기스테이크", 31000));
		beef.add(new Beef("송아지갈비 커틀렛", 29000));
		beef.add(new Beef("매콤한 닭 그릴", 32000));
	}
}

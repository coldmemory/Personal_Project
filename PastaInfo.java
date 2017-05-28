import java.util.ArrayList;
public class PastaInfo {
	ArrayList<Pasta> pasta = new ArrayList<Pasta>();
	
	public PastaInfo() {
		pasta.add(new Pasta("해물 리조또", 14000));
		pasta.add(new Pasta("굴크림소스", 16000));
		pasta.add(new Pasta("랍스타 토마토라구소스", 18000));
		
		pasta.add(new Pasta("토마토소스 리가토니", 15000));
		pasta.add(new Pasta("엔쵸비 소스 스파게티", 17000));
		pasta.add(new Pasta("까르보나라", 16000));
		
		pasta.add(new Pasta("루꼴라 링귀니", 19000));
		pasta.add(new Pasta("성게알 링귀니", 15000));
		pasta.add(new Pasta("오징어 먹물소스 스파게티", 15000));
	}
}

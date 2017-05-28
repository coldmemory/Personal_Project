import java.awt.*;
import javax.swing.*;
public class Invoice extends JFrame{
	BeefInfo be = new BeefInfo();
	SaladInfo sa = new SaladInfo();
	PastaInfo pa = new PastaInfo();
	Invoice(){
		Container contentprice = getContentPane();
		this.setTitle("Price");
		this.setSize(400, 500);
		contentprice.setLayout(new BorderLayout());
		Restaurant.invoicetable.setEditable(false);
		init();
		contentprice.add("Center",Restaurant.invoicetable);
		this.setVisible(true);
	}// 가격 계산 시작
	public void init() {
		for(int i = 0; i < Restaurant.invoicep.size(); i++) {
			for(int j = 0; j < pa.pasta.size(); j++) {
				if(Restaurant.invoicep.get(i).equals(pa.pasta.get(j).getName())) {
					Restaurant.invoicetable.append("Pasta : " + 
				Restaurant.invoicep.get(i) + ", 가격 : " + pa.pasta.get(j).getPrice() + "\n");
				}
			}
			for(int j = 0; j < be.beef.size(); j++) {
				if(Restaurant.invoicep.get(i).equals(be.beef.get(j).getName())) {
					Restaurant.invoicetable.append("Beef : " + 
				Restaurant.invoicep.get(i) + ", 가격 : " + be.beef.get(j).getPrice() + "\n");
				}
			}
			for(int j = 0; j < sa.salad.size(); j++) {
				if(Restaurant.invoicep.get(i).equals(sa.salad.get(j).getName())) {
					Restaurant.invoicetable.append("Salad : " + 
				Restaurant.invoicep.get(i) + ", 가격 : " + sa.salad.get(j).getPrice() + "\n");
				}
			}
		}
		Restaurant.invoicetable.append("\n합계 : "+Integer.toString(Restaurant.price));
	}
}// 가격 계산 끝

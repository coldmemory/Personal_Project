import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonAction implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		SaladInfo sa = new SaladInfo();
		PastaInfo pa = new PastaInfo();
		BeefInfo be = new BeefInfo();
				// 메뉴 버튼 구성 시작
		if(Restaurant.print == e.getSource()) {
			new Invoice();
		}
		if(Restaurant.menu[0] == e.getSource()) {
					// 상부메뉴를 누를 때마다 색깔 변경
			Restaurant.menu[0].setForeground(Color.blue);
			Restaurant.menu[1].setForeground(Color.GRAY);
			Restaurant.menu[2].setForeground(Color.GRAY);		
			
				int index = 0;
				for(int i = 0; i < Restaurant.table.length; i++) {
					for(int j = 0; j < Restaurant.table[i].length; j++) {
						Restaurant.table[i][j].setText("");
						if(sa.salad.get(index) != null) {
							Restaurant.table[i][j].setText(sa.salad.get(index).getName());
							index++;
							}
						}
					}
				Restaurant.check = 1;
				}
		else if(Restaurant.menu[1] == e.getSource()) {
			Restaurant.menu[1].setForeground(Color.blue);
			Restaurant.menu[0].setForeground(Color.gray);
			Restaurant.menu[2].setForeground(Color.gray);
				int index = 0;
				for(int i = 0; i < Restaurant.table.length; i++) {
					for(int j = 0; j <Restaurant.table[i].length; j++){
						Restaurant.table[i][j].setText("");
						if(pa.pasta.get(index) !=null){
							Restaurant.table[i][j].setText(pa.pasta.get(index).getName());
							index++;
					}
				}
			} Restaurant.check = 2;
		}
			else if(Restaurant.menu[2] == e.getSource()) {
				Restaurant.menu[2].setForeground(Color.blue);
				Restaurant.menu[1].setForeground(Color.gray);
				Restaurant.menu[0].setForeground(Color.gray);
				int index = 0;
				for(int i = 0; i < Restaurant.table.length; i++) {
					for(int j = 0; j < Restaurant.table[i].length; j++){
						Restaurant.table[i][j].setText("");
					if(be.beef.get(index) !=null){
						Restaurant.table[i][j].setText(be.beef.get(index).getName());
						index++;
					}
				}
			}Restaurant.check = 3;
		}
				// 메뉴 버튼 구성 끝
				// 음식 가격 입력 시작
		for(int i = 0; i < Restaurant.table.length; i++) {
			for(int j = 0; j < Restaurant.table[i].length; j++) {
				if(Restaurant.table[i][j] == e.getSource()) {
					
					if(Restaurant.check == 1) {
						for(int k = 0; k < sa.salad.size(); k++) {
							if(Restaurant.table[i][j].getText().equals(sa.salad.get(k).getName())) {
								Restaurant.price += sa.salad.get(k).getPrice();
								Restaurant.pricefield.setText("가격 : " + Integer.toString(Restaurant.price));
								Restaurant.invoicep.add(Restaurant.table[i][j].getText());
							}
						}
					}else if(Restaurant.check == 2) {
						for(int k = 0; k < pa.pasta.size(); k++) {
							if(Restaurant.table[i][j].getText().equals(pa.pasta.get(k).getName())) {
								Restaurant.price += pa.pasta.get(k).getPrice();
								Restaurant.pricefield.setText("가격 : " + Integer.toString(Restaurant.price));
								Restaurant.invoicep.add(Restaurant.table[i][j].getText());
							}
						}
					}else if(Restaurant.check == 3){
						for(int k = 0; k < be.beef.size(); k++) {
							if(Restaurant.table[i][j].getText().equals(be.beef.get(k).getName())) {
								Restaurant.price += be.beef.get(k).getPrice();
								Restaurant.pricefield.setText("가격 : " + Integer.toString(Restaurant.price));
								Restaurant.invoicep.add(Restaurant.table[i][j].getText());
					}
				}
			}
		}
			}
		}
		// 음식 가격 입력 끝
			}
}
				
		
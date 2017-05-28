import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Restaurant extends JFrame{
	static JPanel total, down;
	static int price = 0;
	static JButton[][] table;
	static ArrayList<String> invoicep = new ArrayList<String>();
	static JButton[] menu;
	static JButton print;
	static int check = 0;
	static JTextField pricefield;
	static JTextArea invoicetable = new JTextArea();
	Restaurant(){
		this.price = price;
		Container c = getContentPane();
		setTitle("Flolence");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		
		c.setLayout(new GridLayout(5, 3, 10, 10));
		menu = new JButton[3];
		for(int i = 0; i < menu.length; i++) {
			menu[i] = new JButton();
		}
		// 버튼 액션 추가
		menu[0].setText("Salad");
		menu[0].addActionListener(new ButtonAction());
		menu[1].setText("Pasta");
		menu[1].addActionListener(new ButtonAction());
		menu[2].setText("Beef");
		menu[2].addActionListener(new ButtonAction());
		table = new JButton[3][3];
		total = new JPanel(new GridLayout());
		down = new JPanel(new BorderLayout());
		// 가격 필드 추가
		pricefield = new JTextField();
		pricefield.setText("가격 : "+ Integer.toString(price));
		down.add(pricefield);
		print = new JButton();
		print.setText("영수증 출력");
		print.addActionListener(new ButtonAction());
		// 메뉴 구성 - 상부(메뉴 종류), 중앙(세부 메뉴), 아래(가격)
		for(int i = 0; i<menu.length; i++)
		c.add("North", menu[i]);
		for(int i =0; i < table.length; i++){
			for(int j =0; j < table[i].length; j++){
				table[i][j] = new JButton();
				table[i][j].addActionListener(new ButtonAction());
				c.add("Center", table[i][j]);
				c.add("South", down);
				c.add(print);
			}
		}
		setVisible(true);
	}

	public static void main(String[] args){
		
		new Restaurant();
	}	
}

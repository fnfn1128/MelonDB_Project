package DB;

import javax.swing.*;

import javax.swing.JFrame;

import javax.swing.JTable;


public class MelonServiceDB extends JFrame {
	JTable table;

	String[][] data= {{"유중경","alpa1001","010-1566-8791","O"},

      {"이한빈","bin0919","010-5642-7268","X"},

      {"여민영","fnfn1128","010-4925-8091","O"},

      {"노연진","giran831","010-1325-8956","X"},

      {"오한나","hahahana01","010-4851-1238","O"},

      {"송한별","songstar2","010-2545-8942","O"},

      {"박수지","suji1004","010-3256-4354","X"},

};


Object [] columnNames= {"이름","아이디","핸드폰 번호", "이용권 구매 여부"};



public MelonServiceDB() {

   table= new JTable(data,columnNames);


}

public void startFrame() {

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setTitle("회원 관리");
   add(new JScrollPane(table));
   pack();
   setVisible(true);
}

public static void main(String[] args) {
   MelonServiceDB t=new MelonServiceDB();
   t.startFrame();
	}

}

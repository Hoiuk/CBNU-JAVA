package MeneTest1;
import java.awt.*;
class MenuTest1 extends Frame{
	public MenuBar mb;
	public MenuTest1(String str) {
		super(str);
		 mb = new MenuBar();
		Menu file = new Menu("파일");
		MenuItem file_new = new MenuItem("새로 만들기");
		MenuItem file_open = new MenuItem("열기");
		MenuItem file_save = new MenuItem("저장");
		MenuItem file_newname = new MenuItem("다른이름으로 저장");
		
		file.add(file_new); 
		file.add(file_open);
		file.add(file_save);
		file.add(file_newname);
		
		Menu edit = new Menu("편집");
		MenuItem edit_undo = new MenuItem("실행취소"); 
		MenuItem edit_cut = new MenuItem("잘라내기");
		MenuItem edit_copy = new MenuItem("복사");
		MenuItem edit_paste = new MenuItem("붙여넣기");
		edit.add(edit_undo);
		edit.add(edit_cut);
		edit.add(edit_copy);
		edit.add(edit_paste);
		Menu view = new Menu("보기");
		CheckboxMenuItem view_status = new CheckboxMenuItem("상태표시줄");
		view.add(view_status);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
    
		setMenuBar(mb);
		setSize(400,200);
		setVisible(true);

	}
}

public class Main {
	public static void main(String[] args) {
		MenuTest1 Menu1 = new MenuTest1("메뉴 테스트1");
		Menu help = new Menu("도움말");
		MenuItem help1 = new MenuItem("정보");

		help.add(help1);

		Menu1.mb.add(help);
		Menu man = new Menu("개발자");
		MenuItem man_man = new MenuItem("양회욱");
		man.add(man_man);
		Menu1.mb.add(man);
	
	}
}

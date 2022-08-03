package ja_0803;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_2 extends Frame {

	public Menu_2(String title)
	{
		super(title);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("새파일", true);
		CheckboxMenuItem file_open = new CheckboxMenuItem("불러오기");
		MenuItem file_separator = new MenuItem("-");
		MenuItem file_close = new MenuItem("파일닫기");
		
		Menu tool = new Menu("도구");
		
		CheckboxMenuItem tool_basic = new CheckboxMenuItem("기본설정", false);
		MenuItem tool_separator = new MenuItem("-");
		CheckboxMenuItem tool_sort = new CheckboxMenuItem("정렬");
		CheckboxMenuItem tool_record = new CheckboxMenuItem("기록");
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		tool.add(tool_basic);
		tool.add(tool_separator);
		tool.add(tool_sort);
		tool.add(tool_record);
		
		Menu edit = new Menu("편집");
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		
		Menu record = new Menu("기록");
		MenuItem record_utf_8 = new MenuItem("UTF-8");
		MenuItem record_eul = new MenuItem("Eul-kr");
		
		edit.add(edit_cut);
		edit.add(edit_paste);

		record.add(record_eul);
		record.add(record_utf_8);
		
		file.add(edit);
		tool.add(record);
		
		mb.add(file);
		mb.add(tool);
		
		setMenuBar(mb);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Menu_2("test~");
	}
}

package ja_0812;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Progress_1 extends JFrame{

	
	JProgressBar progress;
	JLabel lbl_info;
	
	public Progress_1(String title) {
		super(title);
		
		progress = new JProgressBar();
		progress.setMinimum(0); //프로그레스 최소값
		progress.setMaximum(100); //프로그레스 최대값
		progress.setValue(0);//프로그레스 시작값
		
		lbl_info = new JLabel("");
		
		this.getContentPane().add(progress,"North");
		getContentPane().add(new JLabel("JProgressTest"),"Center");
		getContentPane().add(lbl_info,"South");
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(400,300);
		setVisible(true);
		progress_start();
		
		
	}
	
	private void progress_start() {
		int i;
		
		try {
			for (i = 0; i <= 100; i+=5) {
				progress.setValue(i);
				Thread.sleep(200);
				lbl_info.setText("    " + i + "%가 진행중 ~~~~");
			}
			if (i==100)
			{
				lbl_info.setText("다운 완료!!!!!!!!");
				
			}
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();
			 lbl_info.setText("문제 발생 ############");
		}
	}
	 public static void main(String[] args) {
		new Progress_1("Progress Test ~~~~");
	}
	
	
}

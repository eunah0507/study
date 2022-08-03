package ja_0726;

public class String_7 {
	public static void main(String[] args) {
		
		String[] juju = { "9406251623444", "9906254623444",
							"9606252563444", "9806251623444",
							"9406253623444", "9706252623444" };
		
		for (int i = 0; i < juju.length; i++) 
		{
			if (juju[i].indexOf("2", 6)==6 || juju[i].indexOf("4",6)==6) 
			{
				System.out.println(juju[i] + "는 여자입니다.");
			}
			else
			{
				System.out.println(juju[i] + "는 남자입니다.");
			}
		}
	}
}

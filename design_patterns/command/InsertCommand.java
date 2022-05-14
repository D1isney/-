package command;

public class InsertCommand extends Command{
	Content c;
	
	//要插入的字符串
	String strToInsert = "https:www.github.com";
	public InsertCommand(Content c) {
		this.c = c;
	}
	
	@Override
	public void doit() {
		c.msg += strToInsert;
	}

	@Override
	public void undo() {
		c.msg = c.msg.substring(0,c.msg.length()-strToInsert.length());
	}

}

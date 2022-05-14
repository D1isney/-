package command;

public class DeleteCommand extends Command{
	Content c;
	String delete;
	public DeleteCommand(Content c) {
		this.c = c;
	}
	
	@Override
	public void doit() {
		delete = c.msg.substring(0,c.msg.length());
		c.msg = c.msg.substring(delete.length(),c.msg.length());
	}

	@Override
	public void undo() {
		c.msg = delete + c.msg;
	}

}

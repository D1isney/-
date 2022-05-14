package command;

//封装各种各样的命令
public abstract class Command {
	public abstract void doit();//执行 exec run
	public abstract void undo();
}

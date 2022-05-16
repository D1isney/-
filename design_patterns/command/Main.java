package command;

import java.util.ArrayList;
import java.util.List;

/*Action动作、Transaction事物
 * 
 *宏命令
 * 	Command与？模式
 * 
 *多次undo
 * 	Command与Cor模式
 * 责任链
 *
 *transaction
 *	Command与？模式
 */

/**多次undo应该用责任链做
 * ------------
 */

public class Main {
	public static void main(String[] args) {
		Content c = new Content();
		System.out.println("---InsertCommand---");
		Command insertCommand = new InsertCommand(c);
		insertCommand.doit();
		System.out.println(c.msg);
		insertCommand.undo();
		System.out.println(c.msg);
		
		System.out.println("---CopyCommand---");
		Command copyCommand = new CopyCommand(c);
		copyCommand.doit();
		System.out.println(c.msg);
		copyCommand.undo();
		System.out.println(c.msg);
		
		System.out.println("---DelectCommand---");
		Command delCommand = new DeleteCommand(c);
		delCommand.doit();
		System.out.println(c.msg);
		delCommand.undo();
		System.out.println(c.msg);
		
		System.out.println();
		System.out.println("责任链实现连续undo");
		//责任链实现连续的undo
		List<Command> commands = new ArrayList<>();
		commands.add(new InsertCommand(c));
		commands.add(new CopyCommand(c));
		commands.add(new DeleteCommand(c));
		
		for(Command co:commands) {
			co.doit();
		}
		
		System.out.println(c.msg);
		
		//undo一定得倒序来
		for(int i = commands.size()-1;i>=0;i--) {
			commands.get(i).undo();
		}
		
		System.out.println(c.msg);
	}
}

package command;

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
		
	}
}

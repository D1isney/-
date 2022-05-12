package Visitor;

/*访问者
 * 
 */

class Computer{
	ComputerPart cpu = new CPU();
	ComputerPart memory = new Memory();
	ComputerPart board = new Board();
	
	public void acccept(Visitor v) {
		this.cpu.accept(v);
		this.memory.accept(v);
		this.board.accept(v);
	}
}

class CPU extends ComputerPart{
	@Override
	void accept(Visitor v) {
		v.visitCpu(this);
	}
	@Override
	double getPrice() {
		return 500;
	}
}

class Memory extends ComputerPart{

	@Override
	void accept(Visitor v) {
		v.visitMemory(this);
	}
	
	@Override
	double getPrice() {
		return 300;
	}
}

class Board extends ComputerPart{

	@Override
	void accept(Visitor v) {
		v.visitBorad(this);
	}

	@Override
	double getPrice() {
		return 200;
	}
	
}

abstract class ComputerPart{
	abstract void accept(Visitor v);
	abstract double getPrice();
}

interface Visitor{
	void visitCpu(CPU cpu);
	void visitMemory(Memory memory);
	void visitBorad(Board board);
}

class PersonelVisitor implements Visitor{

	double totalPrice = 0.0;
	
	@Override
	public void visitCpu(CPU cpu) {
		totalPrice += cpu.getPrice()*0.9;
	}

	@Override
	public void visitMemory(Memory memory) {
		totalPrice += memory.getPrice()*0.85;
	}

	@Override
	public void visitBorad(Board board) {
		totalPrice += board.getPrice()*0.95;
	}
}

class CorpVisitor implements Visitor{

	double totalPrice = 0.0d;
	@Override
	public void visitCpu(CPU cpu) {
		totalPrice += cpu.getPrice()*0.6;
	}

	@Override
	public void visitMemory(Memory memory) {
		totalPrice += memory.getPrice()*0.75;
	}

	@Override
	public void visitBorad(Board board) {
		totalPrice += board.getPrice()*0.75;
	}
	
}

public class Main {
	public static void main(String[] args) {
		PersonelVisitor p = new PersonelVisitor();
		new Computer().acccept(p);
		System.out.println(p.totalPrice);
	}
}

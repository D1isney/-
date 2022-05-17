package state;

/*
 * 有限状态机
 */
public class V3 {

}
class Thread_{
	ThreadState_ state;
	
	void move(Action input) {
		//状态的迁移
		state.move(input);
	}
	void run() {
		state.run();
	}
}
class Action{
	String msg;
}
class ThreadState_{
	void move(Action input) {}
	void run() {}
}
class NewState extends ThreadState_{
	private Thread_ t;
	
	public NewState(Thread_ t) {
		this.t = t;
	}
	
	@Override
	void move(Action input) {
		if(input.msg == "start") t.state = new RunningState(t);
	}
	
	@Override
	void run() {
		
	}
}

class RunningState extends ThreadState_{
	private Thread_ t;
	public RunningState(Thread_ t) {
		this.t = t;
	}
	@Override
	void move(Action input) {
		
	}
	@Override
	void run() {
		
	}
}

class TerminatedState extends ThreadState_{
	private Thread_ t;
	public TerminatedState(Thread_ t){
		this.t = t;
	}
	@Override
	void move(Action input) {
		
	}
	@Override
	void run() {}
}

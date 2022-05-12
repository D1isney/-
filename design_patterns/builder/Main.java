package builder;

/*构建器  构建复杂对象
 * 分离复杂对象的构建和表示
 * 同样的构建过程可以创建出不同的表示
 * 无需记忆 自然使用
 */

//地形
class Terrain{
	Wall w;
	Fort f;
	Mine m;
}

class Wall{
	int x,y,w,h;
	public Wall(int x,int y,int w,int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}

class Fort{
	int x,y,w,h;
	public Fort(int x,int y,int w,int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}

class Mine{
	int x,y,w,h;
	public Mine(int x,int y,int w,int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}


public class Main {
	public static void main(String[] args) {
		TerrainBuilder builder = new ComplexTerrainBuilder();
		//链式编程
		Terrain terrain = builder.buildFort().buildMine().buildWall().build();
//					    = new Terrain(Wall m,Fort f,Mine m);
		
		Person person = new Person.PersonBuilder()
							.basicInfo(1,"zhangsan",18)
							.score(20)
							.loc("beijing","23")
							.bulid();
	}
}

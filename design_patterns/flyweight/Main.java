package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 享元模式
 * 字处理
 */

class Bullet{
	
	public UUID id = UUID.randomUUID();
	
	//如果飞出区域就杀死
	boolean living = true;
	
	@Override
	public String toString() {
		return "Bullet{" +
				"id=" + id+
				"｝";
	}
}

class BulletPool{
	List<Bullet> bullets = new ArrayList<>();
	{
		for(int i = 0;i<5;i++) bullets.add(new Bullet());
	}
	
	public Bullet getBullet() {
		//在池子找到没有被使用的
		//如果都在使用再去new
		for(int i = 0;i<bullets.size();i++) {
			Bullet b = bullets.get(i);
			if(!b.living) return b;
		}
		return new Bullet();
	}
}

public class Main {
	public static void main(String[] args) {
		BulletPool bp = new BulletPool();
		
		for(int i = 0;i<10;i++) {
			Bullet b = bp.getBullet();
			System.out.println(b);
		}
	}
}

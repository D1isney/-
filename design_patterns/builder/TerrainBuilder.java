package builder;

//地形构建器
public interface TerrainBuilder {
	TerrainBuilder buildWall();
	TerrainBuilder buildFort();
	TerrainBuilder buildMine();
	Terrain build();
}

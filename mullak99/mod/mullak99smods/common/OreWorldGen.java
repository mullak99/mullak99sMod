package mullak99.mod.mullak99smods.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreWorldGen implements IWorldGenerator 
{

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId) {
		case 0:
		generateSurface(world, random, chunkX*16, chunkZ*16);
		break;
		}
	
	}
	
		
	public void generateSurface(World world, Random rand, int chunkX, int chunkZ) 
	{
		//2.5 vein of ore per chunk
		for (int i = 0; i < 2.5; i++) 
		{
			//16x16 area up to y = 64
		int randPosX = chunkX + rand.nextInt(16);
		int randPosY = rand.nextInt(15);
		int randPosZ = chunkZ + rand.nextInt(16);
		// 3 blocks per vein
		(new WorldGenMinable(mullak99.MulliteOre.blockID, 3)).generate(world, rand,
		randPosX, randPosY, randPosZ);
		}
		
		
		//2.5 vein of ore per chunk
		for (int i = 0; i < 2.5; i++) 
		{
			//16x16 area up to y = 64
		int randPosX = chunkX + rand.nextInt(16);
		int randPosY = rand.nextInt(15);
		int randPosZ = chunkZ + rand.nextInt(16);
		// 3 blocks per vein
		(new WorldGenMinable(mullak99.RoxiteOre.blockID, 3)).generate(world, rand,
		randPosX, randPosY, randPosZ);
		}
		//10 vein of ore per chunk
				for (int i = 0; i < 10; i++) 
				{
					//16x16 area up to y = 64
				int randPosX = chunkX + rand.nextInt(16);
				int randPosY = rand.nextInt(63);
				int randPosZ = chunkZ + rand.nextInt(16);
				// 8 blocks per vein
				(new WorldGenMinable(mullak99.CopperOre.blockID, 8)).generate(world, rand,
				randPosX, randPosY, randPosZ);
				}
		
	}

}
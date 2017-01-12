package com.github.escapemc.teammadnessmod.world;

import java.util.Random;

import com.github.escapemc.teammadnessmod.init.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class world_gen implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    switch (world.provider.getDimension()) {
    case 0: //Overworld
        this.runGenerator(this.gen_escapemc_ore, world, random, chunkX, chunkZ, 7, 0, 48);
        this.runGenerator(this.gen_mushrromstew_ore, world, random, chunkX, chunkZ, 7, 0, 48);
        this.runGenerator(this.gen_epicbudder22_ore, world, random, chunkX, chunkZ, 7, 0, 48);
        this.runGenerator(this.gen_jonahjoe2002_ore, world, random, chunkX, chunkZ, 7, 0, 48);
        this.runGenerator(this.gen_ianplaysyt_ore, world, random, chunkX, chunkZ, 7, 0, 48);
        this.runGenerator(this.gen_bossface88_ore, world, random, chunkX, chunkZ, 7, 0, 48);
        this.runGenerator(this.gen_diamondtips_ore, world, random, chunkX, chunkZ, 7, 0, 48);
        this.runGenerator(this.gen_ms, world, random, chunkX, chunkZ, 6, 0, 40);
        this.runGenerator(this.gen_madness_ore, world, random, chunkX, chunkZ, 6, 0, 48);
        
        break;
    case -1: //Nether

        break;
    case 1: //End

        break;
    	}
    }
    private WorldGenerator gen_escapemc_ore;
    private WorldGenerator gen_mushrromstew_ore;
    private WorldGenerator gen_epicbudder22_ore;
    private WorldGenerator gen_jonahjoe2002_ore;
    private WorldGenerator gen_ianplaysyt_ore;
    private WorldGenerator gen_bossface88_ore;
    private WorldGenerator gen_diamondtips_ore;
    private WorldGenerator gen_ms;
    private WorldGenerator gen_madness_ore;


    public world_gen() {
    	
        this.gen_escapemc_ore = new WorldGenMinable(ModBlocks.escapemc_ore.getDefaultState(), 6);
        this.gen_mushrromstew_ore = new WorldGenMinable(ModBlocks.mushrromstew_ore.getDefaultState(), 6);
        this.gen_epicbudder22_ore = new WorldGenMinable(ModBlocks.epicbudder22_ore.getDefaultState(), 6);
        this.gen_jonahjoe2002_ore = new WorldGenMinable(ModBlocks.jonahjoe2002_ore.getDefaultState(), 6);
        this.gen_ianplaysyt_ore = new WorldGenMinable(ModBlocks.ianplaysyt_ore.getDefaultState(), 6);
        this.gen_bossface88_ore = new WorldGenMinable(ModBlocks.bossface88_ore.getDefaultState(), 6);
        this.gen_diamondtips_ore = new WorldGenMinable(ModBlocks.diamondtips_ore.getDefaultState(), 6);
        this.gen_ms = new WorldGenMinable(ModBlocks.ms.getDefaultState(), 2);
        this.gen_madness_ore = new WorldGenMinable(ModBlocks.madness_ore.getDefaultState(), 5);

    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }		
	}
}
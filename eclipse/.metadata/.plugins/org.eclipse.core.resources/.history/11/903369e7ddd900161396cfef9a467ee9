package com.github.escapemc.teammadnessmod;

import com.github.escapemc.teammadnessmod.handlers.GuiHandler;
import com.github.escapemc.teammadnessmod.init.ModBlocks;
import com.github.escapemc.teammadnessmod.init.ModItems;
import com.github.escapemc.teammadnessmod.proxies.CommonProxy;
import com.github.escapemc.teammadnessmod.tileentity.TileEntityBlackHole;
import com.github.escapemc.teammadnessmod.tileentity.TileEntityMadnessChest;
import com.github.escapemc.teammadnessmod.tileentity.TileEntityMadnessFurnace;
import com.github.escapemc.teammadnessmod.world.world_gen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)



public class Main {
	
	public static final TeamMadnessModItemsTab TeamMadnessModItemsTab = new TeamMadnessModItemsTab("TeamMadnessModItemsTab");
	public static final TeamMadnessModBlocksTab TeamMadnessModBlocksTab = new TeamMadnessModBlocksTab("TeamMadnessModBlocksTab");
	public static final TeamMadnessModMaterialsTab TeamMadnessModMaterialsTab = new TeamMadnessModMaterialsTab("TeamMadnessModMaterialsTab");
	public static final TeamMadnessModArmorTab TeamMadnessModArmorTab = new TeamMadnessModArmorTab("TeamMadnessModArmorTab");

	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.registry();
		ModBlocks.init();
		ModBlocks.registry();

		GameRegistry.registerTileEntity(TileEntityMadnessFurnace.class, Reference.MOD_ID + "TileEntityMadnessFurnace");
		GameRegistry.registerTileEntity(TileEntityMadnessChest.class, Reference.MOD_ID + "TileEntityMadnessChest");
		GameRegistry.registerTileEntity(TileEntityBlackHole.class, Reference.MOD_ID + "TileEntityBlackHole");

	
		proxy.init();
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
		
		ModCrafting.initCrafting();
	    GameRegistry.registerWorldGenerator(new world_gen(), 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());


	    
	    
		
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		
		System.out.println("Post Init");

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

package mullak99.mod.mullak99smods.common;


import net.minecraft.src.*;
import universalelectricity.components.common.BasicComponents;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import universalelectricity.*;
import mullak99.mod.mullak99smods.block.SteelBlock;
import mullak99.mod.mullak99smods.item.ItemStaffofDay;
import mullak99.mod.mullak99smods.item.ingotBronze;
import mullak99.mod.mullak99smods.item.ItemBatteryCase;
import mullak99.mod.mullak99smods.item.ItemCopperContacts;
import mullak99.mod.mullak99smods.item.ItemEnderBattery;
import mullak99.mod.mullak99smods.item.ItemMortarandPestle;
import mullak99.mod.mullak99smods.item.ItemMullite;
import mullak99.mod.mullak99smods.item.ItemCoalDust;
import mullak99.mod.mullak99smods.item.ItemMulliteBattery;
import mullak99.mod.mullak99smods.item.ItemMulliteDust;
import mullak99.mod.mullak99smods.item.ItemMulliteAxe;
import mullak99.mod.mullak99smods.item.ItemMulliteCatalyst;
import mullak99.mod.mullak99smods.item.ItemMulliteHoe;
import mullak99.mod.mullak99smods.item.ItemMullitePickaxe;
import mullak99.mod.mullak99smods.item.ItemMulliteShovel;
import mullak99.mod.mullak99smods.item.ItemMulliteSword;
import mullak99.mod.mullak99smods.item.ItemRoxite;
import mullak99.mod.mullak99smods.item.ItemRoxiteDust;
import mullak99.mod.mullak99smods.item.ItemRoxiteAxe;
import mullak99.mod.mullak99smods.item.ItemRoxiteHoe;
import mullak99.mod.mullak99smods.item.ItemRoxitePickaxe;
import mullak99.mod.mullak99smods.item.ItemRoxiteShovel;
import mullak99.mod.mullak99smods.item.ItemRoxiteSword;
import mullak99.mod.mullak99smods.item.MulliteArmor;
import mullak99.mod.mullak99smods.item.RoxiteArmor;
import mullak99.mod.mullak99smods.item.ingotCopper;
import mullak99.mod.mullak99smods.item.ingotTin;
import mullak99.mod.mullak99smods.item.ingotSteel;
import mullak99.mod.mullak99smods.block.MulliteOre;
import mullak99.mod.mullak99smods.block.BronzeBlock;
import mullak99.mod.mullak99smods.block.MulliteTNT;
import mullak99.mod.mullak99smods.block.RoxiteOre;
import mullak99.mod.mullak99smods.block.TinOre;
import mullak99.mod.mullak99smods.block.MulliteBlock;
import mullak99.mod.mullak99smods.block.RoxiteBlock;
import mullak99.mod.mullak99smods.block.CopperOre;
import mullak99.mod.mullak99smods.block.CopperBlock;
import mullak99.mod.mullak99smods.block.TinBlock;
import mullak99.mod.mullak99smods.block.ChestMullite;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.Configuration;
import cpw.*;
import cpw.mods.*;
import cpw.mods.fml.*;
import cpw.mods.fml.client.*;
import cpw.mods.fml.client.modloader.*;
import cpw.mods.fml.client.registry.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.asm.transformers.*;
import cpw.mods.fml.common.discovery.*;
import cpw.mods.fml.common.discovery.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.functions.*;
import cpw.mods.fml.common.modloader.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.toposort.*;
import cpw.mods.fml.common.versioning.*;
import cpw.mods.fml.relauncher.*;
import cpw.mods.fml.server.*;
import ibxm.*;
import net.*;
import net.minecraft.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.client.texturepacks.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.packet.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.liquids.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import java.util.Map;
import java.util.Random;

@Mod(modid = "mullak99's Mod", name = "mullak99's Mod", version = "Beta 0.1.0")

public class mullak99
{
	@SidedProxy(clientSide = "mullak99.mod.mullak99smods.common.ClientProxy", serverSide = "mullak99.mod.mullak99smods.common.CommonProxy")
	
	
	
	
	public static CommonProxy proxy;
	
	public static Item ItemMullite;
	public static Item ItemRoxite;
	public static Item ingotCopper;
	public static Item ingotTin;
	public static Item ingotBronze;
	public static Item ingotSteel;
	
	public static Item CopperContacts;
	
	public static Item ItemMulliteDust;
	public static Item ItemRoxiteDust;
	public static Item ItemCoalDust;
	
	public static Item MortarandPestle;
	
	
	public static Block MulliteOre;
	public static Block RoxiteOre;
	public static Block CopperOre;
	public static Block TinOre;
	public static Block TinBlock;
	public static Block BronzeBlock;
	public static Block SteelBlock;
	
	public static Block MulliteTNT;
	
	
	public static Block MulliteBlock;
	public static Block RoxiteBlock;
	public static Block CopperBlock;
	
	public static Block ChestMullite;
	
	public static Item MulliteHelmet;
	public static Item MulliteChest;
	public static Item MulliteLegs;
	public static Item MulliteBoots;
	public static Item RoxiteHelmet;
	public static Item RoxiteChest;
	public static Item RoxiteLegs;
	public static Item RoxiteBoots;
	
	public static Item MulliteCatalyst;
	public static Item EnderBattery;
	public static Item BatteryCase;
	public static Item MulliteBattery;
	
	public static Item MullitePickaxe;
	public static Item MulliteShovel;
	public static Item MulliteSword;
	public static Item MulliteAxe;
	public static Item MulliteHoe;
	public static Item RoxitePickaxe;
	public static Item RoxiteShovel;
	public static Item RoxiteSword;
	public static Item RoxiteAxe;
	public static Item RoxiteHoe;
	
	public static Item StaffofDay;
	
	/*public static final int renderMullite = proxy.addArmor("Mullite");
	public static final int renderRoxite = proxy.addArmor("Roxite");*/
	
	public static Item DEBUGPickaxe;
	
	public static EnumToolMaterial toolMullite = EnumHelper.addToolMaterial("MULLITE", 3, 2061, 15.0F, 6, 10);
	public static EnumToolMaterial toolDebug = EnumHelper.addToolMaterial("DEBUG", 3, 999999999, 99999999999999999999999999999.9F, 6, 10);
	public static EnumArmorMaterial ArmorMullite = EnumHelper.addArmorMaterial("MULLITE", 44, new int[]{4, 9, 7, 4}, 10);
	public static EnumArmorMaterial ArmorRoxite = EnumHelper.addArmorMaterial("Roxite", 44, new int[]{4, 9, 7, 4}, 10);
		
	@Init
	public void load(FMLInitializationEvent event)
	{
		
	//Mullite//
	
	
	
		
	MullitePickaxe =  new ItemMullitePickaxe(1000, toolMullite).setUnlocalizedName("MullitePickaxe");
	MulliteShovel =  new ItemMulliteShovel(1001, toolMullite).setUnlocalizedName("MulliteShovel");
	MulliteSword =  new ItemMulliteSword(1002, toolMullite).setUnlocalizedName("MulliteSword");
	MulliteAxe =  new ItemMulliteAxe(1003, toolMullite).setUnlocalizedName("MulliteAxe");
	MulliteHoe =  new ItemMulliteHoe(1004, toolMullite).setUnlocalizedName("MulliteHoe");
	DEBUGPickaxe =  new ItemMullitePickaxe(1111, toolDebug).setUnlocalizedName("DEBUGPickaxe");	
	MulliteHelmet =  new MulliteArmor(1012, ArmorMullite, proxy.addArmor("Mullite"), 0).setUnlocalizedName("MulliteHelmet").setCreativeTab(CreativeTabs.tabCombat);
	MulliteChest =  new MulliteArmor(1013, ArmorMullite, proxy.addArmor("Mullite"), 1).setUnlocalizedName("MulliteChest").setCreativeTab(CreativeTabs.tabCombat);
	MulliteLegs =  new MulliteArmor(1014, ArmorMullite, proxy.addArmor("Mullite"), 2).setUnlocalizedName("MulliteLegs").setCreativeTab(CreativeTabs.tabCombat);
	MulliteBoots =  new MulliteArmor(1015, ArmorMullite, proxy.addArmor("Mullite"), 3).setUnlocalizedName("MulliteBoots").setCreativeTab(CreativeTabs.tabCombat);
	MulliteBlock = new MulliteBlock(502,Material.rock, "MulliteBlock").setUnlocalizedName("MulliteBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(7F);
	MulliteOre = new MulliteOre(500, Material.rock, "MulliteOre").setUnlocalizedName("MulliteOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(6F);
	ChestMullite = new ChestMullite(1223,Material.rock, "ChestMullite").setUnlocalizedName("MulliteBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(7F);
	MulliteTNT = new MulliteTNT(1210).setUnlocalizedName("MulliteTNT").setCreativeTab(CreativeTabs.tabRedstone).setHardness(1F);
	ItemMullite = new ItemMullite(1005).setUnlocalizedName("Mullite").setCreativeTab(CreativeTabs.tabMaterials);
	ItemMulliteDust = new ItemMulliteDust(1221).setUnlocalizedName("MulliteDust").setCreativeTab(CreativeTabs.tabMaterials);
	MulliteCatalyst = new ItemMulliteCatalyst(1200).setUnlocalizedName("MulliteCatalyst").setMaxStackSize(1).setCreativeTab(CreativeTabs.tabMaterials);
	StaffofDay = new ItemStaffofDay(1130).setUnlocalizedName("StaffofDay").setCreativeTab(CreativeTabs.tabTools);
	
	
	//Roxite//
	
    RoxitePickaxe =  new ItemRoxitePickaxe(1006, toolMullite).setUnlocalizedName("RoxitePickaxe");
    RoxiteShovel =  new ItemRoxiteShovel(1007, toolMullite).setUnlocalizedName("RoxiteShovel");
    RoxiteSword =  new ItemRoxiteSword(1008, toolMullite).setUnlocalizedName("RoxiteSword");
    RoxiteAxe =  new ItemRoxiteAxe(1009, toolMullite).setUnlocalizedName("RoxiteAxe");
    RoxiteHoe =  new ItemRoxiteHoe(1010, toolMullite).setUnlocalizedName("RoxiteHoe");
    RoxiteHelmet =  new RoxiteArmor(1016, ArmorRoxite, proxy.addArmor("Roxite"), 0).setUnlocalizedName("RoxiteHelmet").setCreativeTab(CreativeTabs.tabCombat);
    RoxiteChest =  new RoxiteArmor(1017, ArmorRoxite, proxy.addArmor("Roxite"), 1).setUnlocalizedName("RoxiteChest").setCreativeTab(CreativeTabs.tabCombat);
    RoxiteLegs =  new RoxiteArmor(1018, ArmorRoxite, proxy.addArmor("Roxite"), 2).setUnlocalizedName("RoxiteLegs").setCreativeTab(CreativeTabs.tabCombat);
    RoxiteBoots =  new RoxiteArmor(1019, ArmorRoxite, proxy.addArmor("Roxite"), 3).setUnlocalizedName("RoxiteBoots").setCreativeTab(CreativeTabs.tabCombat);
    RoxiteBlock = new RoxiteBlock(503,Material.rock, "RoxiteBlock").setUnlocalizedName("RoxiteBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(7F);
    RoxiteOre = new RoxiteOre(501, Material.rock, "RoxiteOre").setUnlocalizedName("RoxiteOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(6F);
	ItemRoxite = new ItemRoxite(1011).setUnlocalizedName("Roxite").setCreativeTab(CreativeTabs.tabMaterials);
	ItemRoxiteDust = new ItemRoxiteDust(1222).setUnlocalizedName("RoxiteDust").setCreativeTab(CreativeTabs.tabMaterials);
	
	//Other//
	
	MortarandPestle = new ItemMortarandPestle(1211).setUnlocalizedName("MortarandPestle").setMaxStackSize(1).setCreativeTab(CreativeTabs.tabTools);
	CopperOre = new CopperOre(504, Material.rock, "CopperOre").setUnlocalizedName("CopperOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(3F);
	TinOre = new TinOre(506, Material.rock, "TinOre").setUnlocalizedName("TinOre").setCreativeTab(CreativeTabs.tabBlock).setHardness(3F);
	TinBlock = new TinBlock(507, Material.rock, "TinBlock").setUnlocalizedName("TinBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(4F);
	ingotCopper = new ingotCopper(1100).setUnlocalizedName("Copper").setCreativeTab(CreativeTabs.tabMaterials);
	ingotBronze = new ingotBronze(1109).setUnlocalizedName("Bronze").setCreativeTab(CreativeTabs.tabMaterials);
	ingotTin = new ingotTin(1101).setUnlocalizedName("Tin").setCreativeTab(CreativeTabs.tabMaterials);
	CopperBlock = new CopperBlock(505, Material.rock, "CopperBlock").setUnlocalizedName("CopperBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(4F);
	BronzeBlock = new BronzeBlock(1110, Material.rock, "BronzeBlock").setUnlocalizedName("BronzeBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(4F);
	ingotSteel = new ingotSteel(1230).setUnlocalizedName("Steel").setCreativeTab(CreativeTabs.tabMaterials);
	SteelBlock = new SteelBlock(1231, Material.rock, "SteelBlock").setUnlocalizedName("SteelBlock").setCreativeTab(CreativeTabs.tabBlock).setHardness(5F);
	CopperContacts = new ItemCopperContacts(1116).setUnlocalizedName("CopperContacts").setCreativeTab(CreativeTabs.tabMaterials);
	EnderBattery = new ItemEnderBattery(1201).setUnlocalizedName("EnderBattery").setMaxStackSize(1).setCreativeTab(CreativeTabs.tabMaterials);
	MulliteBattery = new ItemMulliteBattery(1202).setUnlocalizedName("MulliteBattery").setMaxStackSize(1).setCreativeTab(CreativeTabs.tabMaterials);
	ItemCoalDust = new ItemCoalDust(1229).setUnlocalizedName("CoalDust").setCreativeTab(CreativeTabs.tabMaterials);
	BatteryCase = new ItemBatteryCase(1115).setUnlocalizedName("BatteryCase").setCreativeTab(CreativeTabs.tabMaterials);
	
	//Block Register//
	GameRegistry.registerBlock(MulliteOre);
	GameRegistry.registerBlock(RoxiteBlock);
	GameRegistry.registerBlock(CopperOre);
	GameRegistry.registerBlock(CopperBlock);
	GameRegistry.registerBlock(TinOre);
	GameRegistry.registerBlock(RoxiteOre);
	GameRegistry.registerBlock(MulliteBlock);
	GameRegistry.registerBlock(TinBlock);
	GameRegistry.registerBlock(BronzeBlock);
	GameRegistry.registerBlock(SteelBlock);
	GameRegistry.registerBlock(ChestMullite);
	GameRegistry.registerBlock(MulliteTNT);
	
	//Mullite//
	
	LanguageRegistry.addName(ItemMullite, "Mullite");
	LanguageRegistry.addName(MulliteOre, "Mullite Ore");
	LanguageRegistry.addName(MulliteBlock, "Block of Mullite");
	LanguageRegistry.addName(MullitePickaxe, "Mullite Pickaxe");
	LanguageRegistry.addName(MulliteShovel, "Mullite Shovel");
	LanguageRegistry.addName(MulliteSword, "Mullite Sword");
	LanguageRegistry.addName(MulliteAxe, "Mullite Axe");
	LanguageRegistry.addName(MulliteHoe, "Mullite Hoe");
	LanguageRegistry.addName(ItemMulliteDust, "Mullite Dust");
	LanguageRegistry.addName(MulliteTNT, "Mullite TNT");
	LanguageRegistry.addName(ChestMullite, "Mullite Chest [DONT USE IT WILL CRASH YOU!]");
	LanguageRegistry.addName(MulliteHelmet, "Mullite Helmet");
	LanguageRegistry.addName(MulliteChest, "Mullite Chestplate");
	LanguageRegistry.addName(MulliteLegs, "Mullite Leggings");
	LanguageRegistry.addName(MulliteBoots, "Mullite Boots");
	LanguageRegistry.addName(MulliteCatalyst, "Mullite Catalyst");
	LanguageRegistry.addName(StaffofDay, "Staff of Day [W.I.P]");
	
	//Roxite//
	
	LanguageRegistry.addName(ItemRoxite, "Roxite");
	LanguageRegistry.addName(RoxiteOre, "Roxite Ore");
	LanguageRegistry.addName(RoxiteBlock, "Block of Roxite");
	LanguageRegistry.addName(RoxitePickaxe, "Roxite Pickaxe");
	LanguageRegistry.addName(RoxiteShovel, "Roxite Shovel");
	LanguageRegistry.addName(RoxiteSword, "Roxite Sword");
	LanguageRegistry.addName(RoxiteAxe, "Roxite Axe");
	LanguageRegistry.addName(RoxiteHoe, "Roxite Hoe");
	LanguageRegistry.addName(ItemRoxiteDust, "Roxite Dust");
	LanguageRegistry.addName(RoxiteHelmet, "Roxite Helmet");
	LanguageRegistry.addName(RoxiteChest, "Roxite Chestplate");
	LanguageRegistry.addName(RoxiteLegs, "Roxite Leggings");
	LanguageRegistry.addName(RoxiteBoots, "Roxite Boots");
	
	//Other//
	
	LanguageRegistry.addName(CopperOre, "Copper Ore");
	LanguageRegistry.addName(CopperBlock, "Block of Copper");
	LanguageRegistry.addName(MortarandPestle, "Mortar and Pestle");
	LanguageRegistry.addName(EnderBattery, "Ender Battery");
	LanguageRegistry.addName(DEBUGPickaxe, "Debug Pickaxe");
	LanguageRegistry.addName(TinOre, "Tin Ore");
	LanguageRegistry.addName(TinBlock, "Block of Tin");
	LanguageRegistry.addName(BatteryCase, "Battery Casing");
	LanguageRegistry.addName(CopperContacts, "Copper Contacts");
    LanguageRegistry.addName(ingotTin, "Tin Ingot");
    LanguageRegistry.addName(ingotCopper, "Copper Ingot");
    LanguageRegistry.addName(MulliteBattery, "Mullite Battery");
    LanguageRegistry.addName(ingotBronze, "Bronze Ingot");
    LanguageRegistry.addName(BronzeBlock, "Block of Bronze");
    LanguageRegistry.addName(ItemCoalDust, "Coal Dust");
    LanguageRegistry.addName(ingotSteel, "Steel Ingot");
    LanguageRegistry.addName(SteelBlock, "Block of Steel");
	
	//Catalyst//
	
	MulliteCatalyst.setContainerItem(MulliteCatalyst);
	EnderBattery.setContainerItem(EnderBattery);
	MortarandPestle.setContainerItem(MortarandPestle);
	
	
	//Fuel//
	
	GameRegistry.registerFuelHandler(new mullak99FuelHandler());
	
	
	//Mullite//
	
	GameRegistry.addRecipe(new ItemStack(MullitePickaxe, 1), new Object [] 
			{
		"XXX", " - ", " - ", 'X', ItemMullite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(MulliteShovel, 1), new Object [] 
			{
		"X", "-", "-", 'X', ItemMullite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(MulliteSword, 1), new Object [] 
			{
		"X", "X", "-", 'X', ItemMullite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(MulliteAxe, 1), new Object [] 
			{
		"XX ", "X- ", " - ", 'X', ItemMullite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(MulliteHoe, 1), new Object [] 
			{
		   "XX ", " - ", " - ", 'X', ItemMullite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(MulliteBlock, 1), new Object [] 
			{
		   "XXX", "XXX", "XXX", 'X', ItemMullite
			});
	GameRegistry.addRecipe(new ItemStack(ItemMullite, 9), new Object [] 
			{
		   "X", 'X', MulliteBlock
			});
	GameRegistry.addRecipe(new ItemStack(DEBUGPickaxe, 1), new Object [] 
			{
		"XXX", " - ", " - ", 'X', Block.bedrock, '-', mullak99.MulliteBlock
			});
	
	GameRegistry.addRecipe(new ItemStack(MulliteHelmet, 1), new Object [] 
			{
		"XXX", "X X", 'X', mullak99.ItemMullite,
			});
	GameRegistry.addRecipe(new ItemStack(MulliteChest, 1), new Object [] 
			{
		"X X", "XXX", "XXX", 'X', mullak99.ItemMullite,
			});
	GameRegistry.addRecipe(new ItemStack(MulliteLegs, 1), new Object [] 
			{
		"XXX", "X X", "X X", 'X', mullak99.ItemMullite,
			});
	GameRegistry.addRecipe(new ItemStack(MulliteBoots, 1), new Object [] 
			{
		"X X", "X X", 'X', mullak99.ItemMullite,
			});
	GameRegistry.addRecipe(new ItemStack(ItemMulliteDust, 1), new Object [] 
			{
		"X", "-", 'X', mullak99.ItemMullite, '-', mullak99.MortarandPestle,
			});
	GameRegistry.addRecipe(new ItemStack(ItemMulliteDust, 2), new Object [] 
			{
		"X", "-", 'X', mullak99.MulliteOre, '-', mullak99.MortarandPestle,
			});
	GameRegistry.addRecipe(new ItemStack(MulliteBattery, 1), new Object [] 
			{
		"X-X", "X~X", "X#X", 'X', mullak99.ItemMullite, '-', mullak99.MulliteCatalyst, '~', Item.netherStar, '#', mullak99.BatteryCase
			});
	GameRegistry.addRecipe(new ItemStack(MulliteTNT, 2), new Object [] 
			{
		   "-X-", 'X', ItemMullite, '-', Block.tnt,
			});
	
	GameRegistry.addSmelting(MulliteOre.blockID, new ItemStack (ItemMullite, 1), 5F);
	GameRegistry.addSmelting(ItemMulliteDust.itemID, new ItemStack (ItemMullite, 1), 5F);
	
	
	//Roxite//
	
	GameRegistry.addRecipe(new ItemStack(RoxitePickaxe, 1), new Object [] 
			{
		"XXX", " - ", " - ", 'X', ItemRoxite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteShovel, 1), new Object [] 
			{
		"X", "-", "-", 'X', ItemRoxite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteSword, 1), new Object [] 
			{
		"X", "X", "-", 'X', ItemRoxite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteAxe, 1), new Object [] 
			{
		"XX ", "X- ", " - ", 'X', ItemRoxite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteHoe, 1), new Object [] 
			{
		   "XX ", " - ", " - ", 'X', ItemRoxite, '-', Item.stick
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteBlock, 1), new Object [] 
			{
		   "XXX", "XXX", "XXX", 'X', ItemRoxite
			});
	GameRegistry.addRecipe(new ItemStack(ItemRoxite, 9), new Object [] 
			{
		   "X", 'X', RoxiteBlock
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteHelmet, 1), new Object [] 
			{
		"XXX", "X X", 'X', mullak99.ItemRoxite,
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteChest, 1), new Object [] 
			{
		"X X", "XXX", "XXX", 'X', mullak99.ItemRoxite,
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteLegs, 1), new Object [] 
			{
		"XXX", "X X", "X X", 'X', mullak99.ItemRoxite,
			});
	GameRegistry.addRecipe(new ItemStack(RoxiteBoots, 1), new Object [] 
			{
		"X X", "X X", 'X', mullak99.ItemRoxite,
			});
	GameRegistry.addRecipe(new ItemStack(ItemRoxiteDust, 1), new Object [] 
			{
		"X", "-", 'X', mullak99.ItemRoxite, '-', mullak99.MortarandPestle,
			});
	GameRegistry.addRecipe(new ItemStack(ItemRoxiteDust, 2), new Object [] 
			{
		"X", "-", 'X', mullak99.RoxiteOre, '-', mullak99.MortarandPestle,
			});
	
	GameRegistry.addSmelting(RoxiteOre.blockID, new ItemStack (ItemRoxite, 1), 5F);
	GameRegistry.addSmelting(ItemRoxiteDust.itemID, new ItemStack (ItemRoxite, 1), 5F);
	
	//Other//
	
	GameRegistry.addRecipe(new ItemStack(CopperBlock, 1), new Object [] 
			{
		   "XXX", "XXX", "XXX", 'X', ingotCopper
			});
	GameRegistry.addRecipe(new ItemStack(ingotCopper, 9), new Object [] 
			{
		   "X", 'X', CopperBlock
			});
	GameRegistry.addRecipe(new ItemStack(BatteryCase, 1), new Object [] 
			{
		"X-X", "X~X", "X-X", 'X', mullak99.ingotTin, '-', mullak99.CopperContacts, '~', Item.redstone,
			});
	GameRegistry.addRecipe(new ItemStack(CopperContacts, 2), new Object [] 
			{
		   "X", 'X', mullak99.ingotCopper
			});
	GameRegistry.addRecipe(new ItemStack(TinBlock, 1), new Object [] 
			{
		   "XXX", "XXX", "XXX", 'X', ingotTin
			});
	
	GameRegistry.addRecipe(new ItemStack(ingotTin, 9), new Object [] 
			{
		   "X", 'X', TinBlock
			});
	GameRegistry.addRecipe(new ItemStack(ingotBronze, 9), new Object [] 
			{
		   "X", 'X', BronzeBlock
			});
	GameRegistry.addRecipe(new ItemStack(ingotSteel, 1), new Object [] 
			{
		   "X-", 'X', Item.ingotIron, '-', ItemCoalDust
			});
	GameRegistry.addRecipe(new ItemStack(SteelBlock, 1), new Object [] 
			{
		   "XXX", "XXX", "XXX", 'X', ingotSteel,
			});
	GameRegistry.addRecipe(new ItemStack(ingotSteel, 9), new Object [] 
			{
		   "X", 'X', SteelBlock,
			});
	
	GameRegistry.addSmelting(CopperOre.blockID, new ItemStack(ingotCopper, 1), 1F);
	GameRegistry.addSmelting(TinOre.blockID, new ItemStack(ingotTin, 1), 1F);
	
	//Catalyst//
	
	GameRegistry.addRecipe(new ItemStack(MulliteCatalyst, 1), new Object [] 
			{
		"X-X", "-~-", "X-X", 'X', mullak99.MulliteBlock, '-', mullak99.CopperBlock, '~', Block.blockDiamond,
			});
	GameRegistry.addRecipe(new ItemStack(EnderBattery, 1), new Object [] 
			{
		"X-X", "~#~", "X+X", 'X', mullak99.MulliteBlock, '-', mullak99.MulliteCatalyst, '~', Item.netherStar, '+', Block.dragonEgg, '#', mullak99.BatteryCase
			});
	GameRegistry.addRecipe(new ItemStack(Item.bucketWater, 1), new Object [] 
			{
		"X-", 'X', mullak99.MulliteCatalyst, '-', Item.bucketEmpty,
			});
	GameRegistry.addRecipe(new ItemStack(MortarandPestle, 1), new Object [] 
			{
		"X-X", " X ", 'X', Block.stone, '-', Item.ingotIron,
			});
	GameRegistry.addRecipe(new ItemStack(ItemCoalDust, 1), new Object [] 
			{
		"X", "-", 'X', Item.coal, '-', mullak99.MortarandPestle,
			});
	
	//UE Converts//
	GameRegistry.addRecipe(new ItemStack(BasicComponents.itemWrench, 1), new Object [] 
			{
		"X X", " X ", " X ", 'X', Item.ingotIron,
			});

	
	
	
	
	
	
	MinecraftForge.setBlockHarvestLevel(MulliteOre, "pickaxe", 3);
	MinecraftForge.setBlockHarvestLevel(RoxiteOre, "pickaxe", 3);
	MinecraftForge.setBlockHarvestLevel(MulliteBlock, "pickaxe", 3);
	MinecraftForge.setBlockHarvestLevel(RoxiteBlock, "pickaxe", 3);
	MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 1);
	MinecraftForge.setBlockHarvestLevel(CopperBlock, "pickaxe", 1);
	
	
	
	
	//World Gen//
	
			GameRegistry.registerWorldGenerator((IWorldGenerator) new OreWorldGen());
	        addNames();
	        oreRegistration();
	        addOreRecipes();

	}




public static void addNames()
{
        

}

public static void oreRegistration()
{
        OreDictionary.registerOre("ingotCopper", new ItemStack(ingotCopper));
        OreDictionary.registerOre("ingotTin", new ItemStack(ingotTin));
        OreDictionary.registerOre("ingotBronze", new ItemStack(ingotBronze));
        OreDictionary.registerOre("ingotSteel", new ItemStack(ingotSteel));
        
}

public static void addOreRecipes()
{
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 1), new Object[] { "X X", " X ", 'X', "ingotCopper" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Item.bucketEmpty, 1), new Object[] { "X X", " X ", 'X', "ingotTin" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mullak99.CopperContacts, 2), new Object[] { "X", 'X', "ingotCopper" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mullak99.CopperBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', "ingotCopper" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mullak99.TinBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', "ingotTin" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mullak99.MulliteCatalyst, 1), new Object[] { "X-X", "-~-", "X-X", 'X', mullak99.MulliteBlock, '-', "CopperBlock", '~', Block.blockDiamond,}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mullak99.BatteryCase, 1), new Object[] { "X-X", "X~X", "X-X", 'X', "ingotTin", '-', mullak99.CopperContacts, '~', Item.redstone,}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ingotBronze, 2), new Object[] { "X-", "--", 'X', "ingotTin", '-', "ingotCopper"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mullak99.BronzeBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', "ingotBronze" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(mullak99.SteelBlock, 1), new Object[] { "XXX", "XXX", "XXX", 'X', "ingotSteel" }));
}
@PreInit
public void preInit(FMLPreInitializationEvent event) {
	
	event.getModMetadata().version = "Beta 0.1.0"; 
	event.getModMetadata().name = "mullak99's Mod"; 
	event.getModMetadata().description = "mullak99's Mod adds many things to Minecraft, such as tools, armor and blocks"; 
	event.getModMetadata().authorList.add("mullak99"); 
	event.getModMetadata().logoFile = "/mullak99/logo.png";
			
}
	
	//Container Registry//
    
	/*ModLoader.registerContainerID(mullak99.ChestMullite, 0);*/
}

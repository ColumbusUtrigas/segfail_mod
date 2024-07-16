package segfail.segfail;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ModItems {

	// helper to register items
	public static Item register(Item item, String id) {
		Identifier itemID = Identifier.of(Segfail.MOD_ID, id);
        return Registry.register(Registries.ITEM, itemID, item);
	}

	public static final CopperToolsMaterial CopperMaterial = new CopperToolsMaterial();

	public static final Item COPPER_PICKAXE = register(
		new PickaxeItem(CopperMaterial, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(CopperMaterial, 1.0F, -2.8F))),
		"copper_pickaxe"
	);

	public static final Item COPPER_AXE = register(
		new AxeItem(CopperMaterial, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(CopperMaterial, 6.0F, -3.1F))),
		"copper_axe"
	);

	public static final Item COPPER_SWORD = register(
		new SwordItem(CopperMaterial, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(CopperMaterial, 3, -2.4F))),
		"copper_sword"
	);

	public static final Item COPPER_SHOVEL = register(
		new ShovelItem(CopperMaterial, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(CopperMaterial, 1.5F, -3.0F))),
		"copper_shovel"
	);

	public static final Item COPPER_HOE = register(
		new HoeItem(CopperMaterial, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(CopperMaterial, -2.0F, -1.0F))),
		"copper_hoe"
	);

	public static final Item COPPER_HELMET = register(new ArmorItem(SegfailArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Settings()), "copper_helmet");
	public static final Item COPPER_CHESTPLATE = register(new ArmorItem(SegfailArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Settings()), "copper_chestplate");
	public static final Item COPPER_LEGGINS = register(new ArmorItem(SegfailArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Settings()), "copper_leggins");
	public static final Item COPPER_BOOTS = register(new ArmorItem(SegfailArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Settings()), "copper_boots");

	public static void initialize() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) ->
		{
			itemGroup.add(ModItems.COPPER_PICKAXE);
			itemGroup.add(ModItems.COPPER_AXE);
			itemGroup.add(ModItems.COPPER_SHOVEL);
			itemGroup.add(ModItems.COPPER_HOE);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) ->
		{
			itemGroup.add(ModItems.COPPER_SWORD);
			itemGroup.add(ModItems.COPPER_AXE);

			// armor
			itemGroup.add(ModItems.COPPER_HELMET);
			itemGroup.add(ModItems.COPPER_CHESTPLATE);
			itemGroup.add(ModItems.COPPER_LEGGINS);
			itemGroup.add(ModItems.COPPER_BOOTS);
		});
	}
}

public class Segfail implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("segfail");
	public static final String MOD_ID = "segfail";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initialising segfail...");

		SegfailArmorMaterials.initialize();
		ModItems.initialize();

		LOGGER.info("segfail initialised!");
	}
}
package net.gam1ng.g3r.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gam1ng.g3r.Gam1ngsthirdrails;
import net.gam1ng.g3r.block.custom.Bollard1;
import net.gam1ng.g3r.block.custom.BottomContactThirdRail;
import net.gam1ng.g3r.block.custom.TopContactThirdRail;
import net.gam1ng.g3r.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.gam1ng.g3r.block.custom.Bollard1;

public class ModBlocks {
    public static final Block MARBLE_1 = registerBlock("dark_green_marble",
    new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.GAM1NGSTHIRDRAILS);

    public static final Block MARBLE_2 = registerBlock("light_green_marble",
    new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.GAM1NGSTHIRDRAILS);

    public static final Block BOLLARD_1 = registerBlock("bollard_1",
    new Bollard1(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.GAM1NGSTHIRDRAILS);
    
    public static final Block THIRD_RAIL_1 = registerBlock("top_contact_third_rail",
        new TopContactThirdRail(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.GAM1NGSTHIRDRAILS);
    
    public static final Block THIRD_RAIL_2 = registerBlock("bottom_contact_third_rail",
        new BottomContactThirdRail(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.GAM1NGSTHIRDRAILS);

    public static final Block GIRDER_VERTICAL = registerBlock("girder_vertical",
        new GirderVertical(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.GAM1NGSTHIRDRAILS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Gam1ngsthirdrails.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item  = Registry.register(Registries.ITEM, new Identifier(Gam1ngsthirdrails.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        Gam1ngsthirdrails.LOGGER.info("Registering ModBlocks for " + Gam1ngsthirdrails.MOD_ID);
    }
}

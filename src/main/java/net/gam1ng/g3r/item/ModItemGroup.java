package net.gam1ng.g3r.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gam1ng.g3r.Gam1ngsthirdrails;
// import net.gam1ng.g3r.block.ModBlocks;
import net.minecraft.item.ItemGroup;
// import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup GAM1NGSTHIRDRAILS;

    public static void registerItemGroups() {
        GAM1NGSTHIRDRAILS = FabricItemGroup.builder(new Identifier(Gam1ngsthirdrails.MOD_ID, "g3r"))
            .displayName(Text.literal("gam1ng's third rails"))
            .build();
    }
}
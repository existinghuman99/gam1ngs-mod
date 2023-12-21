package net.gam1ng.g3r.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gam1ng.g3r.Gam1ngsthirdrails;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroup.Builder;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    
    public static Builder GAM1NGSTHIRDRAILS;

    public static void registerItemGroups() {
        GAM1NGSTHIRDRAILS = FabricItemGroup.builder(new Identifier(Gam1ngsthirdrails.MOD_ID, "g3r"))
            .displayName(Text.literal("G3R Item Group"));
    }


}

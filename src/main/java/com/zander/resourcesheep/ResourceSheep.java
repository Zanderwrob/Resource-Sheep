package com.zander.resourcesheep;

import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("resourcesheep")
public class ResourceSheep {

    public static final String MOD_ID = "resourcesheep";

    public static final CreativeModeTab RESOURCESHEEP_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return null;
        }
    };
    public ResourceSheep() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
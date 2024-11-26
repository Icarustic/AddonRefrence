package net.mcreator.ageofshinobiaddon.item;

import net.mcreator.ageofshinobiaddon.ElementsAgeofshinobiaddonMod;
import net.mcreator.ageofshinobiaddon.creativetab.TabModTab;
import net.mcreator.ageofshinobiaddon.entity.EntitySenkoSpirit;
import net.mcreator.ageofshinobiaddon.item.RangedItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.narutomod.item.ItemJutsu;

@ElementsAgeofshinobiaddonMod.ModElement.Tag
public class ItemTest extends ElementsAgeofshinobiaddonMod.ModElement {
    @GameRegistry.ObjectHolder("ageofshinobiaddon:test")
    public static final Item block = null;
    public static final ItemJutsu.JutsuEnum SENKO = new ItemJutsu.JutsuEnum(2, "senko", 'B', 50d, new EntitySenkoSpirit.EC.Jutsu());

    public ItemTest(ElementsAgeofshinobiaddonMod instance) {
        super(instance, 366);
    }

    @Override
    public void initElements() {
        this.elements.items.add(() -> {
            return new RangedItem(SENKO);
        });
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ageofshinobiaddon:test", "inventory"));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        // No rendering handlers needed for now
    }

    public static class RangedItem extends ItemJutsu.Base {
        public RangedItem(ItemJutsu.JutsuEnum... list) {
            super(ItemJutsu.JutsuEnum.Type.OTHER, list);
            this.setRegistryName("test");
            this.setUnlocalizedName("test");
            this.setCreativeTab(CreativeTabs.TOOLS);
        }

        @Override
        protected float getPower(ItemStack stack, EntityLivingBase entity, int timeLeft) {
            return this.getPower(stack, entity, timeLeft, 1.0f, 30f);
        }

        @Override
        protected float getMaxPower(ItemStack stack, EntityLivingBase entity) {
            return super.getMaxPower(stack, entity);
        }
    }
}
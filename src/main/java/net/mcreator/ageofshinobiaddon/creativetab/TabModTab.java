
package net.mcreator.ageofshinobiaddon.creativetab;

import net.mcreator.ageofshinobiaddon.ElementsAgeofshinobiaddonMod;
import net.narutomod.item.ItemNinjutsu;
import net.narutomod.ElementsNarutomodMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsAgeofshinobiaddonMod.ModElement.Tag
public class TabModTab extends ElementsAgeofshinobiaddonMod.ModElement {
    public TabModTab(ElementsAgeofshinobiaddonMod instance) {
        super(instance, 22);
    }

    @Override
    public void initElements() {
        tab = new CreativeTabs("tabmodtab") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ItemNinjutsu.block, (int) (1));
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return true;
            }
        }.setBackgroundImageName("item_search.png");
    }
    public static CreativeTabs tab;
}

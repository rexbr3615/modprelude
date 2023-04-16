package net.rexbr.preludejurassika.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rexbr.preludejurassika.item.ModBones;
import net.rexbr.preludejurassika.prelude;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, prelude.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(ModBones.JURA_BONE_SKULL.get());
        simpleItem(ModBones.JURA_BONE_GRASTRALIUM.get());

    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(prelude.MODID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(prelude.MODID,"item/" + item.getRegistryName().getPath()));
    }
}

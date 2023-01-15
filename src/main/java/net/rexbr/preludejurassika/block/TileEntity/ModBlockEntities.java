package net.rexbr.preludejurassika.block.TileEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rexbr.preludejurassika.block.ModBlocks;

import net.rexbr.preludejurassika.prelude;


public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, prelude.MODID);

    public static final RegistryObject<BlockEntityType<AnalyzerEntity>> ANALYZER_ENTITY =
            BLOCK_ENTITIES.register("analyzer_block_entity", () ->
                    BlockEntityType.Builder.of(AnalyzerEntity::new,
                            ModBlocks.ANALYZER.get()).build(null));
    public static final RegistryObject<BlockEntityType<CultureEntity>> CULTURE_ENTITY =
            BLOCK_ENTITIES.register("culture_block_entity", () ->
                    BlockEntityType.Builder.of(CultureEntity::new,
                            ModBlocks.CULTURE_VAT.get()).build(null));
    public static final RegistryObject<BlockEntityType<CleanerEntity>> CLEANER_ENTITY =
            BLOCK_ENTITIES.register("cleaner_entity", () ->
                    BlockEntityType.Builder.of(CleanerEntity::new,
                            ModBlocks.CLEANER.get()).build(null));
    public static final RegistryObject<BlockEntityType<RessonatorEntity>> RESSONATOR_ENTITY =
            BLOCK_ENTITIES.register("ressonator_entity", () ->
                    BlockEntityType.Builder.of(RessonatorEntity::new,
                            ModBlocks.RESSONATOR.get()).build(null));










    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

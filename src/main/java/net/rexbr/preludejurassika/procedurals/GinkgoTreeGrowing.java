package net.rexbr.preludejurassika.procedurals;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.rexbr.preludejurassika.block.ModBlocks;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class GinkgoTreeGrowing {


    public static void execute(LevelAccessor world, double x, double y, double z) {
        class TstWait5 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                this.world = world;
                MinecraftForge.EVENT_BUS.register(TstWait5.this);
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == TickEvent.Phase.END) {
                    TstWait5.this.ticks += 1;
                    if (TstWait5.this.ticks >= TstWait5.this.waitTicks)
                        run();
                }
            }

            private void run() {
                MinecraftForge.EVENT_BUS.unregister(TstWait5.this);
                if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.GINKGO_SAPLING.get()) {
                    if (Math.random() > 0.40) {
                        if (world instanceof ServerLevel _serverworld) {
                            StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("prelude", "ginkgo1"));
                            if (template != null) {
                                template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1),
                                        new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
                                        _serverworld.random, 3);
                            }
                        }
                    } else {
                        if (world instanceof ServerLevel _serverworld) {
                            StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("prelude", "ginkgo2"));
                            if (template != null) {
                                template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 1, y, z - 1),
                                        new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
                                        _serverworld.random, 3);
                            }
                        }
                    }
                }
            }
        }
        new TstWait5().start(world, Mth.nextInt(new Random(), 2400, 19200));
    }



}



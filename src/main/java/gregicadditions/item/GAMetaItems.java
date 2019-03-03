package gregicadditions.item;

import gregicadditions.GregicAdditions;
import gregtech.api.items.metaitem.MetaItem;
import gregtech.common.items.MetaItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class GAMetaItems {


    private static List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();

    public static MetaItem<?>.MetaValueItem NANO_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem INTEGRATED_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem WETWARE_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem COATED_BOARD;
    public static MetaItem<?>.MetaValueItem EPOXY_BOARD;
    public static MetaItem<?>.MetaValueItem FIBER_BOARD;
    public static MetaItem<?>.MetaValueItem MULTILAYER_FIBER_BOARD;
    public static MetaItem<?>.MetaValueItem PHENOLIC_BOARD;
    public static MetaItem<?>.MetaValueItem PLASTIC_BOARD;
    public static MetaItem<?>.MetaValueItem WETWARE_BOARD;
    public static MetaItem<?>.MetaValueItem GLOWSTONE_BOULE;
    public static MetaItem<?>.MetaValueItem NAQUADAH_BOULE;
    public static MetaItem<?>.MetaValueItem SILICON_BOULE;
    public static MetaItem<?>.MetaValueItem ADVANCED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem GOOD_CIRCUIT;
    public static MetaItem<?>.MetaValueItem BASIC_CIRCUIT;
    public static MetaItem<?>.MetaValueItem VACUUM_TUBE;
    public static MetaItem<?>.MetaValueItem DIODE;
    public static MetaItem<?>.MetaValueItem CAPACITOR;
    public static MetaItem<?>.MetaValueItem GLASS_FIBER;
    public static MetaItem<?>.MetaValueItem GLASS_TUBE;
    public static MetaItem<?>.MetaValueItem PETRI_DISH;
    public static MetaItem<?>.MetaValueItem RESISTOR;
    public static MetaItem<?>.MetaValueItem SMALL_COIL;
    public static MetaItem<?>.MetaValueItem SMD_CAPACITOR;
    public static MetaItem<?>.MetaValueItem SMD_DIODE;
    public static MetaItem<?>.MetaValueItem SMD_RESISTOR;
    public static MetaItem<?>.MetaValueItem SMD_TRANSISTOR;
    public static MetaItem<?>.MetaValueItem TRANSISTOR;
    public static MetaItem<?>.MetaValueItem COMPRESSED_CLAY;
    public static MetaItem<?>.MetaValueItem COMPRESSED_COKE_CLAY;
    public static MetaItem<?>.MetaValueItem COMPRESSED_FIRECLAY;
    public static MetaItem<?>.MetaValueItem CRYSTAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem NANO_COMPUTER;
    public static MetaItem<?>.MetaValueItem QUANTUM_COMPUTER;
    public static MetaItem<?>.MetaValueItem WETWARE_COMPUTER;
    public static MetaItem<?>.MetaValueItem CRYSTAL_MAINFRAME;
    public static MetaItem<?>.MetaValueItem NANO_MAINFRAME;
    public static MetaItem<?>.MetaValueItem INTEGRATED_MAINFRAME;
    public static MetaItem<?>.MetaValueItem QUANTUM_MAINFRAME;
    public static MetaItem<?>.MetaValueItem WETWARE_MAINFRAME;
    public static MetaItem<?>.MetaValueItem ASOC;
    public static MetaItem<?>.MetaValueItem LOGIC_CIRCUIT;
    public static MetaItem<?>.MetaValueItem CPU;
    public static MetaItem<?>.MetaValueItem HPIC;
    public static MetaItem<?>.MetaValueItem NAND;
    public static MetaItem<?>.MetaValueItem NANOCPU;
    public static MetaItem<?>.MetaValueItem NOR;
    public static MetaItem<?>.MetaValueItem PIC;
    public static MetaItem<?>.MetaValueItem QBIT_CPU;
    public static MetaItem<?>.MetaValueItem RAM;
    public static MetaItem<?>.MetaValueItem SOC;
    public static MetaItem<?>.MetaValueItem CRYSTALPROCESSOR;
    public static MetaItem<?>.MetaValueItem NANOPROCESSOR;
    public static MetaItem<?>.MetaValueItem QUANTUMPROCESSOR;
    public static MetaItem<?>.MetaValueItem WETWAREPROCESSOR;
    public static MetaItem<?>.MetaValueItem ASOC_WAFER;
    public static MetaItem<?>.MetaValueItem LOGIC_CIRCUIT_WAFER;
    public static MetaItem<?>.MetaValueItem CPU_WAFER;
    public static MetaItem<?>.MetaValueItem GLOWSTONE_WAFER;
    public static MetaItem<?>.MetaValueItem HPIC_WAFER;
    public static MetaItem<?>.MetaValueItem NAND_WAFER;
    public static MetaItem<?>.MetaValueItem NANOCPU_WAFER;
    public static MetaItem<?>.MetaValueItem NAQUADAH_WAFER;
    public static MetaItem<?>.MetaValueItem NOR_WAFER;
    public static MetaItem<?>.MetaValueItem PIC_WAFER;
    public static MetaItem<?>.MetaValueItem QBIT_CPU_WAFER;
    public static MetaItem<?>.MetaValueItem RAM_WAFER;
    public static MetaItem<?>.MetaValueItem SILICON_WAFER;
    public static MetaItem<?>.MetaValueItem SOC_WAFER;
    public static MetaItem<?>.MetaValueItem ACACIA_FORM;
    public static MetaItem<?>.MetaValueItem BIRCH_FORM;
    public static MetaItem<?>.MetaValueItem DARK_OAK_FORM;
    public static MetaItem<?>.MetaValueItem JUNGLE_FORM;
    public static MetaItem<?>.MetaValueItem OAK_FORM;
    public static MetaItem<?>.MetaValueItem SPRUCE_FORM;
    public static MetaItem<?>.MetaValueItem RAW_CARBON_FIBERS;
    public static MetaItem<?>.MetaValueItem ADVANCED_ALLOY_PLATE;
    public static MetaItem<?>.MetaValueItem MIXED_METAL_PLATE;
    public static MetaItem<?>.MetaValueItem RAW_CRYSTAL_CHIP;
    public static MetaItem<?>.MetaValueItem CRYSTAL_CPU;
    public static MetaItem<?>.MetaValueItem CRYSTAL_SOC;
    public static MetaItem<?>.MetaValueItem STEMCELLS;
    public static MetaItem<?>.MetaValueItem LAPOTRON_CRYSTAL;
    public static MetaItem<?>.MetaValueItem PLATE_IRIDIUM_ALLOY;
    public static MetaItem<?>.MetaValueItem PLATE_IRIDIUM_ALLOY_UNCOMPRESSED;
    public static MetaItem<?>.MetaValueItem NEUTRON_REFLECTOR;
    public static MetaItem<?>.MetaValueItem ENERGY_MODULE;
    public static MetaItem<?>.MetaValueItem ENERGY_CLUSTER;
    public static MetaItem<?>.MetaValueItem MAX_BATTERY;

    public static MetaItem<?>.MetaValueItem ELECTRODE_APATITE;
    public static MetaItem<?>.MetaValueItem ELECTRODE_BLAZE;
    public static MetaItem<?>.MetaValueItem ELECTRODE_BRONZE;
    public static MetaItem<?>.MetaValueItem ELECTRODE_COPPER;
    public static MetaItem<?>.MetaValueItem ELECTRODE_DIAMOND;
    public static MetaItem<?>.MetaValueItem ELECTRODE_EMERALD;
    public static MetaItem<?>.MetaValueItem ELECTRODE_ENDER;
    public static MetaItem<?>.MetaValueItem ELECTRODE_GOLD;
    public static MetaItem<?>.MetaValueItem ELECTRODE_IRON;
    public static MetaItem<?>.MetaValueItem ELECTRODE_LAPIS;
    public static MetaItem<?>.MetaValueItem ELECTRODE_OBSIDIAN;
    public static MetaItem<?>.MetaValueItem ELECTRODE_ORCHID;
    public static MetaItem<?>.MetaValueItem ELECTRODE_RUBBER;
    public static MetaItem<?>.MetaValueItem ELECTRODE_TIN;

    public static MetaItem<?>.MetaValueItem BENDING_CYLINDER;
    public static MetaItem<?>.MetaValueItem SMALL_BENDING_CYLINDER;

    public static MetaItem<?>.MetaValueItem PLANK_OAK;
    public static MetaItem<?>.MetaValueItem PLANK_SPRUCE;
    public static MetaItem<?>.MetaValueItem PLANK_BIRCH;
    public static MetaItem<?>.MetaValueItem PLANK_JUNGLE;
    public static MetaItem<?>.MetaValueItem PLANK_ACACIA;
    public static MetaItem<?>.MetaValueItem PLANK_DARKOAK;

    public static MetaItem<?>.MetaValueItem SCHEMATIC;
    public static MetaItem<?>.MetaValueItem SCHEMATIC_2X2;
    public static MetaItem<?>.MetaValueItem SCHEMATIC_3X3;
    public static MetaItem<?>.MetaValueItem SCHEMATIC_DUST;

    public static void init() {
        GAMetaItem item = new GAMetaItem();
        item.setRegistryName("ga_meta_item");
        GAMetaTool tool = new GAMetaTool();
        tool.setRegistryName("ga_meta_tool");
    }

    public static void registerOreDict() {
        for (MetaItem<?> item : ITEMS) {
            if (item instanceof GAMetaItem) {
                ((GAMetaItem) item).registerOreDict();
            }
        }
    }

    public static void registerRecipes() {
        for (MetaItem<?> item : ITEMS) {
            if (item instanceof GAMetaTool)
                ((GAMetaTool) item).registerRecipes();
        }
    }

    public static ItemStack getFilledCell(Fluid fluid, int count) {
        ItemStack fluidCell = MetaItems.FLUID_CELL.getStackForm().copy();
        IFluidHandlerItem fluidHandlerItem = fluidCell.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
        try {
            fluidHandlerItem.fill(new FluidStack(fluid, 1000), true);

        } catch (Exception e) {
            GregicAdditions.logger.error("The fluid " + fluid.toString() + " failed to do something with getFilledCell");
            GregicAdditions.logger.error(e);
            fluidHandlerItem.fill(new FluidStack(FluidRegistry.WATER, 1000), true);
        }
        fluidCell = fluidHandlerItem.getContainer();
        fluidCell.setCount(count);
        return fluidCell;
    }

    public static ItemStack getFilledCell(Fluid fluid) {
        return getFilledCell(fluid, 1);
    }

    public static boolean hasPrefix(ItemStack stack, String prefix, String... ignore) {
        for (int i : OreDictionary.getOreIDs(stack)) {
            if (OreDictionary.getOreName(i).startsWith(prefix)) {
                boolean valid = true;
                for (String s : ignore) {
                    if (OreDictionary.getOreName(i).startsWith(s))
                        valid = false;
                }
                if (!valid)
                    continue;
                return true;
            }
        }
        return false;
    }
}

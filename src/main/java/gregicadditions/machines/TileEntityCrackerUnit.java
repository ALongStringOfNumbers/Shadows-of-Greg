package gregicadditions.machines;

import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.multiblock.BlockPattern;
import gregtech.api.multiblock.FactoryBlockPattern;
import gregtech.api.render.ICubeRenderer;
import gregtech.api.render.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.BlockWireCoil;
import gregtech.common.blocks.MetaBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

public class TileEntityCrackerUnit extends RecipeMapMultiblockController {

	private static final MultiblockAbility<?>[] ALLOWED_ABILITIES = { MultiblockAbility.IMPORT_FLUIDS, MultiblockAbility.EXPORT_FLUIDS, MultiblockAbility.INPUT_ENERGY };

	public TileEntityCrackerUnit(ResourceLocation metaTileEntityId) {
		super(metaTileEntityId, GARecipeMaps.CRACKER_UNIT_RECIPES);
	}

	@Override
	public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
		return new TileEntityCrackerUnit(metaTileEntityId);
	}

	@Override
	protected BlockPattern createStructurePattern() {
		return FactoryBlockPattern.start().aisle("HCHCH", "HCHCH", "HCHCH").aisle("HCHCH", "H###H", "HCHCH").aisle("HCHCH", "HCOCH", "HCHCH").setAmountAtLeast('H', 20).where('O', selfPredicate()).where('H', statePredicate(getCasingState()).or(abilityPartPredicate(ALLOWED_ABILITIES))).where('#', isAirPredicate()).where('C', statePredicate(getCoilState())).build();
	}

	@Override
	public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
		return Textures.CLEAN_STAINLESS_STEEL_CASING;
	}

	protected IBlockState getCoilState() {
		return MetaBlocks.WIRE_COIL.getState(BlockWireCoil.CoilType.CUPRONICKEL);
	}

	protected IBlockState getCasingState() {
		return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STAINLESS_CLEAN);
	}
}

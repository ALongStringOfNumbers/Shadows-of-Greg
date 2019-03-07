package gregicadditions.recipes;

import forestry.core.fluids.Fluids;
import gregicadditions.GAConfig;
import gregicadditions.GAMaterials;
import gregtech.api.GTValues;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.recipes.machines.FuelRecipeMap;
import gregtech.api.recipes.recipes.FuelRecipe;
import gregtech.api.unification.material.Materials;
import gregtech.loaders.recipe.FuelLoader;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Loader;

public class GeneratorFuels {
	public static void init() {
		//Removal
		removeFuelRecipe(RecipeMaps.DIESEL_GENERATOR_FUELS, Materials.BioFuel.getFluid(2));
		removeFuelRecipe(RecipeMaps.DIESEL_GENERATOR_FUELS, Materials.LightFuel.getFluid(1));
		removeFuelRecipe(RecipeMaps.DIESEL_GENERATOR_FUELS, Materials.LightFuel.getFluid(1));
		removeFuelRecipe(RecipeMaps.DIESEL_GENERATOR_FUELS, Materials.Fuel.getFluid(1));
		removeFuelRecipe(RecipeMaps.DIESEL_GENERATOR_FUELS, Materials.Ethanol.getFluid(2));
		removeFuelRecipe(RecipeMaps.DIESEL_GENERATOR_FUELS, Materials.NitroFuel.getFluid(1));
		removeFuelRecipe(RecipeMaps.DIESEL_GENERATOR_FUELS, Materials.Steam.getFluid(32));
		removeFuelRecipe(RecipeMaps.GAS_TURBINE_FUELS, Materials.Hydrogen.getFluid(1));
		removeFuelRecipe(RecipeMaps.GAS_TURBINE_FUELS, Materials.Methane.getFluid(1));
		removeFuelRecipe(RecipeMaps.GAS_TURBINE_FUELS, Materials.LPG.getFluid(1));
		removeFuelRecipe(RecipeMaps.GAS_TURBINE_FUELS, Materials.NaturalGas.getFluid(1));
		removeFuelRecipe(RecipeMaps.SEMI_FLUID_GENERATOR_FUELS, Materials.Creosote.getFluid(2));
		removeFuelRecipe(RecipeMaps.STEAM_TURBINE_FUELS, Materials.Steam.getFluid(32));

		//Steam Turbine
		FuelLoader.registerSteamGeneratorFuel(Materials.Steam.getFluid(64), 1, GTValues.LV);

		//Gas Turbine Fuels
		FuelLoader.registerGasGeneratorFuel(Materials.NaturalGas.getFluid(8), 5, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.Hydrogen.getFluid(8), 5, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.CarbonMonoxde.getFluid(8), 6, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.WoodGas.getFluid(8), 6, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.SulfuricGas.getFluid(32), 25, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.SulfuricNaphtha.getFluid(4), 5, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.BioGas.getFluid(4), 45, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.Methane.getFluid(4), 14, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Ethylene.getFluid(1), 4, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.Gas.getFluid(1), 5, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Ethane.getFluid(4), 21, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Propene.getFluid(1), 6, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Butadiene.getFluid(16), 103, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Propane.getFluid(4), 29, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.RocketFuel.getFluid(16), 125, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Butene.getFluid(1), 8, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Phenol.getFluid(1), 9, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Benzene.getFluid(1), 9, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(GAMaterials.Butane.getFluid(4), 37, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.LPG.getFluid(1), 10, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.Naphtha.getFluid(1), 10, GTValues.LV);
		FuelLoader.registerGasGeneratorFuel(Materials.Toluene.getFluid(4), 41, GTValues.LV);

		//Diesel Generator Fluids
		FuelLoader.registerDieselGeneratorFuel(Materials.BioFuel.getFluid(16), 3, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(Materials.Oil.getFluid(2), 1, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(Materials.SulfuricLightFuel.getFluid(4), 5, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(GAMaterials.Methanol.getFluid(8), 21, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(GAMaterials.RocketFuel.getFluid(2), 7, GTValues.LV);
		if (Loader.isModLoaded("forestry") && GAConfig.Misc.ForestryIntegration) FuelLoader.registerDieselGeneratorFuel(Fluids.BIO_ETHANOL.getFluid(1), 6, GTValues.LV);
		else FuelLoader.registerDieselGeneratorFuel(Materials.Ethanol.getFluid(1), 6, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(GAMaterials.BioDiesel.getFluid(1), 8, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(Materials.LightFuel.getFluid(32), 305, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(Materials.Fuel.getFluid(1), 15, GTValues.LV);
		FuelLoader.registerDieselGeneratorFuel(Materials.NitroFuel.getFluid(2), 45, GTValues.LV);

		//Naquadah Reactor
		registerNaquadahReactorFuel(Materials.NaquadahEnriched.getFluid(1), 750, GTValues.LV);

		//Plasma Generator
		registerPlasmaFuel(Materials.Helium.getPlasma(1), 2560, GTValues.LV);
		registerPlasmaFuel(Materials.Nitrogen.getPlasma(1), 4032, GTValues.LV);
		registerPlasmaFuel(Materials.Oxygen.getPlasma(1), 4096, GTValues.LV);
		registerPlasmaFuel(Materials.Iron.getPlasma(16), 103219, GTValues.LV);
		registerPlasmaFuel(Materials.Nickel.getPlasma(16), 106905, GTValues.LV);

		//Smefuels
		FuelLoader.registerSemiFluidGeneratorFuel(GAMaterials.FishOil.getFluid(64), 1, GTValues.LV);
		if (Loader.isModLoaded("forestry") && GAConfig.Misc.ForestryIntegration) FuelLoader.registerSemiFluidGeneratorFuel(Fluids.SEED_OIL.getFluid(64), 1, GTValues.LV);
		else FuelLoader.registerSemiFluidGeneratorFuel(Materials.SeedOil.getFluid(64), 1, GTValues.LV);
		FuelLoader.registerSemiFluidGeneratorFuel(Materials.Creosote.getFluid(16), 1, GTValues.LV);
		FuelLoader.registerSemiFluidGeneratorFuel(Materials.Biomass.getFluid(16), 1, GTValues.LV);
		FuelLoader.registerSemiFluidGeneratorFuel(Materials.OilLight.getFluid(32), 5, GTValues.LV);
		FuelLoader.registerSemiFluidGeneratorFuel(Materials.OilMedium.getFluid(64), 15, GTValues.LV);
		FuelLoader.registerSemiFluidGeneratorFuel(Materials.OilHeavy.getFluid(16), 5, GTValues.LV);
		FuelLoader.registerSemiFluidGeneratorFuel(Materials.SulfuricHeavyFuel.getFluid(16), 5, GTValues.LV);
		FuelLoader.registerSemiFluidGeneratorFuel(Materials.HeavyFuel.getFluid(8), 15, GTValues.LV);
	}

	//Register Methods
	public static void registerPlasmaFuel(FluidStack fuelStack, int duration, int tier) {
		RecipeMaps.PLASMA_GENERATOR_FUELS.addRecipe(new FuelRecipe(fuelStack, duration, GTValues.V[tier]));
	}

	//Register Methods
	public static void registerNaquadahReactorFuel(FluidStack fuelStack, int duration, int tier) {
		GARecipeMaps.NAQUADAH_REACTOR_FUELS.addRecipe(new FuelRecipe(fuelStack, duration, GTValues.V[tier]));
	}

	private static void removeFuelRecipe(FuelRecipeMap map, FluidStack fluidStack) {
		map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, fluidStack));
	}
}

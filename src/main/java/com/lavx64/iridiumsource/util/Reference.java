package com.lavx64.iridiumsource.util;

public class Reference {
	public static final String MODID = "lis";
	public static final String NAME = "Iridium Source";
	public static final String VERSION = "1.0.1 - MC 1.12.2";
	
	public static final String CLIENT = "com.lavx64.iridiumsource.proxy.ClientProxy";
	public static final String COMMON = "com.lavx64.iridiumsource.proxy.CommonProxy";
	
	public static enum IridiumSourceItems {
		PLATINAORE("platinaore", "ItemPlatinaOre");
		
		private String unlocalizedName;
		private String registryName;
		
		IridiumSourceItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}

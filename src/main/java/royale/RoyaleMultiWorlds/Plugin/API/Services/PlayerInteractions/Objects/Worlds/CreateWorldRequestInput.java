package royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import royale.RoyaleMultiWorlds.Plugin.API.Enums.WorldType;
import royale.RoyaleMultiWorlds.Plugin.API.Objects.Layer;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class CreateWorldRequestInput extends PlayerRequestInput {

	public static class WorldData {

		private OfflinePlayer owner;
		private String id;
		private String displayName;
		private WorldType worldType;
		private List<Layer> layers = new ArrayList<>();

		public OfflinePlayer getOwner() {
			return this.owner;
		}

		public void setOwner(OfflinePlayer owner) {
			this.owner = owner;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String name) {
			this.id = name;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public WorldType getWorldType() {
			return this.worldType;
		}

		public void setWorldType(WorldType worldType) {
			this.worldType = worldType;
		}

		public List<Layer> getLayers() {
			return this.layers;
		}

		public void setLayers(List<Layer> layers) {
			this.layers = layers;
		}

	}

	private WorldData worldData;

	public CreateWorldRequestInput(Player player, WorldData worldData) {
		super(player);
		this.worldData = worldData;
	}

	public WorldData getWorldData() {
		return this.worldData;
	}

	public static CreateWorldRequestInput inst(Player player, WorldData worldData) {
		return new CreateWorldRequestInput(player, worldData);
	}

}

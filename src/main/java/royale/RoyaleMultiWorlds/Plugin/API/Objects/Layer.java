package royale.RoyaleMultiWorlds.Plugin.API.Objects;

import org.bukkit.Material;

/**
 * Class which contains information of a layer on a world.
 * 
 * @author DarkPanda73
 */
public class Layer {

	private Material material;
	private int height;

	public Layer(Material material, int height) {
		this.material = material;
		this.height = height;
	}

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

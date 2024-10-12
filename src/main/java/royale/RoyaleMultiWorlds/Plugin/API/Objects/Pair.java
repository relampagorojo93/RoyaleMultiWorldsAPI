package royale.RoyaleMultiWorlds.Plugin.API.Objects;

/**
 * Utility class which is used to offer an instance with a key and a value,
 * intended for compatibility in older Java versions and with the API.
 * 
 * @author DarkPanda73
 *
 * @param <T> The class type of the key.
 * @param <S> The class type of the value.
 */
public class Pair<T, S> {

	private static final String TOSTRING_FORMAT = "[%s, %s]";

	private T key;

	private S value;

	private Pair(T key, S value) {
		this.key = key;
		this.value = value;
	}

	public T getKey() {
		return this.key;
	}

	public S getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return String.format(TOSTRING_FORMAT, this.key.toString(), this.value.toString());
	}

	public static <T, S> Pair<T, S> of(T key, S value) {
		return new Pair<T, S>(key, value);
	}

}

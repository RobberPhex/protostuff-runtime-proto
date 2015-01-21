package net.webby.protostuff.runtime;

public enum RuntimeFieldType {

	RuntimeMessageField,
	RuntimeObjectField;
	
	public static RuntimeFieldType findByName(String name) {
		for (RuntimeFieldType value : values()) {
			if (value.name().equals(name)) {
				return value;
			}
		}
		return null;
	}
	
}
package dndcompanion.data;

/*
 * POJO class to store data for a spell, loaded from the JSON spel list
 */

public class SpellData {

	public String source;
	public String name;
	public int level;
	public String school;
	public String range;
	public String description;
	public boolean concentration;

	public SpellData(String source, String name, int level, String school, String description,  String range) {
		this.source = source;
		this.name = name;
		this.level = level;
		this.school = school;
		this.range = range;
		this.description = description;
	}

	public String getSource() {
		return source;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public String getSchool() {
		return school;
	}

	public String getRange() {
		return range;
	}

	public String getDescription() {
		return description;
	}

}
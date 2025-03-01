package dndcompanion.data;

public class SpellData {

	public String source;
	public String name;
	public int level;
	public String school;
	public int range;
	public int duration;
	String description;

	public SpellData(String source, String name, int level, String school, String description) {
		this.source = source;
		this.name = name;
		this.level = level;
		this.school = school;
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

	public int getRange() {
		return range;
	}

	public int getDuration() {
		return duration;
	}

	public String getDescription() {
		return description;
	}

}
package dndcompanion.compendium.spells;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import dndcompanion.data.SpellData;

public class LoadSpellData {

	public SpellData[] getSpells(String spellQuery) throws IOException {

		// Load spell.json

		ClassLoader classLoader = getClass().getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream("spell.json");

		SpellData[] spells = new SpellData[5];

		ObjectMapper objectMapper = new ObjectMapper();

		// Create root JsonNode array

		JsonNode root = objectMapper.readTree(inputStream);

		JsonNode rootArray = root.path("spells");

		int i = 0;

		for (JsonNode spell : rootArray) {

			// Ensures that the same spell is not inserted twice.
			
			if (i != 0) {
				if (spell.path("name").asText().equals(spells[i - 1].getName())) {
					continue;
				}
			}

			if (i < 4) {
				if (spell.path("name").asText().toLowerCase().contains(spellQuery.toLowerCase())) {

					JsonNode rangeNode = spell.path("range");
					String range = rangeNode.path("type").asText() + rangeNode.path("amount").asText();

					SpellData foundSpell = new SpellData(spell.path("source").asText(), spell.path("name").asText(),
							spell.path("level").asInt(), spell.path("school").asText(), spell.path("entries").asText(),
							range);

					spells[i] = foundSpell;
					i += 1;

				}
			}

		}
		return spells;
	}
}
